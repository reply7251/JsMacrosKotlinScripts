package me.hellrevenger.generated.Map_StateManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_11663
 */
fun <O, S>StateManager<O, S>.getProperty(arg0: String) where S: State<O, S> = this.method_11663(arg0)
/**
 * method_30040
 */
fun <O, S, T>KClass<StateManager<O, S>>.addFieldToMapCodec(arg0: MapCodec<S>, arg1: Supplier<S>, arg2: String, arg3: property_Property<T>) where S: State<O, S>, T: Comparable<T> = StateManager.method_30040<S, T>(arg0, arg1, arg2, arg3)
/**
 * method_11660
 */
fun <O, S>StateManager<O, S>.getOwner() where S: State<O, S> = this.method_11660()
/**
 * method_11659
 */
fun <O, S>StateManager<O, S>.getProperties() where S: State<O, S> = this.method_11659()
/**
 * method_11662
 */
fun <O, S>StateManager<O, S>.getStates() where S: State<O, S> = this.method_11662()
/**
 * method_11664
 */
fun <O, S>StateManager<O, S>.getDefaultState() where S: State<O, S> = this.method_11664()
