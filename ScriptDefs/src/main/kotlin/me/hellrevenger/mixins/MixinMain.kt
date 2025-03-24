package me.hellrevenger.mixins

import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.matcher.ElementMatchers
import xyz.wagyourtail.jsmacros.core.Core

object MixinMain {
    fun mixins(runner: Core<*, *>) {
        RuntimeMixin.addMixin(net.minecraft.class_8113.class_8123::class.java,
            Advice.to(MixinTextDisplayEntity::class.java).on(ElementMatchers.named("method_48911")))
        MixinCompiler.mixin(runner)
    }
}