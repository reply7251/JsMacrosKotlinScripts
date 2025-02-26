package me.hellrevenger.generated.Map_Texts
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_33536
 */
val KClass<Texts>.DEFAULT_SEPARATOR by aliasStatic(Texts::field_33536)
/**
 * field_33537
 */
val KClass<Texts>.GRAY_DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33537)
/**
 * field_33538
 */
val KClass<Texts>.DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33538)
/**
 * method_10884
 */
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: function_Function<T, Text>) = Texts.method_10884<T>(arg0, arg1)
/**
 * method_10887
 */
fun <T>KClass<Texts>.joinOrdered(arg0: Collection<T>, arg1: function_Function<T, Text>) where T: Comparable<T> = Texts.method_10887<T>(arg0, arg1)
/**
 * method_10885
 */
fun KClass<Texts>.bracketed(arg0: Text) = Texts.method_10885(arg0)
/**
 * method_10888
 */
fun KClass<Texts>.joinOrdered(arg0: Collection<String>) = Texts.method_10888(arg0)
/**
 * method_36330
 */
fun KClass<Texts>.parse(arg0: ServerCommandSource, arg1: Optional<Text>, arg2: Entity, arg3: Int) = Texts.method_36330(arg0, arg1, arg2, arg3)
/**
 * method_36332
 */
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: Text, arg2: function_Function<T, Text>) = Texts.method_36332<T>(arg0, arg1, arg2)
/**
 * method_47523
 */
fun KClass<Texts>.bracketedCopyable(arg0: String) = Texts.method_47523(arg0)
/**
 * method_10881
 */
fun KClass<Texts>.parse(arg0: ServerCommandSource, arg1: Text, arg2: Entity, arg3: Int) = Texts.method_10881(arg0, arg1, arg2, arg3)
/**
 * method_10889
 */
fun KClass<Texts>.setStyleIfAbsent(arg0: MutableText, arg1: Style) = Texts.method_10889(arg0, arg1)
/**
 * method_10883
 */
fun KClass<Texts>.toText(arg0: Message) = Texts.method_10883(arg0)
/**
 * method_36331
 */
fun <T>KClass<Texts>.join(arg0: Collection<out T>, arg1: Optional<out Text>, arg2: function_Function<T, Text>) = Texts.method_36331<T>(arg0, arg1, arg2)
/**
 * method_37112
 */
fun KClass<Texts>.join(arg0: Collection<out Text>, arg1: Text) = Texts.method_37112(arg0, arg1)
/**
 * method_43476
 */
fun KClass<Texts>.hasTranslation(arg0: Text) = Texts.method_43476(arg0)
