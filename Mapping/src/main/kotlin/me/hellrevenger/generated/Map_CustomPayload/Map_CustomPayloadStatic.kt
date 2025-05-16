package me.hellrevenger.generated.Map_CustomPayload
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CustomPayloadKt {
    /**
     * method_56483
     */
    fun <T>id(id: String?) where T: CustomPayload = CustomPayload.method_56483<T>(id)
    /**
     * method_56484
     */
    fun <B, T>codecOf(encoder: ValueFirstEncoder<B, T>?, decoder: PacketDecoder<B, T>?) where B: ByteBuf, T: CustomPayload = CustomPayload.method_56484<B, T>(encoder, decoder)
    /**
     * method_56485
     */
    fun <B>createCodec(unknownCodecFactory: net.minecraft.class_8710.class_9153<B>?, types: MutableList<net.minecraft.class_8710.class_9155<in B, *>>?) where B: PacketByteBuf = CustomPayload.method_56485<B>(unknownCodecFactory, types)
}