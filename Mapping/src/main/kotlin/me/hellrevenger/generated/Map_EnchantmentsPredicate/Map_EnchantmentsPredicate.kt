package me.hellrevenger.generated.Map_EnchantmentsPredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<EnchantmentsPredicate>.storedEnchantments(arg0: MutableList<EnchantmentPredicate>) = EnchantmentsPredicate.method_58176(arg0)
fun EnchantmentsPredicate.test(arg0: ItemStack, arg1: ItemEnchantmentsComponent) = this.method_58172(arg0, arg1)
fun <T>KClass<EnchantmentsPredicate>.createCodec(arg0: java.util.function.Function<MutableList<EnchantmentPredicate>, T>) where T: EnchantmentsPredicate = EnchantmentsPredicate.method_58174<T>(arg0)
fun KClass<EnchantmentsPredicate>.enchantments(arg0: MutableList<EnchantmentPredicate>) = EnchantmentsPredicate.method_58173(arg0)
