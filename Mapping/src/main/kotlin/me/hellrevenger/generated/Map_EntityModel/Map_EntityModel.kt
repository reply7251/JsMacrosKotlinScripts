package me.hellrevenger.generated.Map_EntityModel
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_3448
 */
var <T>EntityModel<T>.child where T: Entity by alias(EntityModel<*>::field_3448)
/**
 * field_3449
 */
var <T>EntityModel<T>.riding where T: Entity by alias(EntityModel<*>::field_3449)
/**
 * field_3447
 */
var <T>EntityModel<T>.handSwingProgress where T: Entity by alias(EntityModel<*>::field_3447)
/**
 * method_17081
 */
fun <T>EntityModel<T>.copyStateTo(arg0: EntityModel<T>) where T: Entity = this.method_17081(arg0)
/**
 * method_2819
 */
fun <T>EntityModel<T>.setAngles(arg0: T, arg1: Float, arg2: Float, arg3: Float, arg4: Float, arg5: Float) where T: Entity = this.method_2819(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_2816
 */
fun <T>EntityModel<T>.animateModel(arg0: T, arg1: Float, arg2: Float, arg3: Float) where T: Entity = this.method_2816(arg0, arg1, arg2, arg3)
