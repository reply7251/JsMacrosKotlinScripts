package me.hellrevenger.generated.Map_Sampler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_34782
 */
fun Sampler.stop() = this.method_34782()
/**
 * method_34780
 */
fun Sampler.start() = this.method_34780()
/**
 * method_37173
 */
fun Sampler.collectData() = this.method_37173()
/**
 * method_34781
 */
fun Sampler.sample(arg0: Int) = this.method_34781(arg0)
/**
 * method_34779
 */
fun <T>KClass<Sampler>.builder(arg0: String, arg1: SampleType, arg2: ToDoubleFunction<T>, arg3: T) = Sampler.method_34779<T>(arg0, arg1, arg2, arg3)
/**
 * method_34778
 */
fun <T>KClass<Sampler>.create(arg0: String, arg1: SampleType, arg2: T, arg3: ToDoubleFunction<T>) = Sampler.method_34778<T>(arg0, arg1, arg2, arg3)
/**
 * method_34776
 */
fun KClass<Sampler>.create(arg0: String, arg1: SampleType, arg2: DoubleSupplier) = Sampler.method_34776(arg0, arg1, arg2)
/**
 * method_37172
 */
fun Sampler.getType() = this.method_37172()
/**
 * method_37171
 */
fun Sampler.getName() = this.method_37171()
/**
 * method_37174
 */
fun Sampler.hasDeviated() = this.method_37174()
