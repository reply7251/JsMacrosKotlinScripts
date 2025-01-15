package me.hellrevenger.generated.Map_StatePredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun StatePredicate.test(arg0: FluidState) = this.method_22518(arg0)
fun StatePredicate.conditions() = this.comp_1830()
fun StatePredicate.findMissing(arg0: StateManager<*, *>) = this.method_53235(arg0)
fun <S>StatePredicate.test(arg0: StateManager<*, S>, arg1: S) where S: State<*, S> = this.method_22515<S>(arg0, arg1)
fun StatePredicate.test(arg0: BlockState) = this.method_22514(arg0)
