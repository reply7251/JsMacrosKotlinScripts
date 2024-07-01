package me.hellrevenger

import xyz.wagyourtail.jsmacros.client.api.library.impl.*
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.IFWrapper
import xyz.wagyourtail.jsmacros.core.library.impl.*
import java.io.File
import kotlin.script.experimental.annotations.KotlinScript
import kotlin.script.experimental.jvm.dependenciesFromCurrentContext
import kotlin.script.experimental.jvm.jvm

import net.minecraft.class_310;
import kotlin.script.experimental.api.*

fun noop() {
    class_310.method_1551()
}

@KotlinScript(
    fileExtension = "jsm.kts",
    compilationConfiguration = SimpleScriptConfiguration::class,
)
abstract class SimpleScript(
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

    val JavaWrapper: IFWrapper<Function<*>>,
    val context: EventContainer<BaseScriptContext<*>>,
    val file: File,
    val event: BaseEvent
)

object SimpleScriptConfiguration : ScriptCompilationConfiguration({
    jvm {
        dependenciesFromCurrentContext(wholeClasspath = true, unpackJarCollections = true);
    }
})