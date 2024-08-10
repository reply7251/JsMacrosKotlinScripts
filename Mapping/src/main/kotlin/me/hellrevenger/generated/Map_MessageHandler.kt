package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MessageHandler

fun MessageHandler.onChatMessage(arg0: SignedMessage, arg1: GameProfile, arg2: net.minecraft.class_2556.class_7602) = this.method_45748(arg0, arg1, arg2)
fun MessageHandler.getUnprocessedMessageCount() = this.method_44944()
fun MessageHandler.onUnverifiedMessage(arg0: UUID, arg1: net.minecraft.class_2556.class_7602) = this.method_53488(arg0, arg1)
fun MessageHandler.processDelayedMessages() = this.method_44765()
fun MessageHandler.onGameMessage(arg0: Text, arg1: Boolean) = this.method_44736(arg0, arg1)
fun MessageHandler.onProfilelessMessage(arg0: Text, arg1: net.minecraft.class_2556.class_7602) = this.method_45746(arg0, arg1)
fun MessageHandler.removeDelayedMessage(arg0: MessageSignatureData) = this.method_44819(arg0)
fun MessageHandler.process() = this.method_44769()
fun MessageHandler.processAll() = this.method_44945()
fun MessageHandler.setChatDelay(arg0: Double) = this.method_44766(arg0)
