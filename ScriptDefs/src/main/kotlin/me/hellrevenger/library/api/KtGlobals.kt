package me.hellrevenger.library.api

object KtGlobals {
    private val callables = hashMapOf<String, Function<*>>()
    private val variables = hashMapOf<String, Any>()

    fun addCallable(name: String, callable: Function<*>) {
        callables[name] = callable
    }

    fun <T: Function<*>> getCallable(name: String) = callables[name] as? T

    fun removeCallable(name: String) {
        callables.remove(name)
    }

    fun addVariable(name: String, value: Any) {
        variables[name] = value
    }

    fun <T> getVariable(name: String) = variables[name] as? T

    fun removeVariable(name: String) {
        variables.remove(name)
    }
}