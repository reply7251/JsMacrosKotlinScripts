package me.hellrevenger.generated.Map_PlaceCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PlaceCommandKt {
    /**
     * method_39986
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>?) = PlaceCommand.method_39986(dispatcher)
    /**
     * method_43654
     */
    fun executePlaceStructure(source: ServerCommandSource?, structure: net.minecraft.class_6880.class_6883<Structure>?, pos: BlockPos?) = PlaceCommand.method_43654(source, structure, pos)
    /**
     * method_43650
     */
    fun executePlaceJigsaw(source: ServerCommandSource?, structurePool: RegistryEntry<StructurePool>?, id: Identifier?, maxDepth: Int, pos: BlockPos?) = PlaceCommand.method_43650(source, structurePool, id, maxDepth, pos)
    /**
     * method_39989
     */
    fun executePlaceFeature(source: ServerCommandSource?, feature: net.minecraft.class_6880.class_6883<ConfiguredFeature<*, *>>?, pos: BlockPos?) = PlaceCommand.method_39989(source, feature, pos)
    /**
     * method_43919
     */
    fun executePlaceTemplate(source: ServerCommandSource?, id: Identifier?, pos: BlockPos?, rotation: BlockRotation?, mirror: BlockMirror?, integrity: Float, seed: Int) = PlaceCommand.method_43919(source, id, pos, rotation, mirror, integrity, seed)
}