package me.hellrevenger.generated.Map_VertexFormatElement
import kotlin.reflect.*
import me.hellrevenger.generated.*
object VertexFormatElementKt {
    /**
     * field_52110
     */
    val UV by aliasStatic(VertexFormatElement::field_52110)
    /**
     * field_52107
     */
    val POSITION by aliasStatic(VertexFormatElement::field_52107)
    /**
     * field_52111
     */
    val UV_1 by aliasStatic(VertexFormatElement::field_52111)
    /**
     * field_52112
     */
    val UV_2 by aliasStatic(VertexFormatElement::field_52112)
    /**
     * field_52113
     */
    val NORMAL by aliasStatic(VertexFormatElement::field_52113)
    /**
     * field_52108
     */
    val COLOR by aliasStatic(VertexFormatElement::field_52108)
    /**
     * field_52109
     */
    val UV_0 by aliasStatic(VertexFormatElement::field_52109)
    /**
     * method_60845
     */
    fun register(id: Int, uvIndex: Int, type: net.minecraft.class_296.class_297?, usage: net.minecraft.class_296.class_298?, count: Int) = VertexFormatElement.method_60845(id, uvIndex, type, usage, count)
    /**
     * method_60848
     */
    fun streamFromMask(mask: Int) = VertexFormatElement.method_60848(mask)
    /**
     * method_60844
     */
    fun get(id: Int) = VertexFormatElement.method_60844(id)
}