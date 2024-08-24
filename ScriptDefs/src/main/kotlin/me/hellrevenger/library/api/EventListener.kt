package me.hellrevenger.library.api

import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.Event
import xyz.wagyourtail.jsmacros.core.event.IEventListener
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.service.EventService

class EventListener<T: BaseEvent>(val context: EventContainer<*>, eventClass: Class<T>, private val callback: (T) -> Unit, private val joined: Boolean = false) : IEventListener {
    private val eventName: String = eventClass.getAnnotation(Event::class.java).value

    init {
        Core.getInstance().eventRegistry.addListener(eventName, this)
        context.ctx.eventListeners[this] = eventName

        (context.ctx.triggeringEvent as? EventService)?.unregisterOnStop(true)
    }

    override fun off() {
        Core.getInstance().eventRegistry.removeListener(eventName, this)
    }

    override fun joined(): Boolean {
        return joined
    }

    override fun trigger(p0: BaseEvent): EventContainer<*> {
        try {
            callback.invoke(p0 as T)
        } catch (e: Throwable) {
            off()
            Core.getInstance().profile.logError(e)
        }
        return context
    }
}