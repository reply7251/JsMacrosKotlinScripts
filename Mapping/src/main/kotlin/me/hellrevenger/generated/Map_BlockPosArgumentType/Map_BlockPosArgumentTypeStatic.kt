package me.hellrevenger.generated.Map_BlockPosArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockPosArgumentTypeKt {
    /**
     * field_29499
     */
    val OUT_OF_BOUNDS_EXCEPTION by aliasStatic(BlockPosArgumentType::field_29499)
    /**
     * field_10703
     */
    val UNLOADED_EXCEPTION by aliasStatic(BlockPosArgumentType::field_10703)
    /**
     * field_10704
     */
    val OUT_OF_WORLD_EXCEPTION by aliasStatic(BlockPosArgumentType::field_10704)
    /**
     * method_9698
     */
    fun blockPos() = BlockPosArgumentType.method_9698()
    /**
     * method_48298
     */
    fun getLoadedBlockPos(context: CommandContext<ServerCommandSource>?, world: ServerWorld?, name: String?) = BlockPosArgumentType.method_48298(context, world, name)
    /**
     * method_9696
     */
    fun getLoadedBlockPos(context: CommandContext<ServerCommandSource>?, name: String?) = BlockPosArgumentType.method_9696(context, name)
    /**
     * method_48299
     */
    fun getBlockPos(context: CommandContext<ServerCommandSource>?, name: String?) = BlockPosArgumentType.method_48299(context, name)
    /**
     * method_9697
     */
    fun getValidBlockPos(context: CommandContext<ServerCommandSource>?, name: String?) = BlockPosArgumentType.method_9697(context, name)
}