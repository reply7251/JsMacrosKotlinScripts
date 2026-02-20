package me.hellrevenger.library.api

import java.util.concurrent.locks.Condition
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock
import kotlin.reflect.KClass

object KtGlobals {
    private val callables = hashMapOf<String, Function<*>>()
    private val variables = hashMapOf<String, Any>()
    private val locks = hashMapOf<String, Condition>()
    val lock = ReentrantLock()

    fun addCallable(name: String, callable: Function<*>) {
        callables[name] = callable
    }

    @Suppress("UNCHECKED_CAST")
    fun <T: Function<*>> getCallable(name: String) = callables[name] as? T

    fun removeCallable(name: String) {
        callables.remove(name)
    }

    fun addVariable(name: String, value: Any) {
        lock.withLock {
            variables[name] = value
            lock.newCondition()
            locks[name]?.signalAll()
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun <T> getVariable(name: String) = variables[name] as? T

    fun <T> waitAndGetVariable(name: String): T {
        lock.withLock {
            getVariable<T>(name)?.let{
                return it
            }
            while (true) {
                locks.getOrPut(name) { lock.newCondition() }.await()
                getVariable<T>(name)?.let{
                    locks.remove(name)
                    return it
                }
            }
        }
    }

    fun removeVariable(name: String) {
        synchronized(locks) {
            variables.remove(name)?.also { locks.remove(name) }
        }
    }

    fun <T> waitAndGetWrappedVariable(name: String, type: Class<T>): T? {
        lock.withLock {
            if (variables.containsKey(name)) {
                return getWrappedVariable(name, type)
            }
            locks.getOrPut(name) { lock.newCondition() }.await()
            return getWrappedVariable(name, type)
        }
    }
    fun <T : Any> waitAndGetWrappedVariable(name: String, type: KClass<T>) = waitAndGetWrappedVariable(name, type.java)

    fun <T> getWrappedVariable(name: String, type: Class<T>) = variables[name]?._wrapProxy(type)
    fun <T : Any> getWrappedVariable(name: String, type: KClass<T>) = getWrappedVariable(name, type.java)
}
