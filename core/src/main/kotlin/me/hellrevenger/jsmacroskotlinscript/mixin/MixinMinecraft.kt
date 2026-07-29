package me.hellrevenger.jsmacroskotlinscript.mixin

import me.hellrevenger.jsmacroskotlinscript.script.library.impl.EventGameLoad
import net.minecraft.client.GameLoadCookie
import net.minecraft.client.Minecraft
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Minecraft::class)
class MixinMinecraft {
    @Inject(method = ["onGameLoadFinished(Lnet/minecraft/client/GameLoadCookie;)V"], at = [At("TAIL")])
    fun onGameLoadFinished(cookie: GameLoadCookie, ci: CallbackInfo) {
        EventGameLoad.trigger()
    }
}