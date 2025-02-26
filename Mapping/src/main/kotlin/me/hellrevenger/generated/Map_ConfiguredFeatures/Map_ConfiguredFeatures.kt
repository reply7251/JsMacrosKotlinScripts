package me.hellrevenger.generated.Map_ConfiguredFeatures
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39703
 */
fun KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: Int, arg1: RegistryEntry<PlacedFeature>) = ConfiguredFeatures.method_39703(arg0, arg1)
/**
 * method_39702
 */
fun KClass<ConfiguredFeatures>.bootstrap(arg0: Registerable<ConfiguredFeature<*, *>>) = ConfiguredFeatures.method_39702(arg0)
/**
 * method_39705
 */
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC, arg2: MutableList<Block>) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39705<FC, F>(arg0, arg1, arg2)
/**
 * method_39708
 */
fun <FC, F>KClass<ConfiguredFeatures>.register(arg0: Registerable<ConfiguredFeature<*, *>>, arg1: RegistryKey<ConfiguredFeature<*, *>>, arg2: F, arg3: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39708<FC, F>(arg0, arg1, arg2, arg3)
/**
 * method_46852
 */
fun KClass<ConfiguredFeatures>.of(arg0: String) = ConfiguredFeatures.method_46852(arg0)
/**
 * method_39704
 */
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39704<FC, F>(arg0, arg1)
/**
 * method_39706
 */
fun <FC, F>KClass<ConfiguredFeatures>.createRandomPatchFeatureConfig(arg0: F, arg1: FC, arg2: MutableList<Block>, arg3: Int) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39706<FC, F>(arg0, arg1, arg2, arg3)
/**
 * method_40364
 */
fun KClass<ConfiguredFeatures>.register(arg0: Registerable<ConfiguredFeature<*, *>>, arg1: RegistryKey<ConfiguredFeature<*, *>>, arg2: Feature<DefaultFeatureConfig>) = ConfiguredFeatures.method_40364(arg0, arg1, arg2)
