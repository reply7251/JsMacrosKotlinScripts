@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")
import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.features.inventory.ContainerSearchFeature
import com.wynntils.models.containers.Container
import com.wynntils.models.containers.ContainerModel
import com.wynntils.models.containers.containers.LobbyContainer
import com.wynntils.models.containers.containers.TradeMarketContainer
import com.wynntils.models.containers.type.ContainerBounds
import com.wynntils.models.containers.type.ScrollableContainerProperty
import com.wynntils.models.containers.type.SearchableContainerProperty
import com.wynntils.screens.base.widgets.SearchWidget
import com.wynntils.services.itemfilter.type.ItemProviderType
import me.hellrevenger.generated.Map_Widget.setY
import sun.misc.Unsafe
import org.jetbrains.kotlin.backend.common.pop
import xyz.wagyourtail.jsmacros.client.access.IInventory
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.core.library.impl.FReflection
import xyz.wagyourtail.jsmacros.core.service.EventService
import java.util.function.Supplier
import java.util.regex.Pattern
import kotlin.reflect.full.primaryConstructor


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

//EventListener(context, EventOpenScreen::class.java, { event ->
//    (event.screen as? GenericContainerScreen)?.let {
//        val string = it.getTitle().string
//        Chat.log("match: " + pattern.matcher(string).matches())
//        Chat.log(Chat.createTextBuilder().append("target: " + string)
//            .withClickEvent("copy_to_clipboard", string).build())
//
//        val method = ContainerSearchFeature::class.java.getDeclaredMethod("getCurrentSearchableContainer")
//        if(method.trySetAccessible()) {
//            Client.waitTick()
//            Chat.log("current container: " + Models.Container.currentContainer)
//            val result = method.invoke(containerSearchFeature)
//            Chat.log("current container: " + result)
//        }
//    }
//})


class MyTradeMarketContainer : Container(pattern), SearchableContainerProperty, ScrollableContainerProperty {
    override fun getNextItemPattern() = NEXT_PAGE_PATTERN

    override fun getPreviousItemPattern() = PREVIOUS_PAGE_PATTERN

    override fun getNextItemSlot() = 53

    override fun getPreviousItemSlot() = 51
    override fun getBounds(): ContainerBounds? {
        FReflection(null).getClass<ContainerBounds>("com.wynntils.models.containers.type.ContainerBounds")
            .constructors.firstOrNull { it.parameterCount == 4 }?.let {
                return it.newInstance(0, 0, 4, 8) as ContainerBounds
            }
        return null
    }

    override fun supportedProviderTypes(): MutableList<ItemProviderType> {
        val searchWidgetField = ContainerSearchFeature::class.java.getDeclaredField("lastSearchWidget")
        if(searchWidgetField.trySetAccessible()) {
            val widget = (searchWidgetField.get(containerSearchFeature) as? SearchWidget)
            widget?.let {
                it.setY(70)
            }
        }
        return ItemProviderType.normalTypes()
    }
}

class WynncraftServerContainer : LobbyContainer(), SearchableContainerProperty {

    override fun getBounds(): ContainerBounds? {
        FReflection(null).getClass<ContainerBounds>("com.wynntils.models.containers.type.ContainerBounds")
            .constructors.firstOrNull { it.parameterCount == 4 }?.let {
                return it.newInstance(1, 1, 5, 7) as ContainerBounds
            }
        return null
    }

    override fun supportedProviderTypes(): MutableList<ItemProviderType> {
        return ItemProviderType.normalTypes()
    }
}

fun main(): Boolean {
    var onStop = { }
    var success1 = false
    var success2 = false

    val containerReplaceMap = mapOf(
        MyTradeMarketContainer() to TradeMarketContainer::class,
        WynncraftServerContainer() to LobbyContainer::class
    )
    val addedContainers = mutableSetOf<Container>()
    val removedContainers = mutableSetOf<Container>()

    val containerTypesField = ContainerModel::class.java.getDeclaredField("containerTypes")
    if(containerTypesField.trySetAccessible()) {
        (containerTypesField.get(Models.Container) as? ArrayList<Container>)?.let {

            containerReplaceMap.forEach { (t, u) ->
                it.add(t)
                addedContainers.add(t)
                it.removeIf {
                    if(u.isInstance(it) && !t::class.isInstance(it)) {
                        removedContainers.add(it)
                        true
                    } else false
                }
            }

            onStop = {
                it.removeAll(addedContainers)
                it.addAll(removedContainers)
            }
            success1 = true
        }
    }
    val unsafeField = Unsafe::class.java.getDeclaredField("theUnsafe")
    val searchableContainerMapField = ContainerSearchFeature::class.java.getDeclaredField("searchableContainerMap")
    if(unsafeField.trySetAccessible()) {
        val unsafe = unsafeField.get(null) as Unsafe
        val offset = unsafe.objectFieldOffset(searchableContainerMapField)
        val map = unsafe.getObject(containerSearchFeature, offset) as java.util.Map<Class<out SearchableContainerProperty>, Supplier<Boolean>>
        val newMap: HashMap<Class<out SearchableContainerProperty>, Supplier<Boolean>> = hashMapOf()
        map.forEach { t, u -> newMap[t] = u }

        addedContainers.forEach {
            newMap[it.javaClass as Class<out SearchableContainerProperty>] = Supplier { true }
        }

        unsafe.putObject(containerSearchFeature, offset, newMap)

        val oldOnStop = onStop
        onStop = {
            unsafe.putObject(containerSearchFeature, offset, map)
            oldOnStop()
        }
        success2 = true
    }
    (event as? EventService)?.let { service ->
        service.stopListener = JavaWrapper.methodToJava { ->
            onStop()
        }
    }

    return success1 and success2
}

if(!main()) {
    Chat.toast("market", "patch failed")
}
