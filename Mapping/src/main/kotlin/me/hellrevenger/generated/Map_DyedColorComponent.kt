package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DyedColorComponent

val DyedColorComponent.DEFAULT_COLOR by aliasStatic(DyedColorComponent::field_49314)
val DyedColorComponent.PACKET_CODEC by aliasStatic(DyedColorComponent::field_49313)
fun KClass<DyedColorComponent>.setColor(arg0: ItemStack, arg1: List<DyeItem>) = DyedColorComponent.method_57471(arg0, arg1)
fun KClass<DyedColorComponent>.getColor(arg0: ItemStack, arg1: Int) = DyedColorComponent.method_57470(arg0, arg1)
fun DyedColorComponent.withShowInTooltip(arg0: Boolean) = this.method_58422(arg0)
fun DyedColorComponent.rgb() = this.comp_2384()
fun DyedColorComponent.showInTooltip() = this.comp_2385()
