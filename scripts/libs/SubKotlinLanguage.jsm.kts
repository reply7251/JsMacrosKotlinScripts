//service name: "YYHCCTL" or any zero hashCode string

import io.github.gaming32.jsmacros.kotlin.KotlinExtension
import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinLanguageDefinition
import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinScriptContext
import io.github.gaming32.jsmacros.kotlin.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.BaseWrappedException
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.net.URLClassLoader
import kotlin.concurrent.thread
import kotlin.reflect.KClass
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost


//service name: "YYHCCTL" or any zero hashCode string



class KotlinSubLanguageDefinition(extension: Extension, runner: Core<*, *>) : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {

    var libraries: Map<String, BaseLibrary>? = null

    override fun retrieveLibs(context: KotlinScriptContext?): MutableMap<String, BaseLibrary> {
        val result = super.retrieveLibs(context)
        if(libraries == null) {
            libraries = result.toMap()
        }
        return result
    }

    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val vars = mapOf(
            "event" to event,
            "file" to ctx.ctx.file,
            "context" to ctx
        )

        val libs = retrieveLibs(ctx.ctx)

        val cl = SubClassLoader(FWrapper::class.java.classLoader)

        val compConf = object : ScriptCompilationConfiguration({
            jvm {
                // Extract the whole classpath from context classloader and use it as dependencies
                dependenciesFromCurrentContext(wholeClasspath = true)
            }

            dependencies.append(JvmDependencyFromClassLoader { cl })
            dependencies.append(subLibraries.getClassLoaders().map { cl -> JvmDependencyFromClassLoader { cl } })

            providedProperties.replaceOnlyDefault(mapOf(
                "event" to KotlinType(if (event == null) BaseEvent::class else event::class, isNullable = true),
                "file" to KotlinType(File::class, isNullable = true),
                "context" to KotlinType(EventContainer::class)
            ) + libs.mapValues { KotlinType(it.value::class) } + mapOf(
                "JavaWrapper" to KotlinType(FWrapper::class),
                "SubLibraries" to KotlinType(SubLibraries::class),
            ) + subLibraries.getLibraryTypes())

        }) {}
        val execConf = object : ScriptEvaluationConfiguration({

            providedProperties(vars + libs + mapOf(
                "JavaWrapper" to FWrapper(ctx.ctx, KotlinLanguageDefinition::class.java),
                "SubLibraries" to subLibraries
            ) + subLibraries.getLibraryInstances())
        }) {}

        var conf: ScriptingHostConfiguration? = null
        conf = conf.withDefaultsFrom(defaultJvmScriptingHostConfiguration).with {
            getScriptingClass.put(object : GetScriptingClassByClassLoader {
                var setClassLoader: ClassLoader? = null
                override fun invoke(
                    classType: KotlinType,
                    contextClassLoader: ClassLoader?,
                    hostConfiguration: ScriptingHostConfiguration
                ): KClass<*> {
                    val fromClass = classType.fromClass
                    if (fromClass != null) {
                        if (fromClass.java.classLoader == null) return fromClass // root classloader
                        val actualClassLoadersChain = generateSequence(contextClassLoader) { it.parent }
                        if (actualClassLoadersChain.any { it == fromClass.java.classLoader }) return fromClass
                    }
                    val newDeps = hostConfiguration[configurationDependencies]
                    if(setClassLoader == null) {
                        val classpath = newDeps?.flatMap { dependency ->
                            when (dependency) {
                                is JvmDependency -> dependency.classpath.map { it.toURI().toURL() }
                                else -> throw IllegalArgumentException("unknown dependency type $dependency")
                            }
                        }
                        setClassLoader =
                            if (classpath == null || classpath.isEmpty()) SubClassLoader(contextClassLoader!!)
                            else SubClassLoader(URLClassLoader(classpath.toTypedArray(), contextClassLoader))
                    }

                    return try {
                        (setClassLoader ?: ClassLoader.getSystemClassLoader()).loadClass(classType.typeName).kotlin
                    } catch (e: Throwable) {
                        throw IllegalArgumentException("SubKotlin: unable to load class ${classType.typeName}", e)
                    }
                }

                override fun invoke(
                    classType: KotlinType,
                    contextClass: KClass<*>,
                    hostConfiguration: ScriptingHostConfiguration
                ) = invoke(classType, contextClass.java.classLoader, hostConfiguration)
            })
        }

        val host = BasicJvmScriptingHost(conf)
        ctx.ctx.context = host

        callback(ctx.ctx.context, compConf, execConf)
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, script: ScriptTrigger, event: BaseEvent) {
        internalExec(ctx, event) { host, compConf, evalConf ->
            val ret = host.eval(ctx.ctx.file!!.toScriptSource(), compConf, evalConf)
            ret.onFailure {
                throw KotlinCompileException(it)
            }

            val retOrThrow = ret.valueOrThrow().returnValue
            if (retOrThrow is ResultValue.Error) {
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
        return KotlinScriptContext(p0, p1)
    }

    class KotlinCompileException(val resultWithDiagnostics: ResultWithDiagnostics<*>) : Exception()
    class KotlinRuntimeException(val error: Throwable, val file: File?) : Exception(error)
}


class KotlinSubExtension: Extension {
    private var original = KotlinExtension()
    private var languageDefinition: KotlinSubLanguageDefinition? = null

    override fun init() {
        thread {
            val compConf = object : ScriptCompilationConfiguration({}) {}
            val evalConf = object : ScriptEvaluationConfiguration({}) {}
            val ret = BasicJvmScriptingHost().eval("println(\"KotlinSub Preloaded!\")".toScriptSource(), compConf, evalConf)
            ret.onFailure {
                val reports = mutableListOf<String>()
                val exceptions = mutableListOf<Throwable>()
                for (report in it.reports) {
                    if (report.exception != null) {
                        exceptions.add(report.exception!!)
                        reports.add(report.toString())
                    } else {
                        reports += report.toString()
                    }
                }
                throw RuntimeException("Kotlin script failed:\n        ${reports.joinToString("\n        ")}", exceptions.firstOrNull())
            }
        }
    }

    override fun getPriority(): Int {
        return 1
    }

    override fun getLanguageImplName(): String {
        return "kotlin.sub"
    }

    override fun extensionMatch(p0: File?): Extension.ExtMatch {
        if (p0 != null) {
            return if(p0.name.endsWith(defaultFileExtension())) Extension.ExtMatch.MATCH else Extension.ExtMatch.NOT_MATCH
        }
        return Extension.ExtMatch.NOT_MATCH
    }

    override fun defaultFileExtension(): String {
        return "jsm.kts"
    }

    override fun getLanguage(core: Core<*, *>): BaseLanguage<*, *> {
        if(languageDefinition == null) {
            val classLoader: ClassLoader = Thread.currentThread().contextClassLoader
            Thread.currentThread().contextClassLoader = KotlinSubExtension::class.java.classLoader
            languageDefinition = KotlinSubLanguageDefinition(this, core)
            Thread.currentThread().contextClassLoader = classLoader
        }
        return languageDefinition!!
    }
    /**/
    override fun getLibraries(): MutableSet<Class<out BaseLibrary>> {
        return mutableSetOf() //FWrapper::class.java
    }

    override fun wrapException(p0: Throwable?): BaseWrappedException<*>? {
        if (p0 is KotlinSubLanguageDefinition.KotlinCompileException) {
            val nextGetter = p0.resultWithDiagnostics.reports.iterator()
            p0.resultWithDiagnostics.reports.forEach {
                if (it.severity == ScriptDiagnostic.Severity.ERROR) {
                    val sw = StringWriter()
                    val pw = PrintWriter(sw)
                    it.exception?.printStackTrace(pw)
                    //sw.toString().split("\r\n").forEach { Chat.log(it) }
                }
            }
            return BaseWrappedException(null, "KotlinSub script failed to compile", null, if (nextGetter.hasNext()) wrapReport(nextGetter.next(), nextGetter) else null)
        }
        if (p0 is KotlinSubLanguageDefinition.KotlinRuntimeException) {
            val cause = p0.cause ?: return null
            val nextGetter = cause.stackTrace.iterator()
            var message: String = cause.javaClass.simpleName
            val intMessage: String? = cause.message
            if (intMessage != null) {
                message = "$message: $intMessage"
            }
            return BaseWrappedException(cause, message, null, if (nextGetter.hasNext()) wrapStackTrace(p0.file, nextGetter.next(), nextGetter) else null)
        }
        return null
    }

    private fun wrapReport(sd: ScriptDiagnostic, nextGetter: Iterator<ScriptDiagnostic>): BaseWrappedException<ScriptDiagnostic>? {
        if (sd.severity == ScriptDiagnostic.Severity.DEBUG || sd.severity == ScriptDiagnostic.Severity.WARNING) {
            return if (nextGetter.hasNext()) wrapReport(nextGetter.next(), nextGetter) else null
        }
        return if (sd.location != null) {
            val file = sd.sourcePath?.let { File(it) }
            var startIndex = sd.location!!.start.absolutePos
            var endIndex = sd.location!!.end?.absolutePos
            val line = sd.location!!.start.line
            val column = sd.location!!.start.col
            if (startIndex == null) startIndex = -1
            if (endIndex == null) endIndex = -1
            val loc = BaseWrappedException.GuestLocation(file, startIndex, endIndex, line, column)
            BaseWrappedException(sd, "    " + sd.severity.toString() + " " + sd.message, loc, if (nextGetter.hasNext()) wrapReport(nextGetter.next(), nextGetter) else null)
        } else {
            BaseWrappedException(sd, "    " + sd.severity.toString() + " " + sd.message, null, if (nextGetter.hasNext()) wrapReport(nextGetter.next(), nextGetter) else null)
        }
    }

    private fun wrapStackTrace(f: File?, element: StackTraceElement, nextGetter: Iterator<StackTraceElement>): BaseWrappedException<StackTraceElement>? {
        return if (element.fileName?.endsWith(".kts") == true) {
            val loc = BaseWrappedException.GuestLocation(f, -1, -1, element.lineNumber, -1)
            BaseWrappedException(element, " at " + element.className + "." + element.methodName, loc, if (nextGetter.hasNext()) wrapStackTrace(f, nextGetter.next(), nextGetter) else null)
        } else {
            if (element.className == "kotlin.script.experimental.jvm.BasicJvmScriptEvaluator") {
                return null
            }
            BaseWrappedException.wrapHostElement(element, if (nextGetter.hasNext()) wrapStackTrace(f, nextGetter.next(), nextGetter) else null)
        }
    }

    override fun isGuestObject(p0: Any?): Boolean {
        return false
    }
}

class SubLibraries {
    val libraries: HashMap<String, Class<*>> = hashMapOf()
    val librarySupplier : HashMap<String, () -> Any> = hashMapOf()
    val libraryNames: HashMap<String, Class<*>> = hashMapOf()
    fun <T : Any> addLibrary(name: String, clazz: Class<T>, provider: () -> T): Class<*>? {
        libraryNames[clazz.typeName] = clazz
        librarySupplier[name] = provider
        return libraries.put(name, clazz)
    }

    fun removeLibrary(name: String): Class<*>? {
        librarySupplier.remove(name)
        return libraryNames.remove(libraries.remove(name)?.typeName)
    }

    fun getLibraryTypes(): Map<String, KotlinType> {
        return libraries.mapValues { KotlinType(it.value.kotlin) }
    }

    fun getLibraryInstances(): Map<String, Any?> {
        return librarySupplier.mapValues { it.value.invoke() }
    }

    fun getClassLoaders(): Set<ClassLoader> {
        return libraries.values.map { it.classLoader }.toSet()
    }
}

class SubClassLoader(parent: ClassLoader) : ClassLoader(parent) {
    override fun loadClass(name: String): Class<*> {
        try {
            return parent.loadClass(name)
        } catch (e: ClassNotFoundException) {
            if(name.startsWith(context.ctx.file!!.nameWithoutExtension.replace(".","_"))) {
                return Class.forName(name, false, KotlinSubExtension::class.java.classLoader)
            } else {
                val clazz = subLibraries.libraryNames[name]
                if(clazz != null) return clazz;
            }
            throw e;
        }
    }
}


val subLibraries = SubLibraries()
val extension = KotlinSubExtension()
val core = Core.getInstance()
core.extensions.allExtensions.add(extension)
extension.libraries.forEach {
    core.libraryRegistry.addLibrary(it)
}


(event as EventService).stopListener = JavaWrapper.methodToJava(fun() {
    core.extensions.allExtensions.remove(extension)
    extension.libraries.forEach {
        core.libraryRegistry.perExec.remove(it.getAnnotation(Library::class.java))
    }
} as Function0<*>)

Chat.log("Kotlin Sub Language Extension Enabled")