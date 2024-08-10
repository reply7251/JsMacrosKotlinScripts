package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.JsonEffectShaderProgram

fun JsonEffectShaderProgram.bindSampler(arg0: String, arg1: IntSupplier) = this.method_1269(arg0, arg1)
fun KClass<JsonEffectShaderProgram>.deserializeBlendState(arg0: JsonObject) = JsonEffectShaderProgram.method_16035(arg0)
fun JsonEffectShaderProgram.getUniformByNameOrDummy(arg0: String) = this.method_1275(arg0)
fun JsonEffectShaderProgram.disable() = this.method_1273()
fun KClass<JsonEffectShaderProgram>.loadEffect(arg0: ResourceFactory, arg1: net.minecraft.class_281.class_282, arg2: String) = JsonEffectShaderProgram.method_16036(arg0, arg1, arg2)
fun JsonEffectShaderProgram.enable() = this.method_1277()
