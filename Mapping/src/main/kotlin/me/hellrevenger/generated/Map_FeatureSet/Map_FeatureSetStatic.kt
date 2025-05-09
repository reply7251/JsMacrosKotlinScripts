package me.hellrevenger.generated.Map_FeatureSet
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FeatureSetKt {
    /**
     * field_40172
     */
    val MAX_FEATURE_FLAGS by aliasStatic(FeatureSet::field_40172)
    /**
     * method_45397
     */
    fun empty() = FeatureSet.method_45397()
    /**
     * method_45399
     */
    fun of(feature1: FeatureFlag, features: Array<FeatureFlag>) = FeatureSet.method_45399(feature1, *features)
    /**
     * method_45398
     */
    fun of(feature: FeatureFlag) = FeatureSet.method_45398(feature)
}