package me.hellrevenger.generated.Map_MessageType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MessageTypeKt {
    /**
     * field_39228
     */
    val SAY_COMMAND by aliasStatic(MessageType::field_39228)
    /**
     * field_39882
     */
    val TEAM_MSG_COMMAND_OUTGOING by aliasStatic(MessageType::field_39882)
    /**
     * field_39881
     */
    val TEAM_MSG_COMMAND_INCOMING by aliasStatic(MessageType::field_39881)
    /**
     * field_39800
     */
    val MSG_COMMAND_OUTGOING by aliasStatic(MessageType::field_39800)
    /**
     * field_39677
     */
    val CHAT_TEXT_DECORATION by aliasStatic(MessageType::field_39677)
    /**
     * field_39799
     */
    val MSG_COMMAND_INCOMING by aliasStatic(MessageType::field_39799)
    /**
     * field_39231
     */
    val EMOTE_COMMAND by aliasStatic(MessageType::field_39231)
    /**
     * field_11737
     */
    val CHAT by aliasStatic(MessageType::field_11737)
    /**
     * method_43844
     */
    fun bootstrap(messageTypeRegisterable: Registerable<MessageType>) = MessageType.method_43844(messageTypeRegisterable)
    /**
     * method_44834
     */
    fun params(typeKey: RegistryKey<MessageType>, registryManager: DynamicRegistryManager, name: Text) = MessageType.method_44834(typeKey, registryManager, name)
    /**
     * method_44832
     */
    fun params(typeKey: RegistryKey<MessageType>, entity: Entity) = MessageType.method_44832(typeKey, entity)
    /**
     * method_44833
     */
    fun params(typeKey: RegistryKey<MessageType>, source: ServerCommandSource) = MessageType.method_44833(typeKey, source)
}