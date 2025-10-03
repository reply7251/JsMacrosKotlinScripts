package me.hellrevenger.language.impl

import me.hellrevenger.*
import me.hellrevenger.library.impl.EventType
import me.hellrevenger.mixins.MixinClassLoader
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ConfigManager
import xyz.wagyourtail.jsmacros.core.config.Option
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.extensions.ExtensionClassLoader
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import kotlin.collections.mapOf
import kotlin.collections.mapValues
import kotlin.collections.plus
import kotlin.reflect.KClass
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

class KotlinLanguageDefinition(extension: Extension?, runner: Core<*, *>?)
    : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {
    val externalClassPaths = mutableSetOf<File>()

    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val vars = mapOf(
            "event" to event,
            "file" to ctx.ctx.file,
            "context" to ctx.ctx
        )

        val libs = retrieveLibs(ctx.ctx)

        var K2 = CompilerSetting.isK2Enabled()

        val classLoader = KotlinExtension.classLoader
        Thread.currentThread().contextClassLoader = classLoader
        val compConf = (object : ScriptCompilationConfiguration(){}).with {
            jvm {
                dependenciesFromClassloader(classLoader = classLoader, wholeClasspath = true)
            }
            defaultImports(ImportJar::class, Import::class, ClassPath::class, EventType::class)

            refineConfiguration {
                onAnnotations<ClassPath> { context ->
                    val annotations = context.collectedData?.get(ScriptCollectedData.foundAnnotations)
                        ?.takeIf { it.isNotEmpty() }
                        ?: return@onAnnotations context.compilationConfiguration.asSuccess()

                    val files = annotations.mapNotNull {
                        (it as? ClassPath)?.path
                    }.flatMap { it.toList() }
                        .filter { it.endsWith(".jar") }
                        .mapNotNull {
                            var f = File(it)
                            if(f.exists()) f
                            else {
                                f = File(context.script.locationId?.let { it1 -> File(it1).parentFile }, it)
                                if(f.exists()) f
                                else null
                            }
                        }
                    (ctx.ctx.javaClass.classLoader as? ExtensionClassLoader)?.let { classLoader ->
                        files.forEach {
                            if(externalClassPaths.add(it)) {
                                println("new ExternalClassPath: ${it.absolutePath}")
                                classLoader.addURL(URL("jar:file:${it.canonicalPath}!/"))
                            }
                        }
                    }
                    context.compilationConfiguration.asSuccess()
                }
                beforeCompiling { context ->
                    context.script.text.split("\r?\n\r?".toRegex()).forEach {
                        if(it.startsWith("//")) {
                            val line = it.substring(2).replace(" ", "")
                            if(line.lowercase().startsWith("k2=")) {
                                K2 = line.substring("k2=".length).toBoolean()
                            }
                        }
                    }
                    context.compilationConfiguration.with {
                        if(!K2) {
                            compilerOptions.append("-language-version=1.9")
                        }
                        compilerOptions.append("-Xno-call-assertions")
                        compilerOptions.append("-Xno-param-assertions")
                    }.asSuccess()
                }
            }

            providedProperties.replaceOnlyDefault(mapOf(
                "event" to KotlinType(if (event == null) BaseEvent::class else event::class, isNullable = true),
                "file" to KotlinType(File::class, isNullable = true),
                "context" to KotlinType(KotlinScriptContext::class)
            ) + libs.mapValues { KotlinType(it.value::class) })
        }

        val execConf = object : ScriptEvaluationConfiguration({
            providedProperties(vars + libs)
//            enableScriptsInstancesSharing()
        }) {}


        val host = BasicJvmScriptingHost(
            ScriptingHostConfiguration()
                .withDefaultsFrom(defaultJvmScriptingHostConfiguration)
        )

        ctx.ctx.context = host

        callback(ctx.ctx.context, compConf, execConf)
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
                throw KotlinRuntimeException(retOrThrow.error, ctx.ctx.file)
            }
        }
    }

    override fun createContext(p0: BaseEvent?, p1: File?): KotlinScriptContext {
        return KotlinScriptContext(runner, p0, p1)
    }

    val defaultJvmScriptingHostConfiguration
        get() = ScriptingHostConfiguration {
            getScriptingClass(MyJvmGetScriptingClass(KotlinExtension.classLoader))
        }

    class KotlinCompileException(val resultWithDiagnostics: ResultWithDiagnostics<*>) : Exception()
    class KotlinRuntimeException(val error: Throwable, val file: File?) : Exception(error)
}

class CompilerSetting {
    companion object {
        var config: ConfigManager? = null

        fun init(runner: Core<*, *>) {
            runner.config.addOptions("KotlinSetting", CompilerSetting::class.java)
            config = runner.config

            config?.getOptions(CompilerSetting::class.java)?.setPatchClassloader(shouldPatchClassloader())
        }
        fun isK2Enabled() = config?.getOptions(CompilerSetting::class.java)?.K2Enabled ?: true

        fun shouldPatchClassloader() = config?.getOptions(CompilerSetting::class.java)?.patchClassloader ?: true
    }

    @JvmField
    @Option(translationKey = "jsmacros.settings.languages.kotlin.k2", group = ["jsmacros.settings.languages", "jsmacros.settings.languages.kotlin"])
    var K2Enabled = true

    @JvmField
    @Option(translationKey = "jsmacros.settings.languages.kotlin.classloaderpatch", group = ["jsmacros.settings.languages", "jsmacros.settings.languages.kotlin"], setter = "setPatchClassloader")
    var patchClassloader = true

    @JvmName("setPatchClassloader")
    fun setPatchClassloader(value: Boolean) {
        patchClassloader = value
        MixinClassLoader.setEnabled(value)
    }
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
) : FileScriptSource(file)

var incrementalScriptSourceCounter = 1L
fun File.toIncrementalScriptSource(): NamedFileScriptSource {
    val name = if(this.nameWithoutExtension.endsWith(".jsm"))
        this.nameWithoutExtension.substringBeforeLast(".")
    else this.name
    return NamedFileScriptSource("${name}.${incrementalScriptSourceCounter}.jsm.kts", this)
}