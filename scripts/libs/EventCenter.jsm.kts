

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.fabric.api.event.Event
import xyz.wagyourtail.jsmacros.core.event.BaseEvent
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.service.EventService

val events = hashMapOf<Event<*>, HashMap<BaseScriptContext<*>, Any>>()
val whitelist = hashMapOf<BaseScriptContext<*>, Long>()

JsMacros.createCustomEvent("RegisterKtEvent").registerEvent()
JsMacros.createCustomEvent("UnregisterKtEvent").registerEvent()

JsMacros.on("RegisterKtEvent", JavaWrapper.methodToJava { e: BaseEvent, _: Any ->
    (e as? EventCustom)?.let { e ->
        val eventToRegister = e.getObject("event") as Event<*>
        val ctx = e.getObject("context") as BaseScriptContext<*>
        whitelist[ctx] = Time.time() + 1000L
        val listeners = events.getOrPut(eventToRegister) { hashMapOf() }
        listeners[ctx] = e.getObject("callback") as Any
    }
})

JsMacros.on("UnregisterKtEvent", JavaWrapper.methodToJava { e: BaseEvent, _: Any ->
    (e as? EventCustom)?.let { e ->
        val eventToRegister = e.getObject("event") as Event<*>
        val listeners = events[eventToRegister] ?: return@methodToJava
        val ctx = e.getObject("context") as BaseScriptContext<*>
        whitelist.remove(ctx)
        listeners.remove(ctx)
    }
})
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

fun isClosed(ctx: BaseScriptContext<*>): Boolean {
    val whitelistTime = whitelist[ctx] ?: return ctx.isContextClosed
    if(whitelistTime < Time.time()) {
        whitelist.remove(ctx)
        return ctx.isContextClosed
    }
    return false
}

ClientTickEvents.START_CLIENT_TICK.register(fun(mc){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientTickEvents.START_CLIENT_TICK] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientTickEvents.StartTick).onStartTick(mc)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientTickEvents.END_CLIENT_TICK.register(fun(mc){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientTickEvents.END_CLIENT_TICK] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientTickEvents.EndTick).onEndTick(mc)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientEntityEvents.ENTITY_LOAD.register(fun(entity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientEntityEvents.ENTITY_LOAD] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientEntityEvents.Load).onLoad(entity, world)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientEntityEvents.ENTITY_UNLOAD.register(fun(entity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientEntityEvents.ENTITY_UNLOAD] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientEntityEvents.Unload).onUnload(entity, world)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientChunkEvents.CHUNK_LOAD.register(fun(world, chunk){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientChunkEvents.CHUNK_LOAD] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientChunkEvents.Load).onChunkLoad(world, chunk)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientChunkEvents.CHUNK_UNLOAD.register(fun(world, chunk){
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientChunkEvents.CHUNK_UNLOAD] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientChunkEvents.Unload).onChunkUnload(world, chunk)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientBlockEntityEvents.BLOCK_ENTITY_LOAD.register(fun(blockEntity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientBlockEntityEvents.BLOCK_ENTITY_LOAD] ?: return
    callbacks.forEach { entry ->
        if(isClosed(entry.key)) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientBlockEntityEvents.Load).onLoad(blockEntity, world)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.register(fun(blockEntity, world) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD] ?: return
    callbacks.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ClientBlockEntityEvents.Unload).onUnload(blockEntity, world)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

ItemTooltipCallback.EVENT.register(fun(stack, context, type, lines) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[ItemTooltipCallback.EVENT] ?: return
    callbacks.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as ItemTooltipCallback).getTooltip(stack, context, type, lines)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

HudRenderCallback.EVENT.register(fun(matrixStack, delta) {
    val unregisters = arrayListOf<BaseScriptContext<*>>()
    val callbacks = events[HudRenderCallback.EVENT] ?: return
    callbacks.forEach { entry ->
        if(entry.key.isContextClosed) {
            unregisters.add(entry.key)
            return
        }
        (entry.value as HudRenderCallback).onHudRender(matrixStack, delta)
    }
    unregisters.forEach {
        callbacks.remove(it)
    }
})

//ClientPlayNetworking.registerGlobalReceiver()