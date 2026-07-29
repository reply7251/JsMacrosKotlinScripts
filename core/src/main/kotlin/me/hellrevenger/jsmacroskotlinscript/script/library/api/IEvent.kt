package me.hellrevenger.jsmacroskotlinscript.script.library.api

import org.spongepowered.asm.mixin.Unique

interface IEvent<T> {
    @Unique
    fun registerForScript(handler: T) { }

    @Unique
    fun unregisterForScript(handler: T) { }
}