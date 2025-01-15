package me.hellrevenger.generated.Map_AllOfEnchantmentEffects
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T, A>KClass<AllOfEnchantmentEffects>.buildCodec(arg0: Codec<T>, arg1: java.util.function.Function<MutableList<T>, A>, arg2: java.util.function.Function<A, MutableList<T>>) where A: T = AllOfEnchantmentEffects.method_60214<T, A>(arg0, arg1, arg2)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentEntityEffect>) = AllOfEnchantmentEffects.method_60216(*arg0)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentLocationBasedEffect>) = AllOfEnchantmentEffects.method_60217(*arg0)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentValueEffect>) = AllOfEnchantmentEffects.method_60218(*arg0)
