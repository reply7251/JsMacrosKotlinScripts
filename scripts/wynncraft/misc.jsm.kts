@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.mc.event.ScreenInitEvent
import com.wynntils.models.gear.type.GearAttackSpeed
import com.wynntils.models.gear.type.GearInfo
import com.wynntils.models.gear.type.GearType
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.models.stats.builders.SkillStatBuilder
import com.wynntils.screens.guides.gear.WynntilsItemGuideScreen
import com.wynntils.services.itemfilter.ItemFilterService
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import com.wynntils.services.itemfilter.type.StatFilter
import com.wynntils.services.itemfilter.type.StatFilterFactory
import com.wynntils.utils.type.ErrorOr
import com.wynntils.utils.type.Pair
import com.wynntils.utils.type.RangedValue
import me.hellrevenger.generated.ItemStack
import me.hellrevenger.library.api.RuntimeMixin
import me.hellrevenger.library.api.instrumentation
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.implementation.bytecode.assign.Assigner
import net.bytebuddy.matcher.ElementMatchers
import net.lenni0451.classtransform.InjectionCallback
import net.lenni0451.classtransform.annotations.CInline
import net.lenni0451.classtransform.annotations.CReplaceCallback
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CInject
import net.lenni0451.classtransform.utils.InjectionCallbackReplacer
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.JsMacrosClient
import xyz.wagyourtail.jsmacros.core.MethodWrapper
import xyz.wagyourtail.jsmacros.core.event.impl.EventCustom
import xyz.wagyourtail.jsmacros.core.library.impl.classes.ClassBuilder
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import kotlin.jvm.optionals.getOrNull

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

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

EventListener("ItemFilterService#getItemStatProvider", { event ->
    val name = event.getString("name") ?: return@EventListener

    val split = name.split("/")
    if(split.size == 3 && split[0].isEmpty()) {
        val weaponName = split[1].replace("_", " ")
        val type = split[2].lowercase()
        val matches = Models.Gear.allGearInfos.filter { it.type.isWeapon && it.name.contains(weaponName, true) }.toList()
        if(damageTypes.any { it.contains(type) }) {
            val result = if(matches.size == 1)
                ErrorOr.of(MixedDamageStatProvider(matches[0], type))
            else if(matches.size < 5) {
                ErrorOr.error("found weapons: " + matches.joinToString { it.name })
            } else {
                ErrorOr.error("found more than 5 weapons: ")
            }
            event.putObject("result", result)
            event.cancel()
        }
    }
}, true)

@CReplaceCallback
@CTransformer(ItemFilterService::class)
class MixinItemFilterService2 {
    @CInline
    @CInject(method = ["getItemStatProvider"], target = [CTarget("RETURN")], cancellable = true)
    fun getItemStatProvider(name: String?, supportedProviderTypes: List<ItemProviderType>?, cir: InjectionCallback?) {
        val original = (cir?.returnValue as? ErrorOr<ItemStatProvider<*>>) ?: return
        if(original.hasError()) {
            val event = EventCustom(JsMacrosClient.clientCore, "ItemFilterService#getItemStatProvider")
            event.putString("name", name)
            event.cancelable = true
            event.trigger()
            if(event.isCanceled) {
                cir?.returnValue = event.getObject("result")
            }
        }
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


val manager = RuntimeMixin.createTransformManager()
manager.addTransformer(MixinItemFilterService2::class.java.name)
manager.hookInstrumentation(instrumentation)

(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    RuntimeMixin.removeTransformManager(manager)

    Services.ItemFilter.itemStatProviders.remove(AbilityPointStatProvider)
    Services.ItemFilter.itemStatProviders.remove(QuestRequestStatProvider)
    Services.ItemFilter.itemStatProviders.remove(ObtainFromStatProvider)
    Services.ItemFilter.itemStatProviders.remove(WithoutStatProvider)
    statFilters.remove(filterPair)
}

Chat.toast("MISC", "enabled")