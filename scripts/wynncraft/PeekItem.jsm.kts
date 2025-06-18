@file:ImportJar("../libs/jars/tweakeroo.jar", "../libs/jars/malilib.jar", "../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.core.components.Managers
import com.wynntils.core.components.Models
import com.wynntils.features.players.PlayerViewerFeature
import com.wynntils.screens.playerviewer.PlayerViewerScreen
import xyz.wagyourtail.jsmacros.client.api.event.impl.EventKey
import fi.dy.masa.tweakeroo.config.FeatureToggle
import fi.dy.masa.tweakeroo.util.CameraEntity
import me.hellrevenger.generated.Screen
import me.hellrevenger.library.api._getField
import xyz.wagyourtail.jsmacros.client.api.classes.render.IScreen
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.EntityHelper
import xyz.wagyourtail.jsmacros.client.api.helper.world.entity.PlayerEntityHelper

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}
while (Managers.Feature.getFeatureInstance(PlayerViewerFeature::class.java) == null) {
    Client.waitTick(20)
}

fun getPlayer() =
    if(FeatureToggle.TWEAK_FREE_CAMERA.booleanValue)
        CameraEntity.getCamera()?.let { EntityHelper.create(it) }
    else
        null

val playerView = Managers.Feature.getFeatureInstance(PlayerViewerFeature::class.java)
var playerViewerScreen by playerView._getField<Screen>("playerViewerScreen")

EventListener(EventKey::class.java, { e ->
    if(e.action == 1 && e.key == "key.mouse.middle") {
        (getPlayer()?.rayTraceEntity(8) as? PlayerEntityHelper)?.let {
            if(!Models.Player.isLocalPlayer(it.raw)) return@let
            e.cancel()
            val sc = PlayerViewerScreen.create(it.raw)
            playerViewerScreen = sc
            Hud.openScreen(sc as? IScreen)
        }
    }
}, true)
//Chat.toast("Item Peeker", "enabled")