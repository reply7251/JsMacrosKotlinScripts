package me.hellrevenger.generated.Map_State
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_31386
 */
val <O, S>KClass<State<O, S>>.PROPERTIES by aliasStatic({State.field_31386})
/**
 * field_31385
 */
val <O, S>KClass<State<O, S>>.NAME by aliasStatic({State.field_31385})
/**
 * method_28498
 */
fun <O, S, T>State<O, S>.contains(arg0: property_Property<T>) where T: Comparable<T> = this.method_28498<T>(arg0)
/**
 * method_11656
 */
fun <O, S>State<O, S>.getEntries() = this.method_11656()
/**
 * method_28500
 */
fun <O, S, T>State<O, S>.getOrEmpty(arg0: property_Property<T>) where T: Comparable<T> = this.method_28500<T>(arg0)
/**
 * method_28501
 */
fun <O, S>State<O, S>.getProperties() = this.method_28501()
/**
 * method_11657
 */
fun <O, S, T, V>State<O, S>.with(arg0: property_Property<T>, arg1: V) where T: Comparable<T>, V: T = this.method_11657<T, V>(arg0, arg1)
/**
 * method_28496
 */
fun <O, S>State<O, S>.createWithTable(arg0: Map<Map<property_Property<*>, Comparable<*>>, S>) = this.method_28496(arg0)
/**
 * method_11654
 */
fun <O, S, T>State<O, S>.get(arg0: property_Property<T>) where T: Comparable<T> = this.method_11654<T>(arg0)
/**
 * method_28493
 */
fun <O, S, T>State<O, S>.cycle(arg0: property_Property<T>) where T: Comparable<T> = this.method_28493<T>(arg0)
/**
 * method_47968
 */
fun <O, S, T, V>State<O, S>.withIfExists(arg0: property_Property<T>, arg1: V) where T: Comparable<T>, V: T = this.method_47968<T, V>(arg0, arg1)
