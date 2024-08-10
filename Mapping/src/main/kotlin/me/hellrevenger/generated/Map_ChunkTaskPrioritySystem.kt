package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkTaskPrioritySystem

fun ChunkTaskPrioritySystem.getDebugString() = this.method_21680()
fun <T>KClass<ChunkTaskPrioritySystem>.createTask(arg0: AbstractChunkHolder, arg1: Function<MessageListener<Unit>, T>) = ChunkTaskPrioritySystem.method_34870<T>(arg0, arg1)
fun KClass<ChunkTaskPrioritySystem>.createUnblockingMessage(arg0: Runnable, arg1: Long, arg2: Boolean) = ChunkTaskPrioritySystem.method_17627(arg0, arg1, arg2)
fun KClass<ChunkTaskPrioritySystem>.createMessage(arg0: Runnable, arg1: Long, arg2: IntSupplier) = ChunkTaskPrioritySystem.method_17626(arg0, arg1, arg2)
fun KClass<ChunkTaskPrioritySystem>.createMessage(arg0: AbstractChunkHolder, arg1: Runnable) = ChunkTaskPrioritySystem.method_17629(arg0, arg1)
fun <T>ChunkTaskPrioritySystem.createExecutor(arg0: MessageListener<T>, arg1: Boolean) = this.method_17622<T>(arg0, arg1)
fun ChunkTaskPrioritySystem.createUnblockingExecutor(arg0: MessageListener<Runnable>) = this.method_17614(arg0)
fun <T>KClass<ChunkTaskPrioritySystem>.createTask(arg0: Function<MessageListener<Unit>, T>, arg1: Long, arg2: IntSupplier) = ChunkTaskPrioritySystem.method_34871<T>(arg0, arg1, arg2)
fun ChunkTaskPrioritySystem.shouldDelayShutdown() = this.method_39994()
