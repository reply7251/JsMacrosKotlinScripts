package me.hellrevenger.generated.Map_State
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_28501
 */
fun <O, S>State<O, S>.getProperties() = this.method_28501()
/**
 * method_28496
 */
fun <O, S>State<O, S>.createWithMap(states: Map<Map<property_Property<*>, Comparable<*>>, S>) = this.method_28496(states)
/**
 * method_11654
 */
fun <O, S, T>State<O, S>.get(property: property_Property<T>) where T: Comparable<T> = this.method_11654<T>(property)
/**
 * method_61768
 */
fun <O, S, T>State<O, S>.getNullable(property: property_Property<T>) where T: Comparable<T> = this.method_61768<T>(property)
/**
 * method_28498
 */
fun <O, S, T>State<O, S>.contains(property: property_Property<T>) where T: Comparable<T> = this.method_28498<T>(property)
/**
 * method_11656
 */
fun <O, S>State<O, S>.getEntries() = this.method_11656()
/**
 * method_28500
 */
fun <O, S, T>State<O, S>.getOrEmpty(property: property_Property<T>) where T: Comparable<T> = this.method_28500<T>(property)
/**
 * method_11657
 */
fun <O, S, T, V>State<O, S>.with(property: property_Property<T>, value: V) where T: Comparable<T>, V: T = this.method_11657<T, V>(property, value)
/**
 * method_28493
 */
fun <O, S, T>State<O, S>.cycle(property: property_Property<T>) where T: Comparable<T> = this.method_28493<T>(property)
/**
 * method_61767
 */
fun <O, S, T>State<O, S>.get(property: property_Property<T>, fallback: T) where T: Comparable<T> = this.method_61767<T>(property, fallback)
/**
 * method_47968
 */
fun <O, S, T, V>State<O, S>.withIfExists(property: property_Property<T>, value: V) where T: Comparable<T>, V: T = this.method_47968<T, V>(property, value)
