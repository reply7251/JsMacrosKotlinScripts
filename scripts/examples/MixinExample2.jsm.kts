
import me.hellrevenger.library.api.CTargetType
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.minecraft.class_310
import com.jsmacrosce.jsmacros.client.api.library.impl.FChat

object MixinCallback {
    var callback = {}
    var callbackActionbar: (Any) -> String = { "" }
    var callbackStripFormatting: (Any, String, Any?) -> String = { _,_,_ -> "" }
}

MixinCallback.callback = {
    Chat.actionbar("tick: " + World.time)
}

MixinCallback.callbackActionbar = {
    "transformed \"${it}\""
}

MixinCallback.callbackStripFormatting = { instance, input, original ->
    "$original (from $instance.stripFormatting($input))"
}

@CTransformer(class_310::class)
class TransformTest {
    @CInline
    @CInject(method = ["method_1574"], target = [CTarget("HEAD")])
    fun onTest() {
        MixinCallback.callback()
    }
}

@CTransformer(FChat::class)
class TransformFChat {
    @CRedirect(method = ["actionbar"], target = CTarget(CTargetType.SIMPLE_INVOKE, "toString", optional = true))
    fun onActionbar(instance: Any): String {
        return MixinCallback.callbackActionbar(instance)
    }

    @CInject(method = ["stripFormatting"], target = [CTarget(CTargetType.RETURN)], cancellable = true)
    fun onStripFormatting(input: String, cir: InjectionCallback) {
        cir.returnValue = MixinCallback.callbackStripFormatting(this, input, cir.returnValue)
    }
}

Chat.log(Chat.stripFormatting("TransformTest"))

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTest::class)
RuntimeTransform.addTransformer(TransformFChat::class)
RuntimeTransform.transform()

Chat.log(Chat.stripFormatting("TransformTest"))