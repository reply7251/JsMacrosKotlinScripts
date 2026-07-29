package me.hellrevenger.jsmacroskotlinscript.script.library.api

import me.hellrevenger.jsmacroskotlinscript.JsMacrosKotlinScript
import me.hellrevenger.jsmacroskotlinscript.script.library.api.MiscExtensions.mc
import net.minecraft.ChatFormatting
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.Style

fun String.dot() = replace('/', '.')
fun String.slash() = replace('.', '/')

fun String.log(vararg objs: Any?) {
    JsMacrosKotlinScript.LOG.info(this, *objs)
}
fun Throwable.logError() {
    JsMacrosKotlinScript.LOG.error(this.message, this)
}
fun String.logError() {
    JsMacrosKotlinScript.LOG.error(this)
}

fun String.literal() = Component.literal(this)
fun String.translate(vararg objs: Any) = Component.translatable(this, *objs)
fun String.withColor(color: ChatFormatting) = literal().withStyle(Style.EMPTY.withColor(color))

fun Component.sendToPlayer() =
    mc.player?.let { player ->
        mc.execute {
            player.sendSystemMessage(this)
        }
    }