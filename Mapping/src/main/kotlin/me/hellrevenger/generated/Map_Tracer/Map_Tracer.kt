package me.hellrevenger.generated.Map_Tracer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_36349
 */
fun Tracer.traceCommandStart(depth: Int, command: String?) = this.method_36349(depth, command)
/**
 * method_36350
 */
fun Tracer.traceCommandEnd(depth: Int, command: String?, result: Int) = this.method_36350(depth, command, result)
/**
 * method_36351
 */
fun Tracer.traceFunctionCall(depth: Int, function: Identifier?, size: Int) = this.method_36351(depth, function, size)
/**
 * method_36352
 */
fun Tracer.traceError(message: String?) = this.method_36352(message)
