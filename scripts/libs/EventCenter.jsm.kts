

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.fabric.api.event.Event
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.service.EventService

val events = hashMapOf<Event<*>, HashMap<BaseScriptContext<*>, Any>>()

JsMacros.createCustomEvent("RegisterKtEvent").registerEvent()
JsMacros.createCustomEvent("UnregisterKtEvent").registerEvent()

JsMacros.on("RegisterKtEvent", JavaWrapper.methodToJava(fun(e: EventCustom, _: Any){
    val eventToRegister = e.getObject("event") as Event<*>
    var listeners = events.get(eventToRegister)
    if(listeners == null) {
        listeners = hashMapOf()
        events[eventToRegister] = listeners
    }
    val ctx = e.getObject("context") as BaseScriptContext<*>
    listeners[ctx] = e.getObject("callback") as Any
} as Function2<*,*,*>))

JsMacros.on("UnregisterKtEvent", JavaWrapper.methodToJava(fun(e: EventCustom, _: Any){
    val eventToRegister = e.getObject("event") as Event<*>
    val listeners = events.get(eventToRegister) ?: return
    listeners.remove(e.getObject("context") as BaseScriptContext<*>)
} as Function2<*,*,*>))
Chat.log("EventCenter init " +Time.time() % 100+" ...")


fun <T> registerEvent(event: Event<T>, callback: T) {
    val register = JsMacros.createCustomEvent("RegisterKtEvent")
    register.putObject("event", event)
    register.putObject("callback", callback)
    register.putObject("context", context.ctx)
    register.trigger()
}

fun <T> unregisterEvent(event: Event<T>) {
    val register = JsMacros.createCustomEvent("UnregisterKtEvent")
    register.putObject("event", event)
    register.putObject("context", context.ctx)
    register.trigger()
}

(event as EventService).stopListener = JavaWrapper.methodToJava(fun(){
    events.clear()
} as Function0<*>)

ClientTickEvents.START_CLIENT_TICK.register(fun(mc){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientTickEvents.START_CLIENT_TICK) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientTickEvents.StartTick).onStartTick(mc)
    }
    unregisters.forEach {
        events.get(ClientTickEvents.START_CLIENT_TICK)?.remove(it)
    }
})

ClientTickEvents.END_CLIENT_TICK.register(fun(mc){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientTickEvents.END_CLIENT_TICK) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientTickEvents.EndTick).onEndTick(mc)
    }
    unregisters.forEach {
        events.get(ClientTickEvents.END_CLIENT_TICK)?.remove(it)
    }
})

ClientEntityEvents.ENTITY_LOAD.register(fun(entity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientEntityEvents.ENTITY_LOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientEntityEvents.Load).onLoad(entity, world)
    }
    unregisters.forEach {
        events.get(ClientEntityEvents.ENTITY_LOAD)?.remove(it)
    }
})

ClientEntityEvents.ENTITY_UNLOAD.register(fun(entity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientEntityEvents.ENTITY_UNLOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientEntityEvents.Unload).onUnload(entity, world)
    }
    unregisters.forEach {
        events.get(ClientEntityEvents.ENTITY_UNLOAD)?.remove(it)
    }
})

ClientChunkEvents.CHUNK_LOAD.register(fun(world, chunk){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientChunkEvents.CHUNK_LOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientChunkEvents.Load).onChunkLoad(world, chunk)
    }
    unregisters.forEach {
        events.get(ClientChunkEvents.CHUNK_LOAD)?.remove(it)
    }
})

ClientChunkEvents.CHUNK_UNLOAD.register(fun(world, chunk){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientChunkEvents.CHUNK_UNLOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientChunkEvents.Unload).onChunkUnload(world, chunk)
    }
    unregisters.forEach {
        events.get(ClientChunkEvents.CHUNK_UNLOAD)?.remove(it)
    }
})

ClientBlockEntityEvents.BLOCK_ENTITY_LOAD.register(fun(blockEntity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientBlockEntityEvents.BLOCK_ENTITY_LOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientBlockEntityEvents.Load).onLoad(blockEntity, world)
    }
    unregisters.forEach {
        events.get(ClientBlockEntityEvents.BLOCK_ENTITY_LOAD)?.remove(it)
    }
})

ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.register(fun(blockEntity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientBlockEntityEvents.Unload).onUnload(blockEntity, world)
    }
    unregisters.forEach {
        events.get(ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD)?.remove(it)
    }
})

ItemTooltipCallback.EVENT.register(fun(stack, context, type, lines) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(ItemTooltipCallback.EVENT) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ItemTooltipCallback).getTooltip(stack, context, type, lines)
    }
    unregisters.forEach {
        events.get(ItemTooltipCallback.EVENT)?.remove(it)
    }
})

HudRenderCallback.EVENT.register(fun(matrixStack, delta) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    events.get(HudRenderCallback.EVENT) ?.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as HudRenderCallback).onHudRender(matrixStack, delta)
    }
    unregisters.forEach {
        events.get(HudRenderCallback.EVENT)?.remove(it)
    }
})

//ClientPlayNetworking.registerGlobalReceiver()