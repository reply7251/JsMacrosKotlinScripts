package me.hellrevenger.generated.Map_TestableWorld
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8598
 */
fun TestableWorld.getTopPosition(heightmap: net.minecraft.class_2902.class_2903?, pos: BlockPos?) = this.method_8598(heightmap, pos)
/**
 * method_16358
 */
fun TestableWorld.testBlockState(pos: BlockPos?, state: Predicate<BlockState>?) = this.method_16358(pos, state)
/**
 * method_35237
 */
fun TestableWorld.testFluidState(pos: BlockPos?, state: Predicate<FluidState>?) = this.method_35237(pos, state)
/**
 * method_35230
 */
fun <T>TestableWorld.getBlockEntity(pos: BlockPos?, type: BlockEntityType<T>?) where T: BlockEntity = this.method_35230<T>(pos, type)
