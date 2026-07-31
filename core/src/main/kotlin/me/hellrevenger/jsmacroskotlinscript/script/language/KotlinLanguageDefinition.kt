package me.hellrevenger.jsmacroskotlinscript.script.language

import me.hellrevenger.jsmacroskotlinscript.KotlinExtension
import me.hellrevenger.jsmacroskotlinscript.ScriptReceiver
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.EventType
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ClassPath
import me.hellrevenger.jsmacroskotlinscript.script.library.api.Import
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ImportJar
import me.hellrevenger.jsmacroskotlinscript.script.library.api._getPrivateMethod
import me.hellrevenger.jsmacroskotlinscript.script.library.api._invokePrivate
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ConfigManager
import xyz.wagyourtail.jsmacros.core.config.Option
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import kotlin.collections.mapValues
import kotlin.reflect.KClass
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

class KotlinLanguageDefinition(extension: Extension?, runner: Core<*, *>)
    : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {

    val externalClassPaths = mutableSetOf<File>()

    val addUrlImpl by lazy {
        val classLoader = KotlinExtension.classLoader

        val callback: (URL) -> Unit = classLoader._getPrivateMethod("addUrlFwd", listOf(URL::class.java)).let { method ->
            method.trySetAccessible()
            return@let { url ->
                method.invoke(classLoader, url)
            }
        }
        callback
    }

    val dependencyUpdatedMap = mutableMapOf<File, Boolean>()

    val compileConfiguration by lazy {
        val fakeContext = KotlinScriptContext(runner, null, null)
        val libs = retrieveLibs(fakeContext)

        ScriptCompilationConfiguration {
            baseClass.replaceOnlyDefault(KotlinType(ScriptReceiver::class))

            defaultImports(ImportJar::class, Import::class, ClassPath::class, EventType::class)
            refineConfiguration {
                beforeCompiling { context ->
                    context.compilationConfiguration.with {
                        compilerOptions.append("-Xno-call-assertions")
                        compilerOptions.append("-Xno-param-assertions")
                    }.asSuccess()
                }
            }

            providedProperties.replaceOnlyDefault(libs.mapValues { KotlinType(it.value::class) })

            refineConfiguration {
                onAnnotations<ClassPath> { context ->
                    val annotations = context.collectedData?.get(ScriptCollectedData.collectedAnnotations)
                        ?.takeIf { it.isNotEmpty() }
                        ?: return@onAnnotations context.compilationConfiguration.asSuccess()

                    val file = (context.script as? FileBasedScriptSource)?.file
                        ?: return@onAnnotations context.compilationConfiguration.asSuccess()
                    val scriptBaseDir = file.parentFile

                    val files = annotations.mapNotNull {
                        (it.annotation as? ClassPath)?.path ?: run {
                            try {
                                it.annotation._invokePrivate<Array<String>>("path", arrayOf())
                            } catch (e: Exception) {
                                null
                            }
                        }
                    }.flatMap { it.toList() }
                        .filter { it.endsWith(".jar") }
                        .mapNotNull {
                            var f = scriptBaseDir.resolve(it).normalize()
                            if(f.exists()) f
                            else {
                                f = File(context.script.locationId?.let { it1 -> File(it1).parentFile }, it)
                                if(f.exists()) f
                                else null
                            }
                        }
                    files.forEach {
                        if(externalClassPaths.add(it)) {
                            println("new ExternalClassPath: ${it.absolutePath}")
                            dependencyUpdatedMap[file] = true
                            addUrlImpl(it.toURI().toURL())
                        }
                    }
                    context.compilationConfiguration.asSuccess()
                }
            }
        }
    }

    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, rerun: Boolean = false, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val libs = retrieveLibs(ctx.ctx)
        ctx.ctx.addLibraries(libs.values)

        Thread.currentThread().contextClassLoader = KotlinExtension.classLoader
        Thread.currentThread().name = "KT:${ctx.ctx.file?.nameWithoutExtension?.removeSuffix(".jsm") ?: "unnamed"}"
        val compConf = compileConfiguration.with {
            jvm {
                dependenciesFromClassloader(classLoader = KotlinExtension.classLoader, wholeClasspath = true)
            }
        }

        val execConf = ScriptEvaluationConfiguration {

            constructorArgs(event, ctx.ctx.file, ctx.ctx)

            providedProperties(libs)

//            enableScriptsInstancesSharing()
        }

        val host = BasicJvmScriptingHost(
            ScriptingHostConfiguration()
                .withDefaultsFrom(defaultJvmScriptingHostConfiguration)
        )
        val file = ctx.ctx.file
        if (file != null) {
            dependencyUpdatedMap[file] = false
            try {
                callback(host, compConf, execConf)
                ctx.ctx.context = host
            } catch(e: KotlinCompileException) {
                if (dependencyUpdatedMap[file] == true && !rerun) {
                    return internalExec(ctx, event, true, callback)
                }
                ctx.ctx.closeContext()
                throw e
            } finally {
                dependencyUpdatedMap.remove(file)
            }
        } else {
            try {
                callback(host, compConf, execConf)
                ctx.ctx.context = host
            } catch(e: KotlinCompileException) {
                ctx.ctx.closeContext()
                throw e
            }
        }
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, p1: ScriptTrigger, event: BaseEvent) {
        internalExec(ctx, event) { host, compConf, evalConf ->
            val ret = host.eval(ctx.ctx.file!!.toIncrementalScriptSource(), compConf, evalConf)
            ret.onFailure {
                throw KotlinCompileException(it)
            }

            val retOrThrow = ret.valueOrThrow().returnValue
            if (retOrThrow is ResultValue.Error) {
                ctx.ctx.closeContext()
                throw KotlinRuntimeException(retOrThrow.error, ctx.ctx.file)
            }
        }
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, lang: String, script: String, event: BaseEvent) {
        internalExec(ctx, event) { host, compConf, evalConf ->
            val ret = host.eval(script.toScriptSource(), compConf, evalConf)
            ret.onFailure {
                throw KotlinCompileException(it)
            }

            val retOrThrow = ret.valueOrThrow().returnValue
            if (retOrThrow is ResultValue.Error) {
                ctx.ctx.closeContext()
                throw KotlinRuntimeException(retOrThrow.error, ctx.ctx.file)
            }
        }
    }

    override fun createContext(p0: BaseEvent?, p1: File?): KotlinScriptContext {
        return KotlinScriptContext(runner, p0, p1)
    }

    val defaultJvmScriptingHostConfiguration
        get() = ScriptingHostConfiguration {
//            getScriptingClass(MyJvmGetScriptingClass(KotlinExtension.classLoader))
        }

    class KotlinCompileException(val resultWithDiagnostics: ResultWithDiagnostics<*>) : Exception()
    class KotlinRuntimeException(error: Throwable, val file: File?) : Exception(error)
}

class CompilerSetting {
    companion object {
        var config: ConfigManager? = null

        fun init(runner: Core<*, *>) {
            runner.config.addOptions("KotlinSetting", CompilerSetting::class.java)
            config = runner.config
        }

        fun shouldPatchClassloader() = config?.getOptions(CompilerSetting::class.java)?.patchClassloader ?: true
    }

    @JvmField
    @Option(translationKey = "jsmacros.settings.languages.kotlin.classloaderpatch", group = ["jsmacros.settings.languages", "jsmacros.settings.languages.kotlin"], setter = "setPatchClassloader")
    var patchClassloader = true

}

class MyJvmGetScriptingClass(val myClassLoader: ClassLoader) : GetScriptingClassByClassLoader {

    @Transient
    private var dependencies: List<ScriptDependency>? = null

    @Transient
    private var classLoader: ClassLoader? = null

    @Transient
    // TODO: find out whether Transient fields are initialized on deserialization and if so, convert back to not-nullable val
    private var baseClassLoaderIsInitialized: Boolean? = null

    @Transient
    private var baseClassLoader: ClassLoader? = null

    override fun invoke(classType: KotlinType, contextClass: KClass<*>, hostConfiguration: ScriptingHostConfiguration): KClass<*> =
        invoke(classType, contextClass.java.classLoader, hostConfiguration)

    @Synchronized
    override operator fun invoke(
        classType: KotlinType,
        contextClassLoader: ClassLoader?,
        hostConfiguration: ScriptingHostConfiguration
    ): KClass<*> {

        // checking if class already loaded in the same context
        val fromClass = classType.fromClass
        if (fromClass != null) {
            if (fromClass.java.classLoader == null) return fromClass // root classloader
            val actualClassLoadersChain = generateSequence(contextClassLoader) { it.parent }
            if (actualClassLoadersChain.any { it == fromClass.java.classLoader }) return fromClass
        }

        val newDeps = hostConfiguration[ScriptingHostConfiguration.configurationDependencies]
        if (dependencies == null) {
            dependencies = newDeps
        } else {
            if (newDeps != dependencies) throw IllegalArgumentException(
                "scripting configuration dependencies changed:\nold: ${dependencies?.joinToString { (it as? JvmDependency)?.classpath.toString() }}\nnew: ${newDeps?.joinToString { (it as? JvmDependency)?.classpath.toString() }}"
            )
        }

        if (baseClassLoaderIsInitialized != true) {
            baseClassLoader = contextClassLoader
            baseClassLoaderIsInitialized = true
        }

        if (classLoader == null) {
            val classpath = dependencies?.flatMap { dependency ->
                when (dependency) {
                    is JvmDependency -> dependency.classpath.map { it.toURI().toURL() }
                    else -> throw IllegalArgumentException("unknown dependency type $dependency")
                }
            }
            classLoader =
                if (classpath == null || classpath.isEmpty()) baseClassLoader
                else URLClassLoader(classpath.toTypedArray(), baseClassLoader)
        }

        return try {
            (classLoader ?:
                if(classType.typeName.contains("ClassPath")) myClassLoader
                else ClassLoader.getSystemClassLoader()
            ).loadClass(classType.typeName).kotlin
        } catch (e: Throwable) {
            throw IllegalArgumentException("unable to load class ${classType.typeName}", e)
        }
    }

    override fun equals(other: Any?): Boolean =
        when {
            other === this -> true
            other !is MyJvmGetScriptingClass -> false
            else -> {
                other.dependencies == dependencies &&
                        (other.classLoader == null || classLoader == null || other.classLoader == classLoader) &&
                        (other.baseClassLoader == null || baseClassLoader == null || other.baseClassLoader == baseClassLoader)
            }
        }

    override fun hashCode(): Int {
        return dependencies.hashCode() + 23 * classLoader.hashCode() + 37 * baseClassLoader.hashCode()
    }
}

class NamedFileScriptSource(
    override val name: String, file: File
) : SourceCode {
    override val locationId: String = file.path
    override val text: String by lazy {
        file.readText()
    }
}

var incrementalScriptSourceCounter = 1L
fun File.toIncrementalScriptSource(): SourceCode {
    if (!CompilerSetting.shouldPatchClassloader())
        return toScriptSource()
    val name = if(this.nameWithoutExtension.endsWith(".jsm"))
        this.nameWithoutExtension.substringBeforeLast(".")
    else this.name


    return NamedFileScriptSource(
        "${name}_${incrementalScriptSourceCounter}.jsm.kts",
        this,
    )
}