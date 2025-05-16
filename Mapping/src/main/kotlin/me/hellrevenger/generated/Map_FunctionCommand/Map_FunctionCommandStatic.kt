package me.hellrevenger.generated.Map_FunctionCommand
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FunctionCommandKt {
    /**
     * field_13662
     */
    val SUGGESTION_PROVIDER by aliasStatic(FunctionCommand::field_13662)
    /**
     * field_46645
     */
    val INSTANTIATION_FAILURE_EXCEPTION by aliasStatic(FunctionCommand::field_46645)
    /**
     * method_54272
     */
    fun createFunctionCommandSource(source: ServerCommandSource?) = FunctionCommand.method_54272(source)
    /**
     * method_54275
     */
    fun <T>enqueueAction(commandFunctions: Collection<CommandFunction<T>>?, args: NbtCompound?, parentSource: T, functionSource: T, control: ExecutionControl<T>?, resultConsumer: net.minecraft.class_3062.class_8832<T>?, flags: ExecutionFlags?) where T: AbstractServerCommandSource<T> = FunctionCommand.method_54275<T>(commandFunctions, args, parentSource, functionSource, control, resultConsumer, flags)
    /**
     * method_13380
     */
    fun register(dispatcher: CommandDispatcher<ServerCommandSource>?) = FunctionCommand.method_13380(dispatcher)
}