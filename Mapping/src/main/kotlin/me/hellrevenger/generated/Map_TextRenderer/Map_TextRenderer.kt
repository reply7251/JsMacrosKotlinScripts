package me.hellrevenger.generated.Map_TextRenderer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_2001
 */
val TextRenderer.random by alias(TextRenderer::field_2001)
/**
 * field_2000
 */
val TextRenderer.fontHeight by alias(TextRenderer::field_2000)
/**
 * method_1726
 */
fun TextRenderer.isRightToLeft() = this.method_1726()
/**
 * method_27527
 */
fun TextRenderer.getTextHandler() = this.method_27527()
/**
 * method_1714
 */
fun TextRenderer.trimToWidth(text: StringVisitable, width: Int) = this.method_1714(text, width)
/**
 * method_37296
 */
fun TextRenderer.drawWithOutline(text: OrderedText, x: Float, y: Float, color: Int, outlineColor: Int, matrix: Matrix4f, vertexConsumers: VertexConsumerProvider, light: Int) = this.method_37296(text, x, y, color, outlineColor, matrix, vertexConsumers, light)
/**
 * method_27525
 */
fun TextRenderer.getWidth(text: StringVisitable) = this.method_27525(text)
/**
 * method_27524
 */
fun TextRenderer.trimToWidth(text: String, maxWidth: Int, backwards: Boolean) = this.method_27524(text, maxWidth, backwards)
/**
 * method_44378
 */
fun TextRenderer.getWrappedLinesHeight(text: StringVisitable, maxWidth: Int) = this.method_44378(text, maxWidth)
/**
 * method_22942
 */
fun TextRenderer.draw(text: OrderedText, x: Float, y: Float, color: Int, shadow: Boolean, matrix: Matrix4f, vertexConsumers: VertexConsumerProvider, layerType: net.minecraft.class_327.class_6415, backgroundColor: Int, light: Int) = this.method_22942(text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light)
/**
 * method_30880
 */
fun TextRenderer.getWidth(text: OrderedText) = this.method_30880(text)
/**
 * method_27523
 */
fun TextRenderer.trimToWidth(text: String, maxWidth: Int) = this.method_27523(text, maxWidth)
/**
 * method_1721
 */
fun TextRenderer.mirror(text: String) = this.method_1721(text)
/**
 * method_27521
 */
fun TextRenderer.draw(text: String, x: Float, y: Float, color: Int, shadow: Boolean, matrix: Matrix4f, vertexConsumers: VertexConsumerProvider, layerType: net.minecraft.class_327.class_6415, backgroundColor: Int, light: Int) = this.method_27521(text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light)
/**
 * method_1728
 */
fun TextRenderer.wrapLines(text: StringVisitable, width: Int) = this.method_1728(text, width)
/**
 * method_27522
 */
fun TextRenderer.draw(text: Text, x: Float, y: Float, color: Int, shadow: Boolean, matrix: Matrix4f, vertexConsumers: VertexConsumerProvider, layerType: net.minecraft.class_327.class_6415, backgroundColor: Int, light: Int) = this.method_27522(text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light)
/**
 * method_1713
 */
fun TextRenderer.getWrappedLinesHeight(text: String, maxWidth: Int) = this.method_1713(text, maxWidth)
/**
 * method_1727
 */
fun TextRenderer.getWidth(text: String) = this.method_1727(text)
/**
 * method_30882
 */
fun TextRenderer.draw(text: Text, x: Float, y: Float, color: Int, shadow: Boolean, matrix: Matrix4f, vertexConsumers: VertexConsumerProvider, layerType: net.minecraft.class_327.class_6415, backgroundColor: Int, light: Int, swapZIndex: Boolean) = this.method_30882(text, x, y, color, shadow, matrix, vertexConsumers, layerType, backgroundColor, light, swapZIndex)
