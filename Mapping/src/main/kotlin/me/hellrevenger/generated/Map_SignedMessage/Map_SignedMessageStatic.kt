package me.hellrevenger.generated.Map_SignedMessage
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SignedMessageKt {
    /**
     * field_39786
     */
    val SERVERBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39786)
    /**
     * field_39787
     */
    val CLIENTBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39787)
    /**
     * method_45098
     */
    fun ofUnsigned(sender: UUID, content: String) = SignedMessage.method_45098(sender, content)
    /**
     * method_46290
     */
    fun update(updater: net.minecraft.class_7498.class_7499, link: MessageLink, body: MessageBody) = SignedMessage.method_46290(updater, link, body)
}