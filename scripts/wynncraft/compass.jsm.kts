@file:ImportJar("../libs/jars/wynntils-3.0.10-fabric+MC-1.21.4.jar")

import com.wynntils.models.marker.MarkerModel
import com.wynntils.utils.mc.type.Location
import com.wynntils.utils.wynn.LocationUtils
import me.hellrevenger.generated.Map_SelectionManager.getClipboard
import me.hellrevenger.generated.SelectionManager
import xyz.wagyourtail.jsmacros.client.api.helper.world.BlockPosHelper

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

Chat.commandManager.unregisterCommand("/compass")

Chat.commandManager.createCommandBuilder("/compass")
    .literalArg("clipboard").executes(JavaWrapper.methodToJava { ctx ->

        SelectionManager::class.getClipboard(Client.minecraft).split("\n\r*\n*".toRegex()).forEach {
            LocationUtils.parseFromString(it).ifPresent {
                MarkerModel.USER_WAYPOINTS_PROVIDER.addLocation(it, null)
            }
        }
    })
    .or().literalArg("add").blockPosArg("pos").executes(JavaWrapper.methodToJava { ctx ->
        val pos = ctx.getArg("pos") as BlockPosHelper
        MarkerModel.USER_WAYPOINTS_PROVIDER.addLocation(Location(pos.raw), null)
    }).register()
