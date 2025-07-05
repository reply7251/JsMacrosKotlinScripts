@file:Suppress("UNCHECKED_CAST")

package me.hellrevenger.library.api


import sun.misc.Unsafe
import java.lang.invoke.MethodHandles
import java.lang.reflect.Field
import java.lang.reflect.Method
import kotlin.reflect.KMutableProperty0

fun findField(clazz: Class<*>, name: String): Field {
    try {
        return clazz.getDeclaredField(name)
    } catch (e: NoSuchFieldException) {
        if(!clazz.superclass.equals(Object::class.java)) {
            try {
                return findField(clazz.superclass, name)
            } catch (e: NoSuchFieldException) {}
        }
        throw e
    }
}

fun <T : Any> Any._getField(name: String): KMutableProperty0<T?> {
    val f = findField(this::class.java, name)
    f.trySetAccessible()
    val out = this
    val fake = object {
        var fakeField: T?
            get() = f.get(out) as? T
            set(value) = f.set(out, value)
    }
    return fake::fakeField
}

fun <T : Any> Any._getPrivateValue(name: String): T? {
    val field = findField(this::class.java, name)
    field.trySetAccessible()
    return field.get(this) as? T
}

fun Any._setPrivateValue(name: String, value: Any) {
    val field = findField(this::class.java, name)
    if(field.trySetAccessible()) {
        field.set(this, value)
    } else {
        this._setUnsafeValue(field, value)
    }
}

fun findMethod(clazz: Class<*>, name: String, args: List<Class<*>>): Method? {
    val methods = clazz.declaredMethods.filter { it.name == name }
    val method = if(methods.size > 1) {
        methods.find {  method ->
            method.parameterTypes.withIndex().all {
                it.value.isAssignableFrom(args[it.index])
            }
        }
    } else if (methods.size == 1) {
        methods[0]
    } else {
        null
    }
    if (method == null && clazz.superclass != Object::class.java) {
        return findMethod(clazz.superclass, name, args)
    }
    return method
}

fun Any._getPrivateMethod(name: String, args: List<Class<*>>): Method? {
    val clazz = this::class.java
    return findMethod(clazz, name, args)
}

fun <T : Any> Any._invokePrivate(name: String, args: Array<Any>, static: Boolean = false): T? {
    return this._getPrivateMethod(name, args.map { it::class.java })?.let {
        if(it.trySetAccessible()) {
            it.invoke(if(static) null else this, args) as? T
        } else {
            MethodHandles.privateLookupIn(it.declaringClass, MethodHandles.lookup())
                .unreflect(it).invokeWithArguments(args) as? T
        }
    }
}

val unsafe by lazy {
    val f = Unsafe::class.java.getDeclaredField("theUnsafe")
    f.trySetAccessible()
    f.get(null) as Unsafe
}

private fun Any._setUnsafeValue(name: String, value: Any, static: Boolean = false) =
    this._setUnsafeValue(findField(this::class.java, name), value, static)

private fun Any._setUnsafeValue(field: Field, value: Any, static: Boolean = false) {
    val (base,offset) = if(static)
        unsafe.staticFieldBase(field) to unsafe.staticFieldOffset(field)
    else this to unsafe.objectFieldOffset(field)
    unsafe.putObject(base, offset, value)
}

fun <T: Any> Any._getUnsafeField(name: String, static: Boolean = false): KMutableProperty0<T?> {
    return this._getUnsafeField(findField(this::class.java, name), static)
}

private fun <T: Any> Any._getUnsafeField(field: Field, static: Boolean = false): KMutableProperty0<T?> {
    val (base,offset) = if(static)
        unsafe.staticFieldBase(field) to unsafe.staticFieldOffset(field)
    else this to unsafe.objectFieldOffset(field)
    val fake = object {
        var fakeField: T?
            get() = unsafe.getObject(base, offset) as? T
            set(value) = unsafe.putObject(base, offset, value)
    }
    return fake::fakeField
}
