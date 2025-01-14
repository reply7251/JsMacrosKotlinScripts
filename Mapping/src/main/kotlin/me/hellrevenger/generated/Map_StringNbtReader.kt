package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StringNbtReader

val KClass<StringNbtReader>.EXPECTED_KEY by aliasStatic(StringNbtReader::field_11608)
val KClass<StringNbtReader>.TRAILING by aliasStatic(StringNbtReader::field_11602)
val KClass<StringNbtReader>.LIST_MIXED by aliasStatic(StringNbtReader::field_11603)
val KClass<StringNbtReader>.COLON by aliasStatic(StringNbtReader::field_33266)
val KClass<StringNbtReader>.ARRAY_MIXED by aliasStatic(StringNbtReader::field_11597)
val KClass<StringNbtReader>.EXPECTED_VALUE by aliasStatic(StringNbtReader::field_11605)
val KClass<StringNbtReader>.ARRAY_INVALID by aliasStatic(StringNbtReader::field_11604)
val KClass<StringNbtReader>.COMMA by aliasStatic(StringNbtReader::field_33265)
fun KClass<StringNbtReader>.parse(arg0: String) = StringNbtReader.method_10718(arg0)
fun StringNbtReader.parseElement() = this.method_10723()
fun StringNbtReader.parseCompound() = this.method_10727()
