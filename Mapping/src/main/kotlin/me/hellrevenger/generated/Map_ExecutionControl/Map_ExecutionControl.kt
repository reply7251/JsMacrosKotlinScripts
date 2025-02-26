package me.hellrevenger.generated.Map_ExecutionControl
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_54404
 */
fun <T>ExecutionControl<T>.getTracer() = this.method_54404()
/**
 * method_54892
 */
fun <T>KClass<ExecutionControl<T>>.of(arg0: CommandExecutionContext<T>, arg1: Frame) where T: AbstractServerCommandSource<T> = ExecutionControl.method_54892<T>(arg0, arg1)
/**
 * method_54893
 */
fun <T>ExecutionControl<T>.getFrame() = this.method_54893()
/**
 * method_54402
 */
fun <T>ExecutionControl<T>.enqueueAction(arg0: CommandAction<T>) = this.method_54402(arg0)
/**
 * method_54403
 */
fun <T>ExecutionControl<T>.setTracer(arg0: Tracer) = this.method_54403(arg0)
