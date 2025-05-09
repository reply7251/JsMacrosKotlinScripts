package me.hellrevenger.generated.Map_Structure
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_41609
 */
fun Structure.expandBoxIfShouldAdaptNoise(box: BlockBox) = this.method_41609(box)
/**
 * method_41615
 */
fun Structure.getStructureSpawns() = this.method_41615()
/**
 * method_42701
 */
fun Structure.getTerrainAdaptation() = this.method_42701()
/**
 * method_47932
 */
fun Structure.getValidStructurePosition(context: net.minecraft.class_3195.class_7149) = this.method_47932(context)
/**
 * method_41616
 */
fun Structure.getFeatureGenerationStep() = this.method_41616()
/**
 * method_41614
 */
fun Structure.createStructureStart(structure: RegistryEntry<Structure>, dimension: RegistryKey<world_World>, dynamicRegistryManager: DynamicRegistryManager, chunkGenerator: ChunkGenerator, biomeSource: BiomeSource, noiseConfig: NoiseConfig, structureTemplateManager: StructureTemplateManager, seed: Long, arg8: ChunkPos, chunkPos: Int, references: HeightLimitView, world: Predicate<RegistryEntry<Biome>>) = this.method_41614(structure, dimension, dynamicRegistryManager, chunkGenerator, biomeSource, noiseConfig, structureTemplateManager, seed, arg8, chunkPos, references, world)
/**
 * method_41618
 */
fun Structure.getType() = this.method_41618()
/**
 * method_41607
 */
fun Structure.getValidBiomes() = this.method_41607()
/**
 * method_38694
 */
fun Structure.postPlace(world: StructureWorldAccess, structureAccessor: StructureAccessor, chunkGenerator: ChunkGenerator, random: Random, box: BlockBox, chunkPos: ChunkPos, pieces: StructurePiecesList) = this.method_38694(world, structureAccessor, chunkGenerator, random, box, chunkPos, pieces)
