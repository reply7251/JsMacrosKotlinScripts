package me.hellrevenger.generated.Map_PlayerPosition
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PlayerPositionKt {
    /**
     * method_63638
     */
    fun fromEntity(entity: Entity) = PlayerPosition.method_63638(entity)
    /**
     * method_63639
     */
    fun apply(currentPos: PlayerPosition, newPos: PlayerPosition, flags: Set<PositionFlag>) = PlayerPosition.method_63639(currentPos, newPos, flags)
    /**
     * method_64621
     */
    fun fromEntityLerpTarget(entity: Entity) = PlayerPosition.method_64621(entity)
    /**
     * method_63640
     */
    fun fromTeleportTarget(teleportTarget: TeleportTarget) = PlayerPosition.method_63640(teleportTarget)
}