package me.hellrevenger.language.impl

import me.hellrevenger.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.config.ScriptTrigger
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.extensions.Extension
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import java.io.File
import java.net.URLClassLoader
import kotlin.collections.HashMap
import kotlin.collections.Map
import kotlin.collections.MutableMap
import kotlin.collections.Set
import kotlin.collections.flatMap
import kotlin.collections.hashMapOf
import kotlin.collections.isNullOrEmpty
import kotlin.collections.map
import kotlin.collections.mapOf
import kotlin.collections.mapValues
import kotlin.collections.plus
import kotlin.collections.remove
import kotlin.collections.set
import kotlin.collections.toMap
import kotlin.collections.toSet
import kotlin.collections.toTypedArray
import kotlin.reflect.KClass
import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.*
import kotlin.script.experimental.jvm.*
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

fun noop() {
    //println("noop: " + MinecraftClient.method_1551().player)
}

class KotlinLanguageDefinition(extension: Extension?, runner: Core<*, *>?)
    : BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>(extension, runner) {

    fun internalExec(ctx: EventContainer<KotlinScriptContext>, event: BaseEvent?, callback: (BasicJvmScriptingHost, ScriptCompilationConfiguration, ScriptEvaluationConfiguration) -> Unit) {
        val vars = mapOf(
            "event" to event,
            "file" to ctx.ctx.file,
            "context" to ctx
        )

        val libs = retrieveLibs(ctx.ctx)

        val compConf = object : ScriptCompilationConfiguration({
            jvm {
                // Extract the whole classpath from context classloader and use it as dependencies
                dependenciesFromCurrentContext()
                dependencies.append(JvmDependencyFromClassLoader { KotlinLanguageDefinition::class.java.classLoader })
            }

            providedProperties.replaceOnlyDefault(mapOf(
                "event" to KotlinType(if (event == null) BaseEvent::class else event::class, isNullable = true),
                "file" to KotlinType(File::class, isNullable = true),
                "context" to KotlinType(EventContainer::class)
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
        return KotlinScriptContext(p0, p1)
    }

    class KotlinCompileException(val resultWithDiagnostics: ResultWithDiagnostics<*>) : Exception()
    class KotlinRuntimeException(val error: Throwable, val file: File?) : Exception(error)
}