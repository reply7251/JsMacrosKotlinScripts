package me.hellrevenger.generated.Map_ThreadExecutor
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <R>ThreadExecutor<R>.isOnThread() where R: Runnable = this.method_18854()
fun <R>ThreadExecutor<R>.submitAndJoin(arg0: Runnable) where R: Runnable = this.method_19537(arg0)
fun <R>ThreadExecutor<R>.runTask() where R: Runnable = this.method_16075()
fun <R>ThreadExecutor<R>.send(arg0: R) where R: Runnable = this.method_18858(arg0)
fun <R, V>ThreadExecutor<R>.submit(arg0: Supplier<V>) where R: Runnable = this.method_5385<V>(arg0)
fun <R>ThreadExecutor<R>.submit(arg0: Runnable) where R: Runnable = this.method_20493(arg0)
fun <R>ThreadExecutor<R>.waitForTasks() where R: Runnable = this.method_20813()
fun <R>ThreadExecutor<R>.runTasks(arg0: BooleanSupplier) where R: Runnable = this.method_18857(arg0)
fun <R>ThreadExecutor<R>.getTaskCount() where R: Runnable = this.method_21684()
fun <R>ThreadExecutor<R>.executeSync(arg0: Runnable) where R: Runnable = this.method_40000(arg0)
