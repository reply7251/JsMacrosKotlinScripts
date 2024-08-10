package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StateManager

fun <O, S>StateManager<O, S>.getProperty(arg0: String) where S: State<O, S> = this.method_11663(arg0)
fun <T, O, S>KClass<StateManager<O, S>>.addFieldToMapCodec(arg0: MapCodec<S>, arg1: Supplier<S>, arg2: String, arg3: property_Property<T>) where T: Comparable<T>, S: State<O, S> = StateManager.method_30040<S, T>(arg0, arg1, arg2, arg3)
fun <O, S>StateManager<O, S>.getDefaultState() where S: State<O, S> = this.method_11664()
