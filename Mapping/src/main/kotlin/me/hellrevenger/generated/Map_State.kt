package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.State

val <O, S>State<O, S>.PROPERTIES by aliasStatic({State.field_31386})
val <O, S>State<O, S>.NAME by aliasStatic({State.field_31385})
fun <T, O, S>State<O, S>.contains(arg0: property_Property<T>) where T: Comparable<T> = this.method_28498<T>(arg0)
fun <O, S>State<O, S>.getEntries() = this.method_11656()
fun <T, O, S>State<O, S>.getOrEmpty(arg0: property_Property<T>) where T: Comparable<T> = this.method_28500<T>(arg0)
fun <O, S>State<O, S>.getProperties() = this.method_28501()
fun <S, T, V, O>State<O, S>.with(arg0: property_Property<T>, arg1: V) where T: Comparable<T>, V: T = this.method_11657<T, V>(arg0, arg1)
fun <O, S>State<O, S>.createWithTable(arg0: Map<Map<property_Property<*>, Comparable<*>>, S>) = this.method_28496(arg0)
fun <T, O, S>State<O, S>.get(arg0: property_Property<T>) where T: Comparable<T> = this.method_11654<T>(arg0)
fun <T, O, S>State<O, S>.cycle(arg0: property_Property<T>) where T: Comparable<T> = this.method_28493<T>(arg0)
fun <S, T, V, O>State<O, S>.withIfExists(arg0: property_Property<T>, arg1: V) where T: Comparable<T>, V: T = this.method_47968<T, V>(arg0, arg1)
