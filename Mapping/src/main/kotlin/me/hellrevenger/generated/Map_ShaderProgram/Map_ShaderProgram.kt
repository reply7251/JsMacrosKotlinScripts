package me.hellrevenger.generated.Map_ShaderProgram
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_29472
 */
var ShaderProgram.textureMat by alias(ShaderProgram::field_29472)
/**
 * field_29474
 */
var ShaderProgram.colorModulator by alias(ShaderProgram::field_29474)
/**
 * field_29476
 */
var ShaderProgram.light1Direction by alias(ShaderProgram::field_29476)
/**
 * field_29478
 */
var ShaderProgram.fogEnd by alias(ShaderProgram::field_29478)
/**
 * field_53139
 */
var ShaderProgram.modelOffset by alias(ShaderProgram::field_53139)
/**
 * field_29480
 */
var ShaderProgram.lineWidth by alias(ShaderProgram::field_29480)
/**
 * field_29470
 */
var ShaderProgram.modelViewMat by alias(ShaderProgram::field_29470)
/**
 * field_29473
 */
var ShaderProgram.screenSize by alias(ShaderProgram::field_29473)
/**
 * field_29475
 */
var ShaderProgram.light0Direction by alias(ShaderProgram::field_29475)
/**
 * field_29477
 */
var ShaderProgram.fogStart by alias(ShaderProgram::field_29477)
/**
 * field_29479
 */
var ShaderProgram.fogColor by alias(ShaderProgram::field_29479)
/**
 * field_42231
 */
var ShaderProgram.glintAlpha by alias(ShaderProgram::field_42231)
/**
 * field_36373
 */
var ShaderProgram.fogShape by alias(ShaderProgram::field_36373)
/**
 * field_29471
 */
var ShaderProgram.projectionMat by alias(ShaderProgram::field_29471)
/**
 * field_29481
 */
var ShaderProgram.gameTime by alias(ShaderProgram::field_29481)
/**
 * method_65028
 */
fun ShaderProgram.getUniformDefinition(name: String?) = this.method_65028(name)
/**
 * method_60897
 */
fun ShaderProgram.initializeUniforms(drawMode: net.minecraft.class_293.class_5596?, viewMatrix: Matrix4f?, projectionMatrix: Matrix4f?, window: Window?) = this.method_60897(drawMode, viewMatrix, projectionMatrix, window)
/**
 * method_34586
 */
fun ShaderProgram.bind() = this.method_34586()
/**
 * method_62899
 */
fun ShaderProgram.addSamplerTexture(name: String?, texture: Int) = this.method_62899(name, texture)
/**
 * method_62900
 */
fun ShaderProgram.set(uniforms: MutableList<net.minecraft.class_10157.class_10159>?, samplers: MutableList<net.minecraft.class_10157.class_10158>?) = this.method_62900(uniforms, samplers)
/**
 * method_62897
 */
fun ShaderProgram.addUniform(uniform: GlUniform?) = this.method_62897(uniform)
/**
 * method_1270
 */
fun ShaderProgram.getGlRef() = this.method_1270()
/**
 * method_34585
 */
fun ShaderProgram.unbind() = this.method_34585()
/**
 * method_34582
 */
fun ShaderProgram.getUniform(name: String?) = this.method_34582(name)
/**
 * method_35785
 */
fun ShaderProgram.getUniformOrDefault(name: String?) = this.method_35785(name)
