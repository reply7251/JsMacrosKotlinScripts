package me.hellrevenger.generated.Map_BlockEntityProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_10123
 */
fun BlockEntityProvider.createBlockEntity(pos: BlockPos, state: BlockState) = this.method_10123(pos, state)
/**
 * method_31645
 */
fun <T>BlockEntityProvider.getTicker(world: world_World, state: BlockState, type: BlockEntityType<T>) where T: BlockEntity = this.method_31645<T>(world, state, type)
/**
 * method_32896
 */
fun <T>BlockEntityProvider.getGameEventListener(world: ServerWorld, blockEntity: T) where T: BlockEntity = this.method_32896<T>(world, blockEntity)
