package me.hellrevenger.generated.Map_EntityTrackingStatus
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EntityTrackingStatusKt {
    /**
     * field_27291
     */
    val TICKING by aliasEnum(EntityTrackingStatus::class, "field_27291")
    /**
     * field_27290
     */
    val TRACKED by aliasEnum(EntityTrackingStatus::class, "field_27290")
    /**
     * field_27289
     */
    val HIDDEN by aliasEnum(EntityTrackingStatus::class, "field_27289")
    /**
     * method_31884
     */
    fun fromLevelType(levelType: ChunkLevelType?) = EntityTrackingStatus.method_31884(levelType)
}