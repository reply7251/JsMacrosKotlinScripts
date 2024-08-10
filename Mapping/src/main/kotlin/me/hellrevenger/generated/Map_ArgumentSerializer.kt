package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ArgumentSerializer

fun <T, A>ArgumentSerializer<A, T>.getArgumentTypeProperties(arg0: A) where T: net.minecraft.class_2314.class_7217<A>, A: ArgumentType<*> = this.method_41726(arg0)
fun <T, A>ArgumentSerializer<A, T>.fromPacket(arg0: PacketByteBuf) where T: net.minecraft.class_2314.class_7217<A>, A: ArgumentType<*> = this.method_10005(arg0)
fun <T, A>ArgumentSerializer<A, T>.writeJson(arg0: T, arg1: JsonObject) where T: net.minecraft.class_2314.class_7217<A>, A: ArgumentType<*> = this.method_10006(arg0, arg1)
fun <T, A>ArgumentSerializer<A, T>.writePacket(arg0: T, arg1: PacketByteBuf) where T: net.minecraft.class_2314.class_7217<A>, A: ArgumentType<*> = this.method_10007(arg0, arg1)
