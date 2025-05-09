package me.hellrevenger.generated.Map_Sampler
import kotlin.reflect.*
import me.hellrevenger.generated.*
object SamplerKt {
    /**
     * method_34779
     */
    fun <T>builder(name: String, type: SampleType, retriever: ToDoubleFunction<T>, context: T) = Sampler.method_34779<T>(name, type, retriever, context)
    /**
     * method_34778
     */
    fun <T>create(name: String, type: SampleType, context: T, retriever: ToDoubleFunction<T>) = Sampler.method_34778<T>(name, type, context, retriever)
}