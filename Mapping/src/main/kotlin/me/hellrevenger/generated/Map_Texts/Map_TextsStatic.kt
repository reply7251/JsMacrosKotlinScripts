package me.hellrevenger.generated.Map_Texts
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TextsKt {
    /**
     * field_33536
     */
    val DEFAULT_SEPARATOR by aliasStatic(Texts::field_33536)
    /**
     * field_33537
     */
    val GRAY_DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33537)
    /**
     * field_33538
     */
    val DEFAULT_SEPARATOR_TEXT by aliasStatic(Texts::field_33538)
    /**
     * method_10884
     */
    fun <T>join(elements: Collection<out T>, transformer: function_Function<T, Text>) = Texts.method_10884<T>(elements, transformer)
    /**
     * method_10887
     */
    fun <T>joinOrdered(elements: Collection<T>, transformer: function_Function<T, Text>) where T: Comparable<T> = Texts.method_10887<T>(elements, transformer)
    /**
     * method_10885
     */
    fun bracketed(text: Text) = Texts.method_10885(text)
    /**
     * method_36330
     */
    fun parse(source: ServerCommandSource, text: Optional<Text>, sender: Entity, depth: Int) = Texts.method_36330(source, text, sender, depth)
    /**
     * method_47523
     */
    fun bracketedCopyable(string: String) = Texts.method_47523(string)
    /**
     * method_10889
     */
    fun setStyleIfAbsent(text: MutableText, style: Style) = Texts.method_10889(text, style)
    /**
     * method_10883
     */
    fun toText(message: Message) = Texts.method_10883(message)
    /**
     * method_43476
     */
    fun hasTranslation(text: Text) = Texts.method_43476(text)
}