package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MaceItem

val MaceItem.KNOCKBACK_RANGE by aliasStatic(MaceItem::field_49999)
val MaceItem.MINING_SPEED_MULTIPLIER by aliasStatic(MaceItem::field_49823)
fun KClass<MaceItem>.createAttributeModifiers() = MaceItem.method_59532()
fun KClass<MaceItem>.createToolComponent() = MaceItem.method_58412()
fun KClass<MaceItem>.shouldDealAdditionalDamage(arg0: LivingEntity) = MaceItem.method_58659(arg0)
