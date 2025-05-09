package me.hellrevenger.generated.Map_ModelPart
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_37939
 */
var ModelPart.yScale by alias(ModelPart::field_37939)
/**
 * field_3674
 */
var ModelPart.roll by alias(ModelPart::field_3674)
/**
 * field_3654
 */
var ModelPart.pitch by alias(ModelPart::field_3654)
/**
 * field_3656
 */
var ModelPart.pivotY by alias(ModelPart::field_3656)
/**
 * field_3665
 */
var ModelPart.visible by alias(ModelPart::field_3665)
/**
 * field_3657
 */
var ModelPart.pivotX by alias(ModelPart::field_3657)
/**
 * field_3675
 */
var ModelPart.yaw by alias(ModelPart::field_3675)
/**
 * field_3655
 */
var ModelPart.pivotZ by alias(ModelPart::field_3655)
/**
 * field_37938
 */
var ModelPart.xScale by alias(ModelPart::field_37938)
/**
 * field_38456
 */
var ModelPart.hidden by alias(ModelPart::field_38456)
/**
 * field_37940
 */
var ModelPart.zScale by alias(ModelPart::field_37940)
/**
 * method_22699
 */
fun ModelPart.render(matrices: MatrixStack, vertices: VertexConsumer, light: Int, overlay: Int, color: Int) = this.method_22699(matrices, vertices, light, overlay, color)
/**
 * method_35745
 */
fun ModelPart.forEachCuboid(matrices: MatrixStack, consumer: net.minecraft.class_630.class_6229) = this.method_35745(matrices, consumer)
/**
 * method_32086
 */
fun ModelPart.getChild(name: String) = this.method_32086(name)
/**
 * method_32087
 */
fun ModelPart.isEmpty() = this.method_32087()
/**
 * method_17138
 */
fun ModelPart.copyTransform(part: ModelPart) = this.method_17138(part)
/**
 * method_22703
 */
fun ModelPart.rotate(matrices: MatrixStack) = this.method_22703(matrices)
/**
 * method_41920
 */
fun ModelPart.translate(vec3f: Vector3f) = this.method_41920(vec3f)
/**
 * method_41919
 */
fun ModelPart.hasChild(child: String) = this.method_41919(child)
/**
 * method_22700
 */
fun ModelPart.getRandomCuboid(random: Random) = this.method_22700(random)
/**
 * method_33425
 */
fun ModelPart.setAngles(pitch: Float, yaw: Float, roll: Float) = this.method_33425(pitch, yaw, roll)
/**
 * method_41924
 */
fun ModelPart.scale(vec3f: Vector3f) = this.method_41924(vec3f)
/**
 * method_32084
 */
fun ModelPart.getTransform() = this.method_32084()
/**
 * method_32088
 */
fun ModelPart.traverse() = this.method_32088()
/**
 * method_41923
 */
fun ModelPart.resetTransform() = this.method_41923()
/**
 * method_41921
 */
fun ModelPart.getDefaultTransform() = this.method_41921()
/**
 * method_32085
 */
fun ModelPart.setTransform(rotationData: ModelTransform) = this.method_32085(rotationData)
/**
 * method_41918
 */
fun ModelPart.setDefaultTransform(transform: ModelTransform) = this.method_41918(transform)
/**
 * method_2851
 */
fun ModelPart.setPivot(x: Float, y: Float, z: Float) = this.method_2851(x, y, z)
