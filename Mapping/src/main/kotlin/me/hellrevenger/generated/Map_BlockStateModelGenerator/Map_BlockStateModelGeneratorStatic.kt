package me.hellrevenger.generated.Map_BlockStateModelGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockStateModelGeneratorKt {
    /**
     * field_28548
     */
    val CONNECTION_VARIANT_FUNCTIONS by aliasStatic(BlockStateModelGenerator::field_28548)
    /**
     * method_25668
     */
    fun createSlabBlockState(slabBlock: Block, bottomModelId: Identifier, topModelId: Identifier, fullModelId: Identifier) = BlockStateModelGenerator.method_25668(slabBlock, bottomModelId, topModelId, fullModelId)
    /**
     * method_34631
     */
    fun createDeepslateState(block: Block, modelId: Identifier, textures: TextureMap, modelCollector: BiConsumer<Identifier, ModelSupplier>) = BlockStateModelGenerator.method_34631(block, modelId, textures, modelCollector)
    /**
     * method_25649
     */
    fun createAxisRotatedVariantMap() = BlockStateModelGenerator.method_25649()
    /**
     * method_25655
     */
    fun createOrientableTrapdoorBlockState(trapdoorBlock: Block, topModelId: Identifier, bottomModelId: Identifier, openModelId: Identifier) = BlockStateModelGenerator.method_25655(trapdoorBlock, topModelId, bottomModelId, openModelId)
    /**
     * method_25626
     */
    fun createFenceGateBlockState(fenceGateBlock: Block, openModelId: Identifier, closedModelId: Identifier, openWallModelId: Identifier, closedWallModelId: Identifier, uvlock: Boolean) = BlockStateModelGenerator.method_25626(fenceGateBlock, openModelId, closedModelId, openWallModelId, closedWallModelId, uvlock)
    /**
     * method_25667
     */
    fun createAxisRotatedBlockState(block: Block, verticalModelId: Identifier, horizontalModelId: Identifier) = BlockStateModelGenerator.method_25667(block, verticalModelId, horizontalModelId)
    /**
     * method_34608
     */
    fun createStoneState(block: Block, modelId: Identifier, textures: TextureMap, modelCollector: BiConsumer<Identifier, ModelSupplier>) = BlockStateModelGenerator.method_34608(block, modelId, textures, modelCollector)
    /**
     * method_25646
     */
    fun createStairsBlockState(stairsBlock: Block, innerModelId: Identifier, regularModelId: Identifier, outerModelId: Identifier) = BlockStateModelGenerator.method_25646(stairsBlock, innerModelId, regularModelId, outerModelId)
    /**
     * method_25654
     */
    fun createButtonBlockState(buttonBlock: Block, regularModelId: Identifier, pressedModelId: Identifier) = BlockStateModelGenerator.method_25654(buttonBlock, regularModelId, pressedModelId)
    /**
     * method_25583
     */
    fun buildBlockStateVariants(modelIds: MutableList<Identifier>, processor: UnaryOperator<BlockStateVariant>) = BlockStateModelGenerator.method_25583(modelIds, processor)
    /**
     * method_46189
     */
    fun createCustomFenceBlockState(customFenceBlock: Block, postModelId: Identifier, northModelId: Identifier, eastModelId: Identifier, southModelId: Identifier, westModelId: Identifier) = BlockStateModelGenerator.method_46189(customFenceBlock, postModelId, northModelId, eastModelId, southModelId, westModelId)
    /**
     * method_25566
     */
    fun <T>createValueFencedModelMap(property: property_Property<T>, fence: T, higherOrEqualModelId: Identifier, lowerModelId: Identifier) where T: Comparable<T> = BlockStateModelGenerator.method_25566<T>(property, fence, higherOrEqualModelId, lowerModelId)
    /**
     * method_25645
     */
    fun createBlockStateWithTwoModelAndRandomInversion(block: Block, firstModelId: Identifier, secondModelId: Identifier) = BlockStateModelGenerator.method_25645(block, firstModelId, secondModelId)
    /**
     * method_25618
     */
    fun createSouthDefaultHorizontalRotationStates() = BlockStateModelGenerator.method_25618()
    /**
     * method_25636
     */
    fun createWallBlockState(wallBlock: Block, postModelId: Identifier, lowSideModelId: Identifier, tallSideModelId: Identifier) = BlockStateModelGenerator.method_25636(wallBlock, postModelId, lowSideModelId, tallSideModelId)
    /**
     * method_25599
     */
    fun createNorthDefaultHorizontalRotationStates() = BlockStateModelGenerator.method_25599()
    /**
     * method_25584
     */
    fun createModelVariantWithRandomHorizontalRotations(modelId: Identifier) = BlockStateModelGenerator.method_25584(modelId)
    /**
     * method_25661
     */
    fun createFenceBlockState(fenceBlock: Block, postModelId: Identifier, sideModelId: Identifier) = BlockStateModelGenerator.method_25661(fenceBlock, postModelId, sideModelId)
    /**
     * method_25673
     */
    fun createPressurePlateBlockState(pressurePlateBlock: Block, upModelId: Identifier, downModelId: Identifier) = BlockStateModelGenerator.method_25673(pressurePlateBlock, upModelId, downModelId)
    /**
     * method_25630
     */
    fun createEastDefaultHorizontalRotationStates() = BlockStateModelGenerator.method_25630()
    /**
     * method_42039
     */
    fun createMudBrickState(block: Block, modelId: Identifier, textures: TextureMap, modelCollector: BiConsumer<Identifier, ModelSupplier>) = BlockStateModelGenerator.method_42039(block, modelId, textures, modelCollector)
    /**
     * method_25662
     */
    fun createTrapdoorBlockState(trapdoorBlock: Block, topModelId: Identifier, bottomModelId: Identifier, openModelId: Identifier) = BlockStateModelGenerator.method_25662(trapdoorBlock, topModelId, bottomModelId, openModelId)
    /**
     * method_25640
     */
    fun createNorthDefaultRotationStates() = BlockStateModelGenerator.method_25640()
    /**
     * method_25609
     */
    fun createDoorBlockState(doorBlock: Block, bottomLeftHingeClosedModelId: Identifier, bottomLeftHingeOpenModelId: Identifier, bottomRightHingeClosedModelId: Identifier, bottomRightHingeOpenModelId: Identifier, topLeftHingeClosedModelId: Identifier, topLeftHingeOpenModelId: Identifier, topRightHingeClosedModelId: Identifier, topRightHingeOpenModelId: Identifier) = BlockStateModelGenerator.method_25609(doorBlock, bottomLeftHingeClosedModelId, bottomLeftHingeOpenModelId, bottomRightHingeClosedModelId, bottomRightHingeOpenModelId, topLeftHingeClosedModelId, topLeftHingeOpenModelId, topRightHingeClosedModelId, topRightHingeOpenModelId)
    /**
     * method_25572
     */
    fun fillDoorVariantMap(variantMap: net.minecraft.class_4926.class_4930<Direction, DoubleBlockHalf, DoorHinge, Boolean>, targetHalf: DoubleBlockHalf, leftHingeClosedModelId: Identifier, leftHingeOpenModelId: Identifier, rightHingeClosedModelId: Identifier, rightHingeOpenModelId: Identifier) = BlockStateModelGenerator.method_25572(variantMap, targetHalf, leftHingeClosedModelId, leftHingeOpenModelId, rightHingeClosedModelId, rightHingeOpenModelId)
    /**
     * method_25634
     */
    fun createBlockStateWithRandomHorizontalRotations(block: Block, modelId: Identifier) = BlockStateModelGenerator.method_25634(block, modelId)
    /**
     * method_25565
     */
    fun createBooleanModelMap(property: BooleanProperty, trueModel: Identifier, falseModel: Identifier) = BlockStateModelGenerator.method_25565(property, trueModel, falseModel)
    /**
     * method_47519
     */
    fun createUvLockedColumnBlockState(block: Block, textureMap: TextureMap, modelCollector: BiConsumer<Identifier, ModelSupplier>) = BlockStateModelGenerator.method_47519(block, textureMap, modelCollector)
    /**
     * method_25644
     */
    fun createSingletonBlockState(block: Block, modelId: Identifier) = BlockStateModelGenerator.method_25644(block, modelId)
}