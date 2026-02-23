package me.hellrevenger

import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.impl.*
import com.jsmacrosce.jsmacros.api.library.FJavaUtils
import com.jsmacrosce.jsmacros.api.library.FUtils
import com.jsmacrosce.jsmacros.client.api.library.impl.*
import com.jsmacrosce.jsmacros.core.event.BaseEvent
import com.jsmacrosce.jsmacros.core.library.Library
import com.jsmacrosce.jsmacros.core.library.impl.*
import java.io.File
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

import kotlin.script.experimental.api.*
import kotlin.script.experimental.host.FileBasedScriptSource
import kotlin.script.experimental.host.FileScriptSource
import kotlin.script.experimental.jvm.JvmDependency
import kotlin.script.experimental.jvm.updateClasspath


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

    val JavaWrapper: FWrapper,
    val context: KotlinScriptContext,
    val file: File?,
    val event: BaseEvent?,

    val EventListener: FEventListener,
    val ScriptConfig: FScriptConfig,
    val RuntimeTransform: FRuntimeTransform,
)

object SimpleScriptConfiguration : ScriptCompilationConfiguration({
    jvm {
        dependenciesFromCurrentContext(wholeClasspath = true);
    }

    defaultImports(ImportJar::class, Import::class, ClassPath::class, EventType::class)

    val libs = mutableMapOf(*KotlinExtension().libraries.mapNotNull {
        if(it.isAnnotationPresent(Library::class.java))
            it.getAnnotation(Library::class.java).value to KotlinType(it.kotlin)
        else
            null
    }.toTypedArray())

    providedProperties.replaceOnlyDefault(libs)


    implicitReceivers.append(KotlinType((SimpleScript::class)))

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

/**
 * Put @file:ImportJar(...) on the top of file.
 *
 * Only for IDE, still needs to add to classpath at runtime
 */
@Target(AnnotationTarget.FILE)
annotation class ImportJar(vararg val path: String)
@Target(AnnotationTarget.FILE)
annotation class Import(vararg val path: String)
@Target(AnnotationTarget.FILE)
annotation class ClassPath(vararg val path: String)