package me.hellrevenger.generated.Map_ShaderProgram
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_29472
 */
val ShaderProgram.textureMat by alias(ShaderProgram::field_29472)
/**
 * field_29474
 */
val ShaderProgram.colorModulator by alias(ShaderProgram::field_29474)
/**
 * field_29476
 */
val ShaderProgram.light1Direction by alias(ShaderProgram::field_29476)
/**
 * field_32778
 */
val KClass<ShaderProgram>.SHADERS_DIRECTORY by aliasStatic(ShaderProgram::field_32778)
/**
 * field_29478
 */
val ShaderProgram.fogEnd by alias(ShaderProgram::field_29478)
/**
 * field_29480
 */
val ShaderProgram.lineWidth by alias(ShaderProgram::field_29480)
/**
 * field_29482
 */
val ShaderProgram.chunkOffset by alias(ShaderProgram::field_29482)
/**
 * field_29470
 */
val ShaderProgram.modelViewMat by alias(ShaderProgram::field_29470)
/**
 * field_29473
 */
val ShaderProgram.screenSize by alias(ShaderProgram::field_29473)
/**
 * field_29475
 */
val ShaderProgram.light0Direction by alias(ShaderProgram::field_29475)
/**
 * field_29477
 */
val ShaderProgram.fogStart by alias(ShaderProgram::field_29477)
/**
 * field_29479
 */
val ShaderProgram.fogColor by alias(ShaderProgram::field_29479)
/**
 * field_42231
 */
val ShaderProgram.glintAlpha by alias(ShaderProgram::field_42231)
/**
 * field_36373
 */
val ShaderProgram.fogShape by alias(ShaderProgram::field_36373)
/**
 * field_29471
 */
val ShaderProgram.projectionMat by alias(ShaderProgram::field_29471)
/**
 * field_29481
 */
val ShaderProgram.gameTime by alias(ShaderProgram::field_29481)
/**
 * method_35787
 */
fun ShaderProgram.getName() = this.method_35787()
/**
 * method_60897
 */
fun ShaderProgram.initializeUniforms(arg0: net.minecraft.class_293.class_5596, arg1: Matrix4f, arg2: Matrix4f, arg3: Window) = this.method_60897(arg0, arg1, arg2, arg3)
/**
 * method_34586
 */
fun ShaderProgram.bind() = this.method_34586()
/**
 * method_34583
 */
fun ShaderProgram.addSampler(arg0: String, arg1: Object) = this.method_34583(arg0, arg1)
/**
 * method_35786
 */
fun ShaderProgram.getFormat() = this.method_35786()
/**
 * method_34585
 */
fun ShaderProgram.unbind() = this.method_34585()
/**
 * method_34582
 */
fun ShaderProgram.getUniform(arg0: String) = this.method_34582(arg0)
/**
 * method_35785
 */
fun ShaderProgram.getUniformOrDefault(arg0: String) = this.method_35785(arg0)
