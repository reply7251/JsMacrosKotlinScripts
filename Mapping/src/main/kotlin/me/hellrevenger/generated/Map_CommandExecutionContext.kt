package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CommandExecutionContext

fun <T>CommandExecutionContext<T>.run() = this.method_54390()
fun <T>CommandExecutionContext<T>.getEscapeControl(arg0: Int) = this.method_54890(arg0)
fun <T>CommandExecutionContext<T>.decrementCommandQuota() = this.method_54399()
fun <T>CommandExecutionContext<T>.escape(arg0: Int) = this.method_54391(arg0)
fun <T>CommandExecutionContext<T>.enqueueCommand(arg0: CommandQueueEntry<T>) = this.method_54392(arg0)
fun <T>KClass<CommandExecutionContext<T>>.enqueueCommand(arg0: CommandExecutionContext<T>, arg1: String, arg2: ContextChain<T>, arg3: T, arg4: ReturnValueConsumer) where T: AbstractServerCommandSource<T> = CommandExecutionContext.method_54393<T>(arg0, arg1, arg2, arg3, arg4)
fun <T>CommandExecutionContext<T>.setTracer(arg0: Tracer) = this.method_54394(arg0)
fun <T>KClass<CommandExecutionContext<T>>.enqueueProcedureCall(arg0: CommandExecutionContext<T>, arg1: Procedure<T>, arg2: T, arg3: ReturnValueConsumer) where T: AbstractServerCommandSource<T> = CommandExecutionContext.method_54395<T>(arg0, arg1, arg2, arg3)
