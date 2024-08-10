package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ThreadAllocationStatisticsSample

fun KClass<ThreadAllocationStatisticsSample>.fromEvent(arg0: RecordedEvent) = ThreadAllocationStatisticsSample.method_38057(arg0)
fun ThreadAllocationStatisticsSample.allocated() = this.comp_50()
fun ThreadAllocationStatisticsSample.threadName() = this.comp_49()
fun ThreadAllocationStatisticsSample.time() = this.comp_48()
fun KClass<ThreadAllocationStatisticsSample>.toAllocationMap(arg0: List<ThreadAllocationStatisticsSample>) = ThreadAllocationStatisticsSample.method_38055(arg0)
