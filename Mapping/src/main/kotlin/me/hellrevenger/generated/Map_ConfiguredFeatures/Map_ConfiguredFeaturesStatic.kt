package me.hellrevenger.generated.Map_ConfiguredFeatures
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ConfiguredFeaturesKt {
    /**
     * method_39703
     */
    fun createRandomPatchFeatureConfig(tries: Int, feature: RegistryEntry<PlacedFeature>) = ConfiguredFeatures.method_39703(tries, feature)
    /**
     * method_39702
     */
    fun bootstrap(featureRegisterable: Registerable<ConfiguredFeature<*, *>>) = ConfiguredFeatures.method_39702(featureRegisterable)
    /**
     * method_39708
     */
    fun <FC, F>register(registerable: Registerable<ConfiguredFeature<*, *>>, key: RegistryKey<ConfiguredFeature<*, *>>, feature: F, config: FC) where FC: FeatureConfig, F: Feature<FC> = ConfiguredFeatures.method_39708<FC, F>(registerable, key, feature, config)
    /**
     * method_46852
     */
    fun of(id: String) = ConfiguredFeatures.method_46852(id)
}