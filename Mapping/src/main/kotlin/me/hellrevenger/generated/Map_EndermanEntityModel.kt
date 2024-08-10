package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EndermanEntityModel

val <T>EndermanEntityModel<T>.angry where T: LivingEntity by alias(EndermanEntityModel<T>::field_3370)
val <T>EndermanEntityModel<T>.carryingBlock where T: LivingEntity by alias(EndermanEntityModel<T>::field_3371)
fun <T>KClass<EndermanEntityModel<T>>.getTexturedModelData() where T: LivingEntity = EndermanEntityModel.method_31995()
fun <T>EndermanEntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: LivingEntity = this.method_17087(arg0, arg1, arg2, arg3, arg4, arg5)
