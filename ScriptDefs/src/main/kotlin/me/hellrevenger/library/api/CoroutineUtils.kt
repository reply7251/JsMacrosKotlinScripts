package me.hellrevenger.library.api

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.newFixedThreadPoolContext
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume

/**
 * @param threads default 4
 */
@OptIn(DelicateCoroutinesApi::class)
fun createCoroutine(threads: Int = 4, name: String = "coroutine context") =
    CoroutineScope(newFixedThreadPoolContext(threads, name))

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