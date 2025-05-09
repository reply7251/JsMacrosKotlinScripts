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
fun ChunkGenerator.getHeightInGround(x: Int, z: Int, heightmap: net.minecraft.class_2902.class_2903, world: HeightLimitView, noiseConfig: NoiseConfig) = this.method_18028(x, z, heightmap, world, noiseConfig)
/**
 * method_12098
 */
fun ChunkGenerator.getBiomeSource() = this.method_12098()
/**
 * method_16130
 */
fun ChunkGenerator.addStructureReferences(world: StructureWorldAccess, structureAccessor: StructureAccessor, chunk: Chunk) = this.method_16130(world, structureAccessor, chunk)
/**
 * method_26261
 */
fun ChunkGenerator.getColumnSample(x: Int, z: Int, world: HeightLimitView, noiseConfig: NoiseConfig) = this.method_26261(x, z, world, noiseConfig)
/**
 * method_12100
 */
fun ChunkGenerator.getSpawnHeight(world: HeightLimitView) = this.method_12100(world)
/**
 * method_16397
 */
fun ChunkGenerator.getHeight(x: Int, z: Int, heightmap: net.minecraft.class_2902.class_2903, world: HeightLimitView, noiseConfig: NoiseConfig) = this.method_16397(x, z, heightmap, world, noiseConfig)
/**
 * method_12102
 */
fun ChunkGenerator.generateFeatures(world: StructureWorldAccess, chunk: Chunk, structureAccessor: StructureAccessor) = this.method_12102(world, chunk, structureAccessor)
/**
 * method_12107
 */
fun ChunkGenerator.populateEntities(region: ChunkRegion) = this.method_12107(region)
/**
 * method_12104
 */
fun ChunkGenerator.getWorldHeight() = this.method_12104()
/**
 * method_20402
 */
fun ChunkGenerator.getHeightOnGround(x: Int, z: Int, heightmap: net.minecraft.class_2902.class_2903, world: HeightLimitView, noiseConfig: NoiseConfig) = this.method_20402(x, z, heightmap, world, noiseConfig)
/**
 * method_12108
 */
fun ChunkGenerator.carve(chunkRegion: ChunkRegion, seed: Long, arg2: NoiseConfig, noiseConfig: BiomeAccess, biomeAccess: StructureAccessor, structureAccessor: Chunk) = this.method_12108(chunkRegion, seed, arg2, noiseConfig, biomeAccess, structureAccessor)
/**
 * method_38275
 */
fun ChunkGenerator.populateBiomes(noiseConfig: NoiseConfig, blender: Blender, structureAccessor: StructureAccessor, chunk: Chunk) = this.method_38275(noiseConfig, blender, structureAccessor, chunk)
/**
 * method_39301
 */
fun ChunkGenerator.getCodecKey() = this.method_39301()
/**
 * method_59825
 */
fun ChunkGenerator.initializeIndexedFeaturesList() = this.method_59825()
/**
 * method_16129
 */
fun ChunkGenerator.setStructureStarts(registryManager: DynamicRegistryManager, placementCalculator: StructurePlacementCalculator, structureAccessor: StructureAccessor, chunk: Chunk, structureTemplateManager: StructureTemplateManager, dimension: RegistryKey<world_World>) = this.method_16129(registryManager, placementCalculator, structureAccessor, chunk, structureTemplateManager, dimension)
/**
 * method_12110
 */
fun ChunkGenerator.buildSurface(region: ChunkRegion, structures: StructureAccessor, noiseConfig: NoiseConfig, chunk: Chunk) = this.method_12110(region, structures, noiseConfig, chunk)
/**
 * method_12113
 */
fun ChunkGenerator.getEntitySpawnList(biome: RegistryEntry<Biome>, accessor: StructureAccessor, group: SpawnGroup, pos: BlockPos) = this.method_12113(biome, accessor, group, pos)
/**
 * method_40450
 */
fun ChunkGenerator.appendDebugHudText(text: MutableList<String>, noiseConfig: NoiseConfig, pos: BlockPos) = this.method_40450(text, noiseConfig, pos)
/**
 * method_12103
 */
fun ChunkGenerator.locateStructure(world: ServerWorld, structures: RegistryEntryList<Structure>, center: BlockPos, radius: Int, skipReferencedStructures: Boolean) = this.method_12103(world, structures, center, radius, skipReferencedStructures)
/**
 * method_46696
 */
fun ChunkGenerator.createStructurePlacementCalculator(structureSetRegistry: RegistryWrapper<StructureSet>, noiseConfig: NoiseConfig, seed: Long) = this.method_46696(structureSetRegistry, noiseConfig, seed)
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
fun ChunkGenerator.populateNoise(blender: Blender, noiseConfig: NoiseConfig, structureAccessor: StructureAccessor, chunk: Chunk) = this.method_12088(blender, noiseConfig, structureAccessor, chunk)
/**
 * method_44216
 */
fun ChunkGenerator.getGenerationSettings(biomeEntry: RegistryEntry<Biome>) = this.method_44216(biomeEntry)
