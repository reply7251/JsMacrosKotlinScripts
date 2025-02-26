package me.hellrevenger.generated.Map_Carver
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_13295
 */
val <C>KClass<Carver<C>>.RAVINE where C: CarverConfig by aliasStatic({Carver.field_13295})
/**
 * field_29060
 */
val <C>KClass<Carver<C>>.CAVE where C: CarverConfig by aliasStatic({Carver.field_29060})
/**
 * field_13297
 */
val <C>KClass<Carver<C>>.NETHER_CAVE where C: CarverConfig by aliasStatic({Carver.field_13297})
/**
 * method_28614
 */
fun <C>Carver<C>.configure(arg0: C) where C: CarverConfig = this.method_28614(arg0)
/**
 * method_28616
 */
fun <C>Carver<C>.getCodec() where C: CarverConfig = this.method_28616()
/**
 * method_12702
 */
fun <C>Carver<C>.carve(arg0: CarverContext, arg1: C, arg2: Chunk, arg3: function_Function<BlockPos, RegistryEntry<Biome>>, arg4: Random, arg5: AquiferSampler, arg6: ChunkPos, arg7: CarvingMask) where C: CarverConfig = this.method_12702(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_12705
 */
fun <C>Carver<C>.shouldCarve(arg0: C, arg1: Random) where C: CarverConfig = this.method_12705(arg0, arg1)
/**
 * method_12710
 */
fun <C>Carver<C>.getBranchFactor() where C: CarverConfig = this.method_12710()
