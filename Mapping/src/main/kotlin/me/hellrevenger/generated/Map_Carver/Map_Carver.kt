package me.hellrevenger.generated.Map_Carver
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_28614
 */
fun <C>Carver<C>.configure(config: C) where C: CarverConfig = this.method_28614(config)
/**
 * method_28616
 */
fun <C>Carver<C>.getCodec() where C: CarverConfig = this.method_28616()
/**
 * method_12702
 */
fun <C>Carver<C>.carve(context: CarverContext?, config: C, chunk: Chunk?, posToBiome: function_Function<BlockPos, RegistryEntry<Biome>>?, random: Random?, aquiferSampler: AquiferSampler?, pos: ChunkPos?, mask: CarvingMask?) where C: CarverConfig = this.method_12702(context, config, chunk, posToBiome, random, aquiferSampler, pos, mask)
/**
 * method_12705
 */
fun <C>Carver<C>.shouldCarve(config: C, random: Random?) where C: CarverConfig = this.method_12705(config, random)
/**
 * method_12710
 */
fun <C>Carver<C>.getBranchFactor() where C: CarverConfig = this.method_12710()
