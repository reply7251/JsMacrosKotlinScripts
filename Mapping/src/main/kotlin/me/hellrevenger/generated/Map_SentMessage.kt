package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SentMessage

fun KClass<SentMessage>.of(arg0: SignedMessage) = SentMessage.method_44857(arg0)
fun SentMessage.send(arg0: ServerPlayerEntity, arg1: Boolean, arg2: net.minecraft.class_2556.class_7602) = this.method_45095(arg0, arg1, arg2)
fun SentMessage.content() = this.comp_1081()
