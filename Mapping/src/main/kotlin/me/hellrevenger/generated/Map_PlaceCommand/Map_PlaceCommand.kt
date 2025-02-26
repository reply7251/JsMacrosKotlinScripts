package me.hellrevenger.generated.Map_PlaceCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39986
 */
fun KClass<PlaceCommand>.register(arg0: CommandDispatcher<ServerCommandSource>) = PlaceCommand.method_39986(arg0)
/**
 * method_43654
 */
fun KClass<PlaceCommand>.executePlaceStructure(arg0: ServerCommandSource, arg1: net.minecraft.class_6880.class_6883<Structure>, arg2: BlockPos) = PlaceCommand.method_43654(arg0, arg1, arg2)
/**
 * method_43650
 */
fun KClass<PlaceCommand>.executePlaceJigsaw(arg0: ServerCommandSource, arg1: RegistryEntry<StructurePool>, arg2: Identifier, arg3: Int, arg4: BlockPos) = PlaceCommand.method_43650(arg0, arg1, arg2, arg3, arg4)
/**
 * method_39989
 */
fun KClass<PlaceCommand>.executePlaceFeature(arg0: ServerCommandSource, arg1: net.minecraft.class_6880.class_6883<ConfiguredFeature<*, *>>, arg2: BlockPos) = PlaceCommand.method_39989(arg0, arg1, arg2)
/**
 * method_43919
 */
fun KClass<PlaceCommand>.executePlaceTemplate(arg0: ServerCommandSource, arg1: Identifier, arg2: BlockPos, arg3: BlockRotation, arg4: BlockMirror, arg5: Float, arg6: Int) = PlaceCommand.method_43919(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
