package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FilterMask

val FilterMask.FILTERED_STYLE by aliasStatic(FilterMask::field_40674)
val FilterMask.PASS_THROUGH by aliasStatic(FilterMask::field_39942)
val FilterMask.FULLY_FILTERED by aliasStatic(FilterMask::field_39941)
fun KClass<FilterMask>.writeMask(arg0: PacketByteBuf, arg1: FilterMask) = FilterMask.method_45091(arg0, arg1)
fun FilterMask.isFullyFiltered() = this.method_45093()
fun FilterMask.filter(arg0: String) = this.method_45089(arg0)
fun FilterMask.isPassThrough() = this.method_45087()
fun KClass<FilterMask>.readMask(arg0: PacketByteBuf) = FilterMask.method_45090(arg0)
fun FilterMask.getFilteredText(arg0: String) = this.method_46256(arg0)
fun FilterMask.markFiltered(arg0: Int) = this.method_45088(arg0)
