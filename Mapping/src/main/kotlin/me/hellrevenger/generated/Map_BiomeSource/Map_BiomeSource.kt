package me.hellrevenger.generated.Map_BiomeSource
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_42310
 */
fun BiomeSource.locateBiome(origin: BlockPos, radius: Int, horizontalBlockCheckInterval: Int, verticalBlockCheckInterval: Int, predicate: Predicate<RegistryEntry<Biome>>, noiseSampler: net.minecraft.class_6544.class_6552, world: WorldView) = this.method_42310(origin, radius, horizontalBlockCheckInterval, verticalBlockCheckInterval, predicate, noiseSampler, world)
/**
 * method_38114
 */
fun BiomeSource.addDebugInfo(info: MutableList<String>, pos: BlockPos, noiseSampler: net.minecraft.class_6544.class_6552) = this.method_38114(info, pos, noiseSampler)
/**
 * method_28443
 */
fun BiomeSource.getBiomes() = this.method_28443()
/**
 * method_8763
 */
fun BiomeSource.getBiomesInArea(x: Int, y: Int, z: Int, radius: Int, sampler: net.minecraft.class_6544.class_6552) = this.method_8763(x, y, z, radius, sampler)
