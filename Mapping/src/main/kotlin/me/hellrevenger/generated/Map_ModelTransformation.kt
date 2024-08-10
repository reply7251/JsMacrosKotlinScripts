package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModelTransformation

val ModelTransformation.NONE by aliasStatic(ModelTransformation::field_4301)
val ModelTransformation.fixed by alias(ModelTransformation::field_4306)
val ModelTransformation.thirdPersonRightHand by alias(ModelTransformation::field_4307)
val ModelTransformation.firstPersonRightHand by alias(ModelTransformation::field_4304)
val ModelTransformation.thirdPersonLeftHand by alias(ModelTransformation::field_4305)
val ModelTransformation.firstPersonLeftHand by alias(ModelTransformation::field_4302)
val ModelTransformation.ground by alias(ModelTransformation::field_4303)
val ModelTransformation.gui by alias(ModelTransformation::field_4300)
val ModelTransformation.head by alias(ModelTransformation::field_4311)
fun ModelTransformation.isTransformationDefined(arg0: ModelTransformationMode) = this.method_3501(arg0)
fun ModelTransformation.getTransformation(arg0: ModelTransformationMode) = this.method_3503(arg0)
