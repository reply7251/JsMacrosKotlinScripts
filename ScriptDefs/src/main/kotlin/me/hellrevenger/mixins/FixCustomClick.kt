package me.hellrevenger.mixins

import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api._setPrivateValue
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CRedirect
import xyz.wagyourtail.jsmacros.access.CustomClickEvent
import xyz.wagyourtail.jsmacros.client.config.ClientProfile

object FixCustomClick {
    fun transform() {
        val manager = RuntimeMixin.createTransformManager()
        manager.addTransformer(TransformClientProfile::class.java.name)
        manager.hookInstrumentation(instrumentation)
    }
}

@CReplaceCallback
@CTransformer(ClientProfile::class)
class TransformClientProfile {

    @CInline
    @CRedirect(method = ["compileError"], target = CTarget(CTargetType.SIMPLE_NEW, "CustomClickEvent"))
    fun onCreateCustomClick(event: Runnable): CustomClickEvent {
        return FixedCustomClickEvent(event)
    }
}

class FixedCustomClickEvent(event: Runnable) : CustomClickEvent(event) {
    init {
        this._setPrivateValue("field_11740", "")
    }
}

