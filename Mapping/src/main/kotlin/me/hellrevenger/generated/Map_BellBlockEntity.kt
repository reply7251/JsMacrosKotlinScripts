package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BellBlockEntity

val BellBlockEntity.ringTicks by alias(BellBlockEntity::field_17095)
val BellBlockEntity.lastSideHit by alias(BellBlockEntity::field_17097)
val BellBlockEntity.ringing by alias(BellBlockEntity::field_17096)
fun KClass<BellBlockEntity>.serverTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BellBlockEntity) = BellBlockEntity.method_31659(arg0, arg1, arg2, arg3)
fun KClass<BellBlockEntity>.clientTick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: BellBlockEntity) = BellBlockEntity.method_31657(arg0, arg1, arg2, arg3)
fun BellBlockEntity.activate(arg0: Direction) = this.method_17031(arg0)
