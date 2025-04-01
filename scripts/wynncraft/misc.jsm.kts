@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.builders.SkillStatBuilder
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.type.Pair
import me.hellrevenger.generated.ItemStack
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import kotlin.jvm.optionals.getOrNull

object AbilityPointStatProvider : ItemStatProvider<Int>() {
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
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR)

    override fun getName() = "SkillPoints"

    override fun getDisplayName() = "Skill Points"

    override fun getAliases() = mutableListOf("sp")
}

object QuestRequestStatProvider: ItemStatProvider<String>() {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return gear.itemInfo.requirements.quest
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR)

    override fun getName() = "Quest"

    override fun getDisplayName() = "Quest"
}

object ObtainFromStatProvider: ItemStatProvider<String>() {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return gear.itemInfo.metaInfo.obtainInfo.firstOrNull()?.name ?: Optional.empty()
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR)

    override fun getName() = "Obtain"

    override fun getDisplayName() = "Obtain"

    override fun getAliases() = mutableListOf("from")
}

object WithoutStatProvider: ItemStatProvider<String>() {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return Optional.of(gear.itemInfo.requirements.skills.joinToString("/") { it.key().name })
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR)

    override fun getName() = "Without"

    override fun getDisplayName() = "Without"

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

object MixedDamageStatProvider : ItemStatProvider<String>() {
    override fun getValue(p0: WynnItem?): Optional<String> {
        (p0 as? GearItem)?.let { gear ->
            return Optional.of(gear.itemInstance.getOrNull()?.let {  instance ->
                instance.identifications.mapNotNull { id ->
                    if(id.statType.apiName.contains("damage", true))
                        id.statType.apiName.lowercase() + ":" + id.value
                    else null
                }.joinToString("/")
            } ?: gear.possibleValues.mapNotNull { id ->
                if(id.statType.apiName.contains("damage", true))
                    id.statType.apiName.lowercase() + ":" + id.range.high
                else null
            }.joinToString("/"))
        }
        return Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR, ItemProviderType.GEAR_INSTANCE)

    override fun getName() = "MixedDamage"
    override fun getAliases() = mutableListOf("mix")

    override fun getDisplayName() = "Mixed Damage"
}

class MixedDamageStatFilter(val damageString: String) : StatFilter<String>() {
    val damageTypes = listOf("spell", "main")
    val elementTypes = listOf("earth", "thunder", "water", "fire", "air")

    override fun matches(gear: String?): Boolean {
        try {
            gear?.lowercase()?.let { gear ->
                val splitReq = if(damageString.contains("/")) damageString.split("/")
                else if (damageString.isNotEmpty()) listOf(damageString)
                else listOf("1")

                val dps = splitReq[0].toInt()
                var i = 1
                var damageType = if(i >= splitReq.size) null else getDamageType(splitReq[i])
                if(damageType != null) i++
                val elementType = if(i >= splitReq.size) null else getElementType(splitReq[i])
                if(elementType != null) i++
                if(damageType == null) {
                    damageType = if(i >= splitReq.size) null else getDamageType(splitReq[i])
                    if(damageType != null) i++
                }
                if(i >= splitReq.size) return false
                var score = 0
                gear.split("/").forEach { id ->
                    if(!id.contains(":")) return@forEach
                    val split = id.split(":")
                    val idName = split[0]
                    val idValue = split[1].toInt()
                    val matchDamageType = damageType == null || getDamageType(idName) == null || idName.contains(damageType)
                    val matchElementType = elementType == null || getElementType(idName) == null || idName.contains(elementType)
                    if(matchElementType && matchDamageType) {
                        score += if(idName.contains("raw"))
                            idValue
                        else
                            dps * idValue / 100
                    }
                }
                return score > splitReq[i].toInt()

            }
        } catch (e: NumberFormatException) {}
        return false
    }

    fun getDamageType(string: String) = damageTypes.firstOrNull { string.contains(it, true) }

    fun getElementType(string: String) = elementTypes.firstOrNull { string.contains(it, true) }

    override fun asString(): String {
        return "/$damageString"
    }
}

class MixedDamageStatFilterFactory : StatFilterFactory<MixedDamageStatFilter>() {
    override fun create(input: String?): Optional<MixedDamageStatFilter> {
        if(input?.startsWith("/") == true) {
            return Optional.of(MixedDamageStatFilter(input.substring(1)))
        }
        return Optional.empty()
    }
}

val statFiltersField = Reflection.getDeclaredField(Services.ItemFilter::class.java, "statFilters")
statFiltersField.trySetAccessible()
val statFilters = statFiltersField.get(Services.ItemFilter) as MutableList<Pair<*, *>>
val filterPair = Pair.of(String::class.java, WithoutStatFilterFactory())
val filterPair2 = Pair.of(String::class.java, MixedDamageStatFilterFactory())

Services.ItemFilter.itemStatProviders.add(AbilityPointStatProvider)
Services.ItemFilter.itemStatProviders.add(QuestRequestStatProvider)
Services.ItemFilter.itemStatProviders.add(ObtainFromStatProvider)
Services.ItemFilter.itemStatProviders.add(WithoutStatProvider)
Services.ItemFilter.itemStatProviders.add(MixedDamageStatProvider)
statFilters.add(statFilters.size - 1, filterPair)
statFilters.add(statFilters.size - 1, filterPair2)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.remove(AbilityPointStatProvider)
    Services.ItemFilter.itemStatProviders.remove(QuestRequestStatProvider)
    Services.ItemFilter.itemStatProviders.remove(ObtainFromStatProvider)
    Services.ItemFilter.itemStatProviders.remove(WithoutStatProvider)
    Services.ItemFilter.itemStatProviders.remove(MixedDamageStatProvider)
    statFilters.remove(filterPair)
    statFilters.remove(filterPair2)
}

Chat.toast("MISC", "enabled")