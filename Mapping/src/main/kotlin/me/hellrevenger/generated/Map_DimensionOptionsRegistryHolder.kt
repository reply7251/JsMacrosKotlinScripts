package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DimensionOptionsRegistryHolder

fun DimensionOptionsRegistryHolder.getWorldKeys() = this.method_45526()
fun DimensionOptionsRegistryHolder.getOrEmpty(arg0: RegistryKey<DimensionOptions>) = this.method_45514(arg0)
fun DimensionOptionsRegistryHolder.isDebug() = this.method_45531()
fun DimensionOptionsRegistryHolder.getChunkGenerator() = this.method_45513()
fun KClass<DimensionOptionsRegistryHolder>.createRegistry(arg0: Registry<DimensionType>, arg1: Map<RegistryKey<DimensionOptions>, DimensionOptions>, arg2: ChunkGenerator) = DimensionOptionsRegistryHolder.method_45520(arg0, arg1, arg2)
fun KClass<DimensionOptionsRegistryHolder>.streamAll(arg0: Stream<RegistryKey<DimensionOptions>>) = DimensionOptionsRegistryHolder.method_45525(arg0)
fun DimensionOptionsRegistryHolder.with(arg0: DynamicRegistryManager, arg1: ChunkGenerator) = this.method_45522(arg0, arg1)
fun DimensionOptionsRegistryHolder.toConfig(arg0: Registry<DimensionOptions>) = this.method_45518(arg0)
fun KClass<DimensionOptionsRegistryHolder>.createRegistry(arg0: Map<RegistryKey<DimensionOptions>, DimensionOptions>, arg1: RegistryEntry<DimensionType>, arg2: ChunkGenerator) = DimensionOptionsRegistryHolder.method_45519(arg0, arg1, arg2)
fun DimensionOptionsRegistryHolder.dimensions() = this.comp_1014()
