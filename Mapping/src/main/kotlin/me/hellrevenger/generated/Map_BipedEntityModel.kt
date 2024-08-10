package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BipedEntityModel

val <T>BipedEntityModel<T>.head where T: LivingEntity by alias(BipedEntityModel<T>::field_3398)
val <T>BipedEntityModel<T>.rightArm where T: LivingEntity by alias(BipedEntityModel<T>::field_3401)
val <T>BipedEntityModel<T>.leftLeg where T: LivingEntity by alias(BipedEntityModel<T>::field_3397)
val <T>BipedEntityModel<T>.body where T: LivingEntity by alias(BipedEntityModel<T>::field_3391)
val <T>BipedEntityModel<T>.sneaking where T: LivingEntity by alias(BipedEntityModel<T>::field_3400)
val <T>BipedEntityModel<T>.leftArm where T: LivingEntity by alias(BipedEntityModel<T>::field_27433)
val <T>BipedEntityModel<T>.leftArmPose where T: LivingEntity by alias(BipedEntityModel<T>::field_3399)
val <T>BipedEntityModel<T>.rightArmPose where T: LivingEntity by alias(BipedEntityModel<T>::field_3395)
val <T>BipedEntityModel<T>.leaningPitch where T: LivingEntity by alias(BipedEntityModel<T>::field_3396)
val <T>BipedEntityModel<T>.hat where T: LivingEntity by alias(BipedEntityModel<T>::field_3394)
val <T>BipedEntityModel<T>.rightLeg where T: LivingEntity by alias(BipedEntityModel<T>::field_3392)
fun <T>BipedEntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: LivingEntity = this.method_17087(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T>KClass<BipedEntityModel<T>>.getModelData(arg0: Dilation, arg1: Float) where T: LivingEntity = BipedEntityModel.method_32011(arg0, arg1)
fun <T>BipedEntityModel<T>.setVisible(arg0: Boolean) where T: LivingEntity = this.method_2805(arg0)
fun <T>BipedEntityModel<T>.animateModel(arg0: T, arg1: Float, arg2: Float, arg3: Float) where T: LivingEntity = this.method_17086(arg0, arg1, arg2, arg3)
fun <T>BipedEntityModel<T>.copyBipedStateTo(arg0: BipedEntityModel<T>) where T: LivingEntity = this.method_2818(arg0)
