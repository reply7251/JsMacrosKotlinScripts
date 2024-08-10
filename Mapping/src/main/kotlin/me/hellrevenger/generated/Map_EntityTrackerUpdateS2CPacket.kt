package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityTrackerUpdateS2CPacket

val EntityTrackerUpdateS2CPacket.MARKER_ID by aliasStatic(EntityTrackerUpdateS2CPacket::field_40850)
fun EntityTrackerUpdateS2CPacket.id() = this.comp_1127()
fun EntityTrackerUpdateS2CPacket.trackedValues() = this.comp_1128()
fun EntityTrackerUpdateS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_11808(arg0)
