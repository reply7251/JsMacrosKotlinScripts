@file:ImportJar("../libs/jars/Wynnventory-v1.3.7.jar")

import com.wynnventory.model.item.trademarket.TradeMarketItemPriceHolder
import com.wynnventory.model.item.trademarket.TradeMarketItemPriceInfo
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.MiscExtensions.waitUntilWorldLoaded
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.COverride

JsMacros.waitUntilWorldLoaded()

TradeMarketItemPriceHolder(TradeMarketItemPriceInfo(), "").isPriceExpired(2)

object TransformCallback {
    var callback = { instance: Any -> false }
}

TransformCallback.callback = {
    false
}

@CTransformer(TradeMarketItemPriceHolder::class)
class TransformTradeMarketItemPriceHolder {
    @CInject(method = ["isPriceExpired"], target = [CTarget(CTargetType.HEAD)], cancellable = true)
    fun isPriceExpired(minutes: Long, cir: InjectionCallback) {
        cir.returnValue = TransformCallback.callback(this)
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(TransformTradeMarketItemPriceHolder::class)
RuntimeTransform.transform()

Chat.log("price check")
