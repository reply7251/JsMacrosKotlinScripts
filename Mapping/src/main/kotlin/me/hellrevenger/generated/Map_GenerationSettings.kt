package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GenerationSettings

var GenerationSettings.features by alias(GenerationSettings::field_26416)
val KClass<GenerationSettings>.INSTANCE by aliasStatic(GenerationSettings::field_26639)
var GenerationSettings.carvers by alias(GenerationSettings::field_26415)
var GenerationSettings.allowedFeatures by alias(GenerationSettings::field_34465)
var GenerationSettings.flowerFeatures by alias(GenerationSettings::field_26640)
fun GenerationSettings.isFeatureAllowed(arg0: PlacedFeature) = this.method_38105(arg0)
fun GenerationSettings.getCarversForStep(arg0: net.minecraft.class_2893.class_2894) = this.method_30976(arg0)
