package me.hellrevenger.generated.Map_ServerPlayNetworkHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_45026
 */
val ServerPlayNetworkHandler.chunkDataSender by alias(ServerPlayNetworkHandler::field_45026)
/**
 * field_14140
 */
var ServerPlayNetworkHandler.player by alias(ServerPlayNetworkHandler::field_14140)
/**
 * method_14372
 */
fun ServerPlayNetworkHandler.syncWithPlayerPosition() = this.method_14372()
/**
 * method_45170
 */
fun ServerPlayNetworkHandler.sendChatMessage(message: SignedMessage, params: net.minecraft.class_2556.class_7602) = this.method_45170(message, params)
/**
 * method_48107
 */
fun ServerPlayNetworkHandler.getConnectionAddress() = this.method_48107()
/**
 * method_44897
 */
fun ServerPlayNetworkHandler.addPendingAcknowledgment(message: SignedMessage) = this.method_44897(message)
/**
 * method_14360
 */
fun ServerPlayNetworkHandler.requestTeleport(pos: PlayerPosition, flags: Set<PositionFlag>) = this.method_14360(pos, flags)
/**
 * method_41255
 */
fun ServerPlayNetworkHandler.updateSequence(sequence: Int) = this.method_41255(sequence)
/**
 * method_52414
 */
fun ServerPlayNetworkHandler.reconfigure() = this.method_52414()
/**
 * method_45168
 */
fun ServerPlayNetworkHandler.sendProfilelessChatMessage(message: Text, params: net.minecraft.class_2556.class_7602) = this.method_45168(message, params)
/**
 * method_14363
 */
fun ServerPlayNetworkHandler.requestTeleport(x: Double, arg1: Double, y: Double, arg3: Float, z: Float) = this.method_14363(x, arg1, y, arg3, z)
