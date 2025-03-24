package me.hellrevenger.generated.Map_ChunkTaskScheduler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54036
 */
val KClass<ChunkTaskScheduler>.LEVELS by aliasStatic(ChunkTaskScheduler::field_54036)
/**
 * method_63553
 */
fun ChunkTaskScheduler.add(arg0: Runnable, arg1: Long, arg2: IntSupplier) = this.method_63553(arg0, arg1, arg2)
/**
 * method_63549
 */
fun ChunkTaskScheduler.remove(arg0: Long, arg1: Runnable, arg2: Boolean) = this.method_63549(arg0, arg1, arg2)
/**
 * method_63546
 */
fun ChunkTaskScheduler.shouldDelayShutdown() = this.method_63546()
