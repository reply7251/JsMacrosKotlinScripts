package me.hellrevenger.generated.Map_FilterMask
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40674
 */
val KClass<FilterMask>.FILTERED_STYLE by aliasStatic(FilterMask::field_40674)
/**
 * field_39942
 */
val KClass<FilterMask>.PASS_THROUGH by aliasStatic(FilterMask::field_39942)
/**
 * field_39941
 */
val KClass<FilterMask>.FULLY_FILTERED by aliasStatic(FilterMask::field_39941)
/**
 * method_45091
 */
fun KClass<FilterMask>.writeMask(arg0: PacketByteBuf, arg1: FilterMask) = FilterMask.method_45091(arg0, arg1)
/**
 * method_45093
 */
fun FilterMask.isFullyFiltered() = this.method_45093()
/**
 * method_45089
 */
fun FilterMask.filter(arg0: String) = this.method_45089(arg0)
/**
 * method_45087
 */
fun FilterMask.isPassThrough() = this.method_45087()
/**
 * method_45090
 */
fun KClass<FilterMask>.readMask(arg0: PacketByteBuf) = FilterMask.method_45090(arg0)
/**
 * method_46256
 */
fun FilterMask.getFilteredText(arg0: String) = this.method_46256(arg0)
/**
 * method_45088
 */
fun FilterMask.markFiltered(arg0: Int) = this.method_45088(arg0)
