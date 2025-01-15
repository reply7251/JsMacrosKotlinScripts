package me.hellrevenger.generated.Map_CommandFunction
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>CommandFunction<T>.withMacroReplaced(arg0: NbtCompound, arg1: CommandDispatcher<T>) = this.method_52595(arg0, arg1)
fun <T>KClass<CommandFunction<T>>.create(arg0: Identifier, arg1: CommandDispatcher<T>, arg2: T, arg3: MutableList<String>) where T: AbstractServerCommandSource<T> = CommandFunction.method_9195<T>(arg0, arg1, arg2, arg3)
fun <T>KClass<CommandFunction<T>>.parse(arg0: CommandDispatcher<T>, arg1: T, arg2: StringReader) where T: AbstractServerCommandSource<T> = CommandFunction.method_54417<T>(arg0, arg1, arg2)
fun <T>KClass<CommandFunction<T>>.validateCommandLength(arg0: CharSequence) = CommandFunction.method_57057(arg0)
fun <T>CommandFunction<T>.id() = this.comp_1994()
