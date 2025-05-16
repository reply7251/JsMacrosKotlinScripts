package me.hellrevenger.generated.Map_ServerPlayerEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_13974
 */
val ServerPlayerEntity.interactionManager by alias(ServerPlayerEntity::field_13974)
/**
 * field_13989
 */
var ServerPlayerEntity.notInAnyWorld by alias(ServerPlayerEntity::field_13989)
/**
 * field_13995
 */
val ServerPlayerEntity.server by alias(ServerPlayerEntity::field_13995)
/**
 * field_13987
 */
var ServerPlayerEntity.networkHandler by alias(ServerPlayerEntity::field_13987)
/**
 * field_13969
 */
var ServerPlayerEntity.seenCredits by alias(ServerPlayerEntity::field_13969)
/**
 * method_64128
 */
fun ServerPlayerEntity.getEnderPearls() = this.method_64128()
/**
 * method_61272
 */
fun ServerPlayerEntity.getPlayerListOrder() = this.method_61272()
/**
 * method_45163
 */
fun ServerPlayerEntity.getSession() = this.method_45163()
/**
 * method_14234
 */
fun ServerPlayerEntity.updateLastActionTime() = this.method_14234()
/**
 * method_64125
 */
fun ServerPlayerEntity.readRootVehicle(nbt: Optional<NbtCompound>?) = this.method_64125(nbt)
/**
 * method_51469
 */
fun ServerPlayerEntity.getServerWorld() = this.method_51469()
/**
 * method_17668
 */
fun ServerPlayerEntity.setWatchedSection(section: ChunkSectionPos?) = this.method_17668(section)
/**
 * method_52208
 */
fun ServerPlayerEntity.setMovement(movement: Vec3d?) = this.method_52208(movement)
/**
 * method_14209
 */
fun ServerPlayerEntity.getIp() = this.method_14209()
/**
 * method_58585
 */
fun ServerPlayerEntity.getStartRaidPos() = this.method_58585()
/**
 * method_52373
 */
fun ServerPlayerEntity.setChunkFilter(chunkFilter: ChunkFilter?) = this.method_52373(chunkFilter)
/**
 * method_26284
 */
fun ServerPlayerEntity.setSpawnPoint(dimension: RegistryKey<world_World>?, pos: BlockPos?, angle: Float, forced: Boolean, sendMessage: Boolean) = this.method_26284(dimension, pos, angle, forced, sendMessage)
/**
 * method_64133
 */
fun ServerPlayerEntity.handleThrownEnderPearl(enderPearl: EnderPearlEntity?) = this.method_64133(enderPearl)
/**
 * method_46364
 */
fun ServerPlayerEntity.setSession(session: PublicPlayerSession?) = this.method_46364(session)
/**
 * method_14217
 */
fun ServerPlayerEntity.markHealthDirty() = this.method_14217()
/**
 * method_34225
 */
fun ServerPlayerEntity.onSpawn() = this.method_34225()
/**
 * method_54720
 */
fun ServerPlayerEntity.increaseTravelMotionStats(deltaX: Double, arg1: Double, deltaY: Double) = this.method_54720(deltaX, arg1, deltaY)
/**
 * method_14224
 */
fun ServerPlayerEntity.setCameraEntity(entity: Entity?) = this.method_14224(entity)
/**
 * method_31273
 */
fun ServerPlayerEntity.getTextStream() = this.method_31273()
/**
 * method_43505
 */
fun ServerPlayerEntity.sendChatMessage(message: SentMessage?, filterMaskEnabled: Boolean, params: net.minecraft.class_2556.class_7602?) = this.method_43505(message, filterMaskEnabled, params)
/**
 * method_64131
 */
fun ServerPlayerEntity.readEnderPearls(nbt: Optional<NbtCompound>?) = this.method_64131(nbt)
/**
 * method_14208
 */
fun ServerPlayerEntity.isInTeleportationState() = this.method_14208()
/**
 * method_52371
 */
fun ServerPlayerEntity.getViewDistance() = this.method_52371()
/**
 * method_61275
 */
fun ServerPlayerEntity.teleportTo(arg0: TeleportTarget?) = this.method_61275(arg0)
/**
 * method_14228
 */
fun ServerPlayerEntity.setExperiencePoints(points: Int) = this.method_14228(points)
/**
 * method_64130
 */
fun ServerPlayerEntity.removeEnderPearl(enderPearl: EnderPearlEntity?) = this.method_64130(enderPearl)
/**
 * method_37413
 */
fun ServerPlayerEntity.dropSelectedItem(entireStack: Boolean) = this.method_37413(entireStack)
/**
 * method_14219
 */
fun ServerPlayerEntity.getLastActionTime() = this.method_14219()
/**
 * method_26282
 */
fun ServerPlayerEntity.isSpawnForced() = this.method_26282()
/**
 * method_64398
 */
fun ServerPlayerEntity.sendMessage(message: Text?) = this.method_64398(message)
/**
 * method_14253
 */
fun ServerPlayerEntity.getRecipeBook() = this.method_14253()
/**
 * method_64396
 */
fun ServerPlayerEntity.getCommandSource() = this.method_64396()
/**
 * method_60594
 */
fun ServerPlayerEntity.detachForDimensionChange() = this.method_60594()
/**
 * method_43930
 */
fun ServerPlayerEntity.sendServerMetadata(metadata: ServerMetadata?) = this.method_43930(metadata)
/**
 * method_63562
 */
fun ServerPlayerEntity.getPlayerInput() = this.method_63562()
/**
 * method_14213
 */
fun ServerPlayerEntity.setClientOptions(clientOptions: SyncedClientOptions?) = this.method_14213(clientOptions)
/**
 * method_14242
 */
fun ServerPlayerEntity.getCameraEntity() = this.method_14242()
/**
 * method_26280
 */
fun ServerPlayerEntity.getSpawnPointPosition() = this.method_26280()
/**
 * method_58586
 */
fun ServerPlayerEntity.setStartRaidPos(startRaidPos: BlockPos?) = this.method_58586(startRaidPos)
/**
 * method_14248
 */
fun ServerPlayerEntity.getStatHandler() = this.method_14248()
/**
 * method_32748
 */
fun ServerPlayerEntity.readGameModeNbt(nbt: NbtCompound?) = this.method_32748(nbt)
/**
 * method_38786
 */
fun ServerPlayerEntity.tickFallStartPos() = this.method_38786()
/**
 * method_14226
 */
fun ServerPlayerEntity.playerTick() = this.method_14226()
/**
 * method_52374
 */
fun ServerPlayerEntity.createCommonPlayerSpawnInfo(world: ServerWorld?) = this.method_52374(world)
/**
 * method_51468
 */
fun ServerPlayerEntity.setServerWorld(world: ServerWorld?) = this.method_51468(world)
/**
 * method_14206
 */
fun ServerPlayerEntity.getPlayerListName() = this.method_14206()
/**
 * method_60592
 */
fun ServerPlayerEntity.setSpawnPointFrom(player: ServerPlayerEntity?) = this.method_60592(player)
/**
 * method_58584
 */
fun ServerPlayerEntity.clearStartRaidPos() = this.method_58584()
/**
 * method_26281
 */
fun ServerPlayerEntity.getSpawnPointDimension() = this.method_26281()
/**
 * method_63563
 */
fun ServerPlayerEntity.getInputVelocityForMinecart() = this.method_63563()
/**
 * method_64124
 */
fun ServerPlayerEntity.addEnderPearl(enderPearl: EnderPearlEntity?) = this.method_64124(enderPearl)
/**
 * method_14240
 */
fun ServerPlayerEntity.onTeleportationDone() = this.method_14240()
/**
 * method_38787
 */
fun ServerPlayerEntity.tickVehicleInLavaRiding() = this.method_38787()
/**
 * method_58143
 */
fun ServerPlayerEntity.setSpawnExtraParticlesOnFall(spawnExtraParticlesOnFall: Boolean) = this.method_58143(spawnExtraParticlesOnFall)
/**
 * method_63561
 */
fun ServerPlayerEntity.setPlayerInput(playerInput: PlayerInput?) = this.method_63561(playerInput)
/**
 * method_14232
 */
fun ServerPlayerEntity.getWatchedSection() = this.method_14232()
/**
 * method_34879
 */
fun ServerPlayerEntity.areClientChatColorsEnabled() = this.method_34879()
/**
 * method_52372
 */
fun ServerPlayerEntity.getChunkFilter() = this.method_52372()
/**
 * method_14203
 */
fun ServerPlayerEntity.copyFrom(oldPlayer: ServerPlayerEntity?, alive: Boolean) = this.method_14203(oldPlayer, alive)
/**
 * method_14231
 */
fun ServerPlayerEntity.onDisconnect() = this.method_14231()
/**
 * method_14222
 */
fun ServerPlayerEntity.lookAtEntity(anchorPoint: net.minecraft.class_2183.class_2184?, targetEntity: Entity?, targetAnchor: net.minecraft.class_2183.class_2184?) = this.method_14222(anchorPoint, targetEntity, targetAnchor)
/**
 * method_14252
 */
fun ServerPlayerEntity.setExperienceLevel(level: Int) = this.method_14252(level)
/**
 * method_14238
 */
fun ServerPlayerEntity.getClientChatVisibility() = this.method_14238()
/**
 * method_64401
 */
fun ServerPlayerEntity.getCommandOutput() = this.method_64401()
/**
 * method_14236
 */
fun ServerPlayerEntity.getAdvancementTracker() = this.method_14236()
/**
 * method_53823
 */
fun ServerPlayerEntity.getClientOptions() = this.method_53823()
/**
 * method_39426
 */
fun ServerPlayerEntity.allowsServerListing() = this.method_39426()
/**
 * method_30631
 */
fun ServerPlayerEntity.getSpawnAngle() = this.method_30631()
/**
 * method_43502
 */
fun ServerPlayerEntity.sendMessageToClient(message: Text?, overlay: Boolean) = this.method_43502(message, overlay)
/**
 * method_60590
 */
fun ServerPlayerEntity.getRespawnTarget(alive: Boolean, postDimensionTransition: net.minecraft.class_5454.class_9823?) = this.method_60590(alive, postDimensionTransition)
/**
 * method_14239
 */
fun ServerPlayerEntity.isDisconnected() = this.method_14239()
/**
 * method_33795
 */
fun ServerPlayerEntity.shouldFilterMessagesSentTo(player: ServerPlayerEntity?) = this.method_33795(player)
/**
 * method_7336
 */
fun ServerPlayerEntity.changeGameMode(gameMode: GameMode?) = this.method_7336(gameMode)
