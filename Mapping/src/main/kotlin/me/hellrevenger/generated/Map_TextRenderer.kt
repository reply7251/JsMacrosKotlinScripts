package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TextRenderer

val TextRenderer.random by alias(TextRenderer::field_2001)
val TextRenderer.fontHeight by alias(TextRenderer::field_2000)
val KClass<TextRenderer>.ARABIC_SHAPING_LETTERS_SHAPE by aliasStatic(TextRenderer::field_35427)
fun TextRenderer.isRightToLeft() = this.method_1726()
fun TextRenderer.getTextHandler() = this.method_27527()
fun TextRenderer.trimToWidth(arg0: StringVisitable, arg1: Int) = this.method_1714(arg0, arg1)
fun TextRenderer.drawWithOutline(arg0: OrderedText, arg1: Float, arg2: Float, arg3: Int, arg4: Int, arg5: Matrix4f, arg6: VertexConsumerProvider, arg7: Int) = this.method_37296(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
fun TextRenderer.draw(arg0: String, arg1: Float, arg2: Float, arg3: Int, arg4: Boolean, arg5: Matrix4f, arg6: VertexConsumerProvider, arg7: net.minecraft.class_327.class_6415, arg8: Int, arg9: Int, arg10: Boolean) = this.method_27522(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
fun TextRenderer.draw(arg0: Text, arg1: Float, arg2: Float, arg3: Int, arg4: Boolean, arg5: Matrix4f, arg6: VertexConsumerProvider, arg7: net.minecraft.class_327.class_6415, arg8: Int, arg9: Int) = this.method_30882(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun TextRenderer.getWidth(arg0: StringVisitable) = this.method_27525(arg0)
fun TextRenderer.trimToWidth(arg0: String, arg1: Int, arg2: Boolean) = this.method_27524(arg0, arg1, arg2)
fun TextRenderer.getWrappedLinesHeight(arg0: StringVisitable, arg1: Int) = this.method_44378(arg0, arg1)
fun TextRenderer.draw(arg0: OrderedText, arg1: Float, arg2: Float, arg3: Int, arg4: Boolean, arg5: Matrix4f, arg6: VertexConsumerProvider, arg7: net.minecraft.class_327.class_6415, arg8: Int, arg9: Int) = this.method_22942(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun TextRenderer.getWidth(arg0: OrderedText) = this.method_30880(arg0)
fun TextRenderer.trimToWidth(arg0: String, arg1: Int) = this.method_27523(arg0, arg1)
fun TextRenderer.mirror(arg0: String) = this.method_1721(arg0)
fun TextRenderer.draw(arg0: String, arg1: Float, arg2: Float, arg3: Int, arg4: Boolean, arg5: Matrix4f, arg6: VertexConsumerProvider, arg7: net.minecraft.class_327.class_6415, arg8: Int, arg9: Int) = this.method_27521(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
fun TextRenderer.wrapLines(arg0: StringVisitable, arg1: Int) = this.method_1728(arg0, arg1)
fun TextRenderer.getWrappedLinesHeight(arg0: String, arg1: Int) = this.method_1713(arg0, arg1)
fun TextRenderer.getWidth(arg0: String) = this.method_1727(arg0)
