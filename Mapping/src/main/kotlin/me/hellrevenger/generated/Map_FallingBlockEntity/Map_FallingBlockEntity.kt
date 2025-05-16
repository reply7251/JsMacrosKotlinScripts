package me.hellrevenger.generated.Map_FallingBlockEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_7193
 */
var FallingBlockEntity.dropItem by alias(FallingBlockEntity::field_7193)
/**
 * field_7194
 */
var FallingBlockEntity.blockEntityData by alias(FallingBlockEntity::field_7194)
/**
 * field_52015
 */
var FallingBlockEntity.shouldDupe by alias(FallingBlockEntity::field_52015)
/**
 * field_7192
 */
var FallingBlockEntity.timeFalling by alias(FallingBlockEntity::field_7192)
/**
 * method_6965
 */
fun FallingBlockEntity.setHurtEntities(fallHurtAmount: Float, fallHurtMax: Int) = this.method_6965(fallHurtAmount, fallHurtMax)
/**
 * method_6964
 */
fun FallingBlockEntity.getFallingBlockPos() = this.method_6964()
/**
 * method_6963
 */
fun FallingBlockEntity.setFallingBlockPos(pos: BlockPos?) = this.method_6963(pos)
/**
 * method_6962
 */
fun FallingBlockEntity.getBlockState() = this.method_6962()
/**
 * method_49181
 */
fun FallingBlockEntity.setDestroyedOnLanding() = this.method_49181()
/**
 * method_32752
 */
fun FallingBlockEntity.onDestroyedOnLanding(block: Block?, pos: BlockPos?) = this.method_32752(block, pos)
