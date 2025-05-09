package me.hellrevenger.generated.Map_DimensionOptionsRegistryHolder
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DimensionOptionsRegistryHolderKt {
    /**
     * method_45520
     */
    fun createRegistry(dimensionTypeRegistry: RegistryWrapper<DimensionType>, dimensionOptions: Map<RegistryKey<DimensionOptions>, DimensionOptions>, chunkGenerator: ChunkGenerator) = DimensionOptionsRegistryHolder.method_45520(dimensionTypeRegistry, dimensionOptions, chunkGenerator)
    /**
     * method_45525
     */
    fun streamAll(otherKeys: Stream<RegistryKey<DimensionOptions>>) = DimensionOptionsRegistryHolder.method_45525(otherKeys)
}