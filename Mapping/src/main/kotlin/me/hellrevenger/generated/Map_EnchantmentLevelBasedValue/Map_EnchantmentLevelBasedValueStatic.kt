package me.hellrevenger.generated.Map_EnchantmentLevelBasedValue
import kotlin.reflect.*
import me.hellrevenger.generated.*
object EnchantmentLevelBasedValueKt {
    /**
     * method_60186
     */
    fun constant(value: Float) = EnchantmentLevelBasedValue.method_60186(value)
    /**
     * method_60194
     */
    fun linear(base: Float) = EnchantmentLevelBasedValue.method_60194(base)
    /**
     * method_60193
     */
    fun registerAndGetDefault(registry: Registry<MapCodec<out EnchantmentLevelBasedValue>>?) = EnchantmentLevelBasedValue.method_60193(registry)
    /**
     * method_60187
     */
    fun linear(base: Float, perLevelAboveFirst: Float) = EnchantmentLevelBasedValue.method_60187(base, perLevelAboveFirst)
    /**
     * method_60987
     */
    fun lookup(values: MutableList<Float>?, fallback: EnchantmentLevelBasedValue?) = EnchantmentLevelBasedValue.method_60987(values, fallback)
}