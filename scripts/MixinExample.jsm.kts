import me.hellrevenger.generated.MinecraftClient
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import xyz.wagyourtail.jsmacros.client.JsMacrosClient
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom

@CTransformer(MinecraftClient::class)
class TransformTest {
    @CInline
    @CInject(method = ["method_1574"], target = [CTarget("HEAD")])
    fun onTest() {
        EventCustom(JsMacrosClient.clientCore, "MinecraftClient.tick.pre").trigger()
    }
}

EventListener("MinecraftClient.tick.pre", { e ->
    Chat.actionbar("tick: " + World.time)
})

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTest::class)
RuntimeTransform.transform()

Chat.log("TransformTest")