package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TargetedEnchantmentEffect

fun <T, S>KClass<TargetedEnchantmentEffect<T>>.createPostAttackCodec(arg0: Codec<S>, arg1: LootContextType) = TargetedEnchantmentEffect.method_60203<S>(arg0, arg1)
fun <T, S>KClass<TargetedEnchantmentEffect<T>>.createEquipmentDropsCodec(arg0: Codec<S>, arg1: LootContextType) = TargetedEnchantmentEffect.method_60208<S>(arg0, arg1)
fun <T>TargetedEnchantmentEffect<T>.test(arg0: LootContext) = this.method_60207(arg0)
fun <T>TargetedEnchantmentEffect<T>.effect() = this.comp_2702()
fun <T>TargetedEnchantmentEffect<T>.requirements() = this.comp_2703()
fun <T>TargetedEnchantmentEffect<T>.enchanted() = this.comp_2700()
fun <T>TargetedEnchantmentEffect<T>.affected() = this.comp_2701()
