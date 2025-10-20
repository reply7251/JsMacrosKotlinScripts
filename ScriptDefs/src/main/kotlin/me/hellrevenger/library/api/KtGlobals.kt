package me.hellrevenger.library.api

import kotlin.reflect.KClass

object KtGlobals {
    private val callables = hashMapOf<String, Function<*>>()
    private val variables = hashMapOf<String, Any>()

    fun addCallable(name: String, callable: Function<*>) {
        callables[name] = callable
    }

    @Suppress("UNCHECKED_CAST")
    fun <T: Function<*>> getCallable(name: String) = callables[name] as? T

    fun removeCallable(name: String) {
        callables.remove(name)
    }

    fun addVariable(name: String, value: Any) {
        variables[name] = value
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> getVariable(name: String) = variables[name] as? T

    fun <T> getWrappedVariable(name: String, type: Class<T>) = variables[name]?._wrapProxy(type)
    fun <T : Any> getWrappedVariable(name: String, type: KClass<T>) = variables[name]?._wrapProxy(type)

    fun removeVariable(name: String) {
        variables.remove(name)
    }
}