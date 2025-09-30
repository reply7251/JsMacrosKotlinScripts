@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.models.gear.type.GearAttackSpeed
import com.wynntils.models.gear.type.GearInfo
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.CraftedConsumableItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.items.items.game.IngredientItem
import com.wynntils.models.stats.builders.SkillStatBuilder
import com.wynntils.services.itemfilter.ItemFilterService
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.type.ErrorOr
import com.wynntils.utils.type.Pair
import com.wynntils.utils.type.RangedValue
import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api._getField
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.api.instrumentation
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.*
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.annotations.injection.COverride
import net.lenni0451.classtransform.annotations.injection.CRedirect
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.filter.LevelMatchFilter
import org.apache.logging.log4j.core.filter.ThresholdFilter
import org.apache.logging.log4j.spi.ExtendedLogger
import org.apache.logging.slf4j.Log4jLogger
import org.apache.logging.slf4j.Log4jLoggerFactory
import org.apache.logging.slf4j.Log4jMarkerFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory
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

inner class WithoutStatFilter(val stat: String) : StatFilter<String>() {
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

inner class WithoutStatFilterFactory : StatFilterFactory<WithoutStatFilter>() {
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

class MixedDamageStatProvider(val weaponInfo: GearInfo, damageTypeString: String) : ItemStatProvider<Int>() {
    val damageType: String = damageTypes.firstOrNull { damageTypeString.contains(it, true) } ?: "spell"
    val attackSpeed = (attackSpeeds[weaponInfo.fixedStats.attackSpeed.getOrNull()] ?: 1.0)
    fun getAvg(range: RangedValue) = (range.high + range.low) / 2.0

    fun getDamageBonus(idName: String, idValue: Int): Double {
        val name = idName.lowercase()
        if(name.contains("damage", true) && !name.contains("critical")) {
            if(name.contains(damageType) || !damageTypes.any { name.contains(it) }) {
                if(name.contains("elemental") && name.contains("raw")) {
                    val elements = weaponInfo.fixedStats.damages.count { it.key().element.isPresent }
                    return if(name.contains("raw")) {
                        idValue.toDouble() * elements
                    } else {
                        weaponInfo.fixedStats.damages
                            .map { if(it.key().element.isPresent) getAvg(it.value()) * idValue else 0.0 }
                            .reduce { acc, i -> acc + i } * 0.01 * attackSpeed
                    }
                } else if(!elementTypes.any { name.contains(it) }) {
                    return if(name.contains("raw")) {
                        idValue.toDouble()
                    } else {
                        weaponInfo.fixedStats.damages
                            .map { getAvg(it.value()) }
                            .reduce { acc, i -> acc + i } * idValue * 0.01 * attackSpeed
                    }
                } else {
                    weaponInfo.fixedStats.damages.forEach {
                        if(name.contains(it.key().apiName.lowercase())) {
                            return if(name.contains("raw")) {
                                idValue.toDouble()
                            } else {
                                getAvg(it.value()) * idValue * 0.01 * attackSpeed
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

    if(split.size == 3 && split[0].isEmpty()) {
        val startsWith = split[1].startsWith("^")
        val weaponName = split[1].replace("_", " ").let {
            if(startsWith) it.substring(1) else it
        }
        val type = split[2].lowercase()
        val matches = Models.Gear.allGearInfos.filter {
            it.type.isWeapon &&
                    if(startsWith) it.name.startsWith(weaponName, true)
                    else it.name.contains(weaponName, true)
        }.toList()
        if(damageTypes.any { it.contains(type) }) {
            val result = if(matches.size == 1)
                ErrorOr.of(MixedDamageStatProvider(matches[0], type) as ItemStatProvider<*>)
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

Services.ItemFilter.itemStatProviders.add(AbilityPointStatProvider)
Services.ItemFilter.itemStatProviders.add(QuestRequestStatProvider)
Services.ItemFilter.itemStatProviders.add(ObtainFromStatProvider)
Services.ItemFilter.itemStatProviders.add(WithoutStatProvider)
statFilters.add(statFilters.size - 1, filterPair)

Client.waitTick(20)

RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinItemFilterService::class)
RuntimeTransform.transform()

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.remove(AbilityPointStatProvider)
    Services.ItemFilter.itemStatProviders.remove(QuestRequestStatProvider)
    Services.ItemFilter.itemStatProviders.remove(ObtainFromStatProvider)
    Services.ItemFilter.itemStatProviders.remove(WithoutStatProvider)
    statFilters.remove(filterPair)
}


Chat.toast("MISC", "enabled")