package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Sampler

fun Sampler.stop() = this.method_34782()
fun Sampler.start() = this.method_34780()
fun Sampler.collectData() = this.method_37173()
fun Sampler.sample(arg0: Int) = this.method_34781(arg0)
fun <T>KClass<Sampler>.builder(arg0: String, arg1: SampleType, arg2: ToDoubleFunction<T>, arg3: T) = Sampler.method_34779<T>(arg0, arg1, arg2, arg3)
fun <T>KClass<Sampler>.create(arg0: String, arg1: SampleType, arg2: T, arg3: ToDoubleFunction<T>) = Sampler.method_34778<T>(arg0, arg1, arg2, arg3)
fun KClass<Sampler>.create(arg0: String, arg1: SampleType, arg2: DoubleSupplier) = Sampler.method_34776(arg0, arg1, arg2)
fun Sampler.hasDeviated() = this.method_37174()
