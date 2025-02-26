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
fun ServerPlayNetworkHandler.sendChatMessage(arg0: SignedMessage, arg1: net.minecraft.class_2556.class_7602) = this.method_45170(arg0, arg1)
/**
 * method_48107
 */
fun ServerPlayNetworkHandler.getConnectionAddress() = this.method_48107()
/**
 * method_44897
 */
fun ServerPlayNetworkHandler.addPendingAcknowledgment(arg0: SignedMessage) = this.method_44897(arg0)
/**
 * method_14360
 */
fun ServerPlayNetworkHandler.requestTeleport(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float, arg5: Set<PositionFlag>) = this.method_14360(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_41255
 */
fun ServerPlayNetworkHandler.updateSequence(arg0: Int) = this.method_41255(arg0)
/**
 * method_52414
 */
fun ServerPlayNetworkHandler.reconfigure() = this.method_52414()
/**
 * method_45168
 */
fun ServerPlayNetworkHandler.sendProfilelessChatMessage(arg0: Text, arg1: net.minecraft.class_2556.class_7602) = this.method_45168(arg0, arg1)
/**
 * method_14363
 */
fun ServerPlayNetworkHandler.requestTeleport(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float) = this.method_14363(arg0, arg1, arg2, arg3, arg4)
