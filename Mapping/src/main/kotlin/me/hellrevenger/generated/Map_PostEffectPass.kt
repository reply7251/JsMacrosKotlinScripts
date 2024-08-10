package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PostEffectPass

val PostEffectPass.output by alias(PostEffectPass::field_1538)
val PostEffectPass.input by alias(PostEffectPass::field_1536)
fun PostEffectPass.getName() = this.method_35777()
fun PostEffectPass.setProjectionMatrix(arg0: Matrix4f) = this.method_1291(arg0)
fun PostEffectPass.render(arg0: Float) = this.method_1293(arg0)
fun PostEffectPass.addAuxTarget(arg0: String, arg1: IntSupplier, arg2: Int, arg3: Int) = this.method_1292(arg0, arg1, arg2, arg3)
