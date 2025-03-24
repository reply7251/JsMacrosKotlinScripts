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
fun ShaderProgram.getUniformDefinition(arg0: String) = this.method_65028(arg0)
/**
 * method_60897
 */
fun ShaderProgram.initializeUniforms(arg0: net.minecraft.class_293.class_5596, arg1: Matrix4f, arg2: Matrix4f, arg3: Window) = this.method_60897(arg0, arg1, arg2, arg3)
/**
 * method_34586
 */
fun ShaderProgram.bind() = this.method_34586()
/**
 * method_62899
 */
fun ShaderProgram.addSamplerTexture(arg0: String, arg1: Int) = this.method_62899(arg0, arg1)
/**
 * method_62900
 */
fun ShaderProgram.set(arg0: MutableList<net.minecraft.class_10157.class_10159>, arg1: MutableList<net.minecraft.class_10157.class_10158>) = this.method_62900(arg0, arg1)
/**
 * method_62897
 */
fun ShaderProgram.addUniform(arg0: GlUniform) = this.method_62897(arg0)
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
fun ShaderProgram.getUniform(arg0: String) = this.method_34582(arg0)
/**
 * method_35785
 */
fun ShaderProgram.getUniformOrDefault(arg0: String) = this.method_35785(arg0)
/**
 * method_62896
 */
fun KClass<ShaderProgram>.create(arg0: CompiledShader, arg1: CompiledShader, arg2: VertexFormat) = ShaderProgram.method_62896(arg0, arg1, arg2)
