import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.implementation.bytecode.assign.Assigner
import net.bytebuddy.matcher.ElementMatchers
import net.minecraft.*
import xyz.wagyourtail.jsmacros.client.api.library.impl.FChat
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.lang.instrument.ClassDefinition
import java.lang.reflect.Method



object MixinClientWorld {

    @Advice.OnMethodExit
    @JvmStatic
    fun getBlockParticle(
        @Advice.FieldValue("field_35432", typing = Assigner.Typing.DYNAMIC) BLOCK_MARKER_ITEMS: Set<class_1792>?,
        @Advice.Return(readOnly = false, typing = Assigner.Typing.DYNAMIC) returnValue: Any?
    ) {
        var returnValue = returnValue
        if(returnValue != null) return

        val mc = class_310.method_1551()

        val itemstack = mc.field_1724?.method_6047() ?: return
        val item = itemstack.method_7909()
        if(BLOCK_MARKER_ITEMS?.contains(item) == true)
            returnValue = (item as? class_1747)?.method_7711()
    }
}

val matcher = ElementMatchers.named<MethodDescription>("method_35752")

val mixinClientWorld = RuntimeMixin.getPatchedImplementation(MixinClientWorld::class.java).on(matcher)

RuntimeMixin.writeResult(context, MixinClientWorld::class.java)

RuntimeMixin.addMixin(net.minecraft.class_638::class.java, mixinClientWorld)
RuntimeMixin.doMixin(net.minecraft.class_638::class.java)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    RuntimeMixin.removeMixin(net.minecraft.class_638::class.java, mixinClientWorld)
    RuntimeMixin.doMixin(net.minecraft.class_638::class.java)
}



Chat.toast("MixinTest", "enabled")