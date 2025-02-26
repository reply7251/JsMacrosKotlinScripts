package me.hellrevenger.generated.Map_ChunkTaskPrioritySystem
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_21680
 */
fun ChunkTaskPrioritySystem.getDebugString() = this.method_21680()
/**
 * method_34870
 */
fun <T>KClass<ChunkTaskPrioritySystem>.createTask(arg0: AbstractChunkHolder, arg1: function_Function<MessageListener<util_Unit>, T>) = ChunkTaskPrioritySystem.method_34870<T>(arg0, arg1)
/**
 * method_17627
 */
fun KClass<ChunkTaskPrioritySystem>.createUnblockingMessage(arg0: Runnable, arg1: Long, arg2: Boolean) = ChunkTaskPrioritySystem.method_17627(arg0, arg1, arg2)
/**
 * method_17626
 */
fun KClass<ChunkTaskPrioritySystem>.createMessage(arg0: Runnable, arg1: Long, arg2: IntSupplier) = ChunkTaskPrioritySystem.method_17626(arg0, arg1, arg2)
/**
 * method_17629
 */
fun KClass<ChunkTaskPrioritySystem>.createMessage(arg0: AbstractChunkHolder, arg1: Runnable) = ChunkTaskPrioritySystem.method_17629(arg0, arg1)
/**
 * method_17622
 */
fun <T>ChunkTaskPrioritySystem.createExecutor(arg0: MessageListener<T>, arg1: Boolean) = this.method_17622<T>(arg0, arg1)
/**
 * method_17614
 */
fun ChunkTaskPrioritySystem.createUnblockingExecutor(arg0: MessageListener<Runnable>) = this.method_17614(arg0)
/**
 * method_34871
 */
fun <T>KClass<ChunkTaskPrioritySystem>.createTask(arg0: function_Function<MessageListener<util_Unit>, T>, arg1: Long, arg2: IntSupplier) = ChunkTaskPrioritySystem.method_34871<T>(arg0, arg1, arg2)
/**
 * method_39994
 */
fun ChunkTaskPrioritySystem.shouldDelayShutdown() = this.method_39994()
