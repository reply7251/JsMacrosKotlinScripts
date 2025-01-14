package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PandaEntityModel

fun <T>KClass<PandaEntityModel<T>>.getTexturedModelData() where T: PandaEntity = PandaEntityModel.method_32022()
fun <T>PandaEntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: PandaEntity = this.method_17103(arg0, arg1, arg2, arg3, arg4, arg5)
fun <T>PandaEntityModel<T>.animateModel(arg0: T, arg1: Float, arg2: Float, arg3: Float) where T: PandaEntity = this.method_17102(arg0, arg1, arg2, arg3)
