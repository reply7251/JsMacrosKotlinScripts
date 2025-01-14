
import me.hellrevenger.generated.*
import xyz.wagyourtail.jsmacros.client.api.classes.RegistryHelper
import xyz.wagyourtail.jsmacros.client.api.helpers.world.entity.PlayerEntityHelper
import xyz.wagyourtail.jsmacros.core.Core

val mc = Client.minecraft



fun getServerPlayer(): PlayerEntityHelper<*>? {
    val uuid = Player.player?.uuid ?: return null
    try {
        return mc.method_1576()?.let {  server ->
            if(server.isRemote()) return null
            server.getWorldRegistryKeys().forEach { key ->
                server.getWorld(key)?.let a@ { world ->
                    val p = world.getPlayers().firstOrNull { player -> player?.getUuid()?.toString()?.equals(uuid) == true }?: return@a
                    return PlayerEntityHelper(p)
                }
            }
            return null
        }
    } catch (e: Throwable) {
        Core.getInstance().profile.logError(e)
        Chat.log(e)
    }
    return null
}

Chat.commandManager.unregisterCommand("/cheat")
Chat.commandManager.createCommandBuilder("/cheat")
    .literalArg("item")
        .literalArg("unbreakable").executes(JavaWrapper.methodToJava { _ ->
            getServerPlayer()?.let {  player ->
                player.mainHand.creative.setUnbreakable(true)
                Chat.toast("set unbreakable", "finished")
            }
        }).or()
        .literalArg("fix").executes(JavaWrapper.methodToJava { _ ->
            getServerPlayer()?.let {  player ->
                player.mainHand.creative.setDamage(0)
                Chat.toast("fix item", "finished")
            }
        }).or()
        .literalArg("amount").intArg("count", 1, 64).executes(JavaWrapper.methodToJava { ctx ->
            getServerPlayer()?.let {  player ->
                player.mainHand.creative.setCount(ctx.getArg("count") as Int)
                Chat.toast("set amount", "finished")
            }
        }).or().or()
        .literalArg("enchant").identifierArg("enchantment").suggest(JavaWrapper.methodToJava { ctx, suggest ->
            suggest.suggestIdentifier(RegistryHelper().enchantmentIds)
        }).intArg("level", 1, 65535).executes(JavaWrapper.methodToJava { ctx ->
            getServerPlayer()?.let {  player ->
                player.mainHand.creative.addEnchantment(ctx.getArg("enchantment").toString(), ctx.getArg("level") as Int)
                Chat.toast("enchant", "finished")
            }
        }).or().or().or()
        .literalArg("data").executes(JavaWrapper.methodToJava { _ ->
            getServerPlayer()?.let {  player ->
                val nbt = player.mainHand.nbt
                val nbtString = if(nbt == null || nbt.isNull) "null" else nbt.toString()
                Chat.log(Chat.createTextBuilder().append(nbtString)
                    .withShowItemHover(player.mainHand).withClickEvent("copy_to_clipboard", nbtString).build())
            }
        }).register()

Chat.toast("Cheat", "Enabled")
