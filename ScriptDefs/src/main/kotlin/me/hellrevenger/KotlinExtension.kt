package me.hellrevenger


import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.library.impl.FEventCenter
import me.hellrevenger.library.impl.FWrapper
import net.minecraft.class_310
import xyz.wagyourtail.jsmacros.client.JsMacros
import xyz.wagyourtail.jsmacros.client.api.library.impl.FClient
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.BaseWrappedException
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import kotlin.concurrent.thread
import kotlin.script.experimental.api.ScriptCompilationConfiguration
import kotlin.script.experimental.api.ScriptDiagnostic
import kotlin.script.experimental.api.ScriptEvaluationConfiguration
import kotlin.script.experimental.api.onFailure
import kotlin.script.experimental.host.toScriptSource
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

class KotlinExtension: Extension {
    private var languageDefinition: KotlinLanguageDefinition? = null

    override fun init() {
        thread {
            val compConf = object : ScriptCompilationConfiguration({}) {}
            val evalConf = object : ScriptEvaluationConfiguration({}) {}
            val ret = BasicJvmScriptingHost().eval("println(\"Kotlin Preloaded!\")".toScriptSource(), compConf, evalConf)
            ret.onFailure {
                var reports = mutableListOf<String>()
                var exceptions = mutableListOf<Throwable>()
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

    override fun getPriority() = 0

    override fun getLanguageImplName() = "kotlin"

    override fun extensionMatch(file: File) =
        if (file.name.endsWith(".kts")) {
            if (file.name.contains(languageImplName)) {
                Extension.ExtMatch.MATCH_WITH_NAME
            }
            Extension.ExtMatch.MATCH
        } else Extension.ExtMatch.NOT_MATCH

    override fun defaultFileExtension() = "kts"

    override fun getLanguage(core: Core<*, *>?): BaseLanguage<*, *> {
        if (languageDefinition == null) {
            val classLoader: ClassLoader = Thread.currentThread().contextClassLoader
            Thread.currentThread().contextClassLoader = KotlinExtension::class.java.classLoader
            languageDefinition = KotlinLanguageDefinition(this, core)
            Thread.currentThread().contextClassLoader = classLoader
        }
        return languageDefinition!!
    }

    override fun getLibraries() =
        if(FClient(null).mcVersion() == "1.21") mutableSetOf(FWrapper::class.java, FEventCenter::class.java)
        else mutableSetOf(FWrapper::class.java)


    override fun wrapException(p0: Throwable?): BaseWrappedException<*>? {
        if (p0 is KotlinLanguageDefinition.KotlinCompileException) {
            val nextGetter = p0.resultWithDiagnostics.reports.iterator()
            p0.resultWithDiagnostics.reports.forEach {
                if (it.severity == ScriptDiagnostic.Severity.ERROR && it.exception != null) {
                    JsMacros.core.profile.logError(it.exception)
                }
            }
            return BaseWrappedException(null, "KotlinSub script failed to compile", null, if (nextGetter.hasNext()) wrapReport(nextGetter.next(), nextGetter) else null)
        }
        if (p0 is KotlinLanguageDefinition.KotlinRuntimeException) {
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