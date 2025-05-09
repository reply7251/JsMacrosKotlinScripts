package me.hellrevenger.generated.Map_AllOfEnchantmentEffects
import kotlin.reflect.*
import me.hellrevenger.generated.*
object AllOfEnchantmentEffectsKt {
    /**
     * method_60214
     */
    fun <T, A>buildCodec(baseCodec: Codec<T>, fromList: function_Function<MutableList<T>, A>, toList: function_Function<A, MutableList<T>>) where A: T = AllOfEnchantmentEffects.method_60214<T, A>(baseCodec, fromList, toList)
    /**
     * method_60216
     */
    fun allOf(entityEffects: Array<EnchantmentEntityEffect>) = AllOfEnchantmentEffects.method_60216(*entityEffects)
}