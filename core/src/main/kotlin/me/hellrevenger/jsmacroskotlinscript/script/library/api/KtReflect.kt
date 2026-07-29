@file:Suppress("UNCHECKED_CAST", "DEPRECATION", "UNUSED")

package me.hellrevenger.jsmacroskotlinscript.script.library.api

import net.bytebuddy.ByteBuddy
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.description.modifier.Visibility
import net.bytebuddy.dynamic.TypeResolutionStrategy
import net.bytebuddy.implementation.FieldAccessor
import net.bytebuddy.implementation.InvocationHandlerAdapter
import net.lenni0451.classtransform.utils.tree.BasicClassProvider
import org.jetbrains.kotlin.descriptors.runtime.structure.wrapperByPrimitive
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Member
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


fun Member.isStatic() = Modifier.isStatic(modifiers)

fun findField(clazz: Class<*>, name: String): Field {
    try {
        return clazz.getDeclaredField(name)
    } catch (e: NoSuchFieldException) {
        if(!clazz.superclass.equals(Any::class.java)) {
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
    val method = methods.find { method ->
        method.parameterTypes.withIndex().all {
            wrapType(it.value).isAssignableFrom(wrapType(args[it.index]))
        }
    }
    if(method != null) {
        return method
    }
    if (clazz.superclass != Any::class.java) {
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
            moduleField = Any::class.java.module
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

private fun Any._setUnsafeValue(name: String, value: Any, static: Boolean = false) =
    this._setUnsafeValue(findField(this::class.java, name), value, static)

private fun Any._setUnsafeValue(field: Field, value: Any, static: Boolean = false) {
    if (field.isStatic()) {
        val varHandle = MethodHandleHelper.getMethodHandle(field.declaringClass)
            .findStaticVarHandle(field.declaringClass, field.name, field.type)
        varHandle.set(null, value)
    } else {
        val varHandle = MethodHandleHelper.getMethodHandle(field.declaringClass)
            .findVarHandle(field.declaringClass, field.name, field.type)
        varHandle.set(this, value)
    }
}

fun <T: Any> Any._getUnsafeField(name: String): KMutableProperty0<T?> {
    return this._getUnsafeField(findField(this::class.java, name))
}

private fun <T> Any._getUnsafeField(field: Field): KMutableProperty0<T> {
    val varHandle = if (field.isStatic()) {
        MethodHandleHelper.getMethodHandle(field.declaringClass)
            .findStaticVarHandle(field.declaringClass, field.name, field.type)
    } else {
        MethodHandleHelper.getMethodHandle(field.declaringClass)
            .findVarHandle(field.declaringClass, field.name, field.type)
    }

    val base = if (field.isStatic()) {
        null
    } else {
        this
    }

    val fake = object {
        var fakeField: T
            get() = varHandle.get(base) as T
            set(value) = varHandle.set(base, value)
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


class Reflect(val instance: Any?, val type: Class<*>? = null) {
    constructor(instance: Any?): this(instance, instance?.javaClass)

    fun instance() = instance ?: throw NullPointerException("instance is null")
    fun get() = instance()
    fun type() = type ?: throw NullPointerException("type is null")

    fun get(fieldName: String) = try {
        Reflect(instance()._getPrivateValue(fieldName))
    } catch (e: Throwable) {
        try {
            invoke("get${fieldName.replaceFirstChar { it.uppercase() }}")
        } catch (_: Throwable) {
            throw e
        }
    }
    fun <T> get(fieldName: String): T = get(fieldName).instance as T
    fun set(fieldName: String, value: Any): Reflect {
        try {
            instance()._setPrivateValue(fieldName, value)
        } catch (e: Throwable) {
            try {
                invoke("set${fieldName.replaceFirstChar { it.uppercase() }}", value)
            } catch (_: Throwable) {
                throw e
            }
        }
        return this
    }
    fun exactMethod(name: String, types: Array<Class<*>?>): Method {
        var clazz = type()
        try {
            return clazz.getMethod(name, *types)
        } catch (e: NoSuchMethodException) {
            while (clazz.superclass != Any::class.java) {
                try {
                    return clazz.getDeclaredMethod(name, *types)
                } catch (_: NoSuchMethodException) { }
                clazz = clazz.getSuperclass()
            }

            throw NoSuchMethodException("unable to find $name in $clazz with parameter types: [${types.joinToString()}]")
        }
    }
    fun similarMethod(name: String, types: Array<Class<*>?>): Method {
        var clazz = type()

        for (method in clazz.methods) {
            if(isSimilarSignature(method, name, types)) return method
        }
        while (clazz.superclass != Any::class.java) {
            for (method in clazz.declaredMethods) {
                if(isSimilarSignature(method, name, types)) return method
            }
            clazz = clazz.getSuperclass()
        }
        throw NoSuchMethodException("unable to find $name in $clazz with parameter types: [${types.joinToString()}]")
    }
    fun isSimilarSignature(method: Method, name: String, types: Array<Class<*>?>) =
        method.name == name && match(method.parameterTypes, types)
    fun match(existTypes: Array<Class<*>>, types: Array<Class<*>?>): Boolean {
        if(existTypes.size != types.size) return false
        for(i in existTypes.indices) {
            if(types[i] == null) continue
            if(wrapper(existTypes[i])!!.isAssignableFrom(wrapper(types[i])!!)) continue
            return false
        }
        return true
    }

    fun invoke(method: String, vararg args: Any?): Reflect {
        val method0 = try {
            exactMethod(method, args.map { it?.javaClass }.toTypedArray())
        } catch (_: NoSuchMethodException) {
            similarMethod(method, args.map { it?.javaClass }.toTypedArray())
        }

        val instance = if(method0.isStatic()) null else instance
        return if(method0.trySetAccessible()) {
            Reflect(method0.invoke(instance, *args))
        } else {
            Reflect(
                MethodHandleHelper.getMethodHandle(method0.declaringClass)
                    .unreflect(method0).invokeWithArguments(instance, *args)
            )
        }
    }

    fun <T> call(method: String, vararg args: Any?): T = invoke(method, *args).instance as T

    fun wrapper(type: Class<*>?): Class<*>? {
        return type?.wrapperByPrimitive
    }
}

fun Any._reflect() = this as? Reflect ?: Reflect(this)
fun KClass<*>._reflect() = Reflect(null, this.java)
fun Class<*>.getReflect() = Reflect(null, this)