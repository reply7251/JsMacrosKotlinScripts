import com.wynntils.features.combat.QuickCastFeature
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.implementation.bytecode.assign.Assigner
import net.bytebuddy.matcher.ElementMatchers
import xyz.wagyourtail.jsmacros.core.service.EventService

object MixinQuickCastFeature {
    @JvmStatic
    @Advice.OnMethodEnter()
    fun updateLastTickPosition(@Advice.This(typing = Assigner.Typing.DYNAMIC) zhis: Any? ) {
        zhis?.let {
            val field = it.javaClass.getDeclaredField("lastSpellTick")
            field.trySetAccessible()
            field.set(zhis, 0)
        }
    }
}

val mixin = Advice.to(MixinQuickCastFeature::class.java).on(ElementMatchers.named<MethodDescription?>("onWorldChange").or(ElementMatchers.named("onHeldItemChange")))
RuntimeMixin.addMixin(QuickCastFeature::class.java, mixin)
RuntimeMixin.doMixin(QuickCastFeature::class.java)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    RuntimeMixin.removeMixin(QuickCastFeature::class.java, mixin)
    RuntimeMixin.doMixin(QuickCastFeature::class.java)
}