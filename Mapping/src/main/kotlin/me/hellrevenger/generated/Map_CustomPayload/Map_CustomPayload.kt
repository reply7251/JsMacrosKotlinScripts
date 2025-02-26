package me.hellrevenger.generated.Map_CustomPayload
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_56479
 */
fun CustomPayload.getId() = this.method_56479()
/**
 * method_56483
 */
fun <T>KClass<CustomPayload>.id(arg0: String) where T: CustomPayload = CustomPayload.method_56483<T>(arg0)
/**
 * method_56484
 */
fun <B, T>KClass<CustomPayload>.codecOf(arg0: ValueFirstEncoder<B, T>, arg1: PacketDecoder<B, T>) where B: ByteBuf, T: CustomPayload = CustomPayload.method_56484<B, T>(arg0, arg1)
/**
 * method_56485
 */
fun <B>KClass<CustomPayload>.createCodec(arg0: net.minecraft.class_8710.class_9153<B>, arg1: MutableList<net.minecraft.class_8710.class_9155<in B, *>>) where B: PacketByteBuf = CustomPayload.method_56485<B>(arg0, arg1)
