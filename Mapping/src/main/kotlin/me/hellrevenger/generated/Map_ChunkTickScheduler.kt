package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkTickScheduler

fun <T>KClass<ChunkTickScheduler<T>>.create(arg0: NbtList, arg1: Function<String, Optional<T>>, arg2: ChunkPos) = ChunkTickScheduler.method_39368<T>(arg0, arg1, arg2)
fun <T>ChunkTickScheduler<T>.toNbt(arg0: Long, arg1: Function<T, String>) = this.method_39365(arg0, arg1)
fun <T>ChunkTickScheduler<T>.setTickConsumer(arg0: BiConsumer<ChunkTickScheduler<T>, OrderedTick<T>>) = this.method_39366(arg0)
fun <T>ChunkTickScheduler<T>.getQueueAsStream() = this.method_39372()
fun <T>ChunkTickScheduler<T>.peekNextTick() = this.method_39369()
fun <T>ChunkTickScheduler<T>.disable(arg0: Long) = this.method_39364(arg0)
fun <T>ChunkTickScheduler<T>.removeTicksIf(arg0: Predicate<OrderedTick<T>>) = this.method_39367(arg0)
fun <T>ChunkTickScheduler<T>.pollNextTick() = this.method_39371()
