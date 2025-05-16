package me.hellrevenger.generated.Map_ServerConfigHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ServerConfigHandlerKt {
    /**
     * field_14327
     */
    val OPERATORS_FILE by aliasStatic(ServerConfigHandler::field_14327)
    /**
     * field_14325
     */
    val WHITE_LIST_FILE by aliasStatic(ServerConfigHandler::field_14325)
    /**
     * field_14328
     */
    val BANNED_PLAYERS_FILE by aliasStatic(ServerConfigHandler::field_14328)
    /**
     * field_14324
     */
    val BANNED_IPS_FILE by aliasStatic(ServerConfigHandler::field_14324)
    /**
     * method_14539
     */
    fun convertOperators(server: MinecraftServer?) = ServerConfigHandler.method_14539(server)
    /**
     * method_14547
     */
    fun convertBannedPlayers(server: MinecraftServer?) = ServerConfigHandler.method_14547(server)
    /**
     * method_14545
     */
    fun convertBannedIps(server: MinecraftServer?) = ServerConfigHandler.method_14545(server)
    /**
     * method_14533
     */
    fun convertWhitelist(server: MinecraftServer?) = ServerConfigHandler.method_14533(server)
    /**
     * method_14550
     */
    fun convertPlayerFiles(minecraftServer: MinecraftDedicatedServer?) = ServerConfigHandler.method_14550(minecraftServer)
    /**
     * method_14540
     */
    fun checkSuccess(server: MinecraftServer?) = ServerConfigHandler.method_14540(server)
    /**
     * method_14546
     */
    fun getPlayerUuidByName(server: MinecraftServer?, name: String?) = ServerConfigHandler.method_14546(server, name)
}