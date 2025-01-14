package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SpawnReason

val KClass<SpawnReason>.PATROL by aliasEnum(SpawnReason::class, "field_16527")
val KClass<SpawnReason>.TRIAL_SPAWNER by aliasEnum(SpawnReason::class, "field_47245")
val KClass<SpawnReason>.NATURAL by aliasEnum(SpawnReason::class, "field_16459")
val KClass<SpawnReason>.CONVERSION by aliasEnum(SpawnReason::class, "field_16468")
val KClass<SpawnReason>.SPAWNER by aliasEnum(SpawnReason::class, "field_16469")
val KClass<SpawnReason>.BREEDING by aliasEnum(SpawnReason::class, "field_16466")
val KClass<SpawnReason>.EVENT by aliasEnum(SpawnReason::class, "field_16467")
val KClass<SpawnReason>.JOCKEY by aliasEnum(SpawnReason::class, "field_16460")
val KClass<SpawnReason>.TRIGGERED by aliasEnum(SpawnReason::class, "field_16461")
val KClass<SpawnReason>.SPAWN_EGG by aliasEnum(SpawnReason::class, "field_16465")
val KClass<SpawnReason>.COMMAND by aliasEnum(SpawnReason::class, "field_16462")
val KClass<SpawnReason>.REINFORCEMENT by aliasEnum(SpawnReason::class, "field_16463")
val KClass<SpawnReason>.CHUNK_GENERATION by aliasEnum(SpawnReason::class, "field_16472")
val KClass<SpawnReason>.BUCKET by aliasEnum(SpawnReason::class, "field_16473")
val KClass<SpawnReason>.DISPENSER by aliasEnum(SpawnReason::class, "field_16470")
val KClass<SpawnReason>.MOB_SUMMONED by aliasEnum(SpawnReason::class, "field_16471")
val KClass<SpawnReason>.STRUCTURE by aliasEnum(SpawnReason::class, "field_16474")
fun KClass<SpawnReason>.isTrialSpawner(arg0: SpawnReason) = SpawnReason.method_54987(arg0)
fun KClass<SpawnReason>.isAnySpawner(arg0: SpawnReason) = SpawnReason.method_54986(arg0)
