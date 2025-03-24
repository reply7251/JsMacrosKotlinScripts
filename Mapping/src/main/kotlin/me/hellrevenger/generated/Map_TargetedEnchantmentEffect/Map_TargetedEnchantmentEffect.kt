package me.hellrevenger.generated.Map_TargetedEnchantmentEffect
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60203
 */
fun <T, S>KClass<TargetedEnchantmentEffect<T>>.createPostAttackCodec(arg0: Codec<S>, arg1: ContextType) = TargetedEnchantmentEffect.method_60203<S>(arg0, arg1)
/**
 * method_60208
 */
fun <T, S>KClass<TargetedEnchantmentEffect<T>>.createEquipmentDropsCodec(arg0: Codec<S>, arg1: ContextType) = TargetedEnchantmentEffect.method_60208<S>(arg0, arg1)
/**
 * method_60207
 */
fun <T>TargetedEnchantmentEffect<T>.test(arg0: LootContext) = this.method_60207(arg0)
/**
 * comp_2702
 */
fun <T>TargetedEnchantmentEffect<T>.effect() = this.comp_2702()
/**
 * comp_2703
 */
fun <T>TargetedEnchantmentEffect<T>.requirements() = this.comp_2703()
/**
 * comp_2700
 */
fun <T>TargetedEnchantmentEffect<T>.enchanted() = this.comp_2700()
/**
 * comp_2701
 */
fun <T>TargetedEnchantmentEffect<T>.affected() = this.comp_2701()
