@file:ImportJar("../libs/jars/wynntils.jar")

import com.wynntils.core.components.Services
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.builders.SkillStatBuilder
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.type.Pair
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*

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
        return stats?.contains(stat, true) != true
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

val statFiltersField = Reflection.getDeclaredField(Services.ItemFilter::class.java, "statFilters")
statFiltersField.trySetAccessible()
val statFilters = statFiltersField.get(Services.ItemFilter) as MutableList<Pair<*, *>>
val filterPair = Pair.of(String::class.java, WithoutStatFilterFactory())

Services.ItemFilter.itemStatProviders.add(AbilityPointStatProvider)
Services.ItemFilter.itemStatProviders.add(QuestRequestStatProvider)
Services.ItemFilter.itemStatProviders.add(ObtainFromStatProvider)
Services.ItemFilter.itemStatProviders.add(WithoutStatProvider)
statFilters.add(statFilters.size - 1, filterPair)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    Services.ItemFilter.itemStatProviders.remove(AbilityPointStatProvider)
    Services.ItemFilter.itemStatProviders.remove(QuestRequestStatProvider)
    Services.ItemFilter.itemStatProviders.remove(ObtainFromStatProvider)
    Services.ItemFilter.itemStatProviders.remove(WithoutStatProvider)
    statFilters.remove(filterPair)
}

Chat.toast("MISC", "enabled")