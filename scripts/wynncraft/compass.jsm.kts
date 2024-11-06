import com.wynntils.models.marker.MarkerModel
import com.wynntils.utils.mc.type.Location
import com.wynntils.utils.wynn.LocationUtils
import net.minecraft.class_2338

if(!World.isWorldLoaded) {
    JsMacros.waitForEvent("ChunkLoad")
}

Chat.commandManager.unregisterCommand("/compass")

Chat.commandManager.createCommandBuilder("/compass")
    .literalArg("clipboard").executes(JavaWrapper.methodToJava { ctx ->
        Utils.clipboard.split("\n\r*\n*".toRegex()).forEach {
            LocationUtils.parseFromString(it).ifPresent {
                MarkerModel.USER_WAYPOINTS_PROVIDER.addLocation(it, null)
            }
        }
    })
    .or().literalArg("add").blockPosArg("pos").executes(JavaWrapper.methodToJava { ctx ->
        val pos = ctx.getArg("pos") as class_2338
        MarkerModel.USER_WAYPOINTS_PROVIDER.addLocation(Location(pos), null)
    }).register()

Chat.toast("compass", "enabled")