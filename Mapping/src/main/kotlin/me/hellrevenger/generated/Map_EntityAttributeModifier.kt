package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntityAttributeModifier

val EntityAttributeModifier.PACKET_CODEC by aliasStatic(EntityAttributeModifier::field_49233)
val EntityAttributeModifier.MAP_CODEC by aliasStatic(EntityAttributeModifier::field_49232)
fun EntityAttributeModifier.toNbt() = this.method_26860()
fun EntityAttributeModifier.value() = this.comp_2449()
fun EntityAttributeModifier.idMatches(arg0: Identifier) = this.method_60718(arg0)
fun KClass<EntityAttributeModifier>.fromNbt(arg0: NbtCompound) = EntityAttributeModifier.method_26859(arg0)
fun EntityAttributeModifier.id() = this.comp_2447()
fun EntityAttributeModifier.operation() = this.comp_2450()
