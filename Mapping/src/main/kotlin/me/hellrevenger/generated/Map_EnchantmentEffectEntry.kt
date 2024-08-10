package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnchantmentEffectEntry

fun <T>EnchantmentEffectEntry<T>.test(arg0: LootContext) = this.method_60006(arg0)
fun <T>KClass<EnchantmentEffectEntry<T>>.createCodec(arg0: Codec<T>, arg1: LootContextType) = EnchantmentEffectEntry.method_60004<T>(arg0, arg1)
fun <T>KClass<EnchantmentEffectEntry<T>>.createRequirementsCodec(arg0: LootContextType) = EnchantmentEffectEntry.method_60007(arg0)
fun <T>EnchantmentEffectEntry<T>.effect() = this.comp_2680()
fun <T>EnchantmentEffectEntry<T>.requirements() = this.comp_2681()
