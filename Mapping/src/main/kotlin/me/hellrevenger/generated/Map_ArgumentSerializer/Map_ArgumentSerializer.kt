package me.hellrevenger.generated.Map_ArgumentSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41726
 */
fun <A, T>ArgumentSerializer<A, T>.getArgumentTypeProperties(arg0: A) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_41726(arg0)
/**
 * method_10005
 */
fun <A, T>ArgumentSerializer<A, T>.fromPacket(arg0: PacketByteBuf) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10005(arg0)
/**
 * method_10006
 */
fun <A, T>ArgumentSerializer<A, T>.writeJson(arg0: T, arg1: JsonObject) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10006(arg0, arg1)
/**
 * method_10007
 */
fun <A, T>ArgumentSerializer<A, T>.writePacket(arg0: T, arg1: PacketByteBuf) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10007(arg0, arg1)
