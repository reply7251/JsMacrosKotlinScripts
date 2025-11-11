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
var gson = GsonBuilder().setPrettyPrinting().create()
val noriFile = File(context.file!!.parentFile, "nori.json")
val wynnpoolFile = File(context.file!!.parentFile, "wynnpool.json")
val data = if(!noriFile.exists()) {
    val text = Request.get("https://nori.fish/api/item/mythic").text()
    noriFile.createNewFile()
    noriFile.writeText(gson.toJson(JsonParser.parseString(text)))
    text
} else {
    noriFile.readText()
}
if(!wynnpoolFile.exists()) {
    wynnpoolFile.createNewFile()
    wynnpoolFile.writeText("{}")
}
val json = JsonParser.parseString(data).asJsonObject.get("weights").asJsonObject
val wynnpoolJson = JsonParser.parseString(wynnpoolFile.readText()).asJsonObject
var lastRequest = 0L

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

val isif = Managers.Feature.getFeatureInstance(ItemStatInfoFeature::class.java)
fun coloredPercentage(value: Double) =
    ColorScaleUtils.getPercentageTextComponent(isif.colorMap, value.roundToInt() / 100f,
        isif.colorLerp.get(), isif.decimalPlaces.get())

fun fetchNori(wynnItem: GearItem): MutableList<class_2561>? {
    val instance = wynnItem.itemInstance.getOrNull() ?: return null
    if(!instance.hasOverallValue()) return null
    val scales = json[wynnItem.name]?.asJsonObject ?: return null
    val possibles = wynnItem.possibleValues
    val lines = mutableListOf<class_2561>()
    scales.asMap().forEach { (name, scale0) ->
        val scale = scale0.asJsonObject
        val toAdd = mutableListOf<class_2561>()
        var score = 0.0
        instance.identifications.forEach inner@ { actual ->
            val possible = possibles.firstOrNull { actual.statType == it.statType } ?: return@inner
            if(possible.range.isFixed || !possible.range.inRange(actual.value)) return@inner
            val weight = scale[actual.statType.apiName]?.asDouble ?: return@inner
            val percentage = StatCalculator.getPercentage(actual, possible)
            val style = coloredPercentage(percentage * 100.0).method_10866() ?: return@inner
            score += weight * percentage
            val colored = Chat.createTextBuilder().append("[+${(weight * percentage).roundToInt() / 100f}%]")
            colored.withStyle(StyleHelper(style))
            val line = Chat.createTextBuilder().append("§7${actual.statType.displayName}§r")
                .append(" ($weight%) ")
                .append(colored.build())

            toAdd.add(line.build().raw)
        }
        lines.add(Chat.createTextBuilder().append("§l$name").append(TextHelper.wrap(coloredPercentage(score))).build().raw)

        lines.addAll(toAdd)
    }

    return lines
}

fun fetchWynnpool(wynnItem: GearItem): MutableList<class_2561>? {
    if(!FETCH_WYNNPOOL) return null
    val instance = wynnItem.itemInstance.getOrNull() ?: return null
    if(!instance.hasOverallValue()) return null
    val possibles = wynnItem.possibleValues
    val lines = mutableListOf<class_2561>()

    val name = wynnItem.name
    if(!wynnpoolJson.has(name)) {
        if(Time.time() - lastRequest < 3000) return null
        lastRequest = Time.time()
        thread {
            try {
                val resp = Request.get("https://weight.wynnpool.com/api/weights/item/${name.replace(" ", "%20")}").text()
                val map = JsonObject()
                JsonParser.parseString(resp).asJsonArray.forEach {
                    it.asJsonObject.let {
                        map.add(it["weight_name"].asString, it["identifications"])
                    }
                }
                wynnpoolJson.add(name, map)
                wynnpoolFile.writeText(gson.toJson(wynnpoolJson))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        return null
    }

    wynnpoolJson[name]?.let { scales ->
        scales.asJsonObject.asMap().forEach { (name, scale0) ->
            val scale = scale0.asJsonObject
            val toAdd = mutableListOf<class_2561>()
            var score = 0.0
            instance.identifications.forEach inner@ { actual ->
                val possible = possibles.firstOrNull { actual.statType == it.statType } ?: return@inner
                if(possible.range.isFixed || !possible.range.inRange(actual.value)) return@inner
                var weight = (scale[actual.statType.apiName]?.asDouble?.times(100)) ?: return@inner
                weight = (weight * 1000).roundToInt() / 1000.0
                var percentage = StatCalculator.getPercentage(actual, possible)
                if(weight < 0) {
                    percentage = 100 - percentage
                }
                var tmp = weight * percentage
                if (weight < 0) {
                    tmp = -tmp
                }
                val style = coloredPercentage(percentage * 100.0).method_10866() ?: return@inner
                score += tmp
                val colored = Chat.createTextBuilder().append("[+${(tmp).roundToInt() / 100f}%]")
                colored.withStyle(StyleHelper(style))
                val line = Chat.createTextBuilder().append("§7${actual.statType.displayName}§r")
                    .append(" ($weight%) ")
                    .append(colored.build())

                toAdd.add(line.build().raw)
            }
            lines.add(Chat.createTextBuilder().append("WP §l$name").append(TextHelper.wrap(coloredPercentage(score))).build().raw)

            lines.addAll(toAdd)
        }
        return lines
    }
    return null
}

fun fetchWeights(wynnItem: GearItem): MutableList<class_2561>? {
    val tooltips = fetchNori(wynnItem) ?: return null
    fetchWynnpool(wynnItem)?.let { tooltips.addAll(it) }
    return tooltips
}

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

//            val score = getNoriScale(gear)
//            if(score >= 0) return Optional.of(score.roundToInt() / 100)
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

class WynnListener {
    @SubscribeEvent
    fun onItemToolTip(event: ItemTooltipRenderEvent.Pre) {
        val wynnItem = Models.Item.asWynnItem(event.itemStack, GearItem::class.java).getOrNull() ?: return

        val clientTooltip = TooltipUtils.getClientTooltipComponent(event.tooltips)
        val width = TooltipUtils.getTooltipWidth(clientTooltip, font)
        val height = TooltipUtils.getTooltipHeight(clientTooltip)

        val context = event.guiGraphics

        val offsetY = event.mouseY + height - context.method_51443()
        val y = (if(offsetY > 0) event.mouseY - offsetY else event.mouseY) + 12
        fetchWeights(wynnItem)?.let {
            val stack = context.method_51448()

            stack.method_22903()
            stack.method_46416(0f,0f,300f)

            val myClientTooltip = TooltipUtils.getClientTooltipComponent(it)
            val myWidth = TooltipUtils.getTooltipWidth(myClientTooltip, font)
            val myHeight = TooltipUtils.getTooltipHeight(myClientTooltip)
            val yOffset = y + myHeight - context.method_51443()
            val myY = if(yOffset > 0) y - yOffset else y
            val myX = if(event.mouseX + width + 24 + myWidth > context.method_51421()) {
                event.mouseX - myWidth - 12
            } else {
                event.mouseX + width + 12
            }

            context.method_51434(font, it, myX, myY)
            stack.method_22909()
        }
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