package me.hellrevenger.generated.Map_EntityTrackingStatus
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<EntityTrackingStatus>.TICKING by aliasEnum(EntityTrackingStatus::class, "field_27291")
val KClass<EntityTrackingStatus>.TRACKED by aliasEnum(EntityTrackingStatus::class, "field_27290")
val KClass<EntityTrackingStatus>.HIDDEN by aliasEnum(EntityTrackingStatus::class, "field_27289")
fun EntityTrackingStatus.shouldTick() = this.method_31883()
fun KClass<EntityTrackingStatus>.fromLevelType(arg0: ChunkLevelType) = EntityTrackingStatus.method_31884(arg0)
fun EntityTrackingStatus.shouldTrack() = this.method_31885()
