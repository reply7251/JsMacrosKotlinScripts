package me.hellrevenger.generated.Map_FeatureFlags
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FeatureFlagsKt {
    /**
     * field_40182
     */
    val VANILLA_FEATURES by aliasStatic(FeatureFlags::field_40182)
    /**
     * field_40183
     */
    val DEFAULT_ENABLED_FEATURES by aliasStatic(FeatureFlags::field_40183)
    /**
     * field_40177
     */
    val VANILLA by aliasStatic(FeatureFlags::field_40177)
    /**
     * field_52556
     */
    val MINECART_IMPROVEMENTS by aliasStatic(FeatureFlags::field_52556)
    /**
     * field_45142
     */
    val TRADE_REBALANCE by aliasStatic(FeatureFlags::field_45142)
    /**
     * field_52555
     */
    val REDSTONE_EXPERIMENTS by aliasStatic(FeatureFlags::field_52555)
    /**
     * field_40180
     */
    val FEATURE_MANAGER by aliasStatic(FeatureFlags::field_40180)
    /**
     * method_45405
     */
    fun printMissingFlags(featureManager: FeatureManager?, featuresToCheck: FeatureSet?, features: FeatureSet?) = FeatureFlags.method_45405(featureManager, featuresToCheck, features)
    /**
     * method_45407
     */
    fun printMissingFlags(featuresToCheck: FeatureSet?, features: FeatureSet?) = FeatureFlags.method_45407(featuresToCheck, features)
    /**
     * method_45406
     */
    fun isNotVanilla(features: FeatureSet?) = FeatureFlags.method_45406(features)
}