package me.hellrevenger.generated.Map_ServerConfigHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ServerConfigHandler>.OPERATORS_FILE by aliasStatic(ServerConfigHandler::field_14327)
val KClass<ServerConfigHandler>.WHITE_LIST_FILE by aliasStatic(ServerConfigHandler::field_14325)
val KClass<ServerConfigHandler>.BANNED_PLAYERS_FILE by aliasStatic(ServerConfigHandler::field_14328)
val KClass<ServerConfigHandler>.BANNED_IPS_FILE by aliasStatic(ServerConfigHandler::field_14324)
fun KClass<ServerConfigHandler>.convertOperators(arg0: MinecraftServer) = ServerConfigHandler.method_14539(arg0)
fun KClass<ServerConfigHandler>.convertBannedPlayers(arg0: MinecraftServer) = ServerConfigHandler.method_14547(arg0)
fun KClass<ServerConfigHandler>.convertBannedIps(arg0: MinecraftServer) = ServerConfigHandler.method_14545(arg0)
fun KClass<ServerConfigHandler>.convertWhitelist(arg0: MinecraftServer) = ServerConfigHandler.method_14533(arg0)
fun KClass<ServerConfigHandler>.convertPlayerFiles(arg0: MinecraftDedicatedServer) = ServerConfigHandler.method_14550(arg0)
fun KClass<ServerConfigHandler>.checkSuccess(arg0: MinecraftServer) = ServerConfigHandler.method_14540(arg0)
fun KClass<ServerConfigHandler>.getPlayerUuidByName(arg0: MinecraftServer, arg1: String) = ServerConfigHandler.method_14546(arg0, arg1)
