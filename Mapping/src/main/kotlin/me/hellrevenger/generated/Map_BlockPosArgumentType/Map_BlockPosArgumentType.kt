package me.hellrevenger.generated.Map_BlockPosArgumentType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BlockPosArgumentType>.OUT_OF_BOUNDS_EXCEPTION by aliasStatic(BlockPosArgumentType::field_29499)
val KClass<BlockPosArgumentType>.UNLOADED_EXCEPTION by aliasStatic(BlockPosArgumentType::field_10703)
val KClass<BlockPosArgumentType>.OUT_OF_WORLD_EXCEPTION by aliasStatic(BlockPosArgumentType::field_10704)
fun KClass<BlockPosArgumentType>.blockPos() = BlockPosArgumentType.method_9698()
fun BlockPosArgumentType.parse(arg0: StringReader) = this.method_9699(arg0)
fun KClass<BlockPosArgumentType>.getLoadedBlockPos(arg0: CommandContext<ServerCommandSource>, arg1: ServerWorld, arg2: String) = BlockPosArgumentType.method_48298(arg0, arg1, arg2)
fun KClass<BlockPosArgumentType>.getLoadedBlockPos(arg0: CommandContext<ServerCommandSource>, arg1: String) = BlockPosArgumentType.method_9696(arg0, arg1)
fun KClass<BlockPosArgumentType>.getBlockPos(arg0: CommandContext<ServerCommandSource>, arg1: String) = BlockPosArgumentType.method_48299(arg0, arg1)
fun KClass<BlockPosArgumentType>.getValidBlockPos(arg0: CommandContext<ServerCommandSource>, arg1: String) = BlockPosArgumentType.method_9697(arg0, arg1)
