package me.hellrevenger.generated.Map_DyedColorComponent
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<DyedColorComponent>.DEFAULT_COLOR by aliasStatic(DyedColorComponent::field_49314)
fun KClass<DyedColorComponent>.setColor(arg0: ItemStack, arg1: MutableList<DyeItem>) = DyedColorComponent.method_57471(arg0, arg1)
fun KClass<DyedColorComponent>.getColor(arg0: ItemStack, arg1: Int) = DyedColorComponent.method_57470(arg0, arg1)
fun DyedColorComponent.withShowInTooltip(arg0: Boolean) = this.method_58422(arg0)
fun DyedColorComponent.rgb() = this.comp_2384()
fun DyedColorComponent.showInTooltip() = this.comp_2385()
