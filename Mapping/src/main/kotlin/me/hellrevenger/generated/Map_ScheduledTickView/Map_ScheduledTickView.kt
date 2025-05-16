package me.hellrevenger.generated.Map_ScheduledTickView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_64311
 */
fun ScheduledTickView.scheduleBlockTick(pos: BlockPos?, block: Block?, delay: Int, priority: TickPriority?) = this.method_64311(pos, block, delay, priority)
/**
 * method_8397
 */
fun ScheduledTickView.getBlockTickScheduler() = this.method_8397()
/**
 * method_64313
 */
fun ScheduledTickView.scheduleFluidTick(pos: BlockPos?, fluid: Fluid?, delay: Int, priority: TickPriority?) = this.method_64313(pos, fluid, delay, priority)
/**
 * method_39284
 */
fun <T>ScheduledTickView.createOrderedTick(pos: BlockPos?, type: T, delay: Int, priority: TickPriority?) = this.method_39284<T>(pos, type, delay, priority)
/**
 * method_8405
 */
fun ScheduledTickView.getFluidTickScheduler() = this.method_8405()
/**
 * method_64310
 */
fun ScheduledTickView.scheduleBlockTick(pos: BlockPos?, block: Block?, delay: Int) = this.method_64310(pos, block, delay)
/**
 * method_39283
 */
fun <T>ScheduledTickView.createOrderedTick(pos: BlockPos?, type: T, delay: Int) = this.method_39283<T>(pos, type, delay)
/**
 * method_64312
 */
fun ScheduledTickView.scheduleFluidTick(pos: BlockPos?, fluid: Fluid?, delay: Int) = this.method_64312(pos, fluid, delay)
