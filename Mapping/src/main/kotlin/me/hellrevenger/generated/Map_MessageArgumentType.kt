package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MessageArgumentType

fun KClass<MessageArgumentType>.getSignedMessage(arg0: CommandContext<ServerCommandSource>, arg1: String, arg2: Consumer<SignedMessage>) = MessageArgumentType.method_45562(arg0, arg1, arg2)
fun KClass<MessageArgumentType>.getMessage(arg0: CommandContext<ServerCommandSource>, arg1: String) = MessageArgumentType.method_9339(arg0, arg1)
fun MessageArgumentType.parse(arg0: StringReader) = this.method_9338(arg0)
fun KClass<MessageArgumentType>.message() = MessageArgumentType.method_9340()
