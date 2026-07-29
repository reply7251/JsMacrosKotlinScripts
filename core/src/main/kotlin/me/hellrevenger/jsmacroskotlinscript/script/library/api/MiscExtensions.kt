package me.hellrevenger.jsmacroskotlinscript.script.library.api

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Semaphore
import me.hellrevenger.jsmacroskotlinscript.SharedLibraries
import me.hellrevenger.jsmacroskotlinscript.script.language.KotlinScriptContext
import me.hellrevenger.jsmacroskotlinscript.ScriptReceiver
import me.hellrevenger.jsmacroskotlinscript.script.library.api.gui.widget.ComplexDraw2D
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.EventType
import me.hellrevenger.jsmacroskotlinscript.script.library.impl.FWrapper
import net.minecraft.ChatFormatting
import net.minecraft.client.Minecraft
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.FormattedText
import xyz.wagyourtail.jsmacros.client.api.classes.TextBuilder
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.client.api.library.impl.FClient
import xyz.wagyourtail.jsmacros.client.api.library.impl.FHud
import xyz.wagyourtail.jsmacros.core.classes.Registrable
import xyz.wagyourtail.jsmacros.core.library.impl.FJsMacros

@Suppress("unused")
object MiscExtensions {
    val mc = Minecraft.getInstance()

    fun FChat.error(message: String) {
        mc.player?.let { player ->
            mc.execute {
                player.sendSystemMessage(message.withColor(ChatFormatting.RED))
            }
        } ?: message.logError()
    }

    fun FChat.error(e: Throwable, limit: Int = 30) {
        mc.player?.let { player ->
            mc.execute {
                player.sendSystemMessage(e.toString().withColor(ChatFormatting.RED))
                var i = 0
                for(stack in e.stackTrace) {
                    val redPart = "  at ${stack.className}.${stack.methodName}"
                        .withColor(ChatFormatting.RED)
                    val goldPart = " (${stack.fileName}:${stack.lineNumber})"
                        .withColor(ChatFormatting.GOLD)

                    val message = redPart.append(goldPart)
                    player.sendSystemMessage(message)
                    if (stack.className.contains("kotlin.script.experimental.jvm.BasicJvmScriptEvaluator") || i++ > limit) {
                        break
                    }
                }
            }
        } ?: e.logError()
    }

    fun FChat.title(title: String) =
        title(title.literal())

    fun FChat.title(title: Component) =
        mc.gui.hud.setTitle(title)

    fun FChat.subTitle(title: String) =
        subTitle(title.literal())

    fun FChat.subTitle(title: Component) =
        mc.gui.hud.setSubtitle(title)

    fun FChat.titleTick(fadeIn: Int = 1, remain: Int = 10, fadeOut: Int = 1) =
        mc.gui.hud.setTimes(fadeIn, remain, fadeOut)

    fun FChat.calculateWidth(message: String) = runBlocking {
        var result = 0
        runOnMainThread(true) {
            result = mc.font.width(message)
        }
        result
    }
    fun FChat.calculateWidth(message: FormattedText) = runBlocking {
        var result = 0
        runOnMainThread(true) {
            result = mc.font.width(message)
        }
        result
    }

    fun FJsMacros.waitUntilGameLoaded() {
        if (!mc.isGameLoadFinished) {
            waitForEvent(EventType.GameLoad)
        }
    }

    fun FJsMacros.waitUntilWorldLoaded() {
        if (!SharedLibraries.World.isWorldLoaded) {
            waitForEvent(EventType.ChunkLoad)
        }
    }

    fun <T> FJsMacros.waitForEvent(eventType: EventType<T>) {
        waitForEvent(eventType.toString())
    }

    fun FJsMacros.waitUntil(interval: Long = 50L, pred: () -> Boolean) {
        _getPrivateValue<KotlinScriptContext>("ctx")!!.waitUntil(interval, pred)
    }

    fun TextBuilder.withClickEvent(action: TextClickAction, value: String) =
        this.withClickEvent(action.action, value)!!

    context(receiver: ScriptReceiver)
    fun <T> Registrable<T>.registerForScript() {
        register()
        receiver.context.onContextClosed {
            unregister()
        }
    }

    fun FHud.createComplexDraw2D() = ComplexDraw2D()

    fun FClient.runOnMainThread(callback: () -> Unit) =
        MiscExtensions.runOnMainThread(callback)

    suspend fun FClient.runOnMainThread(await: Boolean, callback: () -> Unit) =
        MiscExtensions.runOnMainThread(await, callback)

    fun runOnMainThread(callback: () -> Unit) {
        runBlocking {
            runOnMainThread(false, callback)
        }
    }

    suspend fun runOnMainThread(await: Boolean, callback: () -> Unit) {
        if (mc.isSameThread) {
            callback()
        } else if (await) {
            val semaphore = Semaphore(0)
            mc.execute {
                try {
                    callback()
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    semaphore.release()
                }
            }
            semaphore.acquire()
        } else {
            mc.execute { callback() }
        }
    }

    context(receiver: ScriptReceiver)
    fun <R> Function0<R>.toMethodWrapper() =
        receiver.context.getLibrary<FWrapper>().methodToJava<Any, Any, R>(this)

    context(receiver: ScriptReceiver)
    fun <T, R> Function1<T, R>.toMethodWrapper() =
        receiver.context.getLibrary<FWrapper>().methodToJava<T, Any, R>(this)

    context(receiver: ScriptReceiver)
    fun <T, U, R> Function2<T, U, R>.toMethodWrapper() =
        receiver.context.getLibrary<FWrapper>().methodToJava(this)

    fun UInt.fixColor() =
        if (this.toLong() and 0xff000000 == 0L && this.toInt() and 0xffffff != 0) {
            this or 0xff000000u
        } else this
}

@Suppress("unused")
object CTargetType {
    const val HEAD = "HEAD"
    const val RETURN = "RETURN"
    const val TAIL = "TAIL"
    const val THROW = "THROW"
    const val INVOKE = "INVOKE"
    const val FIELD = "FIELD"
    const val GET_FIELD = "GETFIELD"
    const val PUT_FIELD = "PUTFIELD"
    const val NEW = "NEW"
    const val OPCODE = "OPCODE"
    const val CONSTANT = "CONSTANT"

    const val SIMPLE_INVOKE = "SIMPLE_INVOKE"
    const val SIMPLE_NEW = "SIMPLE_NEW"
    const val SIMPLE_FIELD = "SIMPLE_FIELD"
    const val SIMPLE_GET_FIELD = "SIMPLE_GET_FIELD"
    const val SIMPLE_PUT_FIELD = "SIMPLE_PUT_FIELD"
}

@Suppress("unused")
enum class TextClickAction(val action: String) {
    OPEN_URL("open_url"),
    OPEN_FILE("open_file"),
    RUN_COMMAND("run_command"),
    SUGGEST_COMMAND("suggest_command"),
    CHANGE_PAGE("change_page"),
    COPY_TO_CLIPBOARD("copy_to_clipboard"),
}
