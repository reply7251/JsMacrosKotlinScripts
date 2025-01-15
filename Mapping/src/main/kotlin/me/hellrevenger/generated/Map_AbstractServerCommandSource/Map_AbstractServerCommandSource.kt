package me.hellrevenger.generated.Map_AbstractServerCommandSource
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>AbstractServerCommandSource<T>.handleException(arg0: CommandExceptionType, arg1: Message, arg2: Boolean, arg3: Tracer) where T: AbstractServerCommandSource<T> = this.method_54491(arg0, arg1, arg2, arg3)
fun <T>AbstractServerCommandSource<T>.withDummyReturnValueConsumer() where T: AbstractServerCommandSource<T> = this.method_54311()
fun <T>AbstractServerCommandSource<T>.hasPermissionLevel(arg0: Int) where T: AbstractServerCommandSource<T> = this.method_9259(arg0)
fun <T>AbstractServerCommandSource<T>.isSilent() where T: AbstractServerCommandSource<T> = this.method_54882()
fun <T>AbstractServerCommandSource<T>.getDispatcher() where T: AbstractServerCommandSource<T> = this.method_54310()
fun <T>KClass<AbstractServerCommandSource<T>>.asResultConsumer() where T: AbstractServerCommandSource<T> = AbstractServerCommandSource.method_54317<T>()
fun <T>AbstractServerCommandSource<T>.handleException(arg0: CommandSyntaxException, arg1: Boolean, arg2: Tracer) where T: AbstractServerCommandSource<T> = this.method_54495(arg0, arg1, arg2)
fun <T>AbstractServerCommandSource<T>.withReturnValueConsumer(arg0: ReturnValueConsumer) where T: AbstractServerCommandSource<T> = this.method_54307(arg0)
fun <T>AbstractServerCommandSource<T>.getReturnValueConsumer() where T: AbstractServerCommandSource<T> = this.method_54881()
