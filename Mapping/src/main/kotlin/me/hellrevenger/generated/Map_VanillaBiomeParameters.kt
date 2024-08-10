package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VanillaBiomeParameters

val VanillaBiomeParameters.MAX_HIGH_WEIRDNESS by aliasStatic(VanillaBiomeParameters::field_34502)
val VanillaBiomeParameters.MAX_MID_WEIRDNESS by aliasStatic(VanillaBiomeParameters::field_35041)
fun KClass<VanillaBiomeParameters>.getPeaksValleysDescription(arg0: Double) = VanillaBiomeParameters.method_38179(arg0)
fun VanillaBiomeParameters.getSpawnSuitabilityNoises() = this.method_39168()
fun KClass<VanillaBiomeParameters>.inDeepDarkParameters(arg0: DensityFunction, arg1: DensityFunction, arg2: net.minecraft.class_6910.class_6912) = VanillaBiomeParameters.method_43718(arg0, arg1, arg2)
fun VanillaBiomeParameters.getContinentalnessDescription(arg0: Double) = this.method_38188(arg0)
fun VanillaBiomeParameters.getHumidityDescription(arg0: Double) = this.method_38201(arg0)
fun VanillaBiomeParameters.getWeirdnessParameters() = this.method_40015()
fun VanillaBiomeParameters.getTemperatureDescription(arg0: Double) = this.method_38197(arg0)
fun VanillaBiomeParameters.getPeaksValleysParameters() = this.method_40014()
fun VanillaBiomeParameters.getErosionDescription(arg0: Double) = this.method_38193(arg0)
fun VanillaBiomeParameters.getContinentalnessParameters() = this.method_40013()
