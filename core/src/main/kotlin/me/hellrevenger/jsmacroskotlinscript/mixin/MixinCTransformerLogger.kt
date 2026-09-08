package me.hellrevenger.jsmacroskotlinscript.mixin

import me.hellrevenger.jsmacroskotlinscript.JsMacrosKotlinScript
import net.lenni0451.classtransform.utils.log.impl.SysoutLogger
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(SysoutLogger::class)
class MixinCTransformerLogger {
    @Inject(method = ["error(Ljava/lang/String;[Ljava/lang/Object;)V"], at = [At("HEAD")], cancellable = true)
    fun onError(msg: String, args: Array<Any>, ci: CallbackInfo) {
        if (Thread.currentThread().name.startsWith("KT:")) {
            JsMacrosKotlinScript.LOG.error(msg, *args)
            ci.cancel()
        }
    }
}