package me.hellrevenger.generated.Map_ChunkGenerator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_39412
 */
var ChunkGenerator.indexedFeaturesListSupplier by alias(ChunkGenerator::field_39412)
/**
 * method_18028
 */
fun ChunkGenerator.getHeightInGround(arg0: Int, arg1: Int, arg2: net.minecraft.class_2902.class_2903, arg3: HeightLimitView, arg4: NoiseConfig) = this.method_18028(arg0, arg1, arg2, arg3, arg4)
/**
 * method_12098
 */
fun ChunkGenerator.getBiomeSource() = this.method_12098()
/**
 * method_16130
 */
fun ChunkGenerator.addStructureReferences(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: Chunk) = this.method_16130(arg0, arg1, arg2)
/**
 * method_26261
 */
fun ChunkGenerator.getColumnSample(arg0: Int, arg1: Int, arg2: HeightLimitView, arg3: NoiseConfig) = this.method_26261(arg0, arg1, arg2, arg3)
/**
 * method_12108
 */
fun ChunkGenerator.carve(arg0: ChunkRegion, arg1: Long, arg2: NoiseConfig, arg3: BiomeAccess, arg4: StructureAccessor, arg5: Chunk, arg6: net.minecraft.class_2893.class_2894) = this.method_12108(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_12100
 */
fun ChunkGenerator.getSpawnHeight(arg0: HeightLimitView) = this.method_12100(arg0)
/**
 * method_16397
 */
fun ChunkGenerator.getHeight(arg0: Int, arg1: Int, arg2: net.minecraft.class_2902.class_2903, arg3: HeightLimitView, arg4: NoiseConfig) = this.method_16397(arg0, arg1, arg2, arg3, arg4)
/**
 * method_12102
 */
fun ChunkGenerator.generateFeatures(arg0: StructureWorldAccess, arg1: Chunk, arg2: StructureAccessor) = this.method_12102(arg0, arg1, arg2)
/**
 * method_12107
 */
fun ChunkGenerator.populateEntities(arg0: ChunkRegion) = this.method_12107(arg0)
/**
 * method_12104
 */
fun ChunkGenerator.getWorldHeight() = this.method_12104()
/**
 * method_20402
 */
fun ChunkGenerator.getHeightOnGround(arg0: Int, arg1: Int, arg2: net.minecraft.class_2902.class_2903, arg3: HeightLimitView, arg4: NoiseConfig) = this.method_20402(arg0, arg1, arg2, arg3, arg4)
/**
 * method_38275
 */
fun ChunkGenerator.populateBiomes(arg0: NoiseConfig, arg1: Blender, arg2: StructureAccessor, arg3: Chunk) = this.method_38275(arg0, arg1, arg2, arg3)
/**
 * method_39301
 */
fun ChunkGenerator.getCodecKey() = this.method_39301()
/**
 * method_59825
 */
fun ChunkGenerator.initializeIndexedFeaturesList() = this.method_59825()
/**
 * method_12110
 */
fun ChunkGenerator.buildSurface(arg0: ChunkRegion, arg1: StructureAccessor, arg2: NoiseConfig, arg3: Chunk) = this.method_12110(arg0, arg1, arg2, arg3)
/**
 * method_12113
 */
fun ChunkGenerator.getEntitySpawnList(arg0: RegistryEntry<Biome>, arg1: StructureAccessor, arg2: SpawnGroup, arg3: BlockPos) = this.method_12113(arg0, arg1, arg2, arg3)
/**
 * method_40450
 */
fun ChunkGenerator.getDebugHudText(arg0: MutableList<String>, arg1: NoiseConfig, arg2: BlockPos) = this.method_40450(arg0, arg1, arg2)
/**
 * method_12103
 */
fun ChunkGenerator.locateStructure(arg0: ServerWorld, arg1: RegistryEntryList<Structure>, arg2: BlockPos, arg3: Int, arg4: Boolean) = this.method_12103(arg0, arg1, arg2, arg3, arg4)
/**
 * method_46696
 */
fun ChunkGenerator.createStructurePlacementCalculator(arg0: RegistryWrapper<StructureSet>, arg1: NoiseConfig, arg2: Long) = this.method_46696(arg0, arg1, arg2)
/**
 * method_16129
 */
fun ChunkGenerator.setStructureStarts(arg0: DynamicRegistryManager, arg1: StructurePlacementCalculator, arg2: StructureAccessor, arg3: Chunk, arg4: StructureTemplateManager) = this.method_16129(arg0, arg1, arg2, arg3, arg4)
/**
 * method_33730
 */
fun ChunkGenerator.getMinimumY() = this.method_33730()
/**
 * method_16398
 */
fun ChunkGenerator.getSeaLevel() = this.method_16398()
/**
 * method_12088
 */
fun ChunkGenerator.populateNoise(arg0: Blender, arg1: NoiseConfig, arg2: StructureAccessor, arg3: Chunk) = this.method_12088(arg0, arg1, arg2, arg3)
/**
 * method_44216
 */
fun ChunkGenerator.getGenerationSettings(arg0: RegistryEntry<Biome>) = this.method_44216(arg0)
