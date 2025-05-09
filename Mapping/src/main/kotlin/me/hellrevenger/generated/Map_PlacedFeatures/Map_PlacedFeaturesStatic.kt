package me.hellrevenger.generated.Map_PlacedFeatures
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PlacedFeaturesKt {
    /**
     * field_36078
     */
    val MOTION_BLOCKING_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36078)
    /**
     * field_36079
     */
    val OCEAN_FLOOR_WG_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36079)
    /**
     * field_36085
     */
    val FOUR_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36085)
    /**
     * field_36084
     */
    val EIGHT_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36084)
    /**
     * field_55187
     */
    val MOTION_BLOCKING_NO_LEAVES_HEIGHTMAP by aliasStatic(PlacedFeatures::field_55187)
    /**
     * field_36086
     */
    val BOTTOM_TO_120_RANGE by aliasStatic(PlacedFeatures::field_36086)
    /**
     * field_36081
     */
    val OCEAN_FLOOR_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36081)
    /**
     * field_36080
     */
    val WORLD_SURFACE_WG_HEIGHTMAP by aliasStatic(PlacedFeatures::field_36080)
    /**
     * field_36083
     */
    val TEN_ABOVE_AND_BELOW_RANGE by aliasStatic(PlacedFeatures::field_36083)
    /**
     * field_36082
     */
    val BOTTOM_TO_TOP_RANGE by aliasStatic(PlacedFeatures::field_36082)
    /**
     * method_39736
     */
    fun createCountExtraModifier(count: Int, extraChance: Float, extraCount: Int) = PlacedFeatures.method_39736(count, extraChance, extraCount)
    /**
     * method_40365
     */
    fun wouldSurvive(block: Block) = PlacedFeatures.method_40365(block)
    /**
     * method_40368
     */
    fun <FC, F>createEntry(feature: F, featureConfig: FC, modifiers: Array<PlacementModifier>) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40368<FC, F>(feature, featureConfig, *modifiers)
    /**
     * method_40367
     */
    fun <FC, F>createEntry(feature: F, featureConfig: FC, predicate: blockpredicate_BlockPredicate) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40367<FC, F>(feature, featureConfig, predicate)
    /**
     * method_40369
     */
    fun createEntry(feature: RegistryEntry<ConfiguredFeature<*, *>>, modifiers: Array<PlacementModifier>) = PlacedFeatures.method_40369(feature, *modifiers)
    /**
     * method_39735
     */
    fun bootstrap(featureRegisterable: Registerable<PlacedFeature>) = PlacedFeatures.method_39735(featureRegisterable)
    /**
     * method_40371
     */
    fun isAir() = PlacedFeatures.method_40371()
    /**
     * method_39737
     */
    fun register(featureRegisterable: Registerable<PlacedFeature>, key: RegistryKey<PlacedFeature>, feature: RegistryEntry<ConfiguredFeature<*, *>>, modifiers: MutableList<PlacementModifier>) = PlacedFeatures.method_39737(featureRegisterable, key, feature, modifiers)
    /**
     * method_40370
     */
    fun register(featureRegisterable: Registerable<PlacedFeature>, key: RegistryKey<PlacedFeature>, feature: RegistryEntry<ConfiguredFeature<*, *>>, modifiers: Array<PlacementModifier>) = PlacedFeatures.method_40370(featureRegisterable, key, feature, *modifiers)
    /**
     * method_40366
     */
    fun <FC, F>createEntry(feature: F, featureConfig: FC) where FC: FeatureConfig, F: Feature<FC> = PlacedFeatures.method_40366<FC, F>(feature, featureConfig)
    /**
     * method_46865
     */
    fun of(id: String) = PlacedFeatures.method_46865(id)
}