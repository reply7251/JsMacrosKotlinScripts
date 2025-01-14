package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PlayerEntityModel

val <T>PlayerEntityModel<T>.rightSleeve where T: LivingEntity by alias(PlayerEntityModel<T>::field_3486)
val <T>PlayerEntityModel<T>.leftSleeve where T: LivingEntity by alias(PlayerEntityModel<T>::field_3484)
val <T>PlayerEntityModel<T>.jacket where T: LivingEntity by alias(PlayerEntityModel<T>::field_3483)
val <T>PlayerEntityModel<T>.rightPants where T: LivingEntity by alias(PlayerEntityModel<T>::field_3479)
val <T>PlayerEntityModel<T>.leftPants where T: LivingEntity by alias(PlayerEntityModel<T>::field_3482)
fun <T>PlayerEntityModel<T>.renderCape(arg0: MatrixStack, arg1: VertexConsumer, arg2: Int, arg3: Int) where T: LivingEntity = this.method_2823(arg0, arg1, arg2, arg3)
fun <T>PlayerEntityModel<T>.renderEars(arg0: MatrixStack, arg1: VertexConsumer, arg2: Int, arg3: Int) where T: LivingEntity = this.method_2824(arg0, arg1, arg2, arg3)
fun <T>PlayerEntityModel<T>.getRandomPart(arg0: Random) where T: LivingEntity = this.method_22697(arg0)
fun <T>KClass<PlayerEntityModel<T>>.getTexturedModelData(arg0: Dilation, arg1: Boolean) where T: LivingEntity = PlayerEntityModel.method_32028(arg0, arg1)
fun <T>PlayerEntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: LivingEntity = this.method_17087(arg0, arg1, arg2, arg3, arg4, arg5)
