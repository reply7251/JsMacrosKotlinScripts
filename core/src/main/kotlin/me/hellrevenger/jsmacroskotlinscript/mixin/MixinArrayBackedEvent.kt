package me.hellrevenger.jsmacroskotlinscript.mixin

import me.hellrevenger.jsmacroskotlinscript.script.library.api.IEvent
import org.spongepowered.asm.mixin.Debug
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow
import org.spongepowered.asm.mixin.Unique
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.ModifyArg
import kotlin.collections.toTypedArray

@Mixin(targets = ["net.fabricmc.fabric.impl.base.event.ArrayBackedEvent"])
abstract class MixinArrayBackedEvent<T : Any> : IEvent<T> {
    @Unique
    private val temporaryHandlers = mutableSetOf<T>()

    @Shadow
    abstract fun update()

    @Unique
    override fun registerForScript(handler: T) {
        temporaryHandlers.add(handler)
        update()
    }

    @Unique
    override fun unregisterForScript(handler: T) {
        temporaryHandlers.remove(handler)
        update()
    }

    @ModifyArg(method = ["update"], at = At("INVOKE", target = "apply"))
    private fun onUpdate(original: Any): Any {
        val originalArray = original as Array<*>
        val type = originalArray::class.java.componentType
        val length = originalArray.size + temporaryHandlers.size

        val newArray = java.lang.reflect.Array.newInstance(type, length)

        System.arraycopy(original, 0, newArray, 0, originalArray.size)
        System.arraycopy(temporaryHandlers.toTypedArray<Any>(), 0, newArray, originalArray.size, temporaryHandlers.size)

        return newArray
    }
}