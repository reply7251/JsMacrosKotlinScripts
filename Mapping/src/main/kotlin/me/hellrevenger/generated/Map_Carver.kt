package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Carver

val <C>Carver<C>.RAVINE where C: CarverConfig by aliasStatic({Carver.field_13295})
val <C>Carver<C>.CAVE where C: CarverConfig by aliasStatic({Carver.field_29060})
val <C>Carver<C>.NETHER_CAVE where C: CarverConfig by aliasStatic({Carver.field_13297})
fun <C>Carver<C>.configure(arg0: C) where C: CarverConfig = this.method_28614(arg0)
fun <C>Carver<C>.carve(arg0: CarverContext, arg1: C, arg2: Chunk, arg3: Function<BlockPos, RegistryEntry<Biome>>, arg4: Random, arg5: AquiferSampler, arg6: ChunkPos, arg7: CarvingMask) where C: CarverConfig = this.method_12702(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun <C>Carver<C>.shouldCarve(arg0: C, arg1: Random) where C: CarverConfig = this.method_12705(arg0, arg1)
fun <C>Carver<C>.getBranchFactor() where C: CarverConfig = this.method_12710()
