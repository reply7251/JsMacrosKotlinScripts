package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ArmorTrim

val ArmorTrim.PACKET_CODEC by aliasStatic(ArmorTrim::field_49278)
fun ArmorTrim.getLeggingsModelId(arg0: RegistryEntry<ArmorMaterial>) = this.method_48434(arg0)
fun ArmorTrim.getGenericModelId(arg0: RegistryEntry<ArmorMaterial>) = this.method_48436(arg0)
fun ArmorTrim.equals(arg0: RegistryEntry<ArmorTrimPattern>, arg1: RegistryEntry<ArmorTrimMaterial>) = this.method_48427(arg0, arg1)
fun ArmorTrim.withShowInTooltip(arg0: Boolean) = this.method_58421(arg0)
