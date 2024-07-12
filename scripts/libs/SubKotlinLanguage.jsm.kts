import io.github.gaming32.jsmacros.kotlin.KotlinExtension
import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinLanguageDefinition
import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinScriptContext
import io.github.gaming32.jsmacros.kotlin.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.BaseWrappedException
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.impl.FReflection
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import kotlin.concurrent.thread
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.toScriptSource
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

        Chat.log("perExec: " + runner.libraryRegistry.perExec.values.joinToString { it.getAnnotation(Library::class.java).value })

        val libs = retrieveLibs(ctx.ctx)
        Chat.log("libs: " + libs.keys.joinToString { it })

        val compConf = object : ScriptCompilationConfiguration({
            jvm {
                // Extract the whole classpath from context classloader and use it as dependencies
                dependenciesFromCurrentContext(wholeClasspath = true)
                dependenciesFromClassloader(classLoader = FReflection::class.java.classLoader, wholeClasspath = true)

                //dependenciesFromClassContext(BaseScriptContext::class, wholeClasspath = true)

                /*
                val filtered = libs.filterKeys { !(libraries!!.containsKey(it)) }

                filtered.values.forEach {
                    //Chat.log("force loading: ${it.javaClass.simpleName}")
                    dependenciesFromClassContext(it.javaClass.kotlin)
                }
                */
            }

            providedProperties.replaceOnlyDefault(mapOf(
                "event" to KotlinType(if (event == null) BaseEvent::class else event::class, isNullable = true),
                "file" to KotlinType(File::class, isNullable = true),
                "context" to KotlinType(EventContainer::class)
            ) + libs.mapValues { KotlinType(it.value::class) } + mapOf("JavaWrapper" to KotlinType(FWrapper::class)))

        }) {}
        val execConf = object : ScriptEvaluationConfiguration({
            jvm {
                //baseClassLoader.put(FReflection::class.java.classLoader)
                baseClassLoader.put(FReflection.classLoader)
                //baseClassLoader.put(Thread.currentThread().contextClassLoader)
            }

            providedProperties(vars + libs + mapOf("JavaWrapper" to FWrapper(ctx.ctx, KotlinLanguageDefinition::class.java)) )
        }) {}

        ctx.ctx.context = BasicJvmScriptingHost()

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
        //return mutableSetOf(BuildedProxiedFWrapper)
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
                    sw.toString().split("\r\n").forEach { Chat.log(it) }
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
        if (sd.severity == ScriptDiagnostic.Severity.DEBUG) {
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


/*
val BuildedProxiedFWrapper: Class<out BaseLibrary> = try {
    Reflection.getClassFromClassBuilderResult("ProxiedFWrapper") as Class<BaseLibrary>
} catch (e: Exception) {
    when(e) {
        is NullPointerException, is ClassNotFoundException -> {

            Reflection.createLibraryBuilder("ProxiedFWrapper", true)
                .addAnnotation(Library::class.java)
                .putString("value", "JavaWrapper")
                .putArray("languages").putClass(KotlinSubLanguageDefinition::class.java)
                .finish()
                .finish()
                .addField(FWrapper::class.java, "original")
                .end()
                .addConstructor(KotlinScriptContext::class.java, Class::class.java)
                .makePublic()
                .body("""
                    {
                        super($1, $2);
                        this.original = new io.github.gaming32.jsmacros.kotlin.library.impl.FWrapper($1, $2);
                    }
                    """.trimIndent())
                .addMethod(MethodWrapper::class.java, "methodToJava", Function::class.java)
                .makePublic()
                .body("""
                    {
                        JavaWrapper.methodToJava($1)
                    }
                    """.trimIndent())
                .addMethod(MethodWrapper::class.java, "methodToJavaAsync", Function::class.java)
                .makePublic()
                .body("""
                    {
                        JavaWrapper.methodToJavaAsync($1)
                    }
                    """.trimIndent())
                .addMethod(Void.TYPE, "stop")
                .makePublic()
                .body("""
                    this.ctx.closeContext();
                    """.trimIndent())
                .finishBuildAndFreeze()
        }

        else -> throw e
    }
}
*/
/*
@Library(value = "JavaWrapper", languages = [KotlinSubLanguageDefinition::class])
class ProxiedFWrapper(context: KotlinScriptContext, language: Class<out BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>>) : PerExecLanguageLibrary<BasicJvmScriptingHost, KotlinScriptContext>(context, language), IFWrapper<Function<*>> {

    val original = FWrapper(context, language)

    override fun <A : Any, B : Any, R : Any> methodToJava(p0: Function<*>): MethodWrapper<A, B, R, *> {
        return original.methodToJava(p0)
    }

    override fun <A : Any, B : Any, R : Any> methodToJavaAsync(p0: Function<*>): MethodWrapper<A, B, R, *> {
        return original.methodToJavaAsync(p0)
    }

    override fun stop() {
        ctx.closeContext()
    }
}
*/
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