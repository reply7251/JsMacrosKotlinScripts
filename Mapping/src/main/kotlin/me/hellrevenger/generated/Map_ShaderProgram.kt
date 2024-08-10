package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ShaderProgram

val ShaderProgram.textureMat by alias(ShaderProgram::field_29472)
val ShaderProgram.colorModulator by alias(ShaderProgram::field_29474)
val ShaderProgram.light1Direction by alias(ShaderProgram::field_29476)
val ShaderProgram.SHADERS_DIRECTORY by aliasStatic(ShaderProgram::field_32778)
val ShaderProgram.fogEnd by alias(ShaderProgram::field_29478)
val ShaderProgram.uniforms by alias(ShaderProgram::field_29490)
val ShaderProgram.lineWidth by alias(ShaderProgram::field_29480)
val ShaderProgram.chunkOffset by alias(ShaderProgram::field_29482)
val ShaderProgram.modelViewMat by alias(ShaderProgram::field_29470)
val ShaderProgram.screenSize by alias(ShaderProgram::field_29473)
val ShaderProgram.light0Direction by alias(ShaderProgram::field_29475)
val ShaderProgram.fogStart by alias(ShaderProgram::field_29477)
val ShaderProgram.fogColor by alias(ShaderProgram::field_29479)
val ShaderProgram.glintAlpha by alias(ShaderProgram::field_42231)
val ShaderProgram.fogShape by alias(ShaderProgram::field_36373)
val ShaderProgram.projectionMat by alias(ShaderProgram::field_29471)
val ShaderProgram.gameTime by alias(ShaderProgram::field_29481)
fun ShaderProgram.initializeUniforms(arg0: net.minecraft.class_293.class_5596, arg1: Matrix4f, arg2: Matrix4f, arg3: Window) = this.method_60897(arg0, arg1, arg2, arg3)
fun ShaderProgram.bind() = this.method_34586()
fun ShaderProgram.addSampler(arg0: String, arg1: Object) = this.method_34583(arg0, arg1)
fun ShaderProgram.unbind() = this.method_34585()
fun ShaderProgram.getUniform(arg0: String) = this.method_34582(arg0)
fun ShaderProgram.getUniformOrDefault(arg0: String) = this.method_35785(arg0)
