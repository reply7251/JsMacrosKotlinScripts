import me.hellrevenger.generated.MinecraftClient
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject

object MixinCallback {
    var callback = {}
}

MixinCallback.callback = {
    Chat.actionbar("tick: " + World.time)
}

@CTransformer(MinecraftClient::class)
class TransformTest {
    @CInline
    @CInject(method = ["method_1574"], target = [CTarget("HEAD")])
    fun onTest() {
        MixinCallback.callback()
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTest::class)
RuntimeTransform.transform()

Chat.log("TransformTest")