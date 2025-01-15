package me.hellrevenger.generated.Map_TimedTaskRunner
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun TimedTaskRunner.expectMinDuration(arg0: Int) = this.method_36076(arg0)
fun TimedTaskRunner.expectMinDurationOrRun(arg0: Int, arg1: Runnable) = this.method_36084(arg0, arg1)
fun TimedTaskRunner.runReported(arg0: Long) = this.method_23644(arg0)
fun TimedTaskRunner.expectMinDurationAndRun(arg0: Int, arg1: Runnable) = this.method_36077(arg0, arg1)
fun TimedTaskRunner.createAndAdd(arg0: Long, arg1: Runnable) = this.method_36078(arg0, arg1)
fun TimedTaskRunner.runSilently(arg0: Long) = this.method_23643(arg0)
fun TimedTaskRunner.createAndAddReported(arg0: Runnable) = this.method_36085(arg0)
fun TimedTaskRunner.createAndAdd(arg0: Runnable) = this.method_36079(arg0)
fun TimedTaskRunner.completeIfSuccessful() = this.method_36075()
fun TimedTaskRunner.createAndAddTrigger() = this.method_36083()
fun TimedTaskRunner.fail(arg0: Supplier<Exception>) = this.method_36080(arg0)
