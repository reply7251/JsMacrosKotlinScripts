package me.hellrevenger.mixins

import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.matcher.ElementMatchers

object MixinMain {
    fun mixins() {
        RuntimeMixin.addMixin(net.minecraft.class_8113.class_8123::class.java,
            Advice.to(MixinTextDisplayEntity::class.java).on(ElementMatchers.named("method_48911")))
        MixinCompilier.mixin()
    }
}