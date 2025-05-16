package me.hellrevenger.generated.Map_CommandExecutionContext
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CommandExecutionContextKt {
    /**
     * method_54393
     */
    fun <T>enqueueCommand(context: CommandExecutionContext<T>?, command: String?, contextChain: ContextChain<T>?, source: T, returnValueConsumer: ReturnValueConsumer?) where T: AbstractServerCommandSource<T> = CommandExecutionContext.method_54393<T>(context, command, contextChain, source, returnValueConsumer)
    /**
     * method_54395
     */
    fun <T>enqueueProcedureCall(context: CommandExecutionContext<T>?, procedure: Procedure<T>?, source: T, returnValueConsumer: ReturnValueConsumer?) where T: AbstractServerCommandSource<T> = CommandExecutionContext.method_54395<T>(context, procedure, source, returnValueConsumer)
}