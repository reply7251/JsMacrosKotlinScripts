package me.hellrevenger.generated.Map_DoubleBlockProperties
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DoubleBlockPropertiesKt {
    /**
     * method_24173
     */
    fun <S>toPropertySource(blockEntityType: BlockEntityType<S>, typeMapper: function_Function<BlockState, net.minecraft.class_4732.class_4733>, directionMapper: function_Function<BlockState, Direction>, arg3: property_Property<Direction>, state: BlockState, world: WorldAccess, pos: BlockPos, fallbackTester: BiPredicate<WorldAccess, BlockPos>) where S: BlockEntity = DoubleBlockProperties.method_24173<S>(blockEntityType, typeMapper, directionMapper, arg3, state, world, pos, fallbackTester)
}