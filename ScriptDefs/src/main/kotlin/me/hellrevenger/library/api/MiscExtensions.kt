package me.hellrevenger.library.api

import me.hellrevenger.SharedLibraries
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.impl.EventType
import com.jsmacrosce.jsmacros.client.api.classes.TextBuilder
import com.jsmacrosce.jsmacros.client.api.library.impl.FChat
import com.jsmacrosce.jsmacros.core.library.impl.FJsMacros

@Suppress("unused")
object MiscExtensions {
    fun FChat.safeToast(title: Any, content: Any) {
        if(SharedLibraries.Client.minecraft.field_1772 != null)
            this.toast(title, content)
    }

    fun FJsMacros.waitUntilGameLoaded() {
        if (!SharedLibraries.Client.minecraft.method_53466()) {
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
