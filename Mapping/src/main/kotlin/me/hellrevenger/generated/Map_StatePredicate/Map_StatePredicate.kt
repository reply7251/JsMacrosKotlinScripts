package me.hellrevenger.generated.Map_StatePredicate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_22518
 */
fun StatePredicate.test(state: FluidState?) = this.method_22518(state)
/**
 * comp_1830
 */
fun StatePredicate.conditions() = this.comp_1830()
/**
 * method_53235
 */
fun StatePredicate.findMissing(stateManager: StateManager<*, *>?) = this.method_53235(stateManager)
/**
 * method_22515
 */
fun <S>StatePredicate.test(stateManager: StateManager<*, S>?, container: S) where S: State<*, S> = this.method_22515<S>(stateManager, container)
/**
 * method_22514
 */
fun StatePredicate.test(state: BlockState?) = this.method_22514(state)
