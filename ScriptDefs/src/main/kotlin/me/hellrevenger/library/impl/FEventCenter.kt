package me.hellrevenger.library.impl

import me.hellrevenger.language.impl.KotlinLanguageDefinition
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
import net.fabricmc.fabric.api.event.Event
import xyz.wagyourtail.jsmacros.core.language.BaseScriptContext
import xyz.wagyourtail.jsmacros.core.library.Library
import xyz.wagyourtail.jsmacros.core.library.PerExecLibrary


val events = hashMapOf<Event<*>, HashMap<BaseScriptContext<*>, Any>>()
val whitelist = hashMapOf<BaseScriptContext<*>, Long>()

val listeners = hashMapOf<String, HashMap<BaseScriptContext<*>, (Map<String, Any>) -> Unit>>()
val whitelist2 = hashMapOf<BaseScriptContext<*>, Long>()

fun time() = System.currentTimeMillis()

var initialized = false

@Library("EventCenter", languages = [KotlinLanguageDefinition::class])
class FEventCenter(context: BaseScriptContext<*>?) : PerExecLibrary(context) {
    init {
        if(!initialized) {
            initialized = true
            init()
        }
    }

    fun <T> registerEvent(context: BaseScriptContext<*>, event: Event<T>, callback: T) {
        whitelist[context] = time() + 1000L
        val listeners = events.getOrPut(event) { hashMapOf() }
        listeners[context] = callback as Any
    }

    fun <T> unregisterEvent(context: BaseScriptContext<*>, event: Event<T>) {
        val listeners = events[event] ?: return
        whitelist.remove(context)
        listeners.remove(context)
    }

    fun listenTo(name: String, context: BaseScriptContext<*>, callback: (Map<String, Any>) -> Unit) {
        whitelist2[context] = time() + 1000L
        val listener = listeners.getOrPut(name) { hashMapOf() }
        listener[context] = callback
    }

    fun cancelListen(name: String, context: BaseScriptContext<*>) {
        whitelist2.remove(context)
        listeners[name]?.remove(context)
    }

    fun trigger(name: String, data: HashMap<String, Any>) {
        val listener = listeners[name] ?: return
        val unregisters = arrayListOf<BaseScriptContext<*>>()
        listener.forEach {
            if(isClosed2(it.key)) {
                unregisters.add(it.key)
                return@forEach
            }
            it.value.invoke(data)
        }
        unregisters.forEach {
            listener.remove(it)
        }
    }
}

fun isClosed(ctx: BaseScriptContext<*>): Boolean {
    val whitelistTime = whitelist[ctx] ?: return ctx.isContextClosed
    if(whitelistTime < time()) {
        whitelist.remove(ctx)
        return ctx.isContextClosed
    }
    return false
}

fun isClosed2(ctx: BaseScriptContext<*>): Boolean {
    val whitelistTime = whitelist2[ctx] ?: return ctx.isContextClosed
    if(whitelistTime < time()) {
        whitelist2.remove(ctx)
        return ctx.isContextClosed
    }
    return false
}

fun init() {
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
}
