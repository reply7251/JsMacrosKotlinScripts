package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NbtString

val KClass<NbtString>.TYPE by aliasStatic(NbtString::field_21045)
fun NbtString.copy() = this.method_10705()
fun KClass<NbtString>.escape(arg0: String) = NbtString.method_10706(arg0)
fun KClass<NbtString>.skip(arg0: DataInput) = NbtString.method_39875(arg0)
fun KClass<NbtString>.of(arg0: String) = NbtString.method_23256(arg0)
