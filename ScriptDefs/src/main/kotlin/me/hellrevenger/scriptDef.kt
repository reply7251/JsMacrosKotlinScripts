package me.hellrevenger

import me.hellrevenger.library.api.FEventListener
import me.hellrevenger.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.client.api.library.impl.*
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.impl.*
import java.io.File
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

import kotlin.script.experimental.api.*
import kotlin.script.experimental.jvm.JvmDependency


@Suppress("UNUSED")
@KotlinScript(
    fileExtension = "jsm.kts",
    compilationConfiguration = SimpleScriptConfiguration::class,
)
open class SimpleScript(
    val JsMacros: FJsMacros,
    val FS: FFS,
    val GlobalVars: FGlobalVars,
    val Reflection: FReflection,
    val Request: FRequest,
    val Time: FTime,
    val Chat: FChat,
    val Hud: FHud,
    val Client: FClient,
    val KeyBind: FKeyBind,
    val Player: FPlayer,
    val PositionCommon: FPositionCommon,
    val JavaUtils: FJavaUtils,
    val Utils: FUtils,
    val World: FWorld,
    val EventListener: FEventListener,

    val JavaWrapper: FWrapper,
    val context: BaseScriptContext<*>,
    val file: File,
    val event: BaseEvent,
)

fun createSimpleScript(map: Map<String, Any?>): SimpleScript? {
    return SimpleScript::class.constructors.firstOrNull()?.let { constructor ->
        val params = mutableListOf<Any>()
        constructor.parameters.forEach { param ->
            val obj = map[param.name] ?: return null
            params.add(obj)
        }
        constructor.call(*params.toTypedArray())
    }
}

object SimpleScriptConfiguration : ScriptCompilationConfiguration({
    jvm {
        dependenciesFromCurrentContext();
    }

    defaultImports(ImportJar::class)

    refineConfiguration {
        onAnnotations<ImportJar> { context ->
            val annotations = context.collectedData?.get(ScriptCollectedData.collectedAnnotations)
                ?.takeIf { it.isNotEmpty() }
                ?: return@onAnnotations context.compilationConfiguration.asSuccess()
            val files = annotations.mapNotNull { (it.annotation as? ImportJar)?.path }
                .flatMap { it.toList() }
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
            context.compilationConfiguration.with {
                dependencies.append(JvmDependency(files))
            }.asSuccess()
        }
    }

    implicitReceivers.append(KotlinType((SimpleScript::class)))
})

/**
 * Put @file:ImportJar(...) on the top of file.
 *
 * Only for IDE, still needs to add to classpath at runtime
 */
@Target(AnnotationTarget.FILE)
annotation class ImportJar(vararg val path: String)