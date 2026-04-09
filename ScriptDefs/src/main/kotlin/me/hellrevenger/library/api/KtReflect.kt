@file:Suppress("UNCHECKED_CAST", "DEPRECATION")

package me.hellrevenger.library.api

import net.bytebuddy.ByteBuddy
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.description.modifier.Visibility
import net.bytebuddy.dynamic.TypeResolutionStrategy
import net.bytebuddy.implementation.FieldAccessor
import net.bytebuddy.implementation.InvocationHandlerAdapter
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
import sun.misc.Unsafe
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty0

fun Class<*>.getBytes(): ByteArray {
    return BasicClassProvider(this.classLoader).getClass(this.name)
}

fun forceLoadTo(name: String, bytes: ByteArray, classLoader: ClassLoader) {
    classLoader._invokePrivate<Class<*>>("defineClass", arrayOf(
        name,
        bytes,
        0,
        bytes.size
    ))
}

fun Class<*>.forceLoadTo(classLoader: ClassLoader) {
    val bytes = this.getBytes()
    forceLoadTo(this.name, bytes, classLoader)
}

fun findField(clazz: Class<*>, name: String): Field {
    try {
        return clazz.getDeclaredField(name)
    } catch (e: NoSuchFieldException) {
        if(!clazz.superclass.equals(Object::class.java)) {
            try {
                return findField(clazz.superclass, name)
            } catch (_: NoSuchFieldException) {}
        }
        throw e
    }
}

fun <T : Any> Any._getField(name: String): KMutableProperty0<T?> {
    val f = findField(this::class.java, name)
    if(f.trySetAccessible()) {
        val out = this
        val fake = object {
            var fakeField: T?
                get() = f.get(out) as? T
                set(value) = f.set(out, value)
        }
        return fake::fakeField
    } else {
        return this._getUnsafeField(f)
    }
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

fun wrapType(clazz: Class<*>) =
    if(clazz.isPrimitive)
        MethodType.methodType(clazz).wrap().returnType()
    else clazz

fun findMethod(clazz: Class<*>, name: String, args: List<Class<*>>): Method {
    val methods = clazz.declaredMethods.filter { it.name == name && it.parameterCount == args.size }
    val method = methods.find {  method ->
        method.parameterTypes.withIndex().all {
            //println("comparing ${wrapType(it.value)} vs ${wrapType(args[it.index])} => ${wrapType(it.value).isAssignableFrom(wrapType(args[it.index]))}")

            wrapType(it.value).isAssignableFrom(wrapType(args[it.index]))
        }
    }
    if(method != null) {
        return method
    }
    if (clazz.superclass != Object::class.java) {
        try {
            return findMethod(clazz.superclass, name, args)
        } catch (_: NoSuchFieldException) {}
    }
    throw NoSuchFieldException("unable to find $name in $clazz with parameter types: [${args.joinToString()}]")
}

fun Any._getPrivateMethod(name: String, args: List<Class<*>>, static: Boolean = false): Method {
    val clazz =
        if(static) (this as? Class<*>)?: this::class.java
        else this::class.java
    return findMethod(clazz, name, args)
}

object MethodHandleHelper {
    fun getMethodHandle(targetClass: Class<*>): MethodHandles.Lookup {
        try {
            return MethodHandles.privateLookupIn(targetClass, MethodHandles.lookup())
        } catch (e: IllegalAccessException) {
            val module = this::class.java.module
            var moduleField by this::class.java._getField<Module>("module")
            moduleField = Object::class.java.module
            val result = MethodHandles.privateLookupIn(targetClass, MethodHandles.lookup())
            moduleField = module
            return result
        }
    }
}

fun <T : Any> Any._invokePrivate(method: Method, args: Array<Any>): T? {
    val instance = if(Modifier.isStatic(method.modifiers)) null else this
    return if(method.trySetAccessible()) {
        method.invoke(instance, *args) as? T
    } else {
        MethodHandleHelper.getMethodHandle(method.declaringClass)
            .unreflect(method).invokeWithArguments(instance, *args) as? T
    }
}

fun <T : Any> Any._invokePrivate(name: String, args: Array<Any>, static: Boolean = false): T? {
    return this._invokePrivate(
        if (static)
            this._getPrivateMethod(name, args.map { it::class.java })
        else this._getPrivateMethod(name, args.map { it::class.java }), args)
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

fun <T: Any> Any._getUnsafeField(name: String): KMutableProperty0<T?> {
    return this._getUnsafeField(findField(this::class.java, name))
}

private fun <T: Any> Any._getUnsafeField(field: Field): KMutableProperty0<T?> {
    val static = Modifier.isStatic(field.modifiers)
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

fun <T : Any> Any._wrapProxy(clazz: KClass<T>) = wrapProxy(clazz.java, this)
fun <T> Any._wrapProxy(clazz: Class<T>) = wrapProxy(clazz, this)

const val handlerName = "handler$"

private fun <T> wrapProxy(clazz: Class<T>, delegate: Any): T {
    return ByteBuddy().subclass(clazz)
        .defineField(handlerName, InvocationHandler::class.java, Visibility.PUBLIC)
        .implement(InvocationHandlerSetter::class.java)
        .intercept(FieldAccessor.ofField(handlerName))
        .method { method0 ->
            delegate.javaClass.declaredMethods.any { method1 ->
                MethodDescription.ForLoadedMethod(method1).asSignatureToken().equals(method0.asSignatureToken())
            }
        }.intercept(InvocationHandlerAdapter.toField(handlerName))
        .make(TypeResolutionStrategy.Lazy.INSTANCE).load(clazz.classLoader).loaded.newInstance().apply {
            (this as InvocationHandlerSetter).setHandler(MyInvocationHandler(delegate))
            this::class.java.declaredFields.forEach { field ->
                try {
                    val value = delegate._getPrivateValue<Any>(field.name)
                    value?.let {
                        this._setPrivateValue(field.name, it)
                    }
                }catch (e:Exception){}
            }
        } as T
}

class MyInvocationHandler(val delegate: Any) : InvocationHandler {
    val map = mutableMapOf<Method, Method>()
    override fun invoke(proxy: Any, method: Method, args: Array<Any>?): Any? {
        val m = map[method] ?: delegate.javaClass.methods.find {
            MethodDescription.ForLoadedMethod(it).asSignatureToken() == MethodDescription.ForLoadedMethod(method).asSignatureToken()
        }?.apply {
            map[method] = this
        } ?: return null
        args?.let {
            return m.invoke(delegate, *args)
        }
        return m.invoke(delegate)
    }
}

interface InvocationHandlerSetter {
    fun getHandler(): InvocationHandler
    fun setHandler(handler: InvocationHandler)
}