package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SlimeEntity

val KClass<SlimeEntity>.MIN_SIZE by aliasStatic(SlimeEntity::field_30496)
var SlimeEntity.stretch by alias(SlimeEntity::field_7388)
var SlimeEntity.targetStretch by alias(SlimeEntity::field_7389)
val KClass<SlimeEntity>.MAX_SIZE by aliasStatic(SlimeEntity::field_30497)
var SlimeEntity.lastStretch by alias(SlimeEntity::field_7387)
fun SlimeEntity.setSize(arg0: Int, arg1: Boolean) = this.method_7161(arg0, arg1)
fun SlimeEntity.isSmall() = this.method_7157()
fun KClass<SlimeEntity>.canSpawn(arg0: EntityType<SlimeEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = SlimeEntity.method_20685(arg0, arg1, arg2, arg3, arg4)
fun SlimeEntity.getSize() = this.method_7152()
