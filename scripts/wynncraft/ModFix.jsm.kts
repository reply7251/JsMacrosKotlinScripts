import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.MiscExtensions.waitUntilWorldLoaded
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CRedirect

JsMacros.waitUntilWorldLoaded()

@CTransformer(name=["com/wynnventory/util/TradeMarketPriceParser"])
object TransformTradeMarketPriceParser {
    @JvmStatic
    @CRedirect(method=["calculateItemPriceInfo"], target = CTarget(CTargetType.SIMPLE_INVOKE, "logWarn"))
    fun onCalculateItemPriceInfo(message: String) {
        message.toString()
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTradeMarketPriceParser::class)
RuntimeTransform.transform()