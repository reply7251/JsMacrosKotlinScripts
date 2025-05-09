package me.hellrevenger.generated.Map_TextVisitFactory
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TextVisitFactoryKt {
    /**
     * method_31402
     */
    fun removeFormattingCodes(text: StringVisitable) = TextVisitFactory.method_31402(text)
    /**
     * method_27478
     */
    fun visitBackwards(text: String, style: Style, visitor: CharacterVisitor) = TextVisitFactory.method_27478(text, style, visitor)
    /**
     * method_27479
     */
    fun visitFormatted(text: String, style: Style, visitor: CharacterVisitor) = TextVisitFactory.method_27479(text, style, visitor)
    /**
     * method_27474
     */
    fun visitForwards(text: String, style: Style, visitor: CharacterVisitor) = TextVisitFactory.method_27474(text, style, visitor)
    /**
     * method_27471
     */
    fun validateSurrogates(text: String) = TextVisitFactory.method_27471(text)
}