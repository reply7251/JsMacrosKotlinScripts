package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PiglinEntityModel

val <T>PiglinEntityModel<T>.rightEar where T: MobEntity by alias(PiglinEntityModel<T>::field_27464)
fun <T>KClass<PiglinEntityModel<T>>.addHead(arg0: Dilation, arg1: ModelData) where T: MobEntity = PiglinEntityModel.method_47656(arg0, arg1)
fun <T>PiglinEntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: MobEntity = this.method_24803(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T>KClass<PiglinEntityModel<T>>.getModelData(arg0: Dilation) where T: MobEntity = PiglinEntityModel.method_32026(arg0)
