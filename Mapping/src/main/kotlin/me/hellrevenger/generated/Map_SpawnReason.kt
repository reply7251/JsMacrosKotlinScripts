package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnReason

val SpawnReason.PATROL by aliasEnum(SpawnReason::class, "field_16527")
val SpawnReason.TRIAL_SPAWNER by aliasEnum(SpawnReason::class, "field_47245")
val SpawnReason.NATURAL by aliasEnum(SpawnReason::class, "field_16459")
val SpawnReason.CONVERSION by aliasEnum(SpawnReason::class, "field_16468")
val SpawnReason.SPAWNER by aliasEnum(SpawnReason::class, "field_16469")
val SpawnReason.BREEDING by aliasEnum(SpawnReason::class, "field_16466")
val SpawnReason.EVENT by aliasEnum(SpawnReason::class, "field_16467")
val SpawnReason.JOCKEY by aliasEnum(SpawnReason::class, "field_16460")
val SpawnReason.TRIGGERED by aliasEnum(SpawnReason::class, "field_16461")
val SpawnReason.SPAWN_EGG by aliasEnum(SpawnReason::class, "field_16465")
val SpawnReason.COMMAND by aliasEnum(SpawnReason::class, "field_16462")
val SpawnReason.REINFORCEMENT by aliasEnum(SpawnReason::class, "field_16463")
val SpawnReason.CHUNK_GENERATION by aliasEnum(SpawnReason::class, "field_16472")
val SpawnReason.BUCKET by aliasEnum(SpawnReason::class, "field_16473")
val SpawnReason.DISPENSER by aliasEnum(SpawnReason::class, "field_16470")
val SpawnReason.MOB_SUMMONED by aliasEnum(SpawnReason::class, "field_16471")
val SpawnReason.STRUCTURE by aliasEnum(SpawnReason::class, "field_16474")
fun KClass<SpawnReason>.isTrialSpawner(arg0: SpawnReason) = SpawnReason.method_54987(arg0)
fun KClass<SpawnReason>.isAnySpawner(arg0: SpawnReason) = SpawnReason.method_54986(arg0)
