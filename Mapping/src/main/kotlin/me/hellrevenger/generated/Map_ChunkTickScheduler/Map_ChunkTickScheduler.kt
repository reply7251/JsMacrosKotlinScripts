package me.hellrevenger.generated.Map_ChunkTickScheduler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_39368
 */
fun <T>KClass<ChunkTickScheduler<T>>.create(arg0: NbtList, arg1: function_Function<String, Optional<T>>, arg2: ChunkPos) = ChunkTickScheduler.method_39368<T>(arg0, arg1, arg2)
/**
 * method_39365
 */
fun <T>ChunkTickScheduler<T>.toNbt(arg0: Long, arg1: function_Function<T, String>) = this.method_39365(arg0, arg1)
/**
 * method_39366
 */
fun <T>ChunkTickScheduler<T>.setTickConsumer(arg0: BiConsumer<ChunkTickScheduler<T>, OrderedTick<T>>) = this.method_39366(arg0)
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
fun <T>ChunkTickScheduler<T>.disable(arg0: Long) = this.method_39364(arg0)
/**
 * method_39367
 */
fun <T>ChunkTickScheduler<T>.removeTicksIf(arg0: Predicate<OrderedTick<T>>) = this.method_39367(arg0)
/**
 * method_39371
 */
fun <T>ChunkTickScheduler<T>.pollNextTick() = this.method_39371()
