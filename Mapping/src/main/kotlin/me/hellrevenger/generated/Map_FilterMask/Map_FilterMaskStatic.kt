package me.hellrevenger.generated.Map_FilterMask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FilterMaskKt {
    /**
     * field_40674
     */
    val FILTERED_STYLE by aliasStatic(FilterMask::field_40674)
    /**
     * field_39942
     */
    val PASS_THROUGH by aliasStatic(FilterMask::field_39942)
    /**
     * field_39941
     */
    val FULLY_FILTERED by aliasStatic(FilterMask::field_39941)
    /**
     * method_45091
     */
    fun writeMask(buf: PacketByteBuf, mask: FilterMask) = FilterMask.method_45091(buf, mask)
    /**
     * method_45090
     */
    fun readMask(buf: PacketByteBuf) = FilterMask.method_45090(buf)
}