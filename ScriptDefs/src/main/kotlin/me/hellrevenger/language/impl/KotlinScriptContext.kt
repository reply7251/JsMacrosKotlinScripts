package me.hellrevenger.language.impl

import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.service.ServiceManager
import java.io.File
import kotlin.script.experimental.jvmhost.BasicJvmScriptingHost

interface IClosableContext {
    fun onContextClosed(callback: (IClosableContext) -> Unit)
}

class KotlinScriptContext(runner: Core<*, *>?, event: BaseEvent?, file: File?) : BaseScriptContext<BasicJvmScriptingHost>(runner, event, file), IClosableContext {
    private val onContextClosedCallbacks = mutableSetOf<(KotlinScriptContext) -> Unit>()

    var keepAliveSet = false

    override fun isMultiThreaded(): Boolean = true

    override fun onContextClosed(callback: (IClosableContext) -> Unit) {
        onContextClosedCallbacks.add(callback)
        if(!keepAliveSet) {
            keepAliveSet = true
            ServiceManager.setAutoUnregisterKeepAlive(this, true)
        }
    }

    override fun closeContext() {
        super.closeContext()
        onContextClosedCallbacks.forEach {
            it(this)
        }
    }

    override fun shouldKeepAlive(): Boolean {
        return super.shouldKeepAlive() || onContextClosedCallbacks.isNotEmpty()
    }
}
