package me.hellrevenger.generated.Map_BlockStateModelGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_22830
 */
val BlockStateModelGenerator.blockStateCollector by alias(BlockStateModelGenerator::field_22830)
/**
 * field_55238
 */
val BlockStateModelGenerator.itemModelOutput by alias(BlockStateModelGenerator::field_55238)
/**
 * field_22831
 */
val BlockStateModelGenerator.modelCollector by alias(BlockStateModelGenerator::field_22831)
/**
 * method_25619
 */
fun BlockStateModelGenerator.registerMirrorable(block: Block) = this.method_25619(block)
/**
 * method_65398
 */
fun BlockStateModelGenerator.uploadItemModel(item: Item) = this.method_65398(item)
/**
 * method_25547
 */
fun BlockStateModelGenerator.registerCrop(crop: Block, ageProperty: property_Property<Int>, ageTextureIndices: IntArray) = this.method_25547(crop, ageProperty, *ageTextureIndices)
/**
 * method_25623
 */
fun BlockStateModelGenerator.registerParentedItemModel(block: Block, parentModelId: Identifier) = this.method_25623(block, parentModelId)
/**
 * method_25686
 */
fun BlockStateModelGenerator.registerRoots(root: Block, pottedRoot: Block) = this.method_25686(root, pottedRoot)
/**
 * method_25602
 */
fun BlockStateModelGenerator.registerPlantPart(plant: Block, plantStem: Block, tintType: net.minecraft.class_4910.class_4913) = this.method_25602(plant, plantStem, tintType)
/**
 * method_25561
 */
fun BlockStateModelGenerator.registerPiston(piston: Block, extendedModelId: Identifier, textures: TextureMap) = this.method_25561(piston, extendedModelId, textures)
/**
 * method_25688
 */
fun BlockStateModelGenerator.registerStraightRail(rail: Block) = this.method_25688(rail)
/**
 * method_51463
 */
fun BlockStateModelGenerator.registerGeneric(block: Block) = this.method_51463(block)
/**
 * method_65402
 */
fun BlockStateModelGenerator.registerTintedItemModel(block: Block, modelId: Identifier, tint: TintSource) = this.method_65402(block, modelId, tint)
/**
 * method_25536
 */
fun BlockStateModelGenerator.getTurtleEggModel(eggs: Int, prefix: String, textures: TextureMap) = this.method_25536(eggs, prefix, textures)
/**
 * method_31063
 */
fun BlockStateModelGenerator.registerAxisRotated(block: Block, modelId: Identifier) = this.method_31063(block, modelId)
/**
 * method_65422
 */
fun BlockStateModelGenerator.registerBuiltin(block: Block) = this.method_65422(block)
/**
 * method_33520
 */
fun BlockStateModelGenerator.registerMultifaceBlock(block: Block) = this.method_33520(block)
/**
 * method_25641
 */
fun BlockStateModelGenerator.registerSimpleCubeAll(block: Block) = this.method_25641(block)
/**
 * method_65417
 */
fun BlockStateModelGenerator.registerDoubleBlockAndItem(block: Block, crossType: net.minecraft.class_4910.class_4913) = this.method_65417(block, crossType)
/**
 * method_25665
 */
fun BlockStateModelGenerator.registerOrientableTrapdoor(trapdoorBlock: Block) = this.method_25665(trapdoorBlock)
/**
 * method_25558
 */
fun BlockStateModelGenerator.registerBeehive(beehive: Block, texturesFactory: function_Function<Block, TextureMap>) = this.method_25558(beehive, texturesFactory)
/**
 * method_47814
 */
fun BlockStateModelGenerator.supplyChiseledBookshelfModel(blockStateSupplier: MultipartBlockStateSupplier, facingCondition: net.minecraft.class_4918.class_4921, rotation: net.minecraft.class_4936.class_4937, property: BooleanProperty, model: Model, occupied: Boolean) = this.method_47814(blockStateSupplier, facingCondition, rotation, property, model, occupied)
/**
 * method_25622
 */
fun BlockStateModelGenerator.registerSingleton(block: Block, modelFactory: net.minecraft.class_4946.class_4947) = this.method_25622(block, modelFactory)
/**
 * method_25706
 */
fun BlockStateModelGenerator.registerLantern(lantern: Block) = this.method_25706(lantern)
/**
 * method_25672
 */
fun BlockStateModelGenerator.registerParented(modelSource: Block, child: Block) = this.method_25672(modelSource, child)
/**
 * method_25542
 */
fun BlockStateModelGenerator.registerBuiltinWithParticle(block: Block, particleSource: Item) = this.method_25542(block, particleSource)
/**
 * method_65409
 */
fun BlockStateModelGenerator.registerSpecialItemModel(block: Block, specialModel: net.minecraft.class_10515.class_10516) = this.method_65409(block, specialModel)
/**
 * method_49374
 */
fun BlockStateModelGenerator.registerTintableCrossBlockStateWithStages(block: Block, tintType: net.minecraft.class_4910.class_4913, stageProperty: property_Property<Int>, stages: IntArray) = this.method_49374(block, tintType, stageProperty, *stages)
/**
 * method_25614
 */
fun BlockStateModelGenerator.registerSouthDefaultHorizontalFacing(modelFactory: net.minecraft.class_4946.class_4947, blocks: Array<Block>) = this.method_25614(modelFactory, *blocks)
/**
 * method_65421
 */
fun BlockStateModelGenerator.registerGrassTintedDoubleBlockAndItem(block: Block) = this.method_65421(block)
/**
 * method_64949
 */
fun BlockStateModelGenerator.registerCreakingHeart(block: Block) = this.method_64949(block)
/**
 * method_25671
 */
fun BlockStateModelGenerator.registerTrapdoor(trapdoorBlock: Block) = this.method_25671(trapdoorBlock)
/**
 * method_46190
 */
fun BlockStateModelGenerator.registerHangingSign(base: Block, hangingSign: Block, wallHangingSign: Block) = this.method_46190(base, hangingSign, wallHangingSign)
/**
 * method_25652
 */
fun BlockStateModelGenerator.registerCooker(cooker: Block, modelFactory: net.minecraft.class_4946.class_4947) = this.method_25652(cooker, modelFactory)
/**
 * method_65295
 */
fun BlockStateModelGenerator.registerMultifaceBlock(block: Block, item: Item) = this.method_65295(block, item)
/**
 * method_25537
 */
fun BlockStateModelGenerator.registerItemModel(item: Item) = this.method_25537(item)
/**
 * method_65416
 */
fun BlockStateModelGenerator.registerTwoLayerItemModel(block: Block, layer1Suffix: String) = this.method_65416(block, layer1Suffix)
/**
 * method_25666
 */
fun BlockStateModelGenerator.registerWeightedPressurePlate(weightedPressurePlate: Block, textureSource: Block) = this.method_25666(weightedPressurePlate, textureSource)
/**
 * method_25642
 */
fun BlockStateModelGenerator.registerWoolAndCarpet(wool: Block, carpet: Block) = this.method_25642(wool, carpet)
/**
 * method_37317
 */
fun BlockStateModelGenerator.registerPottedAzaleaBush(block: Block) = this.method_37317(block)
/**
 * method_25696
 */
fun BlockStateModelGenerator.registerDispenserLikeOrientable(block: Block) = this.method_25696(block)
/**
 * method_54826
 */
fun BlockStateModelGenerator.registerCopperBulb(copperBulbBlock: Block) = this.method_54826(copperBulbBlock)
/**
 * method_65403
 */
fun BlockStateModelGenerator.registerBuiltinWithParticle(block: Block, particleSource: Block) = this.method_65403(block, particleSource)
/**
 * method_25650
 */
fun BlockStateModelGenerator.registerCubeAllModelTexturePool(block: Block) = this.method_25650(block)
/**
 * method_25534
 */
fun BlockStateModelGenerator.register() = this.method_25534()
/**
 * method_25556
 */
fun BlockStateModelGenerator.registerItemModel(block: Block, textureSuffix: String) = this.method_25556(block, textureSuffix)
/**
 * method_25651
 */
fun BlockStateModelGenerator.registerGlassAndPane(glassBlock: Block, glassPane: Block) = this.method_25651(glassBlock, glassPane)
/**
 * method_25685
 */
fun BlockStateModelGenerator.registerTurnableRail(rail: Block) = this.method_25685(rail)
/**
 * method_25700
 */
fun BlockStateModelGenerator.getFireFloorModels(texture: Block) = this.method_25700(texture)
/**
 * method_25550
 */
fun BlockStateModelGenerator.registerNorthDefaultHorizontalRotatable(block: Block, texture: TextureMap) = this.method_25550(block, texture)
/**
 * method_65404
 */
fun BlockStateModelGenerator.registerChest(block: Block, particleSource: Block, texture: Identifier, christmas: Boolean) = this.method_65404(block, particleSource, texture, christmas)
/**
 * method_49377
 */
fun BlockStateModelGenerator.registerBrushableBlock(block: Block) = this.method_49377(block)
/**
 * method_32229
 */
fun BlockStateModelGenerator.registerAmethyst(block: Block) = this.method_32229(block)
/**
 * method_32803
 */
fun BlockStateModelGenerator.getDripstoneVariant(direction: Direction, thickness: Thickness) = this.method_32803(direction, thickness)
/**
 * method_25576
 */
fun BlockStateModelGenerator.registerRandomHorizontalRotations(modelFactory: net.minecraft.class_4946.class_4947, blocks: Array<Block>) = this.method_25576(modelFactory, *blocks)
/**
 * method_25543
 */
fun BlockStateModelGenerator.registerStateWithModelReference(block: Block, modelReference: Block) = this.method_25543(block, modelReference)
/**
 * method_25560
 */
fun BlockStateModelGenerator.registerTopSoil(topSoil: Block, modelId: Identifier, snowyVariant: BlockStateVariant) = this.method_25560(topSoil, modelId, snowyVariant)
/**
 * method_25698
 */
fun BlockStateModelGenerator.registerNetherrackBottomCustomTop(block: Block) = this.method_25698(block)
/**
 * method_65408
 */
fun BlockStateModelGenerator.registerTintedBlockAndItem(block: Block, texturedModelFactory: net.minecraft.class_4946.class_4947, tintColor: Int) = this.method_65408(block, texturedModelFactory, tintColor)
/**
 * method_25549
 */
fun BlockStateModelGenerator.registerTintableCross(block: Block, tintType: net.minecraft.class_4910.class_4913, texture: TextureMap) = this.method_25549(block, tintType, texture)
/**
 * method_25677
 */
fun BlockStateModelGenerator.registerTorch(torch: Block, wallTorch: Block) = this.method_25677(torch, wallTorch)
/**
 * method_31064
 */
fun BlockStateModelGenerator.registerRod(block: Block) = this.method_31064(block)
/**
 * method_25702
 */
fun BlockStateModelGenerator.getFireSideModels(texture: Block) = this.method_25702(texture)
/**
 * method_25603
 */
fun BlockStateModelGenerator.registerTintableCrossBlockState(block: Block, tintType: net.minecraft.class_4910.class_4913) = this.method_25603(block, tintType)
/**
 * method_65399
 */
fun BlockStateModelGenerator.registerItemModel(item: Item, modelId: Identifier) = this.method_65399(item, modelId)
/**
 * method_65419
 */
fun BlockStateModelGenerator.uploadParticleModel(block: Block, particleSource: Block) = this.method_65419(block, particleSource)
/**
 * method_25692
 */
fun BlockStateModelGenerator.registerAnvil(anvil: Block) = this.method_25692(anvil)
/**
 * method_25545
 */
fun BlockStateModelGenerator.registerFlowerPotPlant(plantBlock: Block, flowerPotBlock: Block, tintType: net.minecraft.class_4910.class_4913) = this.method_25545(plantBlock, flowerPotBlock, tintType)
/**
 * method_65414
 */
fun BlockStateModelGenerator.uploadTwoLayerBlockItemModel(item: Item, block: Block, layer1Suffix: String) = this.method_65414(item, block, layer1Suffix)
/**
 * method_49378
 */
fun BlockStateModelGenerator.registerFlowerbed(flowerbed: Block) = this.method_49378(flowerbed)
/**
 * method_65405
 */
fun BlockStateModelGenerator.registerBanner(block: Block, wallBlock: Block, color: DyeColor) = this.method_65405(block, wallBlock, color)
/**
 * method_47812
 */
fun BlockStateModelGenerator.supplyChiseledBookshelfModels(blockStateSupplier: MultipartBlockStateSupplier, facingCondition: net.minecraft.class_4918.class_4921, rotation: net.minecraft.class_4936.class_4937) = this.method_47812(blockStateSupplier, facingCondition, rotation)
/**
 * method_25600
 */
fun BlockStateModelGenerator.registerItemModel(block: Block) = this.method_25600(block)
/**
 * method_25676
 */
fun BlockStateModelGenerator.registerLog(logBlock: Block) = this.method_25676(logBlock)
/**
 * method_25544
 */
fun BlockStateModelGenerator.registerCoral(coral: Block, deadCoral: Block, coralBlock: Block, deadCoralBlock: Block, coralFan: Block, deadCoralFan: Block, coralWallFan: Block, deadCoralWallFan: Block) = this.method_25544(coral, deadCoral, coralBlock, deadCoralBlock, coralFan, deadCoralFan, coralWallFan, deadCoralWallFan)
/**
 * method_25605
 */
fun BlockStateModelGenerator.registerNorthDefaultHorizontalRotated(block: Block, modelFactory: net.minecraft.class_4946.class_4947) = this.method_25605(block, modelFactory)
/**
 * method_25604
 */
fun BlockStateModelGenerator.registerTintableCrossBlockState(block: Block, tintType: net.minecraft.class_4910.class_4913, crossTexture: TextureMap) = this.method_25604(block, tintType, crossTexture)
/**
 * method_25681
 */
fun BlockStateModelGenerator.registerSimpleState(block: Block) = this.method_25681(block)
/**
 * method_25704
 */
fun BlockStateModelGenerator.getFireUpModels(texture: Block) = this.method_25704(texture)
/**
 * method_65406
 */
fun BlockStateModelGenerator.registerSkull(block: Block, wallBlock: Block, type: net.minecraft.class_2484.class_2485, baseModelId: Identifier) = this.method_65406(block, wallBlock, type, baseModelId)
/**
 * method_25553
 */
fun BlockStateModelGenerator.registerAxisRotated(block: Block, modelFactory: net.minecraft.class_4946.class_4947) = this.method_25553(block, modelFactory)
/**
 * method_26433
 */
fun BlockStateModelGenerator.addJigsawOrientationToVariant(orientation: Orientation, variant: BlockStateVariant) = this.method_26433(orientation, variant)
/**
 * method_54822
 */
fun BlockStateModelGenerator.createCopperBulbBlockState(copperBulbBlock: Block, modelId: Identifier, litModelId: Identifier, poweredModelId: Identifier, litPoweredModelId: Identifier) = this.method_54822(copperBulbBlock, modelId, litModelId, poweredModelId, litPoweredModelId)
/**
 * method_25620
 */
fun BlockStateModelGenerator.registerGourd(stemBlock: Block, attachedStemBlock: Block) = this.method_25620(stemBlock, attachedStemBlock)
/**
 * method_25554
 */
fun BlockStateModelGenerator.registerAxisRotated(block: Block, verticalModelFactory: net.minecraft.class_4946.class_4947, horizontalModelFactory: net.minecraft.class_4946.class_4947) = this.method_25554(block, verticalModelFactory, horizontalModelFactory)
/**
 * method_25694
 */
fun BlockStateModelGenerator.registerMushroomBlock(mushroomBlock: Block) = this.method_25694(mushroomBlock)
/**
 * method_32228
 */
fun BlockStateModelGenerator.registerCandle(candle: Block, cake: Block) = this.method_32228(candle, cake)
/**
 * method_25710
 */
fun BlockStateModelGenerator.registerShulkerBox(arg0: Block, shulkerBox: DyeColor) = this.method_25710(arg0, shulkerBox)
/**
 * method_25675
 */
fun BlockStateModelGenerator.createUpDefaultFacingVariantMap() = this.method_25675()
/**
 * method_54825
 */
fun BlockStateModelGenerator.registerWaxedCopperBulb(unwaxedCopperBulbBlock: Block, waxedCopperBulbBlock: Block) = this.method_54825(unwaxedCopperBulbBlock, waxedCopperBulbBlock)
/**
 * method_25631
 */
fun BlockStateModelGenerator.registerRotatable(block: Block) = this.method_25631(block)
/**
 * method_64941
 */
fun BlockStateModelGenerator.registerHangingMoss(block: Block) = this.method_64941(block)
/**
 * method_25708
 */
fun BlockStateModelGenerator.registerNorthDefaultHorizontalRotation(block: Block) = this.method_25708(block)
/**
 * method_65420
 */
fun BlockStateModelGenerator.registerGrassTinted(block: Block) = this.method_65420(block)
/**
 * method_65407
 */
fun BlockStateModelGenerator.registerFlowerPotPlantAndItem(block: Block, flowerPotBlock: Block, crossType: net.minecraft.class_4910.class_4913) = this.method_65407(block, flowerPotBlock, crossType)
/**
 * method_25535
 */
fun BlockStateModelGenerator.getBambooBlockStateVariants(age: Int) = this.method_25535(age)
/**
 * method_25581
 */
fun BlockStateModelGenerator.getTurtleEggModel(eggs: Int, hatch: Int) = this.method_25581(eggs, hatch)
/**
 * method_25557
 */
fun BlockStateModelGenerator.createSubModel(block: Block, suffix: String, model: Model, texturesFactory: function_Function<Identifier, TextureMap>) = this.method_25557(block, suffix, model, texturesFactory)
/**
 * method_65400
 */
fun BlockStateModelGenerator.uploadBlockItemModel(item: Item, block: Block) = this.method_65400(item, block)
/**
 * method_64940
 */
fun BlockStateModelGenerator.registerPaleMossCarpet(block: Block) = this.method_64940(block)
/**
 * method_25546
 */
fun BlockStateModelGenerator.registerCubeWithCustomTextures(block: Block, otherTextureSource: Block, texturesFactory: BiFunction<Block, Block, TextureMap>) = this.method_25546(block, otherTextureSource, texturesFactory)
/**
 * method_65401
 */
fun BlockStateModelGenerator.uploadBlockItemModel(item: Item, block: Block, textureSuffix: String) = this.method_65401(item, block, textureSuffix)
/**
 * method_25660
 */
fun BlockStateModelGenerator.registerBuiltinWithParticle(block: Block, particleSource: Identifier) = this.method_25660(block, particleSource)
/**
 * method_54823
 */
fun BlockStateModelGenerator.registerParentedDoor(parent: Block, doorBlock: Block) = this.method_54823(parent, doorBlock)
/**
 * method_25548
 */
fun BlockStateModelGenerator.registerTintableCross(block: Block, crossType: net.minecraft.class_4910.class_4913) = this.method_25548(block, crossType)
/**
 * method_25621
 */
fun BlockStateModelGenerator.registerDoubleBlock(doubleBlock: Block, tintType: net.minecraft.class_4910.class_4913) = this.method_25621(doubleBlock, tintType)
/**
 * method_27166
 */
fun BlockStateModelGenerator.registerCampfire(blocks: Array<Block>) = this.method_27166(*blocks)
/**
 * method_25678
 */
fun BlockStateModelGenerator.registerDoubleBlock(block: Block, upperHalfModelId: Identifier, lowerHalfModelId: Identifier) = this.method_25678(block, upperHalfModelId, lowerHalfModelId)
/**
 * method_54824
 */
fun BlockStateModelGenerator.registerParentedTrapdoor(parent: Block, trapdoorBlock: Block) = this.method_54824(parent, trapdoorBlock)
/**
 * method_25690
 */
fun BlockStateModelGenerator.registerCommandBlock(commandBlock: Block) = this.method_25690(commandBlock)
/**
 * method_65415
 */
fun BlockStateModelGenerator.registerBed(block: Block, particleSource: Block, color: DyeColor) = this.method_65415(block, particleSource, color)
/**
 * method_25658
 */
fun BlockStateModelGenerator.registerDoor(doorBlock: Block) = this.method_25658(doorBlock)
/**
 * method_65291
 */
fun BlockStateModelGenerator.registerMultifaceBlockModel(block: Block) = this.method_65291(block)
/**
 * method_25601
 */
fun BlockStateModelGenerator.registerCoralFan(coralFanBlock: Block, coralWallFanBlock: Block) = this.method_25601(coralFanBlock, coralWallFanBlock)
/**
 * method_33713
 */
fun BlockStateModelGenerator.registerAzalea(block: Block) = this.method_33713(block)
