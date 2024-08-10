package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GuardianEntity

fun KClass<GuardianEntity>.canSpawn(arg0: EntityType<out GuardianEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = GuardianEntity.method_20676(arg0, arg1, arg2, arg3, arg4)
fun GuardianEntity.areSpikesRetracted() = this.method_7058()
fun GuardianEntity.hasBeamTarget() = this.method_7063()
fun GuardianEntity.getBeamProgress(arg0: Float) = this.method_7061(arg0)
fun GuardianEntity.getWarmupTime() = this.method_7055()
fun GuardianEntity.getBeamTarget() = this.method_7052()
fun KClass<GuardianEntity>.createGuardianAttributes() = GuardianEntity.method_26915()
