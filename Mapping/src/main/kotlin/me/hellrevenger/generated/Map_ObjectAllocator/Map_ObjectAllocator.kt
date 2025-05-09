package me.hellrevenger.generated.Map_ObjectAllocator
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61948
 */
fun <T>ObjectAllocator.acquire(factory: ClosableFactory<T>) = this.method_61948<T>(factory)
/**
 * method_61949
 */
fun <T>ObjectAllocator.release(factory: ClosableFactory<T>, value: T) = this.method_61949<T>(factory, value)
