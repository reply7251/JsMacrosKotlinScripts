package me.hellrevenger.jsmacroskotlinscript.mixin

import me.hellrevenger.jsmacroskotlinscript.script.library.impl.EventGameLoad
import net.minecraft.network.chat.Component
import net.minecraft.network.syncher.EntityDataAccessor
import net.minecraft.world.entity.Display
import net.minecraft.world.entity.EntityType
import net.minecraft.world.level.Level
import org.spongepowered.asm.mixin.Final
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.Shadow
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo
import xyz.wagyourtail.jsmacros.client.api.event.impl.world.EventNameChange

@Mixin(Display.TextDisplay::class)
abstract class MixinTextDisplayEntity(type: EntityType<*>, level: Level) : Display(type, level) {
    private companion object {
        @Shadow
        @JvmStatic
        @Final
        private lateinit var DATA_TEXT_ID: EntityDataAccessor<Component>
    }
    @Shadow
    abstract fun getText(): Component

    @Inject(method = ["setText(Lnet/minecraft/network/chat/Component;)V"], at = [At("HEAD")], cancellable = true)
    fun onSetText(text: Component, ci: CallbackInfo) {
        val event = EventNameChange(this, getText(), text).apply { trigger() }

        if (event.isCanceled) {
            ci.cancel()
        } else if (text != event.newName?.raw) {
            ci.cancel()
            this.entityData.set(DATA_TEXT_ID, text);
        }
    }
}