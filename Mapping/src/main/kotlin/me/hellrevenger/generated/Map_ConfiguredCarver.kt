package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConfiguredCarver

fun <WC>ConfiguredCarver<WC>.carve(arg0: CarverContext, arg1: Chunk, arg2: Function<BlockPos, RegistryEntry<Biome>>, arg3: Random, arg4: AquiferSampler, arg5: ChunkPos, arg6: CarvingMask) where WC: CarverConfig = this.method_12668(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun <WC>ConfiguredCarver<WC>.carver() where WC: CarverConfig = this.comp_330()
fun <WC>ConfiguredCarver<WC>.shouldCarve(arg0: Random) where WC: CarverConfig = this.method_12669(arg0)
fun <WC>ConfiguredCarver<WC>.config() where WC: CarverConfig = this.comp_331()
