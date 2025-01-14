package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ReceivedMessage

fun KClass<ReceivedMessage>.of(arg0: Text, arg1: Instant) = ReceivedMessage.method_44554(arg0, arg1)
fun ReceivedMessage.getContent() = this.method_44551()
fun KClass<ReceivedMessage>.of(arg0: GameProfile, arg1: SignedMessage, arg2: MessageTrustStatus) = ReceivedMessage.method_44552(arg0, arg1, arg2)
fun ReceivedMessage.isSentFrom(arg0: UUID) = this.method_44553(arg0)
fun ReceivedMessage.getNarration() = this.method_44555()
