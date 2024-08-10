package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PerlinNoiseSampler

val PerlinNoiseSampler.originZ by alias(PerlinNoiseSampler::field_16588)
val PerlinNoiseSampler.originY by alias(PerlinNoiseSampler::field_16589)
val PerlinNoiseSampler.originX by alias(PerlinNoiseSampler::field_16591)
fun PerlinNoiseSampler.sample(arg0: Double, arg1: Double, arg2: Double) = this.method_33658(arg0, arg1, arg2)
fun PerlinNoiseSampler.addDebugInfo(arg0: StringBuilder) = this.method_39118(arg0)
fun PerlinNoiseSampler.sampleDerivative(arg0: Double, arg1: Double, arg2: Double, arg3: DoubleArray) = this.method_35477(arg0, arg1, arg2, arg3)
fun PerlinNoiseSampler.sample(arg0: Double, arg1: Double, arg2: Double, arg3: Double, arg4: Double) = this.method_16447(arg0, arg1, arg2, arg3, arg4)
