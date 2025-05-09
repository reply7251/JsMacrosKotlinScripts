package me.hellrevenger.generated.Map_CommandFunction
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CommandFunctionKt {
    /**
     * method_9195
     */
    fun <T>create(id: Identifier, dispatcher: CommandDispatcher<T>, source: T, lines: MutableList<String>) where T: AbstractServerCommandSource<T> = CommandFunction.method_9195<T>(id, dispatcher, source, lines)
    /**
     * method_54417
     */
    fun <T>parse(dispatcher: CommandDispatcher<T>, source: T, reader: StringReader) where T: AbstractServerCommandSource<T> = CommandFunction.method_54417<T>(dispatcher, source, reader)
    /**
     * method_57057
     */
    fun <T>validateCommandLength(command: CharSequence) = CommandFunction.method_57057(command)
}