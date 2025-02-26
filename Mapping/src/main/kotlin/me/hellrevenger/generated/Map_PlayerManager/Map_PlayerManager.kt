package me.hellrevenger.generated.Map_PlayerManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_14343
 */
val KClass<PlayerManager>.WHITELIST_FILE by aliasStatic(PlayerManager::field_14343)
/**
 * field_14355
 */
val KClass<PlayerManager>.BANNED_PLAYERS_FILE by aliasStatic(PlayerManager::field_14355)
/**
 * field_14364
 */
val KClass<PlayerManager>.BANNED_IPS_FILE by aliasStatic(PlayerManager::field_14364)
/**
 * field_14348
 */
val KClass<PlayerManager>.OPERATORS_FILE by aliasStatic(PlayerManager::field_14348)
/**
 * field_39921
 */
val KClass<PlayerManager>.FILTERED_FULL_TEXT by aliasStatic(PlayerManager::field_39921)
/**
 * field_45061
 */
val KClass<PlayerManager>.DUPLICATE_LOGIN_TEXT by aliasStatic(PlayerManager::field_45061)
/**
 * method_14614
 */
fun PlayerManager.isWhitelistEnabled() = this.method_14614()
/**
 * method_52449
 */
fun PlayerManager.disconnectDuplicateLogins(arg0: GameProfile) = this.method_52449(arg0)
/**
 * method_14605
 */
fun PlayerManager.sendToAround(arg0: PlayerEntity, arg1: Double, arg2: Double, arg3: Double, arg4: Double, arg5: RegistryKey<world_World>, arg6: Packet<*>) = this.method_14605(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_43673
 */
fun PlayerManager.broadcast(arg0: SignedMessage, arg1: ServerPlayerEntity, arg2: net.minecraft.class_2556.class_7602) = this.method_43673(arg0, arg1, arg2)
/**
 * method_14609
 */
fun PlayerManager.canBypassPlayerLimit(arg0: GameProfile) = this.method_14609(arg0)
/**
 * method_14581
 */
fun PlayerManager.sendToAll(arg0: Packet<*>) = this.method_14581(arg0)
/**
 * method_14611
 */
fun PlayerManager.remove(arg0: ServerPlayerEntity) = this.method_14611(arg0)
/**
 * method_14606
 */
fun PlayerManager.sendWorldInfo(arg0: ServerPlayerEntity, arg1: ServerWorld) = this.method_14606(arg0, arg1)
/**
 * method_14594
 */
fun PlayerManager.sendPlayerStatus(arg0: ServerPlayerEntity) = this.method_14594(arg0)
/**
 * method_14571
 */
fun PlayerManager.getPlayerList() = this.method_14571()
/**
 * method_38650
 */
fun PlayerManager.setSimulationDistance(arg0: Int) = this.method_38650(arg0)
/**
 * method_14572
 */
fun PlayerManager.onDataPacksReloaded() = this.method_14572()
/**
 * method_14613
 */
fun PlayerManager.createPlayer(arg0: GameProfile, arg1: SyncedClientOptions) = this.method_14613(arg0, arg1)
/**
 * method_14601
 */
fun PlayerManager.updatePlayerLatency() = this.method_14601()
/**
 * method_14569
 */
fun PlayerManager.isOperator(arg0: GameProfile) = this.method_14569(arg0)
/**
 * method_14592
 */
fun PlayerManager.getMaxPlayerCount() = this.method_14592()
/**
 * method_14617
 */
fun PlayerManager.saveAllPlayerData() = this.method_14617()
/**
 * method_14559
 */
fun PlayerManager.getPlayersByIp(arg0: String) = this.method_14559(arg0)
/**
 * method_14564
 */
fun PlayerManager.sendToTeam(arg0: PlayerEntity, arg1: Text) = this.method_14564(arg0, arg1)
/**
 * method_14586
 */
fun PlayerManager.checkCanJoin(arg0: SocketAddress, arg1: GameProfile) = this.method_14586(arg0, arg1)
/**
 * method_14566
 */
fun PlayerManager.getPlayer(arg0: String) = this.method_14566(arg0)
/**
 * method_14568
 */
fun PlayerManager.getViewDistance() = this.method_14568()
/**
 * method_14585
 */
fun PlayerManager.getIpBanList() = this.method_14585()
/**
 * method_14556
 */
fun PlayerManager.respawnPlayer(arg0: ServerPlayerEntity, arg1: Boolean, arg2: net.minecraft.class_1297.class_5529) = this.method_14556(arg0, arg1, arg2)
/**
 * method_14600
 */
fun PlayerManager.loadPlayerData(arg0: ServerPlayerEntity) = this.method_14600(arg0)
/**
 * method_14563
 */
fun PlayerManager.getUserBanList() = this.method_14563()
/**
 * method_14579
 */
fun PlayerManager.areCheatsAllowed() = this.method_14579()
/**
 * method_14602
 */
fun PlayerManager.getPlayer(arg0: UUID) = this.method_14602(arg0)
/**
 * method_14582
 */
fun PlayerManager.addToOperators(arg0: GameProfile) = this.method_14582(arg0)
/**
 * method_14599
 */
fun PlayerManager.reloadWhitelist() = this.method_14599()
/**
 * method_14570
 */
fun PlayerManager.onPlayerConnect(arg0: ClientConnection, arg1: ServerPlayerEntity, arg2: ConnectedClientData) = this.method_14570(arg0, arg1, arg2)
/**
 * method_14576
 */
fun PlayerManager.sendCommandTree(arg0: ServerPlayerEntity) = this.method_14576(arg0)
/**
 * method_14565
 */
fun PlayerManager.sendToOtherTeams(arg0: PlayerEntity, arg1: Text) = this.method_14565(arg0, arg1)
/**
 * method_14583
 */
fun PlayerManager.createStatHandler(arg0: PlayerEntity) = this.method_14583(arg0)
/**
 * method_14608
 */
fun PlayerManager.setViewDistance(arg0: Int) = this.method_14608(arg0)
/**
 * method_43514
 */
fun PlayerManager.broadcast(arg0: Text, arg1: Boolean) = this.method_43514(arg0, arg1)
/**
 * method_14591
 */
fun PlayerManager.setMainWorld(arg0: ServerWorld) = this.method_14591(arg0)
/**
 * method_14587
 */
fun PlayerManager.isWhitelisted(arg0: GameProfile) = this.method_14587(arg0)
/**
 * method_14607
 */
fun PlayerManager.setCheatsAllowed(arg0: Boolean) = this.method_14607(arg0)
/**
 * method_14590
 */
fun PlayerManager.getWhitelist() = this.method_14590()
/**
 * method_14561
 */
fun PlayerManager.getServer() = this.method_14561()
/**
 * method_14574
 */
fun PlayerManager.getCurrentPlayerCount() = this.method_14574()
/**
 * method_43512
 */
fun PlayerManager.broadcast(arg0: Text, arg1: function_Function<ServerPlayerEntity, Text>, arg2: Boolean) = this.method_43512(arg0, arg1, arg2)
/**
 * method_14567
 */
fun PlayerManager.getUserData() = this.method_14567()
/**
 * method_14604
 */
fun PlayerManager.removeFromOperators(arg0: GameProfile) = this.method_14604(arg0)
/**
 * method_14603
 */
fun PlayerManager.getOpList() = this.method_14603()
/**
 * method_38651
 */
fun PlayerManager.getSimulationDistance() = this.method_38651()
/**
 * method_60598
 */
fun PlayerManager.sendStatusEffects(arg0: ServerPlayerEntity) = this.method_60598(arg0)
/**
 * method_14560
 */
fun PlayerManager.getWhitelistedNames() = this.method_14560()
/**
 * method_14578
 */
fun PlayerManager.getAdvancementTracker(arg0: ServerPlayerEntity) = this.method_14578(arg0)
/**
 * method_14557
 */
fun PlayerManager.setWhitelistEnabled(arg0: Boolean) = this.method_14557(arg0)
/**
 * method_14584
 */
fun PlayerManager.getOpNames() = this.method_14584()
/**
 * method_44166
 */
fun PlayerManager.broadcast(arg0: SignedMessage, arg1: ServerCommandSource, arg2: net.minecraft.class_2556.class_7602) = this.method_44166(arg0, arg1, arg2)
/**
 * method_60597
 */
fun PlayerManager.sendStatusEffects(arg0: LivingEntity, arg1: ServerPlayNetworkHandler) = this.method_60597(arg0, arg1)
/**
 * method_14580
 */
fun PlayerManager.getPlayerNames() = this.method_14580()
/**
 * method_14589
 */
fun PlayerManager.sendToDimension(arg0: Packet<*>, arg1: RegistryKey<world_World>) = this.method_14589(arg0, arg1)
/**
 * method_14597
 */
fun PlayerManager.disconnectAllPlayers() = this.method_14597()
