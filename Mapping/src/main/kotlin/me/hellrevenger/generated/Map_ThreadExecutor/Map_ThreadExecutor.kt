package me.hellrevenger.generated.Map_ThreadExecutor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_18854
 */
fun <R>ThreadExecutor<R>.isOnThread() where R: Runnable = this.method_18854()
/**
 * method_19537
 */
fun <R>ThreadExecutor<R>.submitAndJoin(runnable: Runnable) where R: Runnable = this.method_19537(runnable)
/**
 * method_16075
 */
fun <R>ThreadExecutor<R>.runTask() where R: Runnable = this.method_16075()
/**
 * method_5385
 */
fun <R, V>ThreadExecutor<R>.submit(task: Supplier<V>) where R: Runnable = this.method_5385<V>(task)
/**
 * method_20813
 */
fun <R>ThreadExecutor<R>.waitForTasks() where R: Runnable = this.method_20813()
/**
 * method_18857
 */
fun <R>ThreadExecutor<R>.runTasks(stopCondition: BooleanSupplier) where R: Runnable = this.method_18857(stopCondition)
/**
 * method_21684
 */
fun <R>ThreadExecutor<R>.getTaskCount() where R: Runnable = this.method_21684()
/**
 * method_40000
 */
fun <R>ThreadExecutor<R>.executeSync(runnable: Runnable) where R: Runnable = this.method_40000(runnable)
