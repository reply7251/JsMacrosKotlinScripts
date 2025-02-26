package me.hellrevenger.generated.Map_TestableWorld
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_8598
 */
fun TestableWorld.getTopPosition(arg0: net.minecraft.class_2902.class_2903, arg1: BlockPos) = this.method_8598(arg0, arg1)
/**
 * method_16358
 */
fun TestableWorld.testBlockState(arg0: BlockPos, arg1: Predicate<BlockState>) = this.method_16358(arg0, arg1)
/**
 * method_35237
 */
fun TestableWorld.testFluidState(arg0: BlockPos, arg1: Predicate<FluidState>) = this.method_35237(arg0, arg1)
/**
 * method_35230
 */
fun <T>TestableWorld.getBlockEntity(arg0: BlockPos, arg1: BlockEntityType<T>) where T: BlockEntity = this.method_35230<T>(arg0, arg1)
