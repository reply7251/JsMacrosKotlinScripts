package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlacedFeatures

val KClass<PlacedFeatures>.MOTION_BLOCKING_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36078)
val KClass<PlacedFeatures>.OCEAN_FLOOR_WG_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36079)
val KClass<PlacedFeatures>.FOUR_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36085)
val KClass<PlacedFeatures>.EIGHT_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36084)
val KClass<PlacedFeatures>.BOTTOM_TO_120_RANGE by aliasStatic(PlacedFeatures::field_36086)
val KClass<PlacedFeatures>.OCEAN_FLOOR_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36081)
val KClass<PlacedFeatures>.WORLD_SURFACE_WG_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36080)
val KClass<PlacedFeatures>.TEN_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36083)
val KClass<PlacedFeatures>.BOTTOM_TO_TOP_RANGE by aliasStatic(PlacedFeatures::field_36082)
fun KClass<PlacedFeatures>.createCountExtraModifier(arg0: Int, arg1: Float, arg2: Int) = PlacedFeatures.method_39736(arg0, arg1, arg2)
fun KClass<PlacedFeatures>.wouldSurvive(arg0: Block) = PlacedFeatures.method_40365(arg0)
fun <FC, F>KClass<PlacedFeatures>.createEntry(arg0: F, arg1: FC, arg2: Array<PlacementModifier>) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40368<FC, F>(arg0, arg1, *arg2)
fun <FC, F>KClass<PlacedFeatures>.createEntry(arg0: F, arg1: FC, arg2: blockpredicate_BlockPredicate) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40367<FC, F>(arg0, arg1, arg2)
fun KClass<PlacedFeatures>.createEntry(arg0: RegistryEntry<ConfiguredFeature<*, *>>, arg1: Array<PlacementModifier>) = PlacedFeatures.method_40369(arg0, *arg1)
fun KClass<PlacedFeatures>.bootstrap(arg0: Registerable<PlacedFeature>) = PlacedFeatures.method_39735(arg0)
fun KClass<PlacedFeatures>.isAir() = PlacedFeatures.method_40371()
fun KClass<PlacedFeatures>.register(arg0: Registerable<PlacedFeature>, arg1: RegistryKey<PlacedFeature>, arg2: RegistryEntry<ConfiguredFeature<*, *>>, arg3: MutableList<PlacementModifier>) = PlacedFeatures.method_39737(arg0, arg1, arg2, arg3)
fun KClass<PlacedFeatures>.register(arg0: Registerable<PlacedFeature>, arg1: RegistryKey<PlacedFeature>, arg2: RegistryEntry<ConfiguredFeature<*, *>>, arg3: Array<PlacementModifier>) = PlacedFeatures.method_40370(arg0, arg1, arg2, *arg3)
fun <FC, F>KClass<PlacedFeatures>.createEntry(arg0: F, arg1: FC) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40366<FC, F>(arg0, arg1)
fun KClass<PlacedFeatures>.of(arg0: String) = PlacedFeatures.method_46865(arg0)
