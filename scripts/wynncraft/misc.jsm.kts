@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.mojang.brigadier.suggestion.Suggestion
import com.mojang.brigadier.suggestion.Suggestions
import com.mojang.brigadier.suggestion.SuggestionsBuilder
import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.mc.event.ItemTooltipRenderEvent
import com.wynntils.models.elements.type.Element
import com.wynntils.models.elements.type.Powder
import com.wynntils.models.gear.type.GearAttackSpeed
import com.wynntils.models.gear.type.GearInfo
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.CraftedConsumableItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.items.items.game.IngredientItem
import com.wynntils.models.stats.builders.SkillStatBuilder
import com.wynntils.models.stats.type.DamageType
import com.wynntils.screens.base.TextboxScreen
import com.wynntils.screens.base.widgets.ItemSearchWidget
import com.wynntils.screens.guides.WynntilsGuideScreen
import com.wynntils.services.itemfilter.ItemFilterService
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemSearchQuery
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.render.FontRenderer
import com.wynntils.utils.type.ErrorOr
import com.wynntils.utils.type.Pair
import com.wynntils.utils.type.RangedValue
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api._getField
import me.hellrevenger.library.api._getPrivateValue
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.*
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import kotlin.jvm.optionals.getOrNull
import net.minecraft.class_4717
import net.minecraft.class_342
import net.minecraft.class_2561
import java.util.function.Consumer
import net.minecraft.class_437
import java.util.concurrent.CompletableFuture
import net.minecraft.class_332
import net.minecraft.class_4717.class_464
import org.lwjgl.glfw.GLFW
import java.lang.Exception

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

abstract class MyGearItemStatProvider<T : Comparable<T>>(val myName: String) : ItemStatProvider<T>() {
    override fun getName() = myName
    override fun getDisplayName() = myName
    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR, ItemProviderType.GEAR_INSTANCE)
}

object AbilityPointStatProvider : MyGearItemStatProvider<Int>("SkillPoints") {
    override fun getValue(p0: WynnItem?): Optional<Int> {
        var hasSkillStat = false
        (p0 as? GearItem)?.let { gear ->
            var result = 0
            SkillStatBuilder().buildStats {
                val possibleValue = gear.itemInfo.getPossibleValues(it) ?: return@buildStats
                result += possibleValue.baseValue
                hasSkillStat = true
            }
            if(hasSkillStat)
                return Optional.of(result)
        }
        (p0 as? CraftedConsumableItem)?.let { cons ->
            var result = 0
            SkillStatBuilder().buildStats { stat ->
                val value = cons.identifications.firstOrNull { it.statType.key == stat.key } ?: return@buildStats
                result += value.value
                hasSkillStat = true
            }
            if(hasSkillStat)
                return Optional.of(result)
        }
        return Optional.empty()
    }

    override fun getAliases() = mutableListOf("sp")
}

object QuestRequestStatProvider: MyGearItemStatProvider<String>("Quest") {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return gear.itemInfo.requirements.quest
        }
        return Optional.empty()
    }
}

object ObtainFromStatProvider: MyGearItemStatProvider<String>("Obtain") {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return gear.itemInfo.metaInfo.obtainInfo.firstOrNull()?.name ?: Optional.empty()
        }
		(p0 as? IngredientItem)?.let { ingredient ->
            val from = Models.Ingredient.getObtainInfo(ingredient.ingredientInfo).filter { it.name.isPresent }
            if (from.isNotEmpty()) {
                return Optional.of(from.joinToString {it.name.get()})
            }
        }
        return Optional.empty()
    }

    override fun getAliases() = mutableListOf("from")
	
    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR, ItemProviderType.GEAR_INSTANCE, ItemProviderType.INGREDIENT)
}

object WithoutStatProvider: MyGearItemStatProvider<String>("Without") {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return Optional.of(gear.itemInfo.requirements.skills.joinToString("/") { it.key().name })
        }
        return Optional.empty()
    }

    override fun getAliases() = mutableListOf("no")
}

object AnyEffectivenessStatProvider: MyGearItemStatProvider<Boolean>("AnyEffectiveness") {
    override fun getValue(p0: WynnItem?): Optional<Boolean> {
        (p0 as? IngredientItem)?.let { ingredient ->
            return Optional.of(ingredient.ingredientInfo.positionModifiers.any { it.value != 0 })
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.INGREDIENT)
}

class WithoutStatFilter(val stat: String) : StatFilter<String>() {
    override fun matches(stats: String?): Boolean {
        stats?.let {
            val reqs = it.lowercase().split("/")
            return stat.lowercase().split("/").all { !reqs.any { req -> req.contains(it) } }
        }
        return true
    }

    override fun asString(): String {
        return "!$stat"
    }
}

class WithoutStatFilterFactory : StatFilterFactory<WithoutStatFilter>() {
    override fun create(input: String?): Optional<WithoutStatFilter> {
        if(input?.startsWith("!") == true) {
            return Optional.of(WithoutStatFilter(input.substring(1)))
        }
        return Optional.empty()
    }
}

val damageTypes = listOf("spell", "main")
val attackSpeeds = mapOf(
    GearAttackSpeed.SUPER_SLOW to 0.51,
    GearAttackSpeed.VERY_SLOW to 0.83,
    GearAttackSpeed.SLOW to 1.5,
    GearAttackSpeed.NORMAL to 2.05,
    GearAttackSpeed.FAST to 2.5,
    GearAttackSpeed.VERY_FAST to 3.1,
    GearAttackSpeed.SUPER_FAST to 4.3,
)
val elementTypes = listOf("earth", "thunder", "water", "fire", "air", "neutral")
class MixedDamageStatProvider(val weaponInfo: GearInfo, damageTypeString: String = "", powderString: String = "") : ItemStatProvider<Int>() {
    val damageType: String = damageTypes.firstOrNull { damageTypeString.contains(it, true) } ?: "spell"
    val attackSpeed = (attackSpeeds[weaponInfo.fixedStats.attackSpeed.getOrNull()] ?: 1.0)
    fun getAvg(range: RangedValue) = (range.high + range.low) / 2.0

    val weaponDamage by lazy {
        val elements = weaponInfo.fixedStats().damages.associate { pair ->
            pair.key() to pair.value()
        }.toMutableMap()
        val slots = weaponInfo.powderSlots
        val neutral = weaponInfo.fixedStats().damages.find { it.key() == DamageType.NEUTRAL }?.value() ?: RangedValue.NONE
        neutral.let {
            val neutralBaseLow = it.low
            val neutralBaseHigh = it.high
            var neutralLow = neutralBaseLow
            var neutralHigh = neutralBaseHigh
            for (i in 0..<powderString.length.coerceAtMost(slots)) {
                if(!"ETWFA".contains(powderString[i], true)) break
                val element = Element.valueOf(elementTypes.first { it.startsWith(powderString[i], true) }.uppercase())
                val powder = Models.Element.getPowderTierInfo(Powder.fromElement(element), 6)
                val convert = powder.convertedFromNeutral() / 100.0
                val damageType = DamageType.fromElement(element)
                val (elemLow, newNeutralLow) = convertAndFloor(neutralBaseLow, neutralLow, convert)
                val (elemHigh, newNeutralHigh) = convertAndFloor(neutralBaseHigh, neutralHigh, convert)
                neutralLow = newNeutralLow
                neutralHigh = newNeutralHigh
                val oldElem = elements[damageType] ?: RangedValue.NONE
                elements[damageType] = RangedValue(oldElem.low + elemLow + powder.min, oldElem.high + elemHigh + powder.max)
            }
            elements[DamageType.NEUTRAL] = RangedValue(neutralLow, neutralHigh)
        }
        elements
    }

    fun convertAndFloor(neutralBase: Int, neutral: Int, pctConvert: Double): kotlin.Pair<Int, Int> {
        val elemental = neutral.coerceAtMost((neutralBase * pctConvert).toInt())
        val newNeutral = (neutral - elemental)
        return elemental to newNeutral
    }

    fun getDamageBonus(idName: String, idValue: Int): Double {
        val name = idName.lowercase()
        if(name.contains("damage", true) && !name.contains("critical")) {
            if(name.contains(damageType) || !damageTypes.any { name.contains(it) }) {
                if(!elementTypes.any { name.contains(it) }) {
                    if(name.contains("elemental") && weaponDamage.all { it.key.element.isPresent }) return 0.0
                    return if(name.contains("raw")) {
                        idValue.toDouble()
                    } else {
                        weaponDamage
                            .map { getAvg(it.value) }
                            .reduce { acc, i -> acc + i } * idValue * 0.01 * attackSpeed
                    }
                } else {
                    weaponDamage.forEach {
                        if(name.contains(it.key.apiName.lowercase())) {
                            return if(name.contains("raw")) {
                                idValue.toDouble()
                            } else {
                                getAvg(it.value) * idValue * 0.01 * attackSpeed
                            }
                        }
                    }
                }
            }
        }
        return 0.0
    }

    override fun getValue(p0: WynnItem?): Optional<Int> {
        (p0 as? GearItem)?.let { gear ->
            if(gear.itemInfo.type.isWeapon) return@let
            var result = 0.0

            val instance = gear.itemInstance.getOrNull()
            if(instance != null) {
                instance.identifications.forEach {
                    result += getDamageBonus(it.statType.apiName, it.value)
                }
            } else {
                gear.possibleValues.forEach {
                    result += getDamageBonus(it.statType.apiName, it.range.high)
                }
            }
            if(result != 0.0)
                return Optional.of(result.toInt())
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR)
}


object ItemFilterServiceHandler {
    lateinit var callback: (String, List<ItemProviderType>, ErrorOr<ItemStatProvider<*>>) -> ErrorOr<ItemStatProvider<*>>
}

var lastMixedDamageStatProvider: MixedDamageStatProvider? = null

ItemFilterServiceHandler.callback = callback@ { name, supportedProviderTypes, originalResult ->
    val split = name.split("/")

    if(split.size >= 3 && split[0].isEmpty()) {
        val startsWith = split[1].startsWith("^")
        val weaponName = split[1].replace("_", " ").let {
            if(startsWith) it.substring(1) else it
        }
        val powder = split[2]
        val type = if(split.size > 3) split[3] else ""
        var equals: GearInfo? = null
        val matches = Models.Gear.allGearInfos.filter {
            if(it.type.isWeapon && it.name.equals(weaponName, true))
                equals = it
            it.type.isWeapon &&
                    if(startsWith) it.name.startsWith(weaponName, true)
                    else it.name.contains(weaponName, true)
        }.toList()

        if(damageTypes.any { it.contains(type) }) {
            val result = if(matches.size == 1) {
                lastMixedDamageStatProvider = MixedDamageStatProvider(matches[0], type, powder)
                ErrorOr.of(lastMixedDamageStatProvider as ItemStatProvider<*>)
            } else if (equals != null) {
                lastMixedDamageStatProvider = MixedDamageStatProvider(equals, type, powder)
                ErrorOr.of(lastMixedDamageStatProvider as ItemStatProvider<*>)
			} else if(matches.size < 6) {
                lastMixedDamageStatProvider = null
                ErrorOr.error("found weapons: " + matches.joinToString { it.name })
            } else {
                lastMixedDamageStatProvider = null
                ErrorOr.error("found more than 5 weapons: ")
            }
            return@callback result
        }
    } else if(split.size == 1) {
        val providers = Services.ItemFilter.itemStatProviders.filter {
            it.filterTypes.any { supportedProviderTypes.contains(it) }
        }
        val unfinished = providers.filter {
            it.name.startsWith(name, true) || it.aliases.any { it.startsWith(name, true) }
        }
        val result: ErrorOr<ItemStatProvider<*>> = if(unfinished.size == 1) {
            ErrorOr.of(unfinished[0])
        } else if(unfinished.size < 4) {
            ErrorOr.error("suggest: " + unfinished.joinToString { it.displayName })
        } else {
            val regex = name.toList().joinToString(prefix = "^", postfix = "$", separator = "\\w*").lowercase().toRegex()
            val unfinished2 = providers.filter {
                regex.matches(it.name.lowercase())
            }
            if (unfinished2.size == 1) {
                ErrorOr.of(unfinished2[0])
            } else {
                originalResult
            }
        }
        return@callback result
    }
    originalResult
}

val SuggestionWindow by lazy {
    val constructor = class_464::class.java.declaredConstructors.first().apply {
        trySetAccessible()
    }
    fun callback(owner: class_4717, x: Int, y: Int, width: Int, suggestions: List<Suggestion>, narrate: Boolean) =
        constructor.newInstance(owner, x, y, width, suggestions, narrate) as class_464
    ::callback
}

val mc = Client.minecraft

class SuggestionSearchWidget(x: Int, y: Int, width: Int, height: Int,
                             supportedProviderTypes: List<ItemProviderType>, supportsSorting: Boolean,
                             onSearchQueryUpdateConsumer: Consumer<ItemSearchQuery>, textboxScreen: TextboxScreen
) : ItemSearchWidget(
    x, y, width, height, supportedProviderTypes, supportsSorting, onSearchQueryUpdateConsumer, textboxScreen
) {
    val screen = textboxScreen as? class_437 ?: throw IllegalArgumentException("screen is not Screen")

    val textRenderer = FontRenderer.getInstance().font!!

    val fakeTextFieldWidget = object : class_342(textRenderer, 0, 0, 4, 12, class_2561.method_43470("filter")) {
        init {
            this.method_1858(false)
            this.method_1856(false)
            this.method_1852(textBoxInput)
        }

        override fun method_1852(text: String) {
            val old = textBoxInput
            super.method_1852(text)
            textBoxInput = text
            if(old != text) {
                val pos = cursorPosition + text.length - old.length
                setCursorPosition(pos)
                setHighlightPosition(pos)
                onUpdate(text)
            }
        }

        override fun method_1881() = cursorPosition
    }

    val chatInputSuggestor = object : class_4717(mc, screen, fakeTextFieldWidget,
        textRenderer, false, false, 1, 10,true, -805306368
    ) {
        val completingSuggestions by this._getField<Boolean>("field_21614")
        var pendingSuggestions by this._getField<CompletableFuture<Suggestions>>("field_21611")
        var window by this._getField<class_464>("field_21612")

        override fun method_23934() {
            try {
                if(completingSuggestions != true)
                    this.method_44931()
                val text = textBoxInput
                if(cursorPosition > 0 && cursorPosition < text.length && text[cursorPosition-1] == ' ' && text[cursorPosition] != ' ') return
                val tokens = text.split(" ")
                var tokenStartIndex = 0
                var endIndex = -1
                var lastToken = ""
                for (token in tokens) {
                    lastToken = token
                    if (tokenStartIndex + token.length >= cursorPosition) {
                        if (token.isEmpty()) return
                        endIndex = tokenStartIndex + token.length
                        break
                    }
                    tokenStartIndex += token.length + 1
                }
                if (endIndex == -1) return
                var suggestions = listOf("fakeSuggestion")

                var prefix0 = ""
                if (!lastToken[0].isLetter() && !lastToken[0].isDigit() && !lastToken.startsWith("/")) {
                    prefix0 = lastToken[0].toString()
                    lastToken = lastToken.substring(1)
                }
                var suggestWeapon = false
                var inSort = false
                val (prefix, toSuggest) = if(lastToken.startsWith("/")) {
                    suggestWeapon = true
                    "" to lastToken
                } else {
                    val split = lastToken.split(":")
                    val left = split.first()

                    if (left.contains("sort")) {
                        inSort = true
                        if (split.size == 1) {
                            "$left:" to ""
                        } else {
                            suggestWeapon = split[1].startsWith("/")
                            "$left:" to split[1]
                        }
                    } else {
                        if(cursorPosition > tokenStartIndex + left.length) return
                        "" to left
                    }
                }
                val realEnd = (endIndex+1).coerceAtMost(text.length)
                val left2 = text.substring(tokenStartIndex, cursorPosition)
                var tail = text.substring(cursorPosition, realEnd)
                if (suggestWeapon) {
                    val fixed = toSuggest.substring(1).replace(" ", "_")
                    val name = fixed.substringBefore("/")
                    suggestions = Models.Gear.allGearInfos.filter {
                        it.type.isWeapon && (it.name.replace(" ", "_").contains(name, true))
                    }.map { "/" + it.name.replace(" ", "_") + "/" }.toList()
                    if (tail.contains("/"))
                        tail = tail.substringAfter("/")
                    else if(!inSort && left2.substring(1).contains("/")) tail = left2.substringAfterLast("/") + tail//Chat.log("post: ${left2.substringAfterLast("/")}")
                } else {
                    suggestions = Services.ItemFilter.itemStatProviders.filter {
                        it.filterTypes.any { supportedProviderTypes.contains(it) } &&
                                (toSuggest.isEmpty() || it.name.contains(toSuggest, true) || it.aliases.any { it.contains(toSuggest, true) })
                    }.map { it.name }
                    if (tail.contains(":")) {
                        tail = ":" + tail.substringAfter(":")
                    }
                }

                suggestions = suggestions.map {
                    val s = "$prefix0$prefix$it$tail"
                    if (endIndex >= text.length && s.contains(":")) "$s " else s
                }

                pendingSuggestions = SuggestionsBuilder(text.take(realEnd), tokenStartIndex).apply {
                    suggestions.forEach(::suggest)
                }.buildFuture()
                this.method_23920(true)
            } catch (e: IndexOutOfBoundsException) {}
        }

        override fun method_23924(keyCode: Int, scanCode: Int, modifier: Int): Boolean {
            if (window?.method_2377(keyCode, scanCode, modifier) == true)
                return true
            if (keyCode == GLFW.GLFW_KEY_TAB) {
                this.method_23920(true)
                return true
            }
            return false
        }

        override fun method_23920(narrateFirstSuggestion: Boolean) {
            pendingSuggestions?.let {
                if(it.isDone) {
                    val suggestions = it.join()
                    if(suggestions.isEmpty) return
                    var i = suggestions.list.maxOf { textRenderer.method_1727(it.text) }

                    val x = (fakeTextFieldWidget.method_1889(suggestions.range.start) + 5).coerceAtLeast(0)
                    val y = fakeTextFieldWidget.method_46427()

                    window = SuggestionWindow(this, x, y, i, suggestions.list, narrateFirstSuggestion)
                }
            }
        }
    }

    init {
        chatInputSuggestor.method_53869(false)
        chatInputSuggestor.method_23934()
    }

    override fun method_25404(keyCode: Int, scanCode: Int, modifier: Int): Boolean {
        if (chatInputSuggestor.method_23924(keyCode, scanCode, modifier))
            return true
        try {
            return super.method_25404(keyCode, scanCode, modifier)
        } catch (e: Exception) {
            Chat.log(e.stackTraceToString())
        }
        return false
    }


    override fun method_48579(guiGraphics: class_332, mouseX: Int, mouseY: Int, partialTick: Float) {
        guiGraphics.method_51448().method_22903()
        guiGraphics.method_51448().method_46416(this.method_46426().toFloat(), this.method_46427().toFloat(), 200f)
        chatInputSuggestor.method_23923(guiGraphics, mouseX, mouseY)
        guiGraphics.method_51448().method_22909()
        super.method_48579(guiGraphics, mouseX, mouseY, partialTick)
    }

    override fun setCursorAndHighlightPositions(index: Int) {
        super.setCursorAndHighlightPositions(index)
        if(textBoxInput == fakeTextFieldWidget.method_1882()) {
            chatInputSuggestor.method_23934()
        }
    }

    override fun onUpdate(text: String) {
        onChatFieldUpdate(text)
        if(fakeTextFieldWidget.method_1882() != text)
            fakeTextFieldWidget.method_1852(text)
        super.onUpdate(text)
    }

    fun onChatFieldUpdate(text: String) {
        chatInputSuggestor.method_23933(fakeTextFieldWidget.method_1882() != text)
        try {
            chatInputSuggestor.method_23934()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

object MixinCallback {
    var onNewItemSearchWidget = { x: Int, y: Int, width: Int, height: Int,
                                  supportedProviderTypes: List<ItemProviderType>, supportsSorting: Boolean,
                                  onSearchQueryUpdateConsumer: Consumer<ItemSearchQuery>, textboxScreen: TextboxScreen ->
        ItemSearchWidget(x, y, width, height, supportedProviderTypes, supportsSorting, onSearchQueryUpdateConsumer, textboxScreen)
    }
}

MixinCallback.onNewItemSearchWidget = ::SuggestionSearchWidget

@CTransformer(WynntilsGuideScreen::class)
class MixinItemSearchWidget {
    @CRedirect(method=["<init>"], target = CTarget(CTargetType.SIMPLE_NEW, target="ItemSearchWidget"))
    fun transform(x: Int, y: Int, width: Int, height: Int,
                  supportedProviderTypes: List<ItemProviderType>, supportsSorting: Boolean,
                  onSearchQueryUpdateConsumer: Consumer<ItemSearchQuery>, textboxScreen: TextboxScreen): ItemSearchWidget {
        return MixinCallback.onNewItemSearchWidget(x, y, width, height, supportedProviderTypes, supportsSorting, onSearchQueryUpdateConsumer, textboxScreen)
    }
}

@CReplaceCallback
@CTransformer(ItemFilterService::class)
class MixinItemFilterService {
    @CInline
    @CInject(method = ["getItemStatProvider"], target = [CTarget("RETURN")], cancellable = true)
    fun getItemStatProvider(name: String, supportedProviderTypes: List<ItemProviderType>, cir: InjectionCallback?) {
        val original = (cir?.returnValue as? ErrorOr<ItemStatProvider<*>>) ?: return
        if(original.hasError()) {
            cir.returnValue = ItemFilterServiceHandler.callback(name, supportedProviderTypes, original)
        }
    }
}

class WynnListener {
    @SubscribeEvent
    fun onItemToolTip(event: ItemTooltipRenderEvent.Pre) {
        val wynnItem = Models.Item.asWynnItem(event.itemStack, GearItem::class.java).getOrNull() ?: return

        lastMixedDamageStatProvider?.let { provider ->

            val value = provider.getValue(wynnItem)
            if (value.isEmpty) return@let
            val tooltips = event.tooltips.toMutableList()
            tooltips.add(1,
                Chat.createTextBuilder()
                    .append(provider.weaponInfo.name)
                    .append(": ")
                    .append(value.get()).build().raw)
            event.tooltips = tooltips
        }
    }
}

val statFilters = Services.ItemFilter._getPrivateValue<MutableList<Pair<*, *>>>("statFilters")!!
val filterPair = Pair.of(String::class.java, WithoutStatFilterFactory())

val providers = arrayOf(
    AbilityPointStatProvider,
    QuestRequestStatProvider,
    ObtainFromStatProvider,
    WithoutStatProvider,
    AnyEffectivenessStatProvider
)
Services.ItemFilter.itemStatProviders.addAll(providers)
statFilters.add(statFilters.size - 1, filterPair)

Services.ItemFilter.itemStatProviders

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinItemFilterService::class)
RuntimeTransform.addTransformer(MixinItemSearchWidget::class)
RuntimeTransform.transform()

val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.removeAll(providers)
    statFilters.remove(filterPair)

    WynntilsMod.unregisterEventListener(wynnListener)
}


Chat.toast("MISC", "enabled")