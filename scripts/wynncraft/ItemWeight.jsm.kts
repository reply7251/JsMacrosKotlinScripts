@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.features.tooltips.ItemStatInfoFeature
import com.wynntils.mc.event.ItemTooltipRenderEvent
import com.wynntils.models.gear.type.GearTier
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.StatCalculator
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.utils.wynn.ColorScaleUtils
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.io.File
import java.util.*
import kotlin.jvm.optionals.getOrNull
import kotlin.math.roundToInt

// https://nori.fish/api/item/mythic

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}
val noriFile = File(context.file!!.parentFile, "nori.json")
val data = if(!noriFile.exists()) {
    val text = Request.get("https://nori.fish/api/item/mythic").text()
    noriFile.createNewFile()
    noriFile.writeText(GsonBuilder().setPrettyPrinting().create().toJson(JsonParser.parseString(text)))
    text
} else {
    noriFile.readText()
}

val json = JsonParser.parseString(data).asJsonObject.get("weights").asJsonObject

fun getNoriScale(wynnItem: GearItem): Double {
    if(wynnItem.gearTier != GearTier.MYTHIC) return -1.0
    val instance = wynnItem.itemInstance.getOrNull() ?: return -1.0
    if(!instance.hasOverallValue()) return -1.0
    val scales = json[wynnItem.name]?.asJsonObject?.get("Main")?.asJsonObject ?: return -1.0
    var score = 0.0
    val possibles = wynnItem.possibleValues
    var match = false

    instance.identifications.forEach { actual ->
        val possible = possibles.firstOrNull { actual.statType == it.statType } ?: return@forEach
        if(possible.range.isFixed || !possible.range.inRange(actual.value)) return@forEach
        val scale = scales[actual.statType.apiName]?.asDouble ?: return@forEach
        score += scale * StatCalculator.getPercentage(actual, possible)
        match = true
    }

    return if(match) score else -1.0
}

class NoriScaleStatProvider : ItemStatProvider<Int>() {
    override fun getValue(p0: WynnItem?): Optional<Int> {
        (p0 as? GearItem)?.let { gear ->
            val score = getNoriScale(gear)
            if(score >= 0) return Optional.of(score.roundToInt() / 100)
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR_INSTANCE)
    override fun getName() = "nori"
    override fun getDisplayName() = "Nori Scale"
}

class WynnListener {
    @SubscribeEvent
    fun onItemToolTip(event: ItemTooltipRenderEvent.Pre) {
        val wynnItem = Models.Item.asWynnItem(event.itemStack, GearItem::class.java).getOrNull() ?: return
        val score = getNoriScale(wynnItem)
        if(score < 0) return
        val tooltips = mutableListOf(*event.tooltips.toTypedArray())
        val isif = Managers.Feature.getFeatureInstance(ItemStatInfoFeature::class.java)
        val colored = ColorScaleUtils.getPercentageTextComponent(isif.colorMap, score.roundToInt() / 100f,
            isif.colorLerp.get(), isif.decimalPlaces.get())
        tooltips[0] = Chat.createTextBuilder().append(TextHelper.wrap(event.tooltips[0])).append(" Nori Scale")
            .append(TextHelper.wrap(colored)).build().raw
        event.tooltips = tooltips
    }
}

val noriScaleStatProvider = NoriScaleStatProvider()
Services.ItemFilter.itemStatProviders.add(noriScaleStatProvider)
val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    WynntilsMod.unregisterEventListener(wynnListener)
    Services.ItemFilter.itemStatProviders.remove(noriScaleStatProvider)
}