package me.hellrevenger.jsmacroskotlinscript.script.language

import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.BaseLibrary
import xyz.wagyourtail.jsmacros.core.library.PerExecLanguageLibrary
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import xyz.wagyourtail.jsmacros.core.service.ServiceManager
import java.io.File
import kotlin.reflect.KClass
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

interface IClosableContext {
    fun onContextClosed(callback: (IClosableContext) -> Unit): (IClosableContext) -> Unit

    fun cancelContextClosed(callback: (IClosableContext) -> Unit)
}

class KotlinScriptContext(runner: Core<*, *>?, event: BaseEvent?, file: File?) : BaseScriptContext<BasicJvmScriptingHost>(runner, event, file), IClosableContext {
    private val onContextClosedCallbacks = mutableSetOf<(KotlinScriptContext) -> Unit>()
    val contextLibraries = mutableMapOf<KClass<*>, Any>()

    var keepAliveSet = false

    override fun isMultiThreaded(): Boolean = true

    override fun onContextClosed(callback: (IClosableContext) -> Unit): (IClosableContext) -> Unit {
        onContextClosedCallbacks.add(callback)
        if(!keepAliveSet) {
            keepAliveSet = true
            ServiceManager.setAutoUnregisterKeepAlive(this, true)
        }
        return callback
    }

    override fun cancelContextClosed(callback: (IClosableContext) -> Unit) {
        onContextClosedCallbacks.remove(callback)
    }

    fun waitUntil(interval: Long = 50L, pred: () -> Boolean) {
        var terminated = false
        val callback = onContextClosed { terminated = true }
        try {
            while (!terminated && !pred()) {
                Thread.sleep(interval)
            }
        } finally {
            cancelContextClosed(callback)
        }
    }

    override fun doSubclassClose() {
        onContextClosedCallbacks.forEach {
            it(this)
        }
        ServiceManager.setAutoUnregisterKeepAlive(this, false)
    }

    override fun shouldKeepAlive(): Boolean {
        return super.shouldKeepAlive() || onContextClosedCallbacks.isNotEmpty()
    }

    fun addLibraries(libraries: Collection<BaseLibrary>) {
        libraries.forEach {
            if (it is PerExecLibrary || it is PerExecLanguageLibrary<*, *>) {
                contextLibraries[it::class] = it
            }
        }
    }

    inline fun <reified T> getLibrary() = contextLibraries[T::class] as T
}
