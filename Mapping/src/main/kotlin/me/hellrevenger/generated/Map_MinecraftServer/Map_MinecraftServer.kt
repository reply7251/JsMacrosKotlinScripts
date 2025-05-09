package me.hellrevenger.generated.Map_MinecraftServer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_25318
 */
var MinecraftServer.resourceManagerHolder by alias(MinecraftServer::field_25318)
/**
 * method_3819
 */
fun MinecraftServer.getServerIp() = this.method_3819()
/**
 * method_27902
 */
fun MinecraftServer.acceptsStatusQuery() = this.method_27902()
/**
 * method_3730
 */
fun MinecraftServer.setDemo(demo: Boolean) = this.method_3730(demo)
/**
 * method_3767
 */
fun MinecraftServer.getGameRules() = this.method_3767()
/**
 * method_31371
 */
fun MinecraftServer.createFilterer(player: ServerPlayerEntity) = this.method_31371(player)
/**
 * method_3779
 */
fun MinecraftServer.setServerPort(serverPort: Int) = this.method_3779(serverPort)
/**
 * method_37113
 */
fun MinecraftServer.dumpProperties(file: file_Path) = this.method_37113(file)
/**
 * method_37321
 */
fun MinecraftServer.isRecorderActive() = this.method_37321()
/**
 * method_3742
 */
fun MinecraftServer.addServerGuiTickable(tickable: Runnable) = this.method_3742(tickable)
/**
 * method_3832
 */
fun MinecraftServer.startDebug() = this.method_3832()
/**
 * method_3759
 */
fun MinecraftServer.isUsingNativeTransport() = this.method_3759()
/**
 * method_3856
 */
fun MinecraftServer.forcePlayerSampleUpdate() = this.method_3856()
/**
 * method_3831
 */
fun MinecraftServer.getRunDirectory() = this.method_3831()
/**
 * method_3820
 */
fun MinecraftServer.isLoading() = this.method_3820()
/**
 * method_3731
 */
fun MinecraftServer.setEnforceWhitelist(enforceWhitelist: Boolean) = this.method_3731(enforceWhitelist)
/**
 * method_3835
 */
fun MinecraftServer.getPermissionLevel(profile: GameProfile) = this.method_3835(profile)
/**
 * method_3864
 */
fun MinecraftServer.setOnlineMode(onlineMode: Boolean) = this.method_3864(onlineMode)
/**
 * method_37322
 */
fun MinecraftServer.resetRecorder() = this.method_37322()
/**
 * method_19467
 */
fun MinecraftServer.setDifficultyLocked(locked: Boolean) = this.method_19467(locked)
/**
 * method_3841
 */
fun MinecraftServer.getSpawnProtectionRadius() = this.method_3841()
/**
 * method_3790
 */
fun MinecraftServer.getDefaultGameMode() = this.method_3790()
/**
 * method_3738
 */
fun MinecraftServer.getWorlds() = this.method_3738()
/**
 * method_3732
 */
fun MinecraftServer.shouldBroadcastRconToOps() = this.method_3732()
/**
 * method_3728
 */
fun MinecraftServer.kickNonWhitelistedPlayers(source: ServerCommandSource) = this.method_3728(source)
/**
 * method_3764
 */
fun MinecraftServer.setPreventProxyConnections(preventProxyConnections: Boolean) = this.method_3764(preventProxyConnections)
/**
 * method_39219
 */
fun MinecraftServer.isSaving() = this.method_39219()
/**
 * method_56626
 */
fun MinecraftServer.shouldPushTickTimeLog() = this.method_56626()
/**
 * method_43824
 */
fun MinecraftServer.getHostProfile() = this.method_43824()
/**
 * method_39424
 */
fun MinecraftServer.hideOnlinePlayers() = this.method_39424()
/**
 * method_3838
 */
fun MinecraftServer.setDefaultGameMode(gameMode: GameMode) = this.method_3838(gameMode)
/**
 * method_3776
 */
fun MinecraftServer.setDifficulty(difficulty: Difficulty, forceUpdate: Boolean) = this.method_3776(difficulty, forceUpdate)
/**
 * method_3719
 */
fun MinecraftServer.getGameProfileRepo() = this.method_3719()
/**
 * method_3803
 */
fun MinecraftServer.setPlayerIdleTimeout(playerIdleTimeout: Int) = this.method_3803(playerIdleTimeout)
/**
 * method_3842
 */
fun MinecraftServer.setServerIp(serverIp: String) = this.method_3842(serverIp)
/**
 * method_3723
 */
fun MinecraftServer.save(suppressLogs: Boolean, flush: Boolean, force: Boolean) = this.method_3723(suppressLogs, flush, force)
/**
 * method_3815
 */
fun MinecraftServer.setPvpEnabled(pvpEnabled: Boolean) = this.method_3815(pvpEnabled)
/**
 * method_24307
 */
fun MinecraftServer.getModStatus() = this.method_24307()
/**
 * method_34864
 */
fun MinecraftServer.getResourceManager() = this.method_34864()
/**
 * method_3754
 */
fun MinecraftServer.isHardcore() = this.method_3754()
/**
 * method_27050
 */
fun MinecraftServer.getSavePath(worldSavePath: WorldSavePath) = this.method_27050(worldSavePath)
/**
 * method_32303
 */
fun MinecraftServer.requireResourcePack() = this.method_32303()
/**
 * method_54835
 */
fun MinecraftServer.getTickTimes() = this.method_54835()
/**
 * method_30611
 */
fun MinecraftServer.getRegistryManager() = this.method_30611()
/**
 * method_24490
 */
fun MinecraftServer.endTickMetrics() = this.method_24490()
/**
 * method_3787
 */
fun MinecraftServer.getNetworkIo() = this.method_3787()
/**
 * method_22827
 */
fun MinecraftServer.getDataCommandStorage() = this.method_22827()
/**
 * method_3852
 */
fun MinecraftServer.isPvpEnabled() = this.method_3852()
/**
 * method_27903
 */
fun MinecraftServer.adjustTrackingDistance(initialDistance: Int) = this.method_27903(initialDistance)
/**
 * method_3756
 */
fun MinecraftServer.getServerPort() = this.method_3756()
/**
 * method_43614
 */
fun MinecraftServer.logChatMessage(message: Text, params: net.minecraft.class_2556.class_7602, prefix: String) = this.method_43614(message, params, prefix)
/**
 * method_19466
 */
fun MinecraftServer.isHost(profile: GameProfile) = this.method_19466(profile)
/**
 * method_3772
 */
fun MinecraftServer.getRecipeManager() = this.method_3772()
/**
 * method_3837
 */
fun MinecraftServer.getBossBarManager() = this.method_3837()
/**
 * method_56040
 */
fun MinecraftServer.acceptsTransfers() = this.method_56040()
/**
 * method_29439
 */
fun MinecraftServer.reloadResources(dataPacks: Collection<String>) = this.method_29439(dataPacks)
/**
 * method_3829
 */
fun MinecraftServer.getSpawnRadius(world: ServerWorld) = this.method_3829(world)
/**
 * method_3846
 */
fun MinecraftServer.setPlayerManager(playerManager: PlayerManager) = this.method_3846(playerManager)
/**
 * method_43500
 */
fun MinecraftServer.shouldEnforceSecureProfile() = this.method_43500()
/**
 * method_3862
 */
fun MinecraftServer.getPlayerIdleTimeout() = this.method_3862()
/**
 * method_41239
 */
fun MinecraftServer.getMaxChainedNeighborUpdates() = this.method_41239()
/**
 * method_54809
 */
fun MinecraftServer.isPaused() = this.method_54809()
/**
 * method_3806
 */
fun MinecraftServer.isRunning() = this.method_3806()
/**
 * method_49749
 */
fun MinecraftServer.sendTimeUpdatePackets() = this.method_49749()
/**
 * method_46221
 */
fun MinecraftServer.getCombinedDynamicRegistries() = this.method_46221()
/**
 * method_60671
 */
fun MinecraftServer.isWorldAllowed(world: world_World) = this.method_60671(world)
/**
 * method_3725
 */
fun MinecraftServer.getIconFile() = this.method_3725()
/**
 * method_54833
 */
fun MinecraftServer.getTickManager() = this.method_54833()
/**
 * method_3834
 */
fun MinecraftServer.setMotd(motd: String) = this.method_3834(motd)
/**
 * method_3765
 */
fun MinecraftServer.getServerMetadata() = this.method_3765()
/**
 * method_3793
 */
fun MinecraftServer.getUserCache() = this.method_3793()
/**
 * method_3718
 */
fun MinecraftServer.isFlightEnabled() = this.method_3718()
/**
 * method_27727
 */
fun MinecraftServer.getStructureTemplateManager() = this.method_27727()
/**
 * method_36113
 */
fun MinecraftServer.getProxy() = this.method_36113()
/**
 * method_59777
 */
fun MinecraftServer.getBrewingRecipeRegistry() = this.method_59777()
/**
 * method_3750
 */
fun MinecraftServer.isStopped() = this.method_3750()
/**
 * method_3785
 */
fun MinecraftServer.isSpawnProtected(world: ServerWorld, pos: BlockPos, player: PlayerEntity) = this.method_3785(world, pos, player)
/**
 * method_3828
 */
fun MinecraftServer.isOnlineMode() = this.method_3828()
/**
 * method_3816
 */
fun MinecraftServer.isDedicated() = this.method_3816()
/**
 * method_43825
 */
fun MinecraftServer.setHostProfile(hostProfile: GameProfile) = this.method_43825(hostProfile)
/**
 * method_62735
 */
fun MinecraftServer.getFuelRegistry() = this.method_62735()
/**
 * method_3799
 */
fun MinecraftServer.isDemo() = this.method_3799()
/**
 * method_3775
 */
fun MinecraftServer.shouldPreventProxyConnections() = this.method_3775()
/**
 * method_3860
 */
fun MinecraftServer.isRemote() = this.method_3860()
/**
 * method_43929
 */
fun MinecraftServer.getMessageDecorator() = this.method_43929()
/**
 * method_24489
 */
fun MinecraftServer.stopDebug() = this.method_24489()
/**
 * method_54831
 */
fun MinecraftServer.updateAutosaveTicks() = this.method_54831()
/**
 * method_39218
 */
fun MinecraftServer.saveAll(suppressLogs: Boolean, flush: Boolean, force: Boolean) = this.method_39218(suppressLogs, flush, force)
/**
 * method_16209
 */
fun MinecraftServer.createTask(arg0: Runnable) = this.method_16209(arg0)
/**
 * method_3734
 */
fun MinecraftServer.getCommandManager() = this.method_3734()
/**
 * method_58576
 */
fun MinecraftServer.getReloadableRegistries() = this.method_58576()
/**
 * method_54832
 */
fun MinecraftServer.getAverageTickTime() = this.method_54832()
/**
 * method_3836
 */
fun MinecraftServer.getDataPackManager() = this.method_3836()
/**
 * method_3855
 */
fun MinecraftServer.getDataFixer() = this.method_3855()
/**
 * method_3826
 */
fun MinecraftServer.getTimeReference() = this.method_3826()
/**
 * method_32816
 */
fun MinecraftServer.getPlayerInteractionManager(player: ServerPlayerEntity) = this.method_32816(player)
/**
 * method_3773
 */
fun MinecraftServer.getNetworkCompressionThreshold() = this.method_3773()
/**
 * method_61254
 */
fun MinecraftServer.tickNetworkIo() = this.method_61254()
/**
 * method_3761
 */
fun MinecraftServer.getForcedGameMode() = this.method_3761()
/**
 * method_3729
 */
fun MinecraftServer.isEnforceWhitelist() = this.method_3729()
/**
 * method_37324
 */
fun MinecraftServer.addSystemDetails(details: SystemDetails) = this.method_37324(details)
/**
 * method_3760
 */
fun MinecraftServer.getPlayerManager() = this.method_3760()
/**
 * method_3859
 */
fun MinecraftServer.addExtraSystemDetails(details: SystemDetails) = this.method_3859(details)
/**
 * method_3739
 */
fun MinecraftServer.getCommandSource() = this.method_3739()
/**
 * method_3740
 */
fun MinecraftServer.getCommandFunctionManager() = this.method_3740()
/**
 * method_27051
 */
fun MinecraftServer.syncChunkWrites() = this.method_27051()
/**
 * method_3798
 */
fun MinecraftServer.getOpPermissionLevel() = this.method_3798()
/**
 * method_21714
 */
fun MinecraftServer.getFunctionPermissionLevel() = this.method_21714()
/**
 * method_16043
 */
fun MinecraftServer.isStopping() = this.method_16043()
/**
 * method_54834
 */
fun MinecraftServer.getAverageNanosPerTick() = this.method_54834()
/**
 * method_37320
 */
fun MinecraftServer.setupRecorder(resultConsumer: Consumer<ProfileResult>, dumpConsumer: Consumer<file_Path>) = this.method_37320(resultConsumer, dumpConsumer)
/**
 * method_3782
 */
fun MinecraftServer.shutdown() = this.method_3782()
/**
 * method_3758
 */
fun MinecraftServer.getPath(path: String) = this.method_3758(path)
/**
 * method_52344
 */
fun MinecraftServer.shouldLogIps() = this.method_52344()
/**
 * method_24488
 */
fun MinecraftServer.isDebugRunning() = this.method_24488()
/**
 * method_27728
 */
fun MinecraftServer.getSaveProperties() = this.method_27728()
/**
 * method_30612
 */
fun MinecraftServer.getRateLimit() = this.method_30612()
/**
 * method_56625
 */
fun MinecraftServer.subscribeToDebugSample(player: ServerPlayerEntity, type: DebugSampleType) = this.method_56625(player, type)
/**
 * method_30002
 */
fun MinecraftServer.getOverworld() = this.method_30002()
/**
 * method_3727
 */
fun MinecraftServer.hasGui() = this.method_3727()
/**
 * method_3716
 */
fun MinecraftServer.getKeyPair() = this.method_3716()
/**
 * method_3812
 */
fun MinecraftServer.areCommandBlocksEnabled() = this.method_3812()
/**
 * method_3747
 */
fun MinecraftServer.stop(waitForShutdown: Boolean) = this.method_3747(waitForShutdown)
/**
 * method_3783
 */
fun MinecraftServer.isMonsterSpawningEnabled() = this.method_3783()
/**
 * method_3780
 */
fun MinecraftServer.getTicks() = this.method_3780()
/**
 * method_44301
 */
fun MinecraftServer.getServicesSignatureVerifier() = this.method_44301()
/**
 * method_3821
 */
fun MinecraftServer.exit() = this.method_3821()
/**
 * method_42062
 */
fun MinecraftServer.forceStopRecorder() = this.method_42062()
/**
 * method_3744
 */
fun MinecraftServer.setCrashReport(report: CrashReport) = this.method_3744(report)
/**
 * method_3724
 */
fun MinecraftServer.isSingleplayer() = this.method_3724()
/**
 * method_3844
 */
fun MinecraftServer.getSessionService() = this.method_3844()
/**
 * method_29435
 */
fun MinecraftServer.getWorldRegistryKeys() = this.method_29435()
/**
 * method_43659
 */
fun MinecraftServer.getResourcePackProperties() = this.method_43659()
/**
 * method_3749
 */
fun MinecraftServer.getMaxWorldBorderRadius() = this.method_3749()
/**
 * method_3763
 */
fun MinecraftServer.openToLan(gameMode: GameMode, cheatsAllowed: Boolean, port: Int) = this.method_3763(gameMode, cheatsAllowed, port)
/**
 * method_37323
 */
fun MinecraftServer.stopRecorder() = this.method_37323()
/**
 * method_62733
 */
fun MinecraftServer.onPacketException(exception: Throwable, type: PacketType<*>) = this.method_62733(exception, type)
/**
 * method_3748
 */
fun MinecraftServer.tick(shouldKeepTicking: BooleanSupplier) = this.method_3748(shouldKeepTicking)
/**
 * method_3847
 */
fun MinecraftServer.getWorld(key: RegistryKey<world_World>) = this.method_3847(key)
/**
 * method_3745
 */
fun MinecraftServer.setFlightEnabled(flightEnabled: Boolean) = this.method_3745(flightEnabled)
/**
 * method_3858
 */
fun MinecraftServer.getPlayerNames() = this.method_3858()
/**
 * method_60672
 */
fun MinecraftServer.getServerLinks() = this.method_60672()
/**
 * method_3845
 */
fun MinecraftServer.getScoreboard() = this.method_3845()
/**
 * method_3851
 */
fun MinecraftServer.getAdvancementLoader() = this.method_3851()
