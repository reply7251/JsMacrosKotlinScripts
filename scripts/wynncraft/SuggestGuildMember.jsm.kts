@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.mc.event.ScreenInitEvent
import com.wynntils.mc.event.ScreenRenderEvent
import com.wynntils.screens.partymanagement.PartyManagementScreen
import com.wynntils.screens.partymanagement.widgets.SuggestionPlayerWidget
import me.hellrevenger.generated.ButtonWidget
import me.hellrevenger.generated.Map_ClickableWidget.visible
import me.hellrevenger.generated.Map_Widget.*
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.matcher.ElementMatchers
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.core.library.impl.classes.ClassBuilder
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.math.max
import kotlin.math.min

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

fun Any.getPrivateFieldValue(fieldName: String): Any? {
    val f = this::class.java.getDeclaredField(fieldName)
    f.trySetAccessible()
    return f.get(this)
}

fun getOnlineFriendsMap() =
    Models.Friends.getPrivateFieldValue("onlineFriends") as MutableMap<String, String>

object MixinPartyManagementScreen {
    @Advice.OnMethodEnter
    @JvmStatic
    fun reloadSuggestedPlayersWidgets() {
        ClassBuilder.methodWrappers["MixinPartyManagementScreen.reloadSuggestedPlayersWidgets"]?.get()
    }
}

ClassBuilder.methodWrappers["MixinPartyManagementScreen.reloadSuggestedPlayersWidgets"] = JavaWrapper.methodToJava { ->
    fetchSuggestion()
}

fun fetchSuggestion() {
    if(Time.time() > lastUpdate + 1e4) {
        lastUpdate = Time.time()
        if(Models.Guild.guildName.isEmpty()) return
        val guild = Models.Guild.getGuild(Models.Guild.guildName)
        guild.whenComplete { info, throwable ->
            cachedGuildMembers.clear()
            cachedGuildMembers.addAll(info.guildMembers.mapNotNull { if(it.online) it.username else null })
            onFetchComplete()
        }
    } else {
        updateSuggestion()
    }
}
fun onFetchComplete() {
    (Hud.openScreen as? PartyManagementScreen)?.reloadSuggestedPlayersWidgets()
}

fun updateSuggestion() {
    val map = getOnlineFriendsMap()
    val oldMembers = map.filterValues { it == "" }
    map -= oldMembers.keys
    map += cachedGuildMembers.filter { !Models.Party.partyMembers.contains(it) }.map { it to "" }
}
val cachedGuildMembers = mutableSetOf<String>()
var lastUpdate = 0L
var scrollY = 0

val matcher2 = ElementMatchers.named<MethodDescription>("reloadSuggestedPlayersWidgets")
val mixin2 = Advice.to(MixinPartyManagementScreen::class.java).on(matcher2)
RuntimeMixin.addMixin(PartyManagementScreen::class.java, mixin2)
RuntimeMixin.doMixin(PartyManagementScreen::class.java)

fun PartyManagementScreen.getSuggestions() =
    getPrivateFieldValue("suggestedPlayersWidgets") as List<SuggestionPlayerWidget>
class WynnListener {
    @SubscribeEvent
    fun onScreen(event: ScreenInitEvent.Pre) {
        (event.screen as? PartyManagementScreen)?.let { screen ->
            fetchSuggestion()
            val iscreen = screen as IScreen
            iscreen.setOnScroll(JavaWrapper.methodToJava { mouse, scroll ->
                scrollY = max(min(screen.getSuggestions().size, scrollY - scroll.y.toInt() * 10), 0)
            })
        }
    }

    @SubscribeEvent
    fun onRender(event: ScreenRenderEvent) {
        (event.screen as? PartyManagementScreen)?.let { screen ->
            val height = (screen as IScreen).height
            val cellHeight = (height / 64)

            val top = cellHeight * 22
            val bottom = cellHeight * (23 + 36)
            screen.getSuggestions().forEachIndexed { index, suggestionPlayerWidget ->
                val newY = cellHeight * (23 + index * 3 - scrollY)
                val visible = newY in (top + 1)..<bottom
                suggestionPlayerWidget.setY(newY)
                suggestionPlayerWidget.visible = visible
                (suggestionPlayerWidget.getPrivateFieldValue("inviteButton") as? ButtonWidget)?.let {
                    it.setY(newY)
                }
            }
        }
    }
}

val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    WynntilsMod.unregisterEventListener(wynnListener)

    RuntimeMixin.removeMixin(PartyManagementScreen::class.java, mixin2)
    RuntimeMixin.doMixin(PartyManagementScreen::class.java)
}