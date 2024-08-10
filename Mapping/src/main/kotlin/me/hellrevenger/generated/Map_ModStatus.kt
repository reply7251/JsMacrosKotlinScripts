package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModStatus

fun ModStatus.getMessage() = this.method_39032()
fun ModStatus.isModded() = this.method_39029()
fun ModStatus.combine(arg0: ModStatus) = this.method_39030(arg0)
fun KClass<ModStatus>.check(arg0: String, arg1: Supplier<String>, arg2: String, arg3: Class<*>) = ModStatus.method_39031(arg0, arg1, arg2, arg3)
fun ModStatus.description() = this.comp_172()
fun ModStatus.confidence() = this.comp_171()
