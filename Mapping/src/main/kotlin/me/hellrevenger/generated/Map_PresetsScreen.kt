package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PresetsScreen

val KClass<PresetsScreen>.UNKNOWN_PRESET_TEXT by aliasStatic(PresetsScreen::field_37908)
fun PresetsScreen.updateSelectButton(arg0: Boolean) = this.method_20102(arg0)
fun KClass<PresetsScreen>.parsePresetString(arg0: RegistryEntryLookup<Block>, arg1: RegistryEntryLookup<Biome>, arg2: RegistryEntryLookup<StructureSet>, arg3: RegistryEntryLookup<PlacedFeature>, arg4: String, arg5: FlatChunkGeneratorConfig) = PresetsScreen.method_29060(arg0, arg1, arg2, arg3, arg4, arg5)
