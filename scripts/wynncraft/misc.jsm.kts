@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
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
import com.wynntils.services.itemfilter.ItemFilterService
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.type.ErrorOr
import com.wynntils.utils.type.Pair
import com.wynntils.utils.type.RangedValue
import me.hellrevenger.library.api._getPrivateValue
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.*
import net.lenni0451.classtransform.annotations.injection.CInject
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import kotlin.jvm.optionals.getOrNull

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
        weaponInfo.fixedStats().damages.find { it.key() == DamageType.NEUTRAL }?.let {
            val neutralBaseLow = it.value().low
            val neutralBaseHigh = it.value().high
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

ItemFilterServiceHandler.callback = callback@ { name, supportedProviderTypes, originalResult ->
    val split = name.split("/")

    if(split.size >= 3 && split[0].isEmpty()) {
        val startsWith = split[1].startsWith("^")
        val weaponName = split[1].replace("_", " ").let {
            if(startsWith) it.substring(1) else it
        }
        val powder = split[2]
        val type = if(split.size > 3) split[3] else ""
        val matches = Models.Gear.allGearInfos.filter {
            it.type.isWeapon &&
                    if(startsWith) it.name.startsWith(weaponName, true)
                    else it.name.contains(weaponName, true)
        }.toList()
        if(damageTypes.any { it.contains(type) }) {
            val result = if(matches.size == 1)
                ErrorOr.of(MixedDamageStatProvider(matches[0], type, powder) as ItemStatProvider<*>)
            else if(matches.size < 6) {
                ErrorOr.error("found weapons: " + matches.joinToString { it.name })
            } else {
                ErrorOr.error("found more than 5 weapons: ")
            }
            return@callback result
        }
    } else if(split.size == 1) {
        val unfinished = Services.ItemFilter.itemStatProviders.filter {
            it.filterTypes.any { supportedProviderTypes.contains(it) } && (
                    it.name.startsWith(name, true) || it.aliases.any { it.startsWith(name, true) }
                    )
        }
        val result: ErrorOr<ItemStatProvider<*>> = if(unfinished.size == 1) {
            ErrorOr.of(unfinished[0])
        } else if(unfinished.size < 4) {
            ErrorOr.error("suggest: " + unfinished.joinToString { it.displayName })
        } else {
            originalResult
        }
        return@callback result
    }
    originalResult
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
RuntimeTransform.transform()

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.removeAll(providers)
    statFilters.remove(filterPair)
}


Chat.toast("MISC", "enabled")