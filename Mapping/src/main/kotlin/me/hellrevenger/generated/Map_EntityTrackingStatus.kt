package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityTrackingStatus

val EntityTrackingStatus.TICKING by aliasEnum(EntityTrackingStatus::class, "field_27291")
val EntityTrackingStatus.TRACKED by aliasEnum(EntityTrackingStatus::class, "field_27290")
val EntityTrackingStatus.HIDDEN by aliasEnum(EntityTrackingStatus::class, "field_27289")
fun EntityTrackingStatus.shouldTick() = this.method_31883()
fun KClass<EntityTrackingStatus>.fromLevelType(arg0: ChunkLevelType) = EntityTrackingStatus.method_31884(arg0)
fun EntityTrackingStatus.shouldTrack() = this.method_31885()
