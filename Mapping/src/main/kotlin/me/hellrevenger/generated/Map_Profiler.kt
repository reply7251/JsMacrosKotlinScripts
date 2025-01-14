package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Profiler

fun Profiler.push(arg0: String) = this.method_15396(arg0)
fun Profiler.endTick() = this.method_16066()
fun Profiler.visit(arg0: String) = this.method_39278(arg0)
fun Profiler.startTick() = this.method_16065()
fun Profiler.visit(arg0: Supplier<String>, arg1: Int) = this.method_24271(arg0, arg1)
fun Profiler.markSampleType(arg0: SampleType) = this.method_37167(arg0)
fun Profiler.visit(arg0: String, arg1: Int) = this.method_24270(arg0, arg1)
fun Profiler.push(arg0: Supplier<String>) = this.method_15400(arg0)
fun Profiler.swap(arg0: Supplier<String>) = this.method_15403(arg0)
fun Profiler.swap(arg0: String) = this.method_15405(arg0)
fun Profiler.visit(arg0: Supplier<String>) = this.method_39277(arg0)
fun Profiler.pop() = this.method_15407()
fun KClass<Profiler>.union(arg0: Profiler, arg1: Profiler) = Profiler.method_24338(arg0, arg1)
