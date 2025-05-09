package me.hellrevenger.generated.Map_TeamS2CPacket
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TeamS2CPacketKt {
    /**
     * method_34171
     */
    fun changePlayerTeam(team: Team, playerName: String, operation: net.minecraft.class_5900.class_5901) = TeamS2CPacket.method_34171(team, playerName, operation)
    /**
     * method_34172
     */
    fun updateTeam(team: Team, updatePlayers: Boolean) = TeamS2CPacket.method_34172(team, updatePlayers)
    /**
     * method_34170
     */
    fun updateRemovedTeam(team: Team) = TeamS2CPacket.method_34170(team)
}