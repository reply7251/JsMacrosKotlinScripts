package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModelPart

val ModelPart.yScale by alias(ModelPart::field_37939)
val ModelPart.roll by alias(ModelPart::field_3674)
val ModelPart.pitch by alias(ModelPart::field_3654)
val ModelPart.pivotY by alias(ModelPart::field_3656)
val ModelPart.visible by alias(ModelPart::field_3665)
val ModelPart.pivotX by alias(ModelPart::field_3657)
val ModelPart.yaw by alias(ModelPart::field_3675)
val ModelPart.pivotZ by alias(ModelPart::field_3655)
val ModelPart.xScale by alias(ModelPart::field_37938)
val ModelPart.hidden by alias(ModelPart::field_38456)
val ModelPart.zScale by alias(ModelPart::field_37940)
fun ModelPart.render(arg0: MatrixStack, arg1: VertexConsumer, arg2: Int, arg3: Int, arg4: Int) = this.method_22699(arg0, arg1, arg2, arg3, arg4)
fun ModelPart.forEachCuboid(arg0: MatrixStack, arg1: net.minecraft.class_630.class_6229) = this.method_35745(arg0, arg1)
fun ModelPart.getChild(arg0: String) = this.method_32086(arg0)
fun ModelPart.isEmpty() = this.method_32087()
fun ModelPart.render(arg0: MatrixStack, arg1: VertexConsumer, arg2: Int, arg3: Int) = this.method_22698(arg0, arg1, arg2, arg3)
fun ModelPart.copyTransform(arg0: ModelPart) = this.method_17138(arg0)
fun ModelPart.rotate(matrixStack: MatrixStack) = this.method_22703(matrixStack)
fun ModelPart.rotate(arg0: Vector3f) = this.method_41922(arg0)
fun ModelPart.translate(arg0: Vector3f) = this.method_41920(arg0)
fun ModelPart.hasChild(arg0: String) = this.method_41919(arg0)
fun ModelPart.getRandomCuboid(arg0: Random) = this.method_22700(arg0)
fun ModelPart.setAngles(arg0: Float, arg1: Float, arg2: Float) = this.method_33425(arg0, arg1, arg2)
fun ModelPart.scale(arg0: Vector3f) = this.method_41924(arg0)
fun ModelPart.getTransform() = this.method_32084()
fun ModelPart.traverse() = this.method_32088()
fun ModelPart.resetTransform() = this.method_41923()
fun ModelPart.setTransform(arg0: ModelTransform) = this.method_32085(arg0)
fun ModelPart.setDefaultTransform(arg0: ModelTransform) = this.method_41918(arg0)
fun ModelPart.setPivot(arg0: Float, arg1: Float, arg2: Float) = this.method_2851(arg0, arg1, arg2)
