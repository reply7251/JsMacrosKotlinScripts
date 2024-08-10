package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BatEntity

val BatEntity.roostingAnimationState by alias(BatEntity::field_46969)
val BatEntity.flyingAnimationState by alias(BatEntity::field_46968)
fun KClass<BatEntity>.canSpawn(arg0: EntityType<BatEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = BatEntity.method_20661(arg0, arg1, arg2, arg3, arg4)
fun BatEntity.setRoosting(arg0: Boolean) = this.method_6449(arg0)
fun BatEntity.isRoosting() = this.method_6450()
fun KClass<BatEntity>.createBatAttributes() = BatEntity.method_26878()
