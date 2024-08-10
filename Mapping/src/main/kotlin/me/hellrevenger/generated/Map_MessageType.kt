package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MessageType

val MessageType.SAY_COMMAND by aliasStatic(MessageType::field_39228)
val MessageType.TEAM_MSG_COMMAND_OUTGOING by aliasStatic(MessageType::field_39882)
val MessageType.TEAM_MSG_COMMAND_INCOMING by aliasStatic(MessageType::field_39881)
val MessageType.MSG_COMMAND_OUTGOING by aliasStatic(MessageType::field_39800)
val MessageType.PACKET_CODEC by aliasStatic(MessageType::field_51969)
val MessageType.CHAT_TEXT_DECORATION by aliasStatic(MessageType::field_39677)
val MessageType.MSG_COMMAND_INCOMING by aliasStatic(MessageType::field_39799)
val MessageType.EMOTE_COMMAND by aliasStatic(MessageType::field_39231)
val MessageType.CHAT by aliasStatic(MessageType::field_11737)
val MessageType.ENTRY_PACKET_CODEC by aliasStatic(MessageType::field_51970)
fun KClass<MessageType>.bootstrap(arg0: Registerable<MessageType>) = MessageType.method_43844(arg0)
fun KClass<MessageType>.params(arg0: RegistryKey<MessageType>, arg1: DynamicRegistryManager, arg2: Text) = MessageType.method_44834(arg0, arg1, arg2)
fun KClass<MessageType>.params(arg0: RegistryKey<MessageType>, arg1: Entity) = MessageType.method_44832(arg0, arg1)
fun KClass<MessageType>.params(arg0: RegistryKey<MessageType>, arg1: ServerCommandSource) = MessageType.method_44833(arg0, arg1)
fun MessageType.chat() = this.comp_792()
fun MessageType.narration() = this.comp_794()
