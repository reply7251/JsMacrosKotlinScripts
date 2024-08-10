package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AllOfEnchantmentEffects

fun <T, A>KClass<AllOfEnchantmentEffects>.buildCodec(arg0: Codec<T>, arg1: Function<List<T>, A>, arg2: Function<A, List<T>>) where A: T = AllOfEnchantmentEffects.method_60214<T, A>(arg0, arg1, arg2)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentEntityEffect>) = AllOfEnchantmentEffects.method_60216(*arg0)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentLocationBasedEffect>) = AllOfEnchantmentEffects.method_60217(*arg0)
fun KClass<AllOfEnchantmentEffects>.allOf(arg0: Array<EnchantmentValueEffect>) = AllOfEnchantmentEffects.method_60218(*arg0)
