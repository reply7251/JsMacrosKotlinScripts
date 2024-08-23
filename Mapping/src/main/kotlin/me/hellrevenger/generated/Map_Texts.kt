package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Texts

val KClass<Texts>.DEFAULT_SEPARATOR by aliasStatic(Texts::field_33536)
val KClass<Texts>.GRAY_DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33537)
val KClass<Texts>.DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33538)
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: Function<T, Text>) = Texts.method_10884<T>(arg0, arg1)
fun <T>KClass<Texts>.joinOrdered(arg0: Collection<T>, arg1: Function<T, Text>) where T: Comparable<T> = Texts.method_10887<T>(arg0, arg1)
fun KClass<Texts>.bracketed(arg0: Text) = Texts.method_10885(arg0)
fun KClass<Texts>.joinOrdered(arg0: Collection<String>) = Texts.method_10888(arg0)
fun KClass<Texts>.parse(arg0: ServerCommandSource, arg1: Optional<Text>, arg2: Entity, arg3: Int) = Texts.method_36330(arg0, arg1, arg2, arg3)
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: Text, arg2: Function<T, Text>) = Texts.method_36332<T>(arg0, arg1, arg2)
fun KClass<Texts>.bracketedCopyable(arg0: String) = Texts.method_47523(arg0)
fun KClass<Texts>.parse(arg0: ServerCommandSource, arg1: Text, arg2: Entity, arg3: Int) = Texts.method_10881(arg0, arg1, arg2, arg3)
fun KClass<Texts>.setStyleIfAbsent(arg0: MutableText, arg1: Style) = Texts.method_10889(arg0, arg1)
fun KClass<Texts>.toText(arg0: Message) = Texts.method_10883(arg0)
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: Optional<out Text>, arg2: Function<T, Text>) = Texts.method_36331<T>(arg0, arg1, arg2)
fun KClass<Texts>.join(arg0: Collection<out Text>, arg1: Text) = Texts.method_37112(arg0, arg1)
fun KClass<Texts>.hasTranslation(arg0: Text) = Texts.method_43476(arg0)
