package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureManager

fun FeatureManager.featureSetOf(arg0: Iterable<Identifier>) = this.method_45387(arg0)
fun FeatureManager.contains(arg0: FeatureSet) = this.method_45385(arg0)
fun FeatureManager.getCodec() = this.method_45391()
fun FeatureManager.toId(arg0: FeatureSet) = this.method_45392(arg0)
fun FeatureManager.featureSetOf(arg0: Iterable<Identifier>, arg1: Consumer<Identifier>) = this.method_45388(arg0, arg1)
fun FeatureManager.featureSetOf(arg0: Array<FeatureFlag>) = this.method_45390(*arg0)
