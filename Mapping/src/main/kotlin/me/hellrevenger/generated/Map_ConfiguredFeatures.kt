package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConfiguredFeatures

fun KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: Int, arg1: RegistryEntry<PlacedFeature>) = ConfiguredFeatures.method_39703(arg0, arg1)
fun KClass<ConfiguredFeatures>.bootstrap(arg0: Registerable<ConfiguredFeature<*, *>>) = ConfiguredFeatures.method_39702(arg0)
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC, arg2: List<Block>) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39705<FC, F>(arg0, arg1, arg2)
fun <FC, F>KClass<ConfiguredFeatures>.register(arg0: Registerable<ConfiguredFeature<*, *>>, arg1: RegistryKey<ConfiguredFeature<*, *>>, arg2: F, arg3: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39708<FC, F>(arg0, arg1, arg2, arg3)
fun KClass<ConfiguredFeatures>.of(arg0: String) = ConfiguredFeatures.method_46852(arg0)
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39704<FC, F>(arg0, arg1)
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC, arg2: List<Block>, arg3: Int) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39706<FC, F>(arg0, arg1, arg2, arg3)
fun KClass<ConfiguredFeatures>.register(arg0: Registerable<ConfiguredFeature<*, *>>, arg1: RegistryKey<ConfiguredFeature<*, *>>, arg2: Feature<DefaultFeatureConfig>) = ConfiguredFeatures.method_40364(arg0, arg1, arg2)
