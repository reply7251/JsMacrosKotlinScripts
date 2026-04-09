@file:Suppress("UNCHECKED_CAST", "DEPRECATION")

package me.hellrevenger

import java.lang.invoke.MethodType
import java.lang.reflect.Field
import java.lang.reflect.Method


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
