package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StringNbtReader

val StringNbtReader.EXPECTED_KEY by aliasStatic(StringNbtReader::field_11608)
val StringNbtReader.NBT_COMPOUND_CODEC by aliasStatic(StringNbtReader::field_51469)
val StringNbtReader.TRAILING by aliasStatic(StringNbtReader::field_11602)
val StringNbtReader.LIST_MIXED by aliasStatic(StringNbtReader::field_11603)
val StringNbtReader.COLON by aliasStatic(StringNbtReader::field_33266)
val StringNbtReader.ARRAY_MIXED by aliasStatic(StringNbtReader::field_11597)
val StringNbtReader.EXPECTED_VALUE by aliasStatic(StringNbtReader::field_11605)
val StringNbtReader.STRINGIFIED_CODEC by aliasStatic(StringNbtReader::field_45952)
val StringNbtReader.ARRAY_INVALID by aliasStatic(StringNbtReader::field_11604)
val StringNbtReader.COMMA by aliasStatic(StringNbtReader::field_33265)
fun KClass<StringNbtReader>.parse(arg0: String) = StringNbtReader.method_10718(arg0)
fun StringNbtReader.parseElement() = this.method_10723()
fun StringNbtReader.parseCompound() = this.method_10727()
