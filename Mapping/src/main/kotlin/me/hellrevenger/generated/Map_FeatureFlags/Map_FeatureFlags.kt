package me.hellrevenger.generated.Map_FeatureFlags
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<FeatureFlags>.VANILLA_FEATURES by aliasStatic(FeatureFlags::field_40182)
val KClass<FeatureFlags>.DEFAULT_ENABLED_FEATURES by aliasStatic(FeatureFlags::field_40183)
val KClass<FeatureFlags>.VANILLA by aliasStatic(FeatureFlags::field_40177)
val KClass<FeatureFlags>.BUNDLE by aliasStatic(FeatureFlags::field_40178)
val KClass<FeatureFlags>.TRADE_REBALANCE by aliasStatic(FeatureFlags::field_45142)
val KClass<FeatureFlags>.FEATURE_MANAGER by aliasStatic(FeatureFlags::field_40180)
fun KClass<FeatureFlags>.printMissingFlags(arg0: FeatureManager, arg1: FeatureSet, arg2: FeatureSet) = FeatureFlags.method_45405(arg0, arg1, arg2)
fun KClass<FeatureFlags>.printMissingFlags(arg0: FeatureSet, arg1: FeatureSet) = FeatureFlags.method_45407(arg0, arg1)
fun KClass<FeatureFlags>.isNotVanilla(arg0: FeatureSet) = FeatureFlags.method_45406(arg0)
