@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")
import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.core.components.Services
import com.wynntils.features.inventory.ContainerSearchFeature
import com.wynntils.mc.event.ScreenInitEvent
import com.wynntils.models.containers.Container
import com.wynntils.models.containers.ContainerModel
import com.wynntils.models.containers.containers.LobbyContainer
import com.wynntils.models.containers.containers.trademarket.TradeMarketContainer
import com.wynntils.models.containers.type.ContainerBounds
import com.wynntils.models.containers.type.HighlightableProfessionProperty
import com.wynntils.models.containers.type.ScrollableContainerProperty
import com.wynntils.models.containers.type.SearchableContainerProperty
import com.wynntils.models.items.WynnItem
import com.wynntils.models.items.items.game.GearItem
import com.wynntils.screens.base.widgets.ItemFilterUIButton
import com.wynntils.screens.base.widgets.ItemSearchWidget
import com.wynntils.screens.base.widgets.WynntilsButton
import com.wynntils.services.itemfilter.type.ItemProviderType
import com.wynntils.services.itemfilter.type.ItemStatProvider
import me.hellrevenger.generated.Map_Screen.drawables
import me.hellrevenger.generated.Map_Widget.getX
import me.hellrevenger.generated.Map_Widget.getY
import me.hellrevenger.generated.Map_Widget.setX
import me.hellrevenger.generated.Map_Widget.setY
import me.hellrevenger.language.impl.KotlinScriptContext
import me.hellrevenger.library.api._getField
import me.hellrevenger.library.api._getPrivateValue
import me.hellrevenger.library.api._getUnsafeField
import net.neoforged.bus.api.EventPriority
import net.neoforged.bus.api.SubscribeEvent
import sun.misc.Unsafe
import xyz.wagyourtail.jsmacros.core.library.impl.FReflection
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.*
import java.util.function.Supplier
import java.util.regex.Pattern
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

val pattern = Pattern.compile("\uDAFF\uDFE8\uE011")

val NEXT_PAGE_PATTERN: Pattern = Pattern.compile("§7Next Page")
val PREVIOUS_PAGE_PATTERN: Pattern = Pattern.compile("§7Previous Page")

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

while (Managers.Feature.getFeatureInstance(ContainerSearchFeature::class.java) == null) {
    Client.waitTick(10)
}

val containerSearchFeature: ContainerSearchFeature = Managers.Feature.getFeatureInstance(ContainerSearchFeature::class.java)

fun getContainerBounds(startRow: Int, startCol: Int, endRow: Int, endCol: Int): ContainerBounds? =
    Class.forName("com.wynntils.models.containers.type.ContainerBounds", true, FReflection.classLoader)
        .constructors.firstOrNull { it.parameterCount == 4 }?.let {
            return it.newInstance(startRow, startCol, endRow, endCol) as ContainerBounds
        }

class MyTradeMarketContainer : TradeMarketContainer(), SearchableContainerProperty {
    override fun supportedProviderTypes(): MutableList<ItemProviderType> {
        return ItemProviderType.normalTypes()
    }
}

class WynncraftServerContainer : LobbyContainer(), SearchableContainerProperty {
    override fun getBounds() = getContainerBounds(1, 1, 5, 7)

    override fun supportedProviderTypes(): MutableList<ItemProviderType> {
        return ItemProviderType.normalTypes()
    }
}

object RerollStatProvider : ItemStatProvider<Int>() {
    override fun getValue(p0: WynnItem?): Optional<Int> {
        return (p0 as? GearItem)?.let { gear ->
            Optional.of(gear.rerollCount)
        } ?: Optional.empty()
    }

    override fun getFilterTypes() = mutableListOf(ItemProviderType.GEAR_INSTANCE)
    override fun getName() = "reroll"
    override fun getDisplayName() = "Reroll"
}

class WynnListener {
    @SubscribeEvent(priority = EventPriority.LOW)
    fun onScreen(event: ScreenInitEvent.Pre) {
        if(Models.Container.currentContainer !is MyTradeMarketContainer) return
        event.screen.drawables.forEach {
            when(it) {
                is ItemFilterUIButton -> it.setY(it.getY() - 40)
                is ItemSearchWidget -> it.setY(it.getY() - 40)
                is WynntilsButton -> it.setX(it.getX() + 20)
            }
        }
    }
}
fun main(): Boolean {
    var success1 = false
    var success2 = false

    val containerReplaceMap = mapOf(
        MyTradeMarketContainer() to TradeMarketContainer::class,
        WynncraftServerContainer() to LobbyContainer::class
    )
    val addedContainers = mutableSetOf<Container>()
    val removedContainers = mutableSetOf<Container>()

    Models.Container._getPrivateValue<ArrayList<Container>>("containerTypes")?.let { containerTypes ->
        containerReplaceMap.forEach { (t, u) ->
            containerTypes.add(t)
            addedContainers.add(t)
            containerTypes.removeIf {
                if(u.isInstance(it) && !t::class.isInstance(it)) {
                    removedContainers.add(it)
                    true
                } else false
            }
        }

        context.onContextClosed {
            containerTypes.removeAll(addedContainers)
            containerTypes.addAll(removedContainers)
        }
        success1 = true
    }

    var searchableContainerMap by containerSearchFeature
        ._getUnsafeField<Map<Class<out SearchableContainerProperty>, Supplier<Boolean>>>("searchableContainerMap")

    searchableContainerMap?.let { map ->
        val newMap: HashMap<Class<out SearchableContainerProperty>, Supplier<Boolean>> = hashMapOf()
        map.forEach { t, u -> newMap[t] = u }

        addedContainers.forEach {
            newMap[it.javaClass as Class<out SearchableContainerProperty>] = Supplier { true }
        }
        searchableContainerMap = newMap

        context.onContextClosed {
            searchableContainerMap = map
        }
        success2 = true
    }

    val listener = WynnListener()
    WynntilsMod.registerEventListener(listener)
    Services.ItemFilter.itemStatProviders.add(RerollStatProvider)
    context.onContextClosed {
        WynntilsMod.unregisterEventListener(listener)
        Services.ItemFilter.itemStatProviders.remove(RerollStatProvider)
    }
    return success1 and success2
}

if(!main()) {
    Chat.toast("market", "patch failed")
}