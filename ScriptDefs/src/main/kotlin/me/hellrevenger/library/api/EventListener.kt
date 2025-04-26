package me.hellrevenger.library.api

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import xyz.wagyourtail.jsmacros.core.Core
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.Event
import xyz.wagyourtail.jsmacros.core.event.IEventListener
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.language.EventContainer
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.concurrent.thread

@Library(value = "EventListener", languages = [KotlinLanguageDefinition::class])
class FEventListener(val context: BaseScriptContext<*>) : PerExecLibrary(context) {
    operator fun <T: BaseEvent> invoke(eventClass: Class<T>, callback: (T) -> Unit, joined: Boolean = false) =
        Listener(context, eventClass.getAnnotation(Event::class.java).value, callback, joined)

    operator fun invoke(eventName: String, callback: (EventCustom) -> Unit, joined: Boolean = false): Listener<EventCustom> {
        EventCustom(context.runner, eventName).registerEvent()
        return Listener(context, eventName, callback, joined)
    }
}

class Listener<T: BaseEvent>(val context: BaseScriptContext<*>, private val eventName: String, private val callback: (T) -> Unit, private val joined: Boolean) : IEventListener {
    init {
        context.runner.eventRegistry.addListener(eventName, this)
        context.eventListeners[this] = eventName

        (context.triggeringEvent as? EventService)?.unregisterOnStop(true)
    }

    override fun joined() = joined

    @Suppress("UNCHECKED_CAST")
    override fun trigger(p0: BaseEvent): EventContainer<*> {
        val ctx = EventContainer(KotlinScriptContext(context.runner, p0, context.file))
        try {
            thread {
                callback.invoke(p0 as T)
                ctx.ctx.closeContext()
                ctx.releaseLock()
            }
        } catch (e: Throwable) {
            off()
            context.runner.profile.logError(e)
        }
        return ctx
    }

    override fun off() {
        context.runner.eventRegistry.removeListener(eventName, this)
    }
}