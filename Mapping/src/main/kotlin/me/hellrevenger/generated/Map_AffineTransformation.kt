package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AffineTransformation

val AffineTransformation.ANY_CODEC by aliasStatic(AffineTransformation::field_42533)
fun AffineTransformation.multiply(arg0: AffineTransformation) = this.method_22933(arg0)
fun AffineTransformation.invert() = this.method_22935()
fun KClass<AffineTransformation>.identity() = AffineTransformation.method_22931()
fun AffineTransformation.interpolate(arg0: AffineTransformation, arg1: Float) = this.method_35864(arg0, arg1)
