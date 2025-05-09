package me.hellrevenger.generated.Map_ChunkTickScheduler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39365
 */
fun <T>ChunkTickScheduler<T>.toNbt(time: Long, arg1: function_Function<T, String>) = this.method_39365(time, arg1)
/**
 * method_39366
 */
fun <T>ChunkTickScheduler<T>.setTickConsumer(tickConsumer: BiConsumer<ChunkTickScheduler<T>, OrderedTick<T>>) = this.method_39366(tickConsumer)
/**
 * method_39372
 */
fun <T>ChunkTickScheduler<T>.getQueueAsStream() = this.method_39372()
/**
 * method_39369
 */
fun <T>ChunkTickScheduler<T>.peekNextTick() = this.method_39369()
/**
 * method_39364
 */
fun <T>ChunkTickScheduler<T>.disable(time: Long) = this.method_39364(time)
/**
 * method_39367
 */
fun <T>ChunkTickScheduler<T>.removeTicksIf(predicate: Predicate<OrderedTick<T>>) = this.method_39367(predicate)
/**
 * method_39371
 */
fun <T>ChunkTickScheduler<T>.pollNextTick() = this.method_39371()
