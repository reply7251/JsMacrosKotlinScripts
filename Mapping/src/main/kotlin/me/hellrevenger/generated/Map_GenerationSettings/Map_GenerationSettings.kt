package me.hellrevenger.generated.Map_GenerationSettings
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_26416
 */
var GenerationSettings.features by alias(GenerationSettings::field_26416)
/**
 * field_26639
 */
val KClass<GenerationSettings>.INSTANCE by aliasStatic(GenerationSettings::field_26639)
/**
 * field_34465
 */
var GenerationSettings.allowedFeatures by alias(GenerationSettings::field_34465)
/**
 * field_26640
 */
var GenerationSettings.flowerFeatures by alias(GenerationSettings::field_26640)
/**
 * field_26415
 */
var GenerationSettings.carvers by alias(GenerationSettings::field_26415)
/**
 * method_38105
 */
fun GenerationSettings.isFeatureAllowed(arg0: PlacedFeature) = this.method_38105(arg0)
/**
 * method_30976
 */
fun GenerationSettings.getCarversForStep() = this.method_30976()
