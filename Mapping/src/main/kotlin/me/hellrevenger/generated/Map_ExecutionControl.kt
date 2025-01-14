package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ExecutionControl

fun <T>ExecutionControl<T>.getTracer() = this.method_54404()
fun <T>KClass<ExecutionControl<T>>.of(arg0: CommandExecutionContext<T>, arg1: Frame) where T: AbstractServerCommandSource<T> = ExecutionControl.method_54892<T>(arg0, arg1)
fun <T>ExecutionControl<T>.getFrame() = this.method_54893()
fun <T>ExecutionControl<T>.enqueueAction(arg0: CommandAction<T>) = this.method_54402(arg0)
fun <T>ExecutionControl<T>.setTracer(arg0: Tracer) = this.method_54403(arg0)
