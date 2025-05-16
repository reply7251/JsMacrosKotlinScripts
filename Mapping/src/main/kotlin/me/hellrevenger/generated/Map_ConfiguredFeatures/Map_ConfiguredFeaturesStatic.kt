package me.hellrevenger.generated.Map_ConfiguredFeatures
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ConfiguredFeaturesKt {
    /**
     * method_39703
     */
    fun createRandomPatchFeatureConfig(tries: Int, feature: RegistryEntry<PlacedFeature>?) = ConfiguredFeatures.method_39703(tries, feature)
    /**
     * method_39702
     */
    fun bootstrap(featureRegisterable: Registerable<ConfiguredFeature<*, *>>?) = ConfiguredFeatures.method_39702(featureRegisterable)
    /**
     * method_39705
     */
    fun <FC, F>createRandomPatchFeatureConfig(feature: F, config: FC, predicateBlocks: MutableList<Block>?) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39705<FC, F>(feature, config, predicateBlocks)
    /**
     * method_39708
     */
    fun <FC, F>register(registerable: Registerable<ConfiguredFeature<*, *>>?, key: RegistryKey<ConfiguredFeature<*, *>>?, feature: F, config: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39708<FC, F>(registerable, key, feature, config)
    /**
     * method_46852
     */
    fun of(id: String?) = ConfiguredFeatures.method_46852(id)
    /**
     * method_39704
     */
    fun <FC, F>createRandomPatchFeatureConfig(feature: F, config: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39704<FC, F>(feature, config)
    /**
     * method_39706
     */
    fun <FC, F>createRandomPatchFeatureConfig(feature: F, config: FC, predicateBlocks: MutableList<Block>?, tries: Int) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39706<FC, F>(feature, config, predicateBlocks, tries)
    /**
     * method_40364
     */
    fun register(registerable: Registerable<ConfiguredFeature<*, *>>?, key: RegistryKey<ConfiguredFeature<*, *>>?, feature: Feature<DefaultFeatureConfig>?) = ConfiguredFeatures.method_40364(registerable, key, feature)
}