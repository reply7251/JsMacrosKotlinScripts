@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.handlers.chat.ChatHandler
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.MiscExtensions.waitUntilWorldLoaded
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.minecraft.class_408
import net.minecraft.class_338
import net.minecraft.class_303
import net.minecraft.class_2561

JsMacros.waitUntilWorldLoaded()

@CTransformer(name=["com/wynnventory/util/TradeMarketPriceParser"])
object TransformTradeMarketPriceParser {
    @JvmStatic
    @CRedirect(method=["calculateItemPriceInfo"], target = CTarget(CTargetType.SIMPLE_INVOKE, "logWarn"))
    fun onCalculateItemPriceInfo(message: String) {
        message.toString()
    }
}

object TransformCallback {
    var callback = { message: class_303 -> false }
}

var lastMessage: class_2561? = null

TransformCallback.callback = {
    val result = it.comp_893().equals(lastMessage)
    lastMessage = it.comp_893()
    result
}

@CTransformer(class_338::class)
class TransformChatScreen {
    @CInject(method = ["method_45027"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun onLogChatMessage(message: class_303, cir: InjectionCallback) {
        if (TransformCallback.callback(message)) {
            cir.isCancelled = true
        }
    }
}

@CTransformer(ChatHandler::class)
class TransformChatHandler {
    @CRedirect(method=["processChatMessage"], target = CTarget(CTargetType.SIMPLE_INVOKE, "info"))
    fun onCalculateItemPriceInfo(message: String) {
        message.toString()
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTradeMarketPriceParser::class)
RuntimeTransform.addTransformer(TransformChatScreen::class)
RuntimeTransform.addTransformer(TransformChatHandler::class)
RuntimeTransform.transform()