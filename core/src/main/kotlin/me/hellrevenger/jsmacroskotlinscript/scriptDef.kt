package me.hellrevenger.jsmacroskotlinscript

import me.hellrevenger.jsmacroskotlinscript.script.language.KotlinScriptContext
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ClassPath
import me.hellrevenger.jsmacroskotlinscript.script.library.api.Import
import me.hellrevenger.jsmacroskotlinscript.script.library.api.ImportJar
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.EventType
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.FEventListener
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.FRuntimeTransform
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.FScriptConfig
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.api.library.FJavaUtils
import xyz.wagyourtail.jsmacros.api.library.FUtils
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.client.api.library.impl.FClient
import xyz.wagyourtail.jsmacros.client.api.library.impl.FHud
import xyz.wagyourtail.jsmacros.client.api.library.impl.FKeyBind
import xyz.wagyourtail.jsmacros.client.api.library.impl.FPlayer
import xyz.wagyourtail.jsmacros.client.api.library.impl.FPositionCommon
import xyz.wagyourtail.jsmacros.client.api.library.impl.FWorld
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.impl.FFS
import xyz.wagyourtail.jsmacros.core.library.impl.FGlobalVars
import xyz.wagyourtail.jsmacros.core.library.impl.FJsMacros
import xyz.wagyourtail.jsmacros.core.library.impl.FReflection
import xyz.wagyourtail.jsmacros.core.library.impl.FRequest
import xyz.wagyourtail.jsmacros.core.library.impl.FTime
import java.io.File
import kotlin.collections.toList
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.FileBasedScriptSource
import kotlin.script.experimental.host.FileScriptSource
import kotlin.script.experimental.jvm.updateClasspath


@Suppress("UNUSED")
@KotlinScript(
    fileExtension = "jsm.kts",
    compilationConfiguration = SimpleScriptConfiguration::class,
)
abstract class SimpleScript(
)

object SimpleScriptConfiguration : ScriptCompilationConfiguration({
    jvm {
        dependenciesFromCurrentContext(wholeClasspath = true)
    }


    defaultImports(ImportJar::class, Import::class, ClassPath::class, EventType::class)

    val libs = mutableMapOf(*KotlinExtension().libraries.toList().mapNotNull {
        if(it.isAnnotationPresent(Library::class.java))
            it.getAnnotation(Library::class.java).value to KotlinType(it.kotlin)
        else
            null
    }.toTypedArray())

    providedProperties(
        "JsMacros" to KotlinType(FJsMacros::class),
        "FS" to KotlinType(FFS::class),
        "GlobalVars" to KotlinType(FGlobalVars::class),
        "Reflection" to KotlinType(FReflection::class),
        "Request" to KotlinType(FRequest::class),
        "Time" to KotlinType(FTime::class),
        "Chat" to KotlinType(FChat::class),
        "Hud" to KotlinType(FHud::class),
        "Client" to KotlinType(FClient::class),
        "KeyBind" to KotlinType(FKeyBind::class),
        "Player" to KotlinType(FPlayer::class),
        "PositionCommon" to KotlinType(FPositionCommon::class),
        "JavaUtils" to KotlinType(FJavaUtils::class),
        "Utils" to KotlinType(FUtils::class),
        "World" to KotlinType(FWorld::class),

        "JavaWrapper" to KotlinType(FWrapper::class),

        "EventListener" to KotlinType(FEventListener::class),
        "ScriptConfig" to KotlinType(FScriptConfig::class),
        "RuntimeTransform" to KotlinType(FRuntimeTransform::class),
    )

    providedProperties.replaceOnlyDefault(libs)
    baseClass(ScriptReceiver::class)

    refineConfiguration {
        onAnnotations(ImportJar::class, Import::class, ClassPath::class) { context ->
            val annotations = context.collectedData?.get(ScriptCollectedData.collectedAnnotations)
                ?.takeIf { it.isNotEmpty() }
                ?: return@onAnnotations context.compilationConfiguration.asSuccess()

            val scriptBaseDir = (context.script as? FileBasedScriptSource)?.file?.parentFile

            val files = annotations.mapNotNull {
                (it.annotation as? ImportJar)?.path ?: (it.annotation as? Import)?.path ?: (it.annotation as? ClassPath)?.path
            }.flatMap { it.toList() }.mapNotNull {
                var f = (scriptBaseDir?.resolve(it) ?: File(it)).normalize()
                if(f.exists()) f
                else {
                    f = File(context.script.locationId?.let { it1 -> File(it1).parentFile }, it)
                    if(f.exists()) f
                    else null
                }
            }

            val jars = files
                .filter { it.path.endsWith(".jar") }
            val ktses = files
                .filter { it.path.endsWith(".kts") }

            ScriptCompilationConfiguration(context.compilationConfiguration) {
                if(jars.isNotEmpty()) {
                    updateClasspath(jars)
                }
                if (ktses.isNotEmpty()) {
                    importScripts.append(ktses.map {
                        FileScriptSource(it)
                    })
                }
            }.asSuccess()
        }
    }
})

open class ScriptReceiver(val event: BaseEvent?, val file: File?, val context: KotlinScriptContext) {}