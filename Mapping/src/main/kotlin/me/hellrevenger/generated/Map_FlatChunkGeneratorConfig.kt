package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FlatChunkGeneratorConfig

fun FlatChunkGeneratorConfig.with(arg0: List<FlatChunkGeneratorLayer>, arg1: Optional<RegistryEntryList<StructureSet>>, arg2: RegistryEntry<Biome>) = this.method_46727(arg0, arg1, arg2)
fun FlatChunkGeneratorConfig.updateLayerBlocks() = this.method_14330()
fun FlatChunkGeneratorConfig.enableFeatures() = this.method_28911()
fun FlatChunkGeneratorConfig.createGenerationSettings(arg0: RegistryEntry<Biome>) = this.method_44225(arg0)
fun KClass<FlatChunkGeneratorConfig>.getPlains(arg0: RegistryEntryLookup<Biome>) = FlatChunkGeneratorConfig.method_46726(arg0)
fun KClass<FlatChunkGeneratorConfig>.getDefaultConfig(arg0: RegistryEntryLookup<Biome>, arg1: RegistryEntryLookup<StructureSet>, arg2: RegistryEntryLookup<PlacedFeature>) = FlatChunkGeneratorConfig.method_14309(arg0, arg1, arg2)
fun FlatChunkGeneratorConfig.enableLakes() = this.method_28916()
fun KClass<FlatChunkGeneratorConfig>.getLavaLakes(arg0: RegistryEntryLookup<PlacedFeature>) = FlatChunkGeneratorConfig.method_46729(arg0)
