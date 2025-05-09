package me.hellrevenger.generated.Map_OrderedText
import kotlin.reflect.*
import me.hellrevenger.generated.*
object OrderedTextKt {
    /**
     * method_34906
     */
    fun of(text: OrderedText) = OrderedText.method_34906(text)
    /**
     * method_30741
     */
    fun styled(codePoint: Int, style: Style) = OrderedText.method_30741(codePoint, style)
    /**
     * method_30742
     */
    fun concat(first: OrderedText, second: OrderedText) = OrderedText.method_30742(first, second)
    /**
     * method_30752
     */
    fun innerConcat(text1: OrderedText, text2: OrderedText) = OrderedText.method_30752(text1, text2)
    /**
     * method_34905
     */
    fun empty() = OrderedText.method_34905()
    /**
     * method_30749
     */
    fun concat(texts: MutableList<OrderedText>) = OrderedText.method_30749(texts)
    /**
     * method_30755
     */
    fun innerConcat(texts: MutableList<OrderedText>) = OrderedText.method_30755(texts)
    /**
     * method_30745
     */
    fun map(visitor: CharacterVisitor, codePointMapper: Int2IntFunction) = OrderedText.method_30745(visitor, codePointMapper)
    /**
     * method_30754
     */
    fun styledBackwardsVisitedString(string: String, style: Style, codePointMapper: Int2IntFunction) = OrderedText.method_30754(string, style, codePointMapper)
    /**
     * method_34908
     */
    fun styledForwardsVisitedString(string: String, style: Style, codePointMapper: Int2IntFunction) = OrderedText.method_34908(string, style, codePointMapper)
    /**
     * method_34909
     */
    fun concat(texts: Array<OrderedText>) = OrderedText.method_34909(*texts)
    /**
     * method_34910
     */
    fun styledBackwardsVisitedString(string: String, style: Style) = OrderedText.method_34910(string, style)
    /**
     * method_30747
     */
    fun styledForwardsVisitedString(string: String, style: Style) = OrderedText.method_30747(string, style)
}