package me.hellrevenger.generated.Map_PlayerManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_14614
 */
fun PlayerManager.isWhitelistEnabled() = this.method_14614()
/**
 * method_52449
 */
fun PlayerManager.disconnectDuplicateLogins(profile: GameProfile?) = this.method_52449(profile)
/**
 * method_14605
 */
fun PlayerManager.sendToAround(player: PlayerEntity?, x: Double, arg2: Double, y: Double, arg4: Double, z: RegistryKey<world_World>?, arg6: Packet<*>?) = this.method_14605(player, x, arg2, y, arg4, z, arg6)
/**
 * method_43673
 */
fun PlayerManager.broadcast(message: SignedMessage?, sender: ServerPlayerEntity?, params: net.minecraft.class_2556.class_7602?) = this.method_43673(message, sender, params)
/**
 * method_14609
 */
fun PlayerManager.canBypassPlayerLimit(profile: GameProfile?) = this.method_14609(profile)
/**
 * method_14581
 */
fun PlayerManager.sendToAll(packet: Packet<*>?) = this.method_14581(packet)
/**
 * method_14611
 */
fun PlayerManager.remove(player: ServerPlayerEntity?) = this.method_14611(player)
/**
 * method_14606
 */
fun PlayerManager.sendWorldInfo(player: ServerPlayerEntity?, world: ServerWorld?) = this.method_14606(player, world)
/**
 * method_14594
 */
fun PlayerManager.sendPlayerStatus(player: ServerPlayerEntity?) = this.method_14594(player)
/**
 * method_14571
 */
fun PlayerManager.getPlayerList() = this.method_14571()
/**
 * method_38650
 */
fun PlayerManager.setSimulationDistance(simulationDistance: Int) = this.method_38650(simulationDistance)
/**
 * method_14572
 */
fun PlayerManager.onDataPacksReloaded() = this.method_14572()
/**
 * method_14613
 */
fun PlayerManager.createPlayer(profile: GameProfile?, syncedOptions: SyncedClientOptions?) = this.method_14613(profile, syncedOptions)
/**
 * method_14601
 */
fun PlayerManager.updatePlayerLatency() = this.method_14601()
/**
 * method_14569
 */
fun PlayerManager.isOperator(profile: GameProfile?) = this.method_14569(profile)
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
fun PlayerManager.getPlayersByIp(ip: String?) = this.method_14559(ip)
/**
 * method_14564
 */
fun PlayerManager.sendToTeam(source: PlayerEntity?, message: Text?) = this.method_14564(source, message)
/**
 * method_14586
 */
fun PlayerManager.checkCanJoin(address: SocketAddress?, profile: GameProfile?) = this.method_14586(address, profile)
/**
 * method_14566
 */
fun PlayerManager.getPlayer(name: String?) = this.method_14566(name)
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
fun PlayerManager.respawnPlayer(player: ServerPlayerEntity?, alive: Boolean, removalReason: net.minecraft.class_1297.class_5529?) = this.method_14556(player, alive, removalReason)
/**
 * method_14600
 */
fun PlayerManager.loadPlayerData(player: ServerPlayerEntity?) = this.method_14600(player)
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
fun PlayerManager.getPlayer(uuid: UUID?) = this.method_14602(uuid)
/**
 * method_14582
 */
fun PlayerManager.addToOperators(profile: GameProfile?) = this.method_14582(profile)
/**
 * method_14599
 */
fun PlayerManager.reloadWhitelist() = this.method_14599()
/**
 * method_14570
 */
fun PlayerManager.onPlayerConnect(connection: ClientConnection?, player: ServerPlayerEntity?, clientData: ConnectedClientData?) = this.method_14570(connection, player, clientData)
/**
 * method_14576
 */
fun PlayerManager.sendCommandTree(player: ServerPlayerEntity?) = this.method_14576(player)
/**
 * method_14565
 */
fun PlayerManager.sendToOtherTeams(source: PlayerEntity?, message: Text?) = this.method_14565(source, message)
/**
 * method_14583
 */
fun PlayerManager.createStatHandler(player: PlayerEntity?) = this.method_14583(player)
/**
 * method_14608
 */
fun PlayerManager.setViewDistance(viewDistance: Int) = this.method_14608(viewDistance)
/**
 * method_43514
 */
fun PlayerManager.broadcast(message: Text?, overlay: Boolean) = this.method_43514(message, overlay)
/**
 * method_14591
 */
fun PlayerManager.setMainWorld(world: ServerWorld?) = this.method_14591(world)
/**
 * method_14587
 */
fun PlayerManager.isWhitelisted(profile: GameProfile?) = this.method_14587(profile)
/**
 * method_14607
 */
fun PlayerManager.setCheatsAllowed(cheatsAllowed: Boolean) = this.method_14607(cheatsAllowed)
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
fun PlayerManager.broadcast(message: Text?, playerMessageFactory: function_Function<ServerPlayerEntity, Text>?, overlay: Boolean) = this.method_43512(message, playerMessageFactory, overlay)
/**
 * method_14567
 */
fun PlayerManager.getUserData() = this.method_14567()
/**
 * method_14604
 */
fun PlayerManager.removeFromOperators(profile: GameProfile?) = this.method_14604(profile)
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
fun PlayerManager.sendStatusEffects(player: ServerPlayerEntity?) = this.method_60598(player)
/**
 * method_14560
 */
fun PlayerManager.getWhitelistedNames() = this.method_14560()
/**
 * method_14578
 */
fun PlayerManager.getAdvancementTracker(player: ServerPlayerEntity?) = this.method_14578(player)
/**
 * method_14557
 */
fun PlayerManager.setWhitelistEnabled(whitelistEnabled: Boolean) = this.method_14557(whitelistEnabled)
/**
 * method_14584
 */
fun PlayerManager.getOpNames() = this.method_14584()
/**
 * method_44166
 */
fun PlayerManager.broadcast(message: SignedMessage?, source: ServerCommandSource?, params: net.minecraft.class_2556.class_7602?) = this.method_44166(message, source, params)
/**
 * method_60597
 */
fun PlayerManager.sendStatusEffects(entity: LivingEntity?, networkHandler: ServerPlayNetworkHandler?) = this.method_60597(entity, networkHandler)
/**
 * method_14580
 */
fun PlayerManager.getPlayerNames() = this.method_14580()
/**
 * method_14589
 */
fun PlayerManager.sendToDimension(packet: Packet<*>?, dimension: RegistryKey<world_World>?) = this.method_14589(packet, dimension)
/**
 * method_14597
 */
fun PlayerManager.disconnectAllPlayers() = this.method_14597()
