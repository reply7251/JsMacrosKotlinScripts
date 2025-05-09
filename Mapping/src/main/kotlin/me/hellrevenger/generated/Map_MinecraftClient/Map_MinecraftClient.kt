package me.hellrevenger.generated.Map_MinecraftClient
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_1708
 */
val MinecraftClient.fontManager by alias(MinecraftClient::field_1708)
/**
 * field_32144
 */
var MinecraftClient.wireFrame by alias(MinecraftClient::field_32144)
/**
 * field_1730
 */
var MinecraftClient.chunkCullingEnabled by alias(MinecraftClient::field_1730)
/**
 * field_1743
 */
var MinecraftClient.skipGameRender by alias(MinecraftClient::field_1743)
/**
 * field_1690
 */
val MinecraftClient.options by alias(MinecraftClient::field_1690)
/**
 * field_1729
 */
val MinecraftClient.mouse by alias(MinecraftClient::field_1729)
/**
 * field_1719
 */
var MinecraftClient.cameraEntity by alias(MinecraftClient::field_1719)
/**
 * field_1772
 */
val MinecraftClient.textRenderer by alias(MinecraftClient::field_1772)
/**
 * field_1765
 */
var MinecraftClient.crosshairTarget by alias(MinecraftClient::field_1765)
/**
 * field_1705
 */
val MinecraftClient.inGameHud by alias(MinecraftClient::field_1705)
/**
 * field_1771
 */
var MinecraftClient.attackCooldown by alias(MinecraftClient::field_1771)
/**
 * field_1724
 */
var MinecraftClient.player by alias(MinecraftClient::field_1724)
/**
 * field_39924
 */
val MinecraftClient.advanceValidatingTextRenderer by alias(MinecraftClient::field_39924)
/**
 * field_1770
 */
var MinecraftClient.fpsDebugString by alias(MinecraftClient::field_1770)
/**
 * field_20908
 */
var MinecraftClient.debugChunkOcclusion by alias(MinecraftClient::field_20908)
/**
 * field_1761
 */
var MinecraftClient.interactionManager by alias(MinecraftClient::field_1761)
/**
 * field_1769
 */
val MinecraftClient.worldRenderer by alias(MinecraftClient::field_1769)
/**
 * field_1773
 */
val MinecraftClient.gameRenderer by alias(MinecraftClient::field_1773)
/**
 * field_1697
 */
val MinecraftClient.runDirectory by alias(MinecraftClient::field_1697)
/**
 * field_1709
 */
val MinecraftClient.debugRenderer by alias(MinecraftClient::field_1709)
/**
 * field_1713
 */
val MinecraftClient.particleManager by alias(MinecraftClient::field_1713)
/**
 * field_1692
 */
var MinecraftClient.targetedEntity by alias(MinecraftClient::field_1692)
/**
 * field_1774
 */
val MinecraftClient.keyboard by alias(MinecraftClient::field_1774)
/**
 * field_1687
 */
var MinecraftClient.world by alias(MinecraftClient::field_1687)
/**
 * field_1755
 */
var MinecraftClient.currentScreen by alias(MinecraftClient::field_1755)
/**
 * field_20907
 */
var MinecraftClient.debugChunkInfo by alias(MinecraftClient::field_20907)
/**
 * method_22683
 */
fun MinecraftClient.getWindow() = this.method_22683()
/**
 * method_52701
 */
fun MinecraftClient.uuidEquals(uuid: UUID) = this.method_52701(uuid)
/**
 * method_1541
 */
fun MinecraftClient.getBlockRenderManager() = this.method_1541()
/**
 * method_1562
 */
fun MinecraftClient.getNetworkHandler() = this.method_1562()
/**
 * method_45573
 */
fun MinecraftClient.getDefaultResourcePack() = this.method_45573()
/**
 * method_1574
 */
fun MinecraftClient.tick() = this.method_1574()
/**
 * method_38932
 */
fun MinecraftClient.loadBlockList() = this.method_38932()
/**
 * method_52702
 */
fun MinecraftClient.getSymlinkFinder() = this.method_52702()
/**
 * method_1479
 */
fun MinecraftClient.getResourcePackDir() = this.method_1479()
/**
 * method_29042
 */
fun MinecraftClient.shouldBlockMessages(sender: UUID) = this.method_29042(sender)
/**
 * method_1586
 */
fun MinecraftClient.getLevelStorage() = this.method_1586()
/**
 * method_35703
 */
fun MinecraftClient.getWorldGenerationProgressTracker() = this.method_35703()
/**
 * method_1481
 */
fun MinecraftClient.joinWorld(world: ClientWorld, worldEntryReason: net.minecraft.class_434.class_9678) = this.method_1481(world, worldEntryReason)
/**
 * method_1515
 */
fun MinecraftClient.getGameVersion() = this.method_1515()
/**
 * method_35706
 */
fun MinecraftClient.isRealmsEnabled() = this.method_35706()
/**
 * method_44256
 */
fun MinecraftClient.getServicesSignatureVerifier() = this.method_44256()
/**
 * method_62887
 */
fun MinecraftClient.getShaderLoader() = this.method_62887()
/**
 * method_18096
 */
fun MinecraftClient.disconnect(disconnectionScreen: Screen, transferring: Boolean) = this.method_18096(disconnectionScreen, transferring)
/**
 * method_41734
 */
fun MinecraftClient.getGpuUtilizationPercentage() = this.method_41734()
/**
 * method_34745
 */
fun MinecraftClient.toggleDebugProfiler(chatMessageSender: Consumer<Text>) = this.method_34745(chatMessageSender)
/**
 * method_35698
 */
fun MinecraftClient.takePanorama(directory: File, width: Int, height: Int) = this.method_35698(directory, width, height)
/**
 * method_53526
 */
fun MinecraftClient.getDebugHud() = this.method_53526()
/**
 * method_27022
 */
fun MinecraftClient.hasOutline(entity: Entity) = this.method_27022(entity)
/**
 * method_53518
 */
fun MinecraftClient.isUsernameBanned() = this.method_53518()
/**
 * method_51253
 */
fun MinecraftClient.getQuickPlayLogger() = this.method_51253()
/**
 * method_1548
 */
fun MinecraftClient.getSession() = this.method_1548()
/**
 * method_43590
 */
fun MinecraftClient.getProfileKeys() = this.method_43590()
/**
 * method_47601
 */
fun MinecraftClient.getTelemetryManager() = this.method_47601()
/**
 * method_30049
 */
fun MinecraftClient.getVideoWarningManager() = this.method_30049()
/**
 * method_1555
 */
fun MinecraftClient.hasReducedDebugInfo() = this.method_1555()
/**
 * method_29610
 */
fun MinecraftClient.startIntegratedServer(session: net.minecraft.class_32.class_5143, dataPackManager: ResourcePackManager, saveLoader: SaveLoader, newWorld: Boolean) = this.method_29610(session, dataPackManager, saveLoader, newWorld)
/**
 * method_1544
 */
fun MinecraftClient.getMusicInstance() = this.method_1544()
/**
 * method_44377
 */
fun MinecraftClient.getAbuseReportContext() = this.method_44377()
/**
 * method_1490
 */
fun MinecraftClient.stop() = this.method_1490()
/**
 * method_58476
 */
fun MinecraftClient.getMapDecorationsAtlasManager() = this.method_58476()
/**
 * method_18321
 */
fun MinecraftClient.getPaintingManager() = this.method_18321()
/**
 * method_31975
 */
fun MinecraftClient.getBlockEntityRenderDispatcher() = this.method_31975()
/**
 * method_61963
 */
fun MinecraftClient.getMapTextureManager() = this.method_61963()
/**
 * method_44714
 */
fun MinecraftClient.getMessageHandler() = this.method_44714()
/**
 * method_1576
 */
fun MinecraftClient.getServer() = this.method_1576()
/**
 * method_1530
 */
fun MinecraftClient.isDemo() = this.method_1530()
/**
 * method_1542
 */
fun MinecraftClient.isInSingleplayer() = this.method_1542()
/**
 * method_1569
 */
fun MinecraftClient.isWindowFocused() = this.method_1569()
/**
 * method_55606
 */
fun MinecraftClient.providesProfileKeys() = this.method_55606()
/**
 * method_31186
 */
fun MinecraftClient.onResourceReloadFailure(exception: Throwable, resourceName: Text, loadingContext: net.minecraft.class_310.class_8764) = this.method_31186(exception, resourceName, loadingContext)
/**
 * method_24288
 */
fun MinecraftClient.updateWindowTitle() = this.method_24288()
/**
 * method_29970
 */
fun MinecraftClient.setScreenAndRender(screen: Screen) = this.method_29970(screen)
/**
 * method_1513
 */
fun MinecraftClient.reloadResourcesConcurrently() = this.method_1513()
/**
 * method_1558
 */
fun MinecraftClient.getCurrentServerEntry() = this.method_1558()
/**
 * method_1582
 */
fun MinecraftClient.getSkinProvider() = this.method_1582()
/**
 * method_31974
 */
fun MinecraftClient.getLoadedEntityModels() = this.method_31974()
/**
 * method_47600
 */
fun MinecraftClient.getRenderTime() = this.method_47600()
/**
 * method_1566
 */
fun MinecraftClient.getToastManager() = this.method_1566()
/**
 * method_24041
 */
fun MinecraftClient.setMipmapLevels(mipmapLevels: Int) = this.method_24041(mipmapLevels)
/**
 * method_41735
 */
fun MinecraftClient.createIntegratedServerLoader() = this.method_41735()
/**
 * method_22940
 */
fun MinecraftClient.getBufferBuilders() = this.method_22940()
/**
 * method_1554
 */
fun MinecraftClient.getBakedModelManager() = this.method_1554()
/**
 * method_47595
 */
fun MinecraftClient.isOptionalTelemetryEnabledByApi() = this.method_47595()
/**
 * method_22108
 */
fun MinecraftClient.isRunning() = this.method_22108()
/**
 * method_18502
 */
fun MinecraftClient.setOverlay(overlay: Overlay) = this.method_18502(overlay)
/**
 * method_1571
 */
fun MinecraftClient.getCreativeHotbarStorage() = this.method_1571()
/**
 * method_1526
 */
fun MinecraftClient.getLanguageManager() = this.method_1526()
/**
 * method_47596
 */
fun MinecraftClient.isTelemetryEnabledByApi() = this.method_47596()
/**
 * method_63507
 */
fun MinecraftClient.onShaderResourceReloadFailure(exception: Exception) = this.method_63507(exception)
/**
 * method_48185
 */
fun MinecraftClient.setNavigationType(navigationType: GuiNavigationType) = this.method_48185(navigationType)
/**
 * method_1549
 */
fun MinecraftClient.getSpriteAtlas(id: Identifier) = this.method_1549(id)
/**
 * method_47602
 */
fun MinecraftClient.isOptionalTelemetryEnabled() = this.method_47602()
/**
 * method_1493
 */
fun MinecraftClient.isPaused() = this.method_1493()
/**
 * method_52703
 */
fun MinecraftClient.enterReconfiguration(reconfigurationScreen: Screen) = this.method_52703(reconfigurationScreen)
/**
 * method_44646
 */
fun MinecraftClient.getRealmsPeriodicCheckers() = this.method_44646()
/**
 * method_55505
 */
fun MinecraftClient.onDisconnected() = this.method_55505()
/**
 * method_61965
 */
fun MinecraftClient.getMapRenderer() = this.method_61965()
/**
 * method_29043
 */
fun MinecraftClient.isMultiplayerEnabled() = this.method_29043()
/**
 * method_1522
 */
fun MinecraftClient.getFramebuffer() = this.method_1522()
/**
 * method_1577
 */
fun MinecraftClient.getTutorialManager() = this.method_1577()
/**
 * method_1496
 */
fun MinecraftClient.isIntegratedServerRunning() = this.method_1496()
/**
 * method_1536
 */
fun MinecraftClient.doAttack() = this.method_1536()
/**
 * method_1521
 */
fun MinecraftClient.reloadResources() = this.method_1521()
/**
 * method_33883
 */
fun MinecraftClient.shouldFilterText() = this.method_33883()
/**
 * method_53462
 */
fun MinecraftClient.getGameProfile() = this.method_53462()
/**
 * method_1480
 */
fun MinecraftClient.getItemRenderer() = this.method_1480()
/**
 * method_1478
 */
fun MinecraftClient.getResourceManager() = this.method_1478()
/**
 * method_1505
 */
fun MinecraftClient.getBlockColors() = this.method_1505()
/**
 * method_47599
 */
fun MinecraftClient.getCurrentFps() = this.method_47599()
/**
 * method_1592
 */
fun MinecraftClient.scheduleStop() = this.method_1592()
/**
 * method_20539
 */
fun MinecraftClient.openGameMenu(pauseOnly: Boolean) = this.method_20539(pauseOnly)
/**
 * method_1583
 */
fun MinecraftClient.doItemUse() = this.method_1583()
/**
 * method_31320
 */
fun MinecraftClient.getSocialInteractionsManager() = this.method_31320()
/**
 * method_52700
 */
fun MinecraftClient.getCommandHistoryManager() = this.method_52700()
/**
 * method_1494
 */
fun MinecraftClient.setCrashReportSupplierAndAddDetails(crashReport: CrashReport) = this.method_1494(crashReport)
/**
 * method_1516
 */
fun MinecraftClient.getServerResourcePackProvider() = this.method_1516()
/**
 * method_53466
 */
fun MinecraftClient.isFinishedLoading() = this.method_53466()
/**
 * method_18505
 */
fun MinecraftClient.getStatusEffectSpriteManager() = this.method_18505()
/**
 * method_48186
 */
fun MinecraftClient.getNavigationType() = this.method_48186()
/**
 * method_65386
 */
fun MinecraftClient.getItemModelManager() = this.method_65386()
/**
 * method_1531
 */
fun MinecraftClient.getTextureManager() = this.method_1531()
/**
 * method_1507
 */
fun MinecraftClient.setScreen(screen: Screen) = this.method_1507(screen)
/**
 * method_1587
 */
fun MinecraftClient.addDetailsToCrashReport(report: CrashReport) = this.method_1587(report)
/**
 * method_1514
 */
fun MinecraftClient.run() = this.method_1514()
/**
 * method_44647
 */
fun MinecraftClient.getMultiplayerBanDetails() = this.method_44647()
/**
 * method_1538
 */
fun MinecraftClient.getMusicTracker() = this.method_1538()
/**
 * method_1483
 */
fun MinecraftClient.getSoundManager() = this.method_1483()
/**
 * method_1547
 */
fun MinecraftClient.getVersionType() = this.method_1547()
/**
 * method_1561
 */
fun MinecraftClient.getEntityRenderDispatcher() = this.method_1561()
/**
 * method_18095
 */
fun MinecraftClient.getSplashTextLoader() = this.method_18095()
/**
 * method_1495
 */
fun MinecraftClient.getSessionService() = this.method_1495()
/**
 * method_52699
 */
fun MinecraftClient.getGuiAtlasManager() = this.method_52699()
/**
 * method_1543
 */
fun MinecraftClient.getDataFixer() = this.method_1543()
/**
 * method_1573
 */
fun MinecraftClient.forcesUnicodeFont() = this.method_1573()
/**
 * method_44376
 */
fun MinecraftClient.ensureAbuseReportContext(environment: ReporterEnvironment) = this.method_44376(environment)
/**
 * method_18506
 */
fun MinecraftClient.getOverlay() = this.method_18506()
/**
 * method_1520
 */
fun MinecraftClient.getResourcePackManager() = this.method_1520()
/**
 * method_47392
 */
fun MinecraftClient.isConnectedToLocalServer() = this.method_47392()
/**
 * method_44713
 */
fun MinecraftClient.getNarratorManager() = this.method_44713()
/**
 * method_1487
 */
fun MinecraftClient.getNetworkProxy() = this.method_1487()
/**
 * method_61964
 */
fun MinecraftClient.getInactivityFpsLimiter() = this.method_61964()
/**
 * method_43587
 */
fun MinecraftClient.setCrashReportSupplier(crashReport: CrashReport) = this.method_43587(crashReport)
/**
 * method_33884
 */
fun MinecraftClient.getChatRestriction() = this.method_33884()
/**
 * method_61966
 */
fun MinecraftClient.getRenderTickCounter() = this.method_61966()
