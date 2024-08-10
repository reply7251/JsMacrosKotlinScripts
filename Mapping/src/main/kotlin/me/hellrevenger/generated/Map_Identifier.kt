package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Identifier

val Identifier.COMMAND_EXCEPTION by aliasStatic(Identifier::field_13354)
val Identifier.DEFAULT_NAMESPACE by aliasStatic(Identifier::field_33381)
val Identifier.REALMS_NAMESPACE by aliasStatic(Identifier::field_33382)
val Identifier.NAMESPACE_SEPARATOR by aliasStatic(Identifier::field_33380)
val Identifier.PACKET_CODEC by aliasStatic(Identifier::field_48267)
fun Identifier.compareTo(arg0: Identifier) = this.method_12833(arg0)
fun KClass<Identifier>.of(arg0: String) = Identifier.method_60654(arg0)
fun Identifier.withPath(arg0: UnaryOperator<String>) = this.method_45134(arg0)
fun Identifier.withSuffixedPath(arg0: String) = this.method_48331(arg0)
fun Identifier.toShortTranslationKey() = this.method_43903()
fun Identifier.withPrefixedPath(arg0: String) = this.method_45138(arg0)
fun KClass<Identifier>.ofVanilla(arg0: String) = Identifier.method_60656(arg0)
fun Identifier.toTranslationKey(arg0: String, arg1: String) = this.method_48747(arg0, arg1)
fun KClass<Identifier>.isPathValid(arg0: String) = Identifier.method_20208(arg0)
fun Identifier.withPath(arg0: String) = this.method_45136(arg0)
fun KClass<Identifier>.fromCommandInputNonEmpty(arg0: StringReader) = Identifier.method_58274(arg0)
fun KClass<Identifier>.fromCommandInput(arg0: StringReader) = Identifier.method_12835(arg0)
fun KClass<Identifier>.tryParse(arg0: String) = Identifier.method_12829(arg0)
fun KClass<Identifier>.of(arg0: String, arg1: String) = Identifier.method_60655(arg0, arg1)
fun Identifier.toTranslationKey() = this.method_42094()
fun KClass<Identifier>.tryParse(arg0: String, arg1: String) = Identifier.method_43902(arg0, arg1)
fun KClass<Identifier>.trySplitOn(arg0: String, arg1: Char) = Identifier.method_60935(arg0, arg1)
fun KClass<Identifier>.isNamespaceValid(arg0: String) = Identifier.method_20209(arg0)
fun KClass<Identifier>.validate(arg0: String) = Identifier.method_29186(arg0)
fun Identifier.toTranslationKey(arg0: String) = this.method_42093(arg0)
fun KClass<Identifier>.isPathCharacterValid(arg0: Char) = Identifier.method_29184(arg0)
fun KClass<Identifier>.isCharValid(arg0: Char) = Identifier.method_12831(arg0)
fun KClass<Identifier>.splitOn(arg0: String, arg1: Char) = Identifier.method_12838(arg0, arg1)
fun Identifier.toUnderscoreSeparatedString() = this.method_36181()
