package me.hellrevenger.generated.Map_WorldTickScheduler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_48167
 */
fun <T>WorldTickScheduler<T>.scheduleTicks(scheduler: WorldTickScheduler<T>, box: BlockBox, offset: Vec3i) = this.method_48167(scheduler, box, offset)
/**
 * method_39380
 */
fun <T>WorldTickScheduler<T>.clearNextTicks(box: BlockBox) = this.method_39380(box)
/**
 * method_39379
 */
fun <T>WorldTickScheduler<T>.addChunkTickScheduler(pos: ChunkPos, scheduler: ChunkTickScheduler<T>) = this.method_39379(pos, scheduler)
/**
 * method_39378
 */
fun <T>WorldTickScheduler<T>.removeChunkTickScheduler(pos: ChunkPos) = this.method_39378(pos)
/**
 * method_39377
 */
fun <T>WorldTickScheduler<T>.tick(time: Long, arg1: Int, maxTicks: BiConsumer<BlockPos, T>) = this.method_39377(time, arg1, maxTicks)
