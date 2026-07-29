package me.hellrevenger.jsmacroskotlinscript.script.library.api

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * @param threads default 4
 */
@OptIn(DelicateCoroutinesApi::class)
fun createCoroutine(threads: Int = 4, name: String = "coroutine context") =
    CoroutineScope(newFixedThreadPoolContext(threads, name))

@OptIn(DelicateCoroutinesApi::class, ExperimentalCoroutinesApi::class)
fun createSimpleCoroutine(name: String = "coroutine context") =
    CoroutineScope(newSingleThreadContext(name))

val defaultCoroutine by lazy { CoroutineScope(Dispatchers.Default) }
val ioCoroutine by lazy { CoroutineScope(Dispatchers.IO) }

/**
 * example:
 * ```
 * wrapTask {
 *     Client.waitTick()
 * }
 * ```
 */
suspend fun <T> wrapTask(callback: () -> T) = suspendCancellableCoroutine { continuation ->
    continuation.resume(callback())
}