package me.hellrevenger.library.impl

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import me.hellrevenger.language.impl.KotlinScriptContext
import xyz.wagyourtail.jsmacros.client.api.event.impl.*
import xyz.wagyourtail.jsmacros.client.api.event.impl.inventory.*
import xyz.wagyourtail.jsmacros.client.api.event.impl.player.*
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.*
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
    operator fun <T: BaseEvent> invoke(eventType: EventType<T>, callback: (T) -> Unit, joined: Boolean = false) =
        Listener(context, eventType.clazz.getAnnotation(Event::class.java).value, callback, joined)

    operator fun <T: BaseEvent> invoke(eventClass: Class<T>, callback: (T) -> Unit, joined: Boolean = false) =
        Listener(context, eventClass.getAnnotation(Event::class.java).value, callback, joined)

    operator fun invoke(eventName: String, callback: (EventCustom) -> Unit, joined: Boolean = false): Listener<EventCustom> {
        EventCustom(context.runner, eventName).registerEvent()
        return Listener(context, eventName, callback, joined)
    }
}

sealed class EventType<T>(val clazz: Class<T>) {
    data object AirChange : EventType<EventAirChange>(EventAirChange::class.java)
    data object ArmorChange: EventType<EventArmorChange>(EventArmorChange::class.java)
    data object AttackBlock: EventType<EventAttackBlock>(EventAttackBlock::class.java)
    data object AttackEntity: EventType<EventAttackEntity>(EventAttackEntity::class.java)
    data object BlockUpdate: EventType<EventBlockUpdate>(EventBlockUpdate::class.java)
    data object Bossbar: EventType<EventBossbar>(EventBossbar::class.java)
    data object ChunkLoad: EventType<EventChunkLoad>(EventChunkLoad::class.java)
    data object ChunkUnload: EventType<EventChunkUnload>(EventChunkUnload::class.java)
    data object ContainerUpdate: EventType<EventContainerUpdate>(EventContainerUpdate::class.java)
    data object ClickSlot: EventType<EventClickSlot>(EventClickSlot::class.java)
    data object Damage: EventType<EventDamage>(EventDamage::class.java)
    data object Heal: EventType<EventHeal>(EventHeal::class.java)
    data object Death: EventType<EventDeath>(EventDeath::class.java)
    data object DimensionChange: EventType<EventDimensionChange>(EventDimensionChange::class.java)
    data object Disconnect: EventType<EventDisconnect>(EventDisconnect::class.java)
    data object DropSlot: EventType<EventDropSlot>(EventDropSlot::class.java)
    data object EntityDamaged: EventType<EventEntityDamaged>(EventEntityDamaged::class.java)
    data object EntityHealed: EventType<EventEntityHealed>(EventEntityHealed::class.java)
    data object EntityLoad: EventType<EventEntityLoad>(EventEntityLoad::class.java)
    data object EntityUnload: EventType<EventEntityUnload>(EventEntityUnload::class.java)
    data object EXPChange: EventType<EventEXPChange>(EventEXPChange::class.java)
    data object FallFlying: EventType<EventFallFlying>(EventFallFlying::class.java)
    data object HealthChange: EventType<EventHealthChange>(EventHealthChange::class.java)
    data object HeldItemChange: EventType<EventHeldItemChange>(EventHeldItemChange::class.java)
    data object HungerChange: EventType<EventHungerChange>(EventHungerChange::class.java)
    data object InteractBlock: EventType<EventInteractBlock>(EventInteractBlock::class.java)
    data object InteractEntity: EventType<EventInteractEntity>(EventInteractEntity::class.java)
    data object ItemDamage: EventType<EventItemDamage>(EventItemDamage::class.java)
    data object ItemPickup: EventType<EventItemPickup>(EventItemPickup::class.java)
    data object RecvPacket: EventType<EventRecvPacket>(EventRecvPacket::class.java)
    data object SendPacket: EventType<EventSendPacket>(EventSendPacket::class.java)
    data object JoinServer: EventType<EventJoinServer>(EventJoinServer::class.java)
    data object Key: EventType<EventKey>(EventKey::class.java)
    data object LaunchGame: EventType<EventLaunchGame>(EventLaunchGame::class.java)
    data object MouseScroll: EventType<EventMouseScroll>(EventMouseScroll::class.java)
    data object NameChange: EventType<EventNameChange>(EventNameChange::class.java)
    data object OpenContainer: EventType<EventOpenContainer>(EventOpenContainer::class.java)
    data object OpenScreen: EventType<EventOpenScreen>(EventOpenScreen::class.java)
    data object PlayerJoin: EventType<EventPlayerJoin>(EventPlayerJoin::class.java)
    data object PlayerLeave: EventType<EventPlayerLeave>(EventPlayerLeave::class.java)
    data object QuitGame: EventType<EventQuitGame>(EventQuitGame::class.java)
    data object RecvMessage: EventType<EventRecvMessage>(EventRecvMessage::class.java)
    data object Riding: EventType<EventRiding>(EventRiding::class.java)
    data object ResourcePackLoaded: EventType<EventResourcePackLoaded>(EventResourcePackLoaded::class.java)
    data object SendMessage: EventType<EventSendMessage>(EventSendMessage::class.java)
    data object SignEdit: EventType<EventSignEdit>(EventSignEdit::class.java)
    data object SlotUpdate: EventType<EventSlotUpdate>(EventSlotUpdate::class.java)
    data object Sound: EventType<EventSound>(EventSound::class.java)
    data object StatusEffectUpdate: EventType<EventStatusEffectUpdate>(EventStatusEffectUpdate::class.java)
    data object Tick: EventType<EventTick>(EventTick::class.java)
    data object Title: EventType<EventTitle>(EventTitle::class.java)
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
            val call = {
                callback.invoke(p0 as T)
                ctx.ctx.closeContext()
                ctx.releaseLock()
            }
            if(joined) {
                call()
            } else {
                thread {
                    call()
                }
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
