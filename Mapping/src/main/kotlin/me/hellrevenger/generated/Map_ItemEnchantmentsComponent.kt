package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemEnchantmentsComponent

val ItemEnchantmentsComponent.PACKET_CODEC by aliasStatic(ItemEnchantmentsComponent::field_49387)
val ItemEnchantmentsComponent.DEFAULT by aliasStatic(ItemEnchantmentsComponent::field_49385)
fun ItemEnchantmentsComponent.getEnchantmentEntries() = this.method_57539()
fun ItemEnchantmentsComponent.withShowInTooltip(arg0: Boolean) = this.method_58449(arg0)
fun ItemEnchantmentsComponent.getLevel(arg0: RegistryEntry<Enchantment>) = this.method_57536(arg0)
fun ItemEnchantmentsComponent.isEmpty() = this.method_57543()
fun ItemEnchantmentsComponent.getSize() = this.method_57541()
