package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WorldPresets

val KClass<WorldPresets>.DEFAULT by aliasStatic(WorldPresets::field_25050)
val KClass<WorldPresets>.SINGLE_BIOME_SURFACE by aliasStatic(WorldPresets::field_25056)
val KClass<WorldPresets>.LARGE_BIOMES by aliasStatic(WorldPresets::field_35756)
val KClass<WorldPresets>.FLAT by aliasStatic(WorldPresets::field_25054)
val KClass<WorldPresets>.DEBUG_ALL_BLOCK_STATES by aliasStatic(WorldPresets::field_25059)
val KClass<WorldPresets>.AMPLIFIED by aliasStatic(WorldPresets::field_35757)
fun KClass<WorldPresets>.getDefaultOverworldOptions(arg0: DynamicRegistryManager) = WorldPresets.method_41599(arg0)
fun KClass<WorldPresets>.getWorldPreset(arg0: DimensionOptionsRegistryHolder) = WorldPresets.method_41594(arg0)
fun KClass<WorldPresets>.bootstrap(arg0: Registerable<WorldPreset>) = WorldPresets.method_41593(arg0)
fun KClass<WorldPresets>.createDemoOptions(arg0: DynamicRegistryManager) = WorldPresets.method_41598(arg0)
