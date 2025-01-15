package me.hellrevenger.generated.Map_MessageSignatureData
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<MessageSignatureData>.SIZE by aliasStatic(MessageSignatureData::field_40683)
fun MessageSignatureData.pack(arg0: MessageSignatureStorage) = this.method_46277(arg0)
fun MessageSignatureData.verify(arg0: SignatureVerifier, arg1: SignatureUpdatable) = this.method_44843(arg0, arg1)
fun MessageSignatureData.toByteBuffer() = this.method_44994()
fun MessageSignatureData.data() = this.comp_925()
fun KClass<MessageSignatureData>.write(arg0: PacketByteBuf, arg1: MessageSignatureData) = MessageSignatureData.method_44845(arg0, arg1)
fun KClass<MessageSignatureData>.fromBuf(arg0: PacketByteBuf) = MessageSignatureData.method_46276(arg0)
