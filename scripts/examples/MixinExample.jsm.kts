
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import com.jsmacrosce.jsmacros.client.JsMacrosClient
import com.jsmacrosce.jsmacros.core.event.impl.EventCustom
import me.hellrevenger.mixins.MixinClassLoaderCallback
import net.minecraft.class_310


object TransformTestCallback {
    var callback: () -> Unit = {}
}

TransformTestCallback.callback = {
    Chat.actionbar("tick: " + World.time)
}

@CTransformer(class_310::class)
class TransformTest {
    @CInline
    @CInject(method = ["method_1574"], target = [CTarget("HEAD")])
    fun onTest() {
        try {
            TransformTestCallback.callback()
        } catch (e: Exception) {
            if (System.getProperty("ktserror") != "true") {
                System.setProperty("ktserror", "true")
                e.printStackTrace()
            }
        }
    }
}

EventListener("MinecraftClient.tick.pre", {
    Chat.actionbar("tick: " + World.time)
})

//TransformTestCallback::class.java.forceLoad()

Chat.log(MixinClassLoaderCallback::class.java.classLoader)

Chat.log(TransformTestCallback::class.java.name)
Chat.log(TransformTestCallback::class.java.classLoader)
Chat.log(TransformTestCallback::class.java.classLoader.javaClass.classLoader)
Chat.log(TransformTestCallback::class.java.classLoader.javaClass.classLoader.javaClass.classLoader)


RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTest::class)
RuntimeTransform.transform()

Chat.log("TransformTest")