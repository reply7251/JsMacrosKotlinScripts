package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.VertexFormatElement

val VertexFormatElement.UV by aliasStatic(VertexFormatElement::field_52110)
val VertexFormatElement.POSITION by aliasStatic(VertexFormatElement::field_52107)
val VertexFormatElement.UV_1 by aliasStatic(VertexFormatElement::field_52111)
val VertexFormatElement.UV_2 by aliasStatic(VertexFormatElement::field_52112)
val VertexFormatElement.NORMAL by aliasStatic(VertexFormatElement::field_52113)
val VertexFormatElement.COLOR by aliasStatic(VertexFormatElement::field_52108)
val VertexFormatElement.UV_0 by aliasStatic(VertexFormatElement::field_52109)
fun KClass<VertexFormatElement>.register(arg0: Int, arg1: Int, arg2: net.minecraft.class_296.class_297, arg3: net.minecraft.class_296.class_298, arg4: Int) = VertexFormatElement.method_60845(arg0, arg1, arg2, arg3, arg4)
fun KClass<VertexFormatElement>.streamFromMask(arg0: Int) = VertexFormatElement.method_60848(arg0)
fun KClass<VertexFormatElement>.get(arg0: Int) = VertexFormatElement.method_60844(arg0)
fun VertexFormatElement.setupState(arg0: Int, arg1: Long, arg2: Int) = this.method_22652(arg0, arg1, arg2)
fun VertexFormatElement.getSizeInBytes() = this.method_60847()
fun VertexFormatElement.uvIndex() = this.comp_2843()
fun VertexFormatElement.getBit() = this.method_60843()
fun VertexFormatElement.id() = this.comp_2842()
fun VertexFormatElement.count() = this.comp_2846()
fun VertexFormatElement.usage() = this.comp_2845()
fun VertexFormatElement.type() = this.comp_2844()
