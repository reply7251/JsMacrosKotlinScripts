package me.hellrevenger.generated.Map_TeamS2CPacket
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<TeamS2CPacket>.changePlayerTeam(arg0: Team, arg1: String, arg2: net.minecraft.class_5900.class_5901) = TeamS2CPacket.method_34171(arg0, arg1, arg2)
fun TeamS2CPacket.getTeam() = this.method_34179()
fun KClass<TeamS2CPacket>.updateTeam(arg0: Team, arg1: Boolean) = TeamS2CPacket.method_34172(arg0, arg1)
fun TeamS2CPacket.getPlayerListOperation() = this.method_34174()
fun TeamS2CPacket.getPlayerNames() = this.method_34178()
fun TeamS2CPacket.getTeamOperation() = this.method_34176()
fun KClass<TeamS2CPacket>.updateRemovedTeam(arg0: Team) = TeamS2CPacket.method_34170(arg0)
fun TeamS2CPacket.getTeamName() = this.method_34177()
fun TeamS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_34173(arg0)
