package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WorldTickScheduler

fun <T>WorldTickScheduler<T>.scheduleTicks(arg0: WorldTickScheduler<T>, arg1: BlockBox, arg2: Vec3i) = this.method_48167(arg0, arg1, arg2)
fun <T>WorldTickScheduler<T>.clearNextTicks(arg0: BlockBox) = this.method_39380(arg0)
fun <T>WorldTickScheduler<T>.addChunkTickScheduler(arg0: ChunkPos, arg1: ChunkTickScheduler<T>) = this.method_39379(arg0, arg1)
fun <T>WorldTickScheduler<T>.removeChunkTickScheduler(arg0: ChunkPos) = this.method_39378(arg0)
fun <T>WorldTickScheduler<T>.scheduleTicks(arg0: BlockBox, arg1: Vec3i) = this.method_39383(arg0, arg1)
fun <T>WorldTickScheduler<T>.tick(arg0: Long, arg1: Int, arg2: BiConsumer<BlockPos, T>) = this.method_39377(arg0, arg1, arg2)
