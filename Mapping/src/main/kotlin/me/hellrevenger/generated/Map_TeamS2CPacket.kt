package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TeamS2CPacket

fun KClass<TeamS2CPacket>.changePlayerTeam(arg0: Team, arg1: String, arg2: net.minecraft.class_5900.class_5901) = TeamS2CPacket.method_34171(arg0, arg1, arg2)
fun KClass<TeamS2CPacket>.updateTeam(arg0: Team, arg1: Boolean) = TeamS2CPacket.method_34172(arg0, arg1)
fun TeamS2CPacket.getPlayerListOperation() = this.method_34174()
fun TeamS2CPacket.getTeamOperation() = this.method_34176()
fun KClass<TeamS2CPacket>.updateRemovedTeam(arg0: Team) = TeamS2CPacket.method_34170(arg0)
fun TeamS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_34173(arg0)
