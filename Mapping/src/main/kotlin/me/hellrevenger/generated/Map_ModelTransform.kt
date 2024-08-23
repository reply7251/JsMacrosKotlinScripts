package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModelTransform

val ModelTransform.pivotY by alias(ModelTransform::field_27703)
val ModelTransform.pivotX by alias(ModelTransform::field_27702)
val ModelTransform.roll by alias(ModelTransform::field_27707)
val ModelTransform.yaw by alias(ModelTransform::field_27706)
val KClass<ModelTransform>.NONE by aliasStatic(ModelTransform::field_27701)
val ModelTransform.pitch by alias(ModelTransform::field_27705)
val ModelTransform.pivotZ by alias(ModelTransform::field_27704)
fun KClass<ModelTransform>.of(arg0: Float, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) = ModelTransform.method_32091(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<ModelTransform>.rotation(arg0: Float, arg1: Float, arg2: Float) = ModelTransform.method_32092(arg0, arg1, arg2)
fun KClass<ModelTransform>.pivot(arg0: Float, arg1: Float, arg2: Float) = ModelTransform.method_32090(arg0, arg1, arg2)
