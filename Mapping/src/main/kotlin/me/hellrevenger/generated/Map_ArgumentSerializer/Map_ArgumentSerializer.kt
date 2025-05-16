package me.hellrevenger.generated.Map_ArgumentSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41726
 */
fun <A, T>ArgumentSerializer<A, T>.getArgumentTypeProperties(argumentType: A) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_41726(argumentType)
/**
 * method_10005
 */
fun <A, T>ArgumentSerializer<A, T>.fromPacket(buf: PacketByteBuf?) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10005(buf)
/**
 * method_10006
 */
fun <A, T>ArgumentSerializer<A, T>.writeJson(properties: T, json: JsonObject?) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10006(properties, json)
/**
 * method_10007
 */
fun <A, T>ArgumentSerializer<A, T>.writePacket(properties: T, buf: PacketByteBuf?) where A: ArgumentType<*>, T: net.minecraft.class_2314.class_7217<A> = this.method_10007(properties, buf)
