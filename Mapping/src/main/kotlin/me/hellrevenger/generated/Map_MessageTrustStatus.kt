package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MessageTrustStatus

val KClass<MessageTrustStatus>.NOT_SECURE by aliasEnum(MessageTrustStatus::class, "field_39782")
val KClass<MessageTrustStatus>.SECURE by aliasEnum(MessageTrustStatus::class, "field_39780")
val KClass<MessageTrustStatus>.MODIFIED by aliasEnum(MessageTrustStatus::class, "field_39781")
fun KClass<MessageTrustStatus>.getStatus(arg0: SignedMessage, arg1: Text, arg2: Instant) = MessageTrustStatus.method_44742(arg0, arg1, arg2)
fun MessageTrustStatus.createIndicator(arg0: SignedMessage) = this.method_44741(arg0)
fun MessageTrustStatus.isInsecure() = this.method_44740()
