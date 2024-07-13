import io.github.gaming32.jsmacros.kotlin.language.impl.KotlinScriptContext
import io.github.gaming32.jsmacros.kotlin.library.impl.FWrapper
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import xyz.wagyourtail.jsmacros.core.library.impl.classes.ClassBuilder
import xyz.wagyourtail.jsmacros.core.library.impl.classes.LibraryBuilder
import xyz.wagyourtail.jsmacros.core.service.EventService


fun <R> m2j1(func: Function0<R>): MethodWrapper<Any, Any, R, *> {
    return (JavaWrapper as FWrapper).methodToJava(func as Function0<Any>) as MethodWrapper<Any, Any, R, *>
}

fun <T, R> m2j1(func: Function1<T,R>): MethodWrapper<T, Any, R, *> {
    return (JavaWrapper as FWrapper).methodToJava(func as Function1<Any, Any>) as MethodWrapper<T, Any, R, *>
}

fun <A, B, R> m2j2(func: Function2<A,B,R>): MethodWrapper<A, B, R, *> {
    return (JavaWrapper as FWrapper).methodToJava(func as Function2<Any, Any, Any>) as MethodWrapper<A, B, R, *>
}


val wrapper = JavaWrapper.methodToJava<Any, Any, Any>(fun(){} as Function0<*>)

class Test {
    fun test() {
        Chat.log("Test.test called")
    }
}

SubLibraries.addLibrary("Test", Test::class.java, {Test()})


(event as? EventService)?.stopListener = JavaWrapper.methodToJava<Any, Any, Any>(fun(){
    SubLibraries.removeLibrary("Test")
})