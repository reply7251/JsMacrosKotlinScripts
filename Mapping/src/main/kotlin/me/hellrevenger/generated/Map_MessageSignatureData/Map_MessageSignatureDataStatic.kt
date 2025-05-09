package me.hellrevenger.generated.Map_MessageSignatureData
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MessageSignatureDataKt {
    /**
     * field_40683
     */
    val SIZE by aliasStatic(MessageSignatureData::field_40683)
    /**
     * method_44845
     */
    fun write(buf: PacketByteBuf, signature: MessageSignatureData) = MessageSignatureData.method_44845(buf, signature)
    /**
     * method_46276
     */
    fun fromBuf(buf: PacketByteBuf) = MessageSignatureData.method_46276(buf)
}