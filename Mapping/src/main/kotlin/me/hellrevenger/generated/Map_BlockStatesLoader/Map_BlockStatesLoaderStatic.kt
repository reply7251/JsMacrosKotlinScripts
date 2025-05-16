package me.hellrevenger.generated.Map_BlockStatesLoader
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockStatesLoaderKt {
    /**
     * field_53650
     */
    val GLOW_ITEM_FRAME_MODEL_ID by aliasStatic(BlockStatesLoader::field_53650)
    /**
     * field_53652
     */
    val ITEM_FRAME_MODEL_ID by aliasStatic(BlockStatesLoader::field_53652)
    /**
     * field_53651
     */
    val MAP_ITEM_FRAME_MODEL_ID by aliasStatic(BlockStatesLoader::field_53651)
    /**
     * field_53649
     */
    val MAP_GLOW_ITEM_FRAME_MODEL_ID by aliasStatic(BlockStatesLoader::field_53649)
    /**
     * method_65718
     */
    fun load(missingModel: UnbakedModel?, resourceManager: ResourceManager?, executor: Executor?) = BlockStatesLoader.method_65718(missingModel, resourceManager, executor)
    /**
     * method_62626
     */
    fun getIdToStatesConverter() = BlockStatesLoader.method_62626()
    /**
     * method_62627
     */
    fun combine(id: Identifier?, stateManager: StateManager<Block, BlockState>?, definitions: MutableList<net.minecraft.class_9824.class_10094>?, missingModel: UnbakedModel?) = BlockStatesLoader.method_62627(id, stateManager, definitions, missingModel)
}