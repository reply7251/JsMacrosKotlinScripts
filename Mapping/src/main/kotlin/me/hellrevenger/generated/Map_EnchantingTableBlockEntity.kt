package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnchantingTableBlockEntity

val EnchantingTableBlockEntity.nextPageTurningSpeed by alias(EnchantingTableBlockEntity::field_11966)
val EnchantingTableBlockEntity.flipTurn by alias(EnchantingTableBlockEntity::field_11967)
val EnchantingTableBlockEntity.bookRotation by alias(EnchantingTableBlockEntity::field_11964)
val EnchantingTableBlockEntity.pageTurningSpeed by alias(EnchantingTableBlockEntity::field_11965)
val EnchantingTableBlockEntity.nextPageAngle by alias(EnchantingTableBlockEntity::field_11958)
val EnchantingTableBlockEntity.flipRandom by alias(EnchantingTableBlockEntity::field_11969)
val EnchantingTableBlockEntity.ticks by alias(EnchantingTableBlockEntity::field_11961)
val EnchantingTableBlockEntity.targetBookRotation by alias(EnchantingTableBlockEntity::field_11962)
val EnchantingTableBlockEntity.lastBookRotation by alias(EnchantingTableBlockEntity::field_11963)
val EnchantingTableBlockEntity.pageAngle by alias(EnchantingTableBlockEntity::field_11960)
fun KClass<EnchantingTableBlockEntity>.tick(arg0: world_World, arg1: BlockPos, arg2: BlockState, arg3: EnchantingTableBlockEntity) = EnchantingTableBlockEntity.method_31688(arg0, arg1, arg2, arg3)
fun EnchantingTableBlockEntity.setCustomName(arg0: Text) = this.method_11179(arg0)
