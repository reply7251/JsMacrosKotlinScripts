package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PatrolEntity

fun PatrolEntity.setPatrolTarget(arg0: BlockPos) = this.method_16216(arg0)
fun PatrolEntity.setRandomPatrolTarget() = this.method_16218()
fun KClass<PatrolEntity>.canSpawn(arg0: EntityType<out PatrolEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = PatrolEntity.method_20739(arg0, arg1, arg2, arg3, arg4)
fun PatrolEntity.isPatrolLeader() = this.method_16219()
fun PatrolEntity.setPatrolLeader(arg0: Boolean) = this.method_16217(arg0)
fun PatrolEntity.hasPatrolTarget() = this.method_16220()
fun PatrolEntity.hasNoRaid() = this.method_16472()
fun PatrolEntity.canLead() = this.method_16485()
