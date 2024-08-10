package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureFlags

val FeatureFlags.VANILLA_FEATURES by aliasStatic(FeatureFlags::field_40182)
val FeatureFlags.DEFAULT_ENABLED_FEATURES by aliasStatic(FeatureFlags::field_40183)
val FeatureFlags.VANILLA by aliasStatic(FeatureFlags::field_40177)
val FeatureFlags.BUNDLE by aliasStatic(FeatureFlags::field_40178)
val FeatureFlags.TRADE_REBALANCE by aliasStatic(FeatureFlags::field_45142)
val FeatureFlags.FEATURE_MANAGER by aliasStatic(FeatureFlags::field_40180)
fun KClass<FeatureFlags>.printMissingFlags(arg0: FeatureManager, arg1: FeatureSet, arg2: FeatureSet) = FeatureFlags.method_45405(arg0, arg1, arg2)
fun KClass<FeatureFlags>.printMissingFlags(arg0: FeatureSet, arg1: FeatureSet) = FeatureFlags.method_45407(arg0, arg1)
fun KClass<FeatureFlags>.isNotVanilla(arg0: FeatureSet) = FeatureFlags.method_45406(arg0)
