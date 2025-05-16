package me.hellrevenger.generated.Map_IntProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
object IntProviderKt {
    /**
     * method_49103
     */
    fun <T>createValidatingCodec(min: Int, max: Int, providerCodec: Codec<T>?) where T: IntProvider = IntProvider.method_49103<T>(min, max, providerCodec)
    /**
     * method_35004
     */
    fun createValidatingCodec(min: Int, max: Int) = IntProvider.method_35004(min, max)
}