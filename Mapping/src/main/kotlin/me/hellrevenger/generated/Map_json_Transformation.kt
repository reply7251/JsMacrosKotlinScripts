package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.json_Transformation

val json_Transformation.translation by alias(json_Transformation::field_4286)
val json_Transformation.IDENTITY by aliasStatic(json_Transformation::field_4284)
val json_Transformation.scale by alias(json_Transformation::field_4285)
val json_Transformation.rotation by alias(json_Transformation::field_4287)
fun json_Transformation.apply(arg0: Boolean, arg1: MatrixStack) = this.method_23075(arg0, arg1)
