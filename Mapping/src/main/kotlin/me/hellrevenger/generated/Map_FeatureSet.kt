package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureSet

val KClass<FeatureSet>.MAX_FEATURE_FLAGS by aliasStatic(FeatureSet::field_40172)
fun FeatureSet.contains(arg0: FeatureFlag) = this.method_45403(arg0)
fun FeatureSet.isEmpty() = this.method_58398()
fun FeatureSet.subtract(arg0: FeatureSet) = this.method_59820(arg0)
fun FeatureSet.isSubsetOf(arg0: FeatureSet) = this.method_45400(arg0)
fun FeatureSet.intersects(arg0: FeatureSet) = this.method_59819(arg0)
fun KClass<FeatureSet>.empty() = FeatureSet.method_45397()
fun KClass<FeatureSet>.of(arg0: FeatureFlag, arg1: Array<FeatureFlag>) = FeatureSet.method_45399(arg0, *arg1)
fun KClass<FeatureSet>.of(arg0: FeatureFlag) = FeatureSet.method_45398(arg0)
fun FeatureSet.combine(arg0: FeatureSet) = this.method_45404(arg0)
