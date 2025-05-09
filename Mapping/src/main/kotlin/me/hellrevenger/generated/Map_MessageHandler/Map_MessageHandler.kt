package me.hellrevenger.generated.Map_MessageHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_45748
 */
fun MessageHandler.onChatMessage(message: SignedMessage, sender: GameProfile, params: net.minecraft.class_2556.class_7602) = this.method_45748(message, sender, params)
/**
 * method_44944
 */
fun MessageHandler.getUnprocessedMessageCount() = this.method_44944()
/**
 * method_53488
 */
fun MessageHandler.onUnverifiedMessage(sender: UUID, parameters: net.minecraft.class_2556.class_7602) = this.method_53488(sender, parameters)
/**
 * method_44765
 */
fun MessageHandler.processDelayedMessages() = this.method_44765()
/**
 * method_44736
 */
fun MessageHandler.onGameMessage(message: Text, overlay: Boolean) = this.method_44736(message, overlay)
/**
 * method_45746
 */
fun MessageHandler.onProfilelessMessage(content: Text, params: net.minecraft.class_2556.class_7602) = this.method_45746(content, params)
/**
 * method_44819
 */
fun MessageHandler.removeDelayedMessage(signature: MessageSignatureData) = this.method_44819(signature)
/**
 * method_44769
 */
fun MessageHandler.process() = this.method_44769()
/**
 * method_44945
 */
fun MessageHandler.processAll() = this.method_44945()
/**
 * method_44766
 */
fun MessageHandler.setChatDelay(chatDelay: Double) = this.method_44766(chatDelay)
