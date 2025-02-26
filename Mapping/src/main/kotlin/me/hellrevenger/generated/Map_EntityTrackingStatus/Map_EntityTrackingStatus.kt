package me.hellrevenger.generated.Map_EntityTrackingStatus
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_27291
 */
val KClass<EntityTrackingStatus>.TICKING by aliasEnum(EntityTrackingStatus::class, "field_27291")
/**
 * field_27290
 */
val KClass<EntityTrackingStatus>.TRACKED by aliasEnum(EntityTrackingStatus::class, "field_27290")
/**
 * field_27289
 */
val KClass<EntityTrackingStatus>.HIDDEN by aliasEnum(EntityTrackingStatus::class, "field_27289")
/**
 * method_31883
 */
fun EntityTrackingStatus.shouldTick() = this.method_31883()
/**
 * method_31884
 */
fun KClass<EntityTrackingStatus>.fromLevelType(arg0: ChunkLevelType) = EntityTrackingStatus.method_31884(arg0)
/**
 * method_31885
 */
fun EntityTrackingStatus.shouldTrack() = this.method_31885()
