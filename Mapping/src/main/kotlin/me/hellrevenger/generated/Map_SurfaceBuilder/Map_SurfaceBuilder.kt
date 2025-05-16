package me.hellrevenger.generated.Map_SurfaceBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39106
 */
fun SurfaceBuilder.buildSurface(noiseConfig: NoiseConfig?, biomeAccess: BiomeAccess?, biomeRegistry: Registry<Biome>?, useLegacyRandom: Boolean, heightContext: HeightContext?, chunk: Chunk?, chunkNoiseSampler: ChunkNoiseSampler?, materialRule: net.minecraft.class_6686.class_6708?) = this.method_39106(noiseConfig, biomeAccess, biomeRegistry, useLegacyRandom, heightContext, chunk, chunkNoiseSampler, materialRule)
/**
 * method_39110
 */
fun SurfaceBuilder.applyMaterialRule(rule: net.minecraft.class_6686.class_6708?, context: CarverContext?, posToBiome: function_Function<BlockPos, RegistryEntry<Biome>>?, chunk: Chunk?, chunkNoiseSampler: ChunkNoiseSampler?, pos: BlockPos?, hasFluid: Boolean) = this.method_39110(rule, context, posToBiome, chunk, chunkNoiseSampler, pos, hasFluid)
/**
 * method_61805
 */
fun SurfaceBuilder.getSeaLevel() = this.method_61805()
