package me.hellrevenger.generated.Map_Identifier
import kotlin.reflect.*
import me.hellrevenger.generated.*
object IdentifierKt {
    /**
     * field_13354
     */
    val COMMAND_EXCEPTION by aliasStatic(Identifier::field_13354)
    /**
     * field_33381
     */
    val DEFAULT_NAMESPACE by aliasStatic(Identifier::field_33381)
    /**
     * field_33382
     */
    val REALMS_NAMESPACE by aliasStatic(Identifier::field_33382)
    /**
     * field_33380
     */
    val NAMESPACE_SEPARATOR by aliasStatic(Identifier::field_33380)
    /**
     * method_60654
     */
    fun of(id: String) = Identifier.method_60654(id)
    /**
     * method_60656
     */
    fun ofVanilla(path: String) = Identifier.method_60656(path)
    /**
     * method_20208
     */
    fun isPathValid(path: String) = Identifier.method_20208(path)
    /**
     * method_58274
     */
    fun fromCommandInputNonEmpty(reader: StringReader) = Identifier.method_58274(reader)
    /**
     * method_12835
     */
    fun fromCommandInput(reader: StringReader) = Identifier.method_12835(reader)
    /**
     * method_12829
     */
    fun tryParse(id: String) = Identifier.method_12829(id)
    /**
     * method_60935
     */
    fun trySplitOn(id: String, delimiter: Char) = Identifier.method_60935(id, delimiter)
    /**
     * method_20209
     */
    fun isNamespaceValid(namespace: String) = Identifier.method_20209(namespace)
    /**
     * method_29186
     */
    fun validate(id: String) = Identifier.method_29186(id)
    /**
     * method_29184
     */
    fun isPathCharacterValid(character: Char) = Identifier.method_29184(character)
    /**
     * method_12831
     */
    fun isCharValid(c: Char) = Identifier.method_12831(c)
    /**
     * method_12838
     */
    fun splitOn(id: String, delimiter: Char) = Identifier.method_12838(id, delimiter)
}