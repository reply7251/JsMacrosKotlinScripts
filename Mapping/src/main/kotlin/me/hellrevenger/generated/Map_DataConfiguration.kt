package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataConfiguration

val KClass<DataConfiguration>.ENABLED_FEATURES_KEY by aliasStatic(DataConfiguration::field_40258)
val KClass<DataConfiguration>.SAFE_MODE by aliasStatic(DataConfiguration::field_40260)
fun DataConfiguration.withFeaturesAdded(arg0: FeatureSet) = this.method_45449(arg0)
fun DataConfiguration.enabledFeatures() = this.comp_1011()
fun DataConfiguration.dataPacks() = this.comp_1010()
