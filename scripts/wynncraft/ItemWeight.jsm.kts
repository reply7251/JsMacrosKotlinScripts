@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.features.chat.ChatItemFeature
import com.wynntils.features.tooltips.ItemStatInfoFeature
import com.wynntils.mc.event.ItemTooltipRenderEvent
import com.wynntils.models.gear.type.GearTier
import com.wynntils.models.gear.type.ItemWeightSource
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.StatCalculator
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemweight.type.ItemWeighting
import com.wynntils.utils.mc.TooltipUtils
import com.wynntils.utils.render.FontRenderer
import com.wynntils.utils.wynn.ColorScaleUtils
import me.hellrevenger.library.api._setPrivateValue
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.minecraft.class_1799
import net.minecraft.class_2561
import net.minecraft.class_2568
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.api.helper.StyleHelper
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.util.*
import kotlin.concurrent.thread
import kotlin.jvm.optionals.getOrNull
import kotlin.math.roundToInt

val FETCH_WYNNPOOL = true

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}


val isif = Managers.Feature.getFeatureInstance(ItemStatInfoFeature::class.java)

val font = FontRenderer.getInstance().font

fun getWeight(item: GearItem, source: ItemWeightSource) =
    Services.ItemWeight.getItemWeighting(item.name, source).firstOrNull()?.let {
        Services.ItemWeight.calculateWeighting(it, item)
    }


class NoriScaleStatProvider : ItemStatProvider<Int>() {
    override fun getValue(p0: WynnItem?): Optional<Int> {
        (p0 as? GearItem)?.let { gear ->
            getWeight(gear, ItemWeightSource.NORI)?.let {
                return Optional.of(it.toInt())
            }
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR_INSTANCE)
    override fun getName() = "nori"
    override fun getDisplayName() = "Nori Scale"
}

object MixinCallback {
    var onCreateItemPart = { itemStack: class_1799 -> class_2568.class_5249(itemStack) }
}

MixinCallback.onCreateItemPart = { itemStack ->
    val result = class_2568.class_5249(itemStack)

    result._setPrivateValue("field_24358", itemStack)
    result
}

@CTransformer(ChatItemFeature::class)
class MixinChatItemFeature {
    @CRedirect(method=["createItemPart"], target = CTarget("NEW", target="net/minecraft/class_2568\$class_5249"))
    fun transform(itemStack: class_1799): class_2568.class_5249 {
        return MixinCallback.onCreateItemPart(itemStack)
    }
}

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinChatItemFeature::class)
RuntimeTransform.transform()

val noriScaleStatProvider = NoriScaleStatProvider()
Services.ItemFilter.itemStatProviders.add(noriScaleStatProvider)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.remove(noriScaleStatProvider)
}