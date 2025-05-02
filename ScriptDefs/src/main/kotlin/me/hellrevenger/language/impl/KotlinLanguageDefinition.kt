package me.hellrevenger.language.impl

import me.hellrevenger.*
import me.hellrevenger.mixins.MixinClassLoader
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ConfigManager
import xyz.wagyourtail.jsmacros.core.config.Option
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import java.io.File
import kotlin.collections.mapOf
import kotlin.collections.mapValues
import kotlin.collections.plus
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

class KotlinLanguageDefinition(extension: Extension?, runner: Core<*, *>?)
    : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {
    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val vars = mapOf(
            "event" to event,
            "file" to ctx.ctx.file,
            "context" to ctx.ctx
        )

        val libs = retrieveLibs(ctx.ctx)

        var K2 = CompilerSetting.isK2Enabled()

        val compConf = object : ScriptCompilationConfiguration({
            jvm {
                // Extract the whole classpath from context classloader and use it as dependencies
                dependenciesFromCurrentContext(wholeClasspath = true)
                dependencies.append(JvmDependencyFromClassLoader { KotlinLanguageDefinition::class.java.classLoader })
            }
            defaultImports(ImportJar::class)

            refineConfiguration {
                beforeCompiling {context ->
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
        }) {}
        val execConf = object : ScriptEvaluationConfiguration({
            providedProperties(vars + libs)
        }) {}

        val host = BasicJvmScriptingHost()
        ctx.ctx.context = host

        callback(ctx.ctx.context, compConf, execConf)
    }

    override fun exec(ctx: EventContainer<KotlinScriptContext>, p1: ScriptTrigger, event: BaseEvent) {
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
        return KotlinScriptContext(runner, p0, p1)
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
    @Option(translationKey = "K2", group = ["jsmacros.settings.general"])
    var K2Enabled = true

    @JvmField
    @Option(translationKey = "Classloader patch", group = ["jsmacros.settings.general"], setter = "setPatchClassloader")
    var patchClassloader = true

    @JvmName("togglePatchClassloader")
    fun setPatchClassloader(value: Boolean) {
        patchClassloader = value
        MixinClassLoader.setEnabled(value)
    }
}