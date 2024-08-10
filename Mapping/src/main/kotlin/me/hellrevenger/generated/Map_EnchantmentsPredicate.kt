package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnchantmentsPredicate

fun KClass<EnchantmentsPredicate>.storedEnchantments(arg0: List<EnchantmentPredicate>) = EnchantmentsPredicate.method_58176(arg0)
fun EnchantmentsPredicate.test(arg0: ItemStack, arg1: ItemEnchantmentsComponent) = this.method_58172(arg0, arg1)
fun <T>KClass<EnchantmentsPredicate>.createCodec(arg0: Function<List<EnchantmentPredicate>, T>) where T: EnchantmentsPredicate = EnchantmentsPredicate.method_58174<T>(arg0)
fun KClass<EnchantmentsPredicate>.enchantments(arg0: List<EnchantmentPredicate>) = EnchantmentsPredicate.method_58173(arg0)
