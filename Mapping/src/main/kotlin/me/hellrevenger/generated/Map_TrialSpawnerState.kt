package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TrialSpawnerState

val TrialSpawnerState.ACTIVE by aliasEnum(TrialSpawnerState::class, "field_47385")
val TrialSpawnerState.WAITING_FOR_REWARD_EJECTION by aliasEnum(TrialSpawnerState::class, "field_47386")
val TrialSpawnerState.INACTIVE by aliasEnum(TrialSpawnerState::class, "field_47383")
val TrialSpawnerState.WAITING_FOR_PLAYERS by aliasEnum(TrialSpawnerState::class, "field_47384")
val TrialSpawnerState.EJECTING_REWARD by aliasEnum(TrialSpawnerState::class, "field_47387")
val TrialSpawnerState.COOLDOWN by aliasEnum(TrialSpawnerState::class, "field_47388")
fun TrialSpawnerState.playsSound() = this.method_55217()
fun TrialSpawnerState.emitParticles(arg0: world_World, arg1: BlockPos, arg2: Boolean) = this.method_55210(arg0, arg1, arg2)
fun TrialSpawnerState.doesDisplayRotate() = this.method_55216()
