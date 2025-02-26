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
fun FallingBlockEntity.setHurtEntities(arg0: Float, arg1: Int) = this.method_6965(arg0, arg1)
/**
 * method_6964
 */
fun FallingBlockEntity.getFallingBlockPos() = this.method_6964()
/**
 * method_6963
 */
fun FallingBlockEntity.setFallingBlockPos(arg0: BlockPos) = this.method_6963(arg0)
/**
 * method_6962
 */
fun FallingBlockEntity.getBlockState() = this.method_6962()
/**
 * method_49181
 */
fun FallingBlockEntity.setDestroyedOnLanding() = this.method_49181()
/**
 * method_40005
 */
fun KClass<FallingBlockEntity>.spawnFromBlock(arg0: world_World, arg1: BlockPos, arg2: BlockState) = FallingBlockEntity.method_40005(arg0, arg1, arg2)
/**
 * method_32752
 */
fun FallingBlockEntity.onDestroyedOnLanding(arg0: Block, arg1: BlockPos) = this.method_32752(arg0, arg1)
