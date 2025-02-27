package me.hellrevenger.library.api

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.Event
import xyz.wagyourtail.jsmacros.core.event.IEventListener
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

@Library(value = "EventListener", languages = [KotlinLanguageDefinition::class])
class FEventListener(val context: BaseScriptContext<*>) : PerExecLibrary(context) {
    operator fun <T: BaseEvent> invoke(eventClass: Class<T>, callback: (T) -> Unit, joined: Boolean = false)
        = Listener(context, eventClass, callback, joined)
}

class Listener<T: BaseEvent>(val context: BaseScriptContext<*>, eventClass: Class<T>, private val callback: (T) -> Unit, private val joined: Boolean) : IEventListener {
    private val eventName: String = eventClass.getAnnotation(Event::class.java).value

    init {
        Core.getInstance().eventRegistry.addListener(eventName, this)
        context.eventListeners[this] = eventName

        (context.triggeringEvent as? EventService)?.unregisterOnStop(true)
    }

    override fun joined() = joined

    @Suppress("UNCHECKED_CAST")
    override fun trigger(p0: BaseEvent): EventContainer<*> {
        try {
            if(joined) {
                callback.invoke(p0 as T)
            } else {
                thread {
                    callback.invoke(p0 as T)
                }
            }
        } catch (e: Throwable) {
            off()
            Core.getInstance().profile.logError(e)
        }
        return EventContainer(context)
    }

    override fun off() {
        Core.getInstance().eventRegistry.removeListener(eventName, this)
    }
}