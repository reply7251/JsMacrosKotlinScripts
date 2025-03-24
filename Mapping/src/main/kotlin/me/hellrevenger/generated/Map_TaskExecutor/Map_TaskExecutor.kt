package me.hellrevenger.generated.Map_TaskExecutor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_63588
 */
fun <R>TaskExecutor<R>.send(arg0: R) where R: Runnable = this.method_63588(arg0)
/**
 * method_63602
 */
fun <R>KClass<TaskExecutor<R>>.of(arg0: String, arg1: Executor) where R: Runnable = TaskExecutor.method_63602(arg0, arg1)
/**
 * method_16211
 */
fun <R>TaskExecutor<R>.createTask(arg0: Runnable) where R: Runnable = this.method_16211(arg0)
/**
 * method_63603
 */
fun <R, Source>TaskExecutor<R>.executeAsync(arg0: Consumer<CompletableFuture<Source>>) where R: Runnable = this.method_63603<Source>(arg0)
/**
 * method_16898
 */
fun <R>TaskExecutor<R>.getName() where R: Runnable = this.method_16898()
