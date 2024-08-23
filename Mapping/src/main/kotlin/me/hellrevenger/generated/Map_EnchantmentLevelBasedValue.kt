package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EnchantmentLevelBasedValue

fun KClass<EnchantmentLevelBasedValue>.constant(arg0: Float) = EnchantmentLevelBasedValue.method_60186(arg0)
fun KClass<EnchantmentLevelBasedValue>.linear(arg0: Float) = EnchantmentLevelBasedValue.method_60194(arg0)
fun KClass<EnchantmentLevelBasedValue>.registerAndGetDefault(arg0: Registry<MapCodec<out EnchantmentLevelBasedValue>>) = EnchantmentLevelBasedValue.method_60193(arg0)
fun EnchantmentLevelBasedValue.getValue(arg0: Int) = this.method_60188(arg0)
fun KClass<EnchantmentLevelBasedValue>.linear(arg0: Float, arg1: Float) = EnchantmentLevelBasedValue.method_60187(arg0, arg1)
fun KClass<EnchantmentLevelBasedValue>.lookup(arg0: MutableList<Float>, arg1: EnchantmentLevelBasedValue) = EnchantmentLevelBasedValue.method_60987(arg0, arg1)
fun EnchantmentLevelBasedValue.getCodec() = this.method_60185()
