package me.hellrevenger.generated.Map_SpawnReason
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SpawnReasonKt {
    /**
     * field_16527
     */
    val PATROL by aliasEnum(SpawnReason::class, "field_16527")
    /**
     * field_47245
     */
    val TRIAL_SPAWNER by aliasEnum(SpawnReason::class, "field_47245")
    /**
     * field_16459
     */
    val NATURAL by aliasEnum(SpawnReason::class, "field_16459")
    /**
     * field_16468
     */
    val CONVERSION by aliasEnum(SpawnReason::class, "field_16468")
    /**
     * field_16469
     */
    val SPAWNER by aliasEnum(SpawnReason::class, "field_16469")
    /**
     * field_16466
     */
    val BREEDING by aliasEnum(SpawnReason::class, "field_16466")
    /**
     * field_16467
     */
    val EVENT by aliasEnum(SpawnReason::class, "field_16467")
    /**
     * field_16460
     */
    val JOCKEY by aliasEnum(SpawnReason::class, "field_16460")
    /**
     * field_16461
     */
    val TRIGGERED by aliasEnum(SpawnReason::class, "field_16461")
    /**
     * field_16465
     */
    val SPAWN_ITEM_USE by aliasEnum(SpawnReason::class, "field_16465")
    /**
     * field_16462
     */
    val COMMAND by aliasEnum(SpawnReason::class, "field_16462")
    /**
     * field_16463
     */
    val REINFORCEMENT by aliasEnum(SpawnReason::class, "field_16463")
    /**
     * field_52445
     */
    val DIMENSION_TRAVEL by aliasEnum(SpawnReason::class, "field_52445")
    /**
     * field_52444
     */
    val LOAD by aliasEnum(SpawnReason::class, "field_52444")
    /**
     * field_16472
     */
    val CHUNK_GENERATION by aliasEnum(SpawnReason::class, "field_16472")
    /**
     * field_16473
     */
    val BUCKET by aliasEnum(SpawnReason::class, "field_16473")
    /**
     * field_16470
     */
    val DISPENSER by aliasEnum(SpawnReason::class, "field_16470")
    /**
     * field_16471
     */
    val MOB_SUMMONED by aliasEnum(SpawnReason::class, "field_16471")
    /**
     * field_16474
     */
    val STRUCTURE by aliasEnum(SpawnReason::class, "field_16474")
    /**
     * method_54987
     */
    fun isTrialSpawner(reason: SpawnReason?) = SpawnReason.method_54987(reason)
    /**
     * method_54986
     */
    fun isAnySpawner(reason: SpawnReason?) = SpawnReason.method_54986(reason)
}