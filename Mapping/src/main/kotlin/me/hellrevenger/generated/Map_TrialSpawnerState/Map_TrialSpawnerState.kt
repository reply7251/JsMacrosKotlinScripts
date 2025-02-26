package me.hellrevenger.generated.Map_TrialSpawnerState
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_47385
 */
val KClass<TrialSpawnerState>.ACTIVE by aliasEnum(TrialSpawnerState::class, "field_47385")
/**
 * field_47386
 */
val KClass<TrialSpawnerState>.WAITING_FOR_REWARD_EJECTION by aliasEnum(TrialSpawnerState::class, "field_47386")
/**
 * field_47383
 */
val KClass<TrialSpawnerState>.INACTIVE by aliasEnum(TrialSpawnerState::class, "field_47383")
/**
 * field_47384
 */
val KClass<TrialSpawnerState>.WAITING_FOR_PLAYERS by aliasEnum(TrialSpawnerState::class, "field_47384")
/**
 * field_47387
 */
val KClass<TrialSpawnerState>.EJECTING_REWARD by aliasEnum(TrialSpawnerState::class, "field_47387")
/**
 * field_47388
 */
val KClass<TrialSpawnerState>.COOLDOWN by aliasEnum(TrialSpawnerState::class, "field_47388")
/**
 * method_55217
 */
fun TrialSpawnerState.playsSound() = this.method_55217()
/**
 * method_55210
 */
fun TrialSpawnerState.emitParticles(arg0: world_World, arg1: BlockPos, arg2: Boolean) = this.method_55210(arg0, arg1, arg2)
/**
 * method_55209
 */
fun TrialSpawnerState.getLuminance() = this.method_55209()
/**
 * method_55215
 */
fun TrialSpawnerState.getDisplayRotationSpeed() = this.method_55215()
/**
 * method_55216
 */
fun TrialSpawnerState.doesDisplayRotate() = this.method_55216()
