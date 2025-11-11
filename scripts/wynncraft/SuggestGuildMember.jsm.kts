@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.WynntilsMod
import com.wynntils.core.components.Models
import com.wynntils.mc.event.ScreenInitEvent
import com.wynntils.models.players.FriendsModel
import com.wynntils.screens.partymanagement.PartyManagementScreen
import com.wynntils.screens.partymanagement.widgets.SuggestionPlayerWidget
import me.hellrevenger.library.api.CTargetType
import me.hellrevenger.library.api.MiscExtensions.waitForEvent
import me.hellrevenger.library.api._getPrivateValue
import net.lenni0451.classtransform.annotations.CTarget
import net.lenni0451.classtransform.annotations.CTransformer
import net.lenni0451.classtransform.annotations.injection.CRedirect
import net.neoforged.bus.api.SubscribeEvent
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.helper.TextHelper
import xyz.wagyourtail.jsmacros.core.service.EventService
import kotlin.math.max
import kotlin.math.min
import net.minecraft.class_640
import net.minecraft.class_4185

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent(EventType.ChunkLoad)
}

fun getOnlineFriendsMap() =
    Models.Friends._getPrivateValue<MutableMap<String, String>>("onlineFriends")!!

object PartyManagementScreenHandler {
    var callback: (FriendsModel) -> Map<String, String> = { it.onlineFriends }
}

PartyManagementScreenHandler.callback = {
    fetchSuggestion()
    it.onlineFriends + cachedGuildMembers.filter { !Models.Party.partyMembers.contains(it) }.map { it to "" }
}

@CTransformer(PartyManagementScreen::class)
class MixinPartyManagementScreen {

    @CRedirect(method = ["reloadSuggestedPlayersWidgets"], target = CTarget(CTargetType.SIMPLE_INVOKE, "getOnlineFriends", optional = true))
    fun reloadSuggestedPlayersWidgets2(instance: FriendsModel): Map<String, String> {
        return PartyManagementScreenHandler.callback(instance)
    }
}

val PLAYER_INFO_COMPARATOR =
    Comparator.comparing<class_640, String> ({ playerInfo -> playerInfo.method_2966().name }) { a, b -> a.compareTo(b, true)}

fun fetchOnlineMembersFromTab(): Boolean {
    val player = Client.minecraft.field_1724 ?: return false
    val playerList = Client.minecraft.field_1705.method_1750()
    val players = player.field_3944.method_2880().stream().sorted(PLAYER_INFO_COMPARATOR).limit(80).toList()
    if(players.size < 61) return false
    val guildMembers = players.subList(61, players.size).mapNotNull {
        TextHelper.wrap(playerList.method_1918(it)).stringStripFormatting.let {
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
            lastUpdate = Time.time()
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

(PartyManagementScreen.create() as PartyManagementScreen).reloadSuggestedPlayersWidgets()
RuntimeTransform.init()
RuntimeTransform.addTransformer(MixinPartyManagementScreen::class)
RuntimeTransform.transform()

fun PartyManagementScreen.getSuggestions() =
    _getPrivateValue<List<SuggestionPlayerWidget>>("suggestedPlayersWidgets")!!

class WynnListener {
    @SubscribeEvent
    fun onScreen(event: ScreenInitEvent.Pre) {
        (event.screen as? PartyManagementScreen)?.let { screen ->
            fetchSuggestion()
            val iscreen = screen as IScreen
            iscreen.setOnScroll(JavaWrapper.methodToJava { mouse, scroll ->
                scrollY = max(min(screen.getSuggestions().size, scrollY - scroll.y.toInt() * 10), 0)

                val height = iscreen.height
                val cellHeight = (height / 64)

                val top = cellHeight * 22
                val bottom = cellHeight * (23 + 36)
                screen.getSuggestions().forEachIndexed { index, suggestionPlayerWidget ->
                    val newY = cellHeight * (23 + index * 3 - scrollY)
                    val visible = newY in (top + 1)..<bottom

                    suggestionPlayerWidget.method_46419(newY)
                    suggestionPlayerWidget.field_22764 = visible

                    suggestionPlayerWidget._getPrivateValue<class_4185>("inviteButton")?.let {
                        it.method_46419(newY)
                    }
                }
            })
        }
    }
}

val wynnListener = WynnListener()
WynntilsMod.registerEventListener(wynnListener)
(event as? EventService)?.stopListener = JavaWrapper.methodToJava { ->
    WynntilsMod.unregisterEventListener(wynnListener)

}