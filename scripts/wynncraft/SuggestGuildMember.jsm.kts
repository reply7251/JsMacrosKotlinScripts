@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.mc.event.ScreenInitEvent
import com.wynntils.mc.event.ScreenRenderEvent
import com.wynntils.screens.partymanagement.PartyManagementScreen
import com.wynntils.screens.partymanagement.widgets.SuggestionPlayerWidget
import me.hellrevenger.generated.ButtonWidget
import me.hellrevenger.generated.Map_ClickableWidget.visible
import me.hellrevenger.generated.Map_ClientPlayNetworkHandler.getPlayerList
import me.hellrevenger.generated.Map_ClientPlayerEntity.networkHandler
import me.hellrevenger.generated.Map_InGameHud.getPlayerListHud
import me.hellrevenger.generated.Map_MinecraftClient.inGameHud
import me.hellrevenger.generated.Map_MinecraftClient.player
import me.hellrevenger.generated.Map_PlayerListEntry.getProfile
import me.hellrevenger.generated.Map_PlayerListHud.getPlayerName
import me.hellrevenger.generated.Map_Widget.*
import me.hellrevenger.generated.PlayerListEntry
import me.hellrevenger.library.api.RuntimeMixin
import net.bytebuddy.asm.Advice
import net.bytebuddy.description.method.MethodDescription
import net.bytebuddy.matcher.ElementMatchers
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
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

object PartyManagementScreenHandler {
    lateinit var callback: () -> Unit
}
PartyManagementScreenHandler.callback = { fetchSuggestion() }

object MixinPartyManagementScreen {
    @Advice.OnMethodEnter
    @JvmStatic
    fun reloadSuggestedPlayersWidgets() {
        PartyManagementScreenHandler.callback()
    }
}

val PLAYER_INFO_COMPARATOR =
    Comparator.comparing<PlayerListEntry, String> ({ playerInfo -> playerInfo.getProfile().name }) { a, b -> a.compareTo(b, true)}

fun fetchOnlineMembersFromTab(): Boolean {
    val player = Client.minecraft.player ?: return false
    val playerList = Client.minecraft.inGameHud.getPlayerListHud()
    val players = player.networkHandler.getPlayerList().stream().sorted(PLAYER_INFO_COMPARATOR).limit(80).toList()
    if(players.size < 61) return false
    val guildMembers = players.subList(61, players.size).mapNotNull {
        TextHelper.wrap(playerList.getPlayerName(it)).stringStripFormatting.let {
            if(it.contains("]")) it.substring(it.indexOf("]") + 2) else null
        }
    }
    if(guildMembers.size < 19) {
        cachedGuildMembers.clear()
        cachedGuildMembers.addAll(guildMembers)
        return true
    }
    return false
}

fun fetchSuggestion() {
    if(!fetchOnlineMembersFromTab() && Time.time() > lastUpdate + 1e4) {
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

fun PartyManagementScreen.getSuggestions() =
    getPrivateFieldValue("suggestedPlayersWidgets") as List<SuggestionPlayerWidget>
class WynnListener {
    @SubscribeEvent
    fun onScreen(event: ScreenInitEvent.Pre) {
        (event.screen as? PartyManagementScreen)?.let { screen ->
            RuntimeMixin.addMixin(PartyManagementScreen::class.java, mixin2)
            RuntimeMixin.doMixin(PartyManagementScreen::class.java)
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