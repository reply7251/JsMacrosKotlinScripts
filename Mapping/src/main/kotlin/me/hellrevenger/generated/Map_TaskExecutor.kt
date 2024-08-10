package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TaskExecutor

fun <T>TaskExecutor<T>.getQueueSize() = this.method_34996()
fun <T>TaskExecutor<T>.hasQueuedTasks() = this.method_40001()
fun <T>TaskExecutor<T>.awaitAll() = this.method_37477()
fun <T>KClass<TaskExecutor<T>>.create(arg0: Executor, arg1: String) = TaskExecutor.method_16902(arg0, arg1)
