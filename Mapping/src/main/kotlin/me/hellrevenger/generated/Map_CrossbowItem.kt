package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CrossbowItem

val KClass<CrossbowItem>.RANGE by aliasStatic(CrossbowItem::field_30863)
fun KClass<CrossbowItem>.isCharged(arg0: ItemStack) = CrossbowItem.method_7781(arg0)
fun CrossbowItem.shootAll(arg0: world_World, arg1: LivingEntity, arg2: Hand, arg3: ItemStack, arg4: Float, arg5: Float, arg6: LivingEntity) = this.method_7777(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<CrossbowItem>.getPullTime(arg0: ItemStack, arg1: LivingEntity) = CrossbowItem.method_7775(arg0, arg1)
