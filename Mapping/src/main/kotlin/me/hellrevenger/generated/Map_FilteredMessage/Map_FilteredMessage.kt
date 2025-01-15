package me.hellrevenger.generated.Map_FilteredMessage
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<FilteredMessage>.EMPTY by aliasStatic(FilteredMessage::field_28863)
fun FilteredMessage.raw() = this.comp_841()
fun FilteredMessage.filter() = this.method_45059()
fun FilteredMessage.isFiltered() = this.method_45063()
fun KClass<FilteredMessage>.permitted(arg0: String) = FilteredMessage.method_45060(arg0)
fun KClass<FilteredMessage>.censored(arg0: String) = FilteredMessage.method_45062(arg0)
fun FilteredMessage.getString() = this.method_45061()
fun FilteredMessage.mask() = this.comp_978()
