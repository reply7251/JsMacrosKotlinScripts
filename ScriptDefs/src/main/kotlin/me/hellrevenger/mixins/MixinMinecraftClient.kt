package me.hellrevenger.mixins

import com.jsmacrosce.jsmacros.core.Core
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.impl.EventGameLoad
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.minecraft.class_310


object MixinMinecraftClientCallback {
    fun transform(runner: Core<*,*>) {
        runner.eventRegistry.addEvent(EventGameLoad::class.java)
        onFinishLoading = {
            EventGameLoad.trigger()
        }
        val tm = RuntimeMixin.createTransformManager()
        tm.addTransformer(MixinMinecraftClient::class.java.name)
        tm.hookInstrumentation(RuntimeMixin.getInstrumentation())
    }
    var onFinishLoading = { }
}

@CTransformer(class_310::class)
class MixinMinecraftClient {
    @CInline
    @CInject(method = ["method_51736"], target = [CTarget(CTargetType.TAIL)])
    fun onFinishLoading() {
        MixinMinecraftClientCallback.onFinishLoading()
    }
}