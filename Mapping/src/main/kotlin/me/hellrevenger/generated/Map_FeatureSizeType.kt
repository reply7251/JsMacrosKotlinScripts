package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FeatureSizeType

val <P>KClass<FeatureSizeType<P>>.TWO_LAYERS_FEATURE_SIZE where P: FeatureSize by aliasStatic({FeatureSizeType.field_24147})
val <P>KClass<FeatureSizeType<P>>.THREE_LAYERS_FEATURE_SIZE where P: FeatureSize by aliasStatic({FeatureSizeType.field_24148})
fun <P>FeatureSizeType<P>.getCodec() where P: FeatureSize = this.method_28825()
