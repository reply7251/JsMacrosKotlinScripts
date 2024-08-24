package me.hellrevenger.library.impl

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.language.BaseLanguage
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.IFWrapper
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLanguageLibrary
import kotlin.concurrent.thread
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost


@Library(value = "JavaWrapper", languages = [KotlinLanguageDefinition::class])
class FWrapper(
    context: KotlinScriptContext,
    language: Class<out BaseLanguage<BasicJvmScriptingHost, KotlinScriptContext>>
) : PerExecLanguageLibrary<BasicJvmScriptingHost, KotlinScriptContext>(context, language),
    IFWrapper<Function<*>> {
    override fun <A, B, R> methodToJava(p0: Function<*>): MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, true, p0)
    }

    override fun <A, B, R> methodToJavaAsync(p0: Function<*>): MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, false, p0)
    }

    fun <A, B, R> methodToJava(p0: () -> R) : MethodWrapper<A, B, R, *>{
        return KotlinMethodWrapper(ctx, true, p0)
    }

    fun <A, B, R> methodToJavaAsync(p0: () -> R) : MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, false, p0)
    }

    fun <A, B, R> methodToJava(p0: (A) -> R) : MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, true, p0)
    }

    fun <A, B, R> methodToJavaAsync(p0: (A) -> R) : MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, false, p0)
    }

    fun <A, B, R> methodToJava(p0: (A,B) -> R) : MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, true, p0)
    }

    fun <A, B, R> methodToJavaAsync(p0: (A,B) -> R) : MethodWrapper<A, B, R, *> {
        return KotlinMethodWrapper(ctx, false, p0)
    }

    fun <A, B, R> m2j1(func: Function0<R>): MethodWrapper<A, B, R, *> {
        return methodToJava<A, B, R>(func as Function0<Any>)
    }

    fun <A, B, R> m2j1(func: Function1<A,R>): MethodWrapper<A, B, R, *> {
        return methodToJava<A, B, R>(func as Function1<Any, Any>)
    }

    fun <A, B, R> m2j2(func: Function2<A,B,R>): MethodWrapper<A, B, R, *> {
        return methodToJava<A, B, R>(func as Function2<Any, Any, Any>)
    }

    override fun stop() {
        ctx.closeContext()
    }
}

@Suppress("UNCHECKED_CAST")
class KotlinMethodWrapper<T, U, R>(ctx: BaseScriptContext<BasicJvmScriptingHost>, val await: Boolean = true, val callback: Function<*>) :
    MethodWrapper<T, U, R, BaseScriptContext<BasicJvmScriptingHost>>(ctx) {

    private fun callAsync(wrapped: () -> Unit){
        thread {
            ctx.bindThread(Thread.currentThread())
            try {
                wrapped()
            } catch (e: Throwable) {
                Core.getInstance().profile.logError(KotlinLanguageDefinition.KotlinRuntimeException(e, ctx.file))
            } finally {
                ctx.releaseBoundEventIfPresent(Thread.currentThread())
                ctx.unbindThread(Thread.currentThread())

                Core.getInstance().profile.joinedThreadStack.remove(Thread.currentThread())
            }
        }
    }

    private fun call(wrapped: () -> R): R {
        try {
            ctx.bindThread(Thread.currentThread())
            if (Core.getInstance().profile.checkJoinedThreadStack()) {
                Core.getInstance().profile.joinedThreadStack.add(Thread.currentThread())
            }
            return wrapped()
        } catch (e: Throwable) {
            throw KotlinLanguageDefinition.KotlinRuntimeException(e, ctx.file)
        } finally {
            ctx.releaseBoundEventIfPresent(Thread.currentThread())
            ctx.unbindThread(Thread.currentThread())
            Core.getInstance().profile.joinedThreadStack.remove(Thread.currentThread())
        }
    }

    private fun <R> call2(wrapped: () -> R): R {
        try {
            ctx.bindThread(Thread.currentThread())
            if (Core.getInstance().profile.checkJoinedThreadStack()) {
                Core.getInstance().profile.joinedThreadStack.add(Thread.currentThread())
            }
            return wrapped()
        } catch (e: Throwable) {
            throw KotlinLanguageDefinition.KotlinRuntimeException(e, ctx.file)
        } finally {
            ctx.releaseBoundEventIfPresent(Thread.currentThread())
            ctx.unbindThread(Thread.currentThread())
            Core.getInstance().profile.joinedThreadStack.remove(Thread.currentThread())
        }
    }

    override fun accept(p0: T) {
        if (await) {
            apply(p0)
            return
        }

        callAsync {
            (callback as (T) -> Unit)(p0)
        }
    }

    override fun accept(p0: T, p1: U) {
        if (await) {
            apply(p0, p1)
            return
        }

        callAsync {
            (callback as (T, U) -> Unit)(p0, p1)
        }
    }

    override fun apply(p0: T): R {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as (T) -> R)(p0)
        }

        return call {
            (callback as (T) -> R)(p0)
        }
    }

    override fun apply(p0: T, p1: U): R {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as (T) -> R)(p0)
        }

        return call {
            (callback as (T, U) -> R)(p0, p1)
        }
    }

    override fun test(p0: T): Boolean {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as (T) -> Boolean)(p0)
        }

        return call2 {
            (callback as (T) -> Boolean)(p0)
        }
    }

    override fun test(p0: T, p1: U): Boolean {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as (T, U) -> Boolean)(p0, p1)
        }

        return call2 {
            (callback as (T, U) -> Boolean)(p0, p1)
        }
    }

    override fun run() {
        if (await) {
            get()
            return
        }

        callAsync {
            (callback as () -> Unit)()
        }
    }

    override fun get(): R {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as () -> R)()
        }

        return call {
            (callback as () -> R)()
        }
    }

    override fun compare(o1: T, o2: T): Int {
        if (ctx.boundThreads.contains(Thread.currentThread())) {
            return (callback as (T,  T) -> Int)(o1, o2)
        }

        return call2 {
            (callback as (T, T) -> Int)(o1, o2)
        }
    }

}