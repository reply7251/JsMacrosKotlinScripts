package me.hellrevenger.generated.Map_SystemDetails
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<SystemDetails>.MEBI by aliasStatic(SystemDetails::field_33852)
fun SystemDetails.addSection(arg0: String, arg1: Supplier<String>) = this.method_37123(arg0, arg1)
fun SystemDetails.writeTo(arg0: StringBuilder) = this.method_37124(arg0)
fun SystemDetails.addSection(arg0: String, arg1: String) = this.method_37122(arg0, arg1)
fun KClass<SystemDetails>.toMebibytes(arg0: Long) = SystemDetails.method_59895(arg0)
fun SystemDetails.collect() = this.method_37120()
