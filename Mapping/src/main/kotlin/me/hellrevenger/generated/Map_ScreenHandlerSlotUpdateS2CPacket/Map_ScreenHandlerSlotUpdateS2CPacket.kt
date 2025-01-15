package me.hellrevenger.generated.Map_ScreenHandlerSlotUpdateS2CPacket
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ScreenHandlerSlotUpdateS2CPacket>.UPDATE_PLAYER_INVENTORY_SYNC_ID by aliasStatic(ScreenHandlerSlotUpdateS2CPacket::field_33325)
val KClass<ScreenHandlerSlotUpdateS2CPacket>.UPDATE_CURSOR_SYNC_ID by aliasStatic(ScreenHandlerSlotUpdateS2CPacket::field_33324)
fun ScreenHandlerSlotUpdateS2CPacket.getRevision() = this.method_37439()
fun ScreenHandlerSlotUpdateS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11451(arg0)
fun ScreenHandlerSlotUpdateS2CPacket.getSyncId() = this.method_11452()
fun ScreenHandlerSlotUpdateS2CPacket.getStack() = this.method_11449()
fun ScreenHandlerSlotUpdateS2CPacket.getSlot() = this.method_11450()
