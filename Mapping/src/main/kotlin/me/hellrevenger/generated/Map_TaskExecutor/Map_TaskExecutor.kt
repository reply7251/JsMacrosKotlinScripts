package me.hellrevenger.generated.Map_TaskExecutor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_63588
 */
fun <R>TaskExecutor<R>.send(runnable: R) where R: Runnable = this.method_63588(runnable)
/**
 * method_16211
 */
fun <R>TaskExecutor<R>.createTask(runnable: Runnable) where R: Runnable = this.method_16211(runnable)
/**
 * method_63603
 */
fun <R, Source>TaskExecutor<R>.executeAsync(future: Consumer<CompletableFuture<Source>>) where R: Runnable = this.method_63603<Source>(future)
/**
 * method_16898
 */
fun <R>TaskExecutor<R>.getName() where R: Runnable = this.method_16898()
