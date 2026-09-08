package me.hellrevenger.jsmacroskotlinscript.script.library.ctransform

import me.hellrevenger.jsmacroskotlinscript.script.library.api.literal
import me.hellrevenger.jsmacroskotlinscript.script.library.api.sendToPlayer
import net.lenni0451.classtransform.transformer.IPostTransformer
import net.minecraft.network.chat.ClickEvent
import net.minecraft.network.chat.Component
import net.minecraft.network.chat.HoverEvent
import net.minecraft.network.chat.Style
import java.io.File

class DumpPostTransformer(var folder: File? = null) : IPostTransformer {
    var enabled: Boolean = false

    override fun transform(className: String, bytecode: ByteArray) {
        if (!enabled) return
        folder?.let {
            it.mkdirs()
            val outputFile = File(it, "${className}.class")
            "dump to $outputFile".literal()
                .withStyle(
                    Style.EMPTY.withClickEvent(ClickEvent.OpenFile(it))
                        .withHoverEvent(HoverEvent.ShowText(Component.literal("open folder")))
                ).sendToPlayer()
            outputFile.writeBytes(bytecode)
        }
    }
}