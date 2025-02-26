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
 * method_45163
 */
fun ServerPlayerEntity.getSession() = this.method_45163()
/**
 * method_14234
 */
fun ServerPlayerEntity.updateLastActionTime() = this.method_14234()
/**
 * method_51469
 */
fun ServerPlayerEntity.getServerWorld() = this.method_51469()
/**
 * method_17668
 */
fun ServerPlayerEntity.setWatchedSection(arg0: ChunkSectionPos) = this.method_17668(arg0)
/**
 * method_52208
 */
fun ServerPlayerEntity.setOnGround(arg0: Vec3d) = this.method_52208(arg0)
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
fun ServerPlayerEntity.setChunkFilter(arg0: ChunkFilter) = this.method_52373(arg0)
/**
 * method_26284
 */
fun ServerPlayerEntity.setSpawnPoint(arg0: RegistryKey<world_World>, arg1: BlockPos, arg2: Float, arg3: Boolean, arg4: Boolean) = this.method_26284(arg0, arg1, arg2, arg3, arg4)
/**
 * method_46364
 */
fun ServerPlayerEntity.setSession(arg0: PublicPlayerSession) = this.method_46364(arg0)
/**
 * method_14217
 */
fun ServerPlayerEntity.markHealthDirty() = this.method_14217()
/**
 * method_34225
 */
fun ServerPlayerEntity.onSpawn() = this.method_34225()
/**
 * method_14207
 */
fun ServerPlayerEntity.handleFall(arg0: Double, arg1: Double, arg2: Double, arg3: Boolean) = this.method_14207(arg0, arg1, arg2, arg3)
/**
 * method_54720
 */
fun ServerPlayerEntity.increaseTravelMotionStats(arg0: Double, arg1: Double, arg2: Double) = this.method_54720(arg0, arg1, arg2)
/**
 * method_14224
 */
fun ServerPlayerEntity.setCameraEntity(arg0: Entity) = this.method_14224(arg0)
/**
 * method_31273
 */
fun ServerPlayerEntity.getTextStream() = this.method_31273()
/**
 * method_43505
 */
fun ServerPlayerEntity.sendChatMessage(arg0: SentMessage, arg1: Boolean, arg2: net.minecraft.class_2556.class_7602) = this.method_43505(arg0, arg1, arg2)
/**
 * method_14208
 */
fun ServerPlayerEntity.isInTeleportationState() = this.method_14208()
/**
 * method_52371
 */
fun ServerPlayerEntity.getViewDistance() = this.method_52371()
/**
 * method_14228
 */
fun ServerPlayerEntity.setExperiencePoints(arg0: Int) = this.method_14228(arg0)
/**
 * method_14251
 */
fun ServerPlayerEntity.teleport(arg0: ServerWorld, arg1: Double, arg2: Double, arg3: Double, arg4: Float, arg5: Float) = this.method_14251(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_37413
 */
fun ServerPlayerEntity.dropSelectedItem(arg0: Boolean) = this.method_37413(arg0)
/**
 * method_14219
 */
fun ServerPlayerEntity.getLastActionTime() = this.method_14219()
/**
 * method_14218
 */
fun ServerPlayerEntity.updateInput(arg0: Float, arg1: Float, arg2: Boolean, arg3: Boolean) = this.method_14218(arg0, arg1, arg2, arg3)
/**
 * method_26282
 */
fun ServerPlayerEntity.isSpawnForced() = this.method_26282()
/**
 * method_14253
 */
fun ServerPlayerEntity.getRecipeBook() = this.method_14253()
/**
 * method_60594
 */
fun ServerPlayerEntity.detachForDimensionChange() = this.method_60594()
/**
 * method_43930
 */
fun ServerPlayerEntity.sendServerMetadata(arg0: ServerMetadata) = this.method_43930(arg0)
/**
 * method_14213
 */
fun ServerPlayerEntity.setClientOptions(arg0: SyncedClientOptions) = this.method_14213(arg0)
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
fun ServerPlayerEntity.setStartRaidPos(arg0: BlockPos) = this.method_58586(arg0)
/**
 * method_14248
 */
fun ServerPlayerEntity.getStatHandler() = this.method_14248()
/**
 * method_32748
 */
fun ServerPlayerEntity.readGameModeNbt(arg0: NbtCompound) = this.method_32748(arg0)
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
fun ServerPlayerEntity.createCommonPlayerSpawnInfo(arg0: ServerWorld) = this.method_52374(arg0)
/**
 * method_51468
 */
fun ServerPlayerEntity.setServerWorld(arg0: ServerWorld) = this.method_51468(arg0)
/**
 * method_14206
 */
fun ServerPlayerEntity.getPlayerListName() = this.method_14206()
/**
 * method_60592
 */
fun ServerPlayerEntity.setSpawnPointFrom(arg0: ServerPlayerEntity) = this.method_60592(arg0)
/**
 * method_58584
 */
fun ServerPlayerEntity.clearStartRaidPos() = this.method_58584()
/**
 * method_26281
 */
fun ServerPlayerEntity.getSpawnPointDimension() = this.method_26281()
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
fun ServerPlayerEntity.setSpawnExtraParticlesOnFall(arg0: Boolean) = this.method_58143(arg0)
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
fun ServerPlayerEntity.copyFrom(arg0: ServerPlayerEntity, arg1: Boolean) = this.method_14203(arg0, arg1)
/**
 * method_14231
 */
fun ServerPlayerEntity.onDisconnect() = this.method_14231()
/**
 * method_14222
 */
fun ServerPlayerEntity.lookAtEntity(arg0: net.minecraft.class_2183.class_2184, arg1: Entity, arg2: net.minecraft.class_2183.class_2184) = this.method_14222(arg0, arg1, arg2)
/**
 * method_14252
 */
fun ServerPlayerEntity.setExperienceLevel(arg0: Int) = this.method_14252(arg0)
/**
 * method_14238
 */
fun ServerPlayerEntity.getClientChatVisibility() = this.method_14238()
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
fun ServerPlayerEntity.sendMessageToClient(arg0: Text, arg1: Boolean) = this.method_43502(arg0, arg1)
/**
 * method_60590
 */
fun ServerPlayerEntity.getRespawnTarget(arg0: Boolean, arg1: net.minecraft.class_5454.class_9823) = this.method_60590(arg0, arg1)
/**
 * method_14239
 */
fun ServerPlayerEntity.isDisconnected() = this.method_14239()
/**
 * method_33795
 */
fun ServerPlayerEntity.shouldFilterMessagesSentTo(arg0: ServerPlayerEntity) = this.method_33795(arg0)
/**
 * method_7336
 */
fun ServerPlayerEntity.changeGameMode(arg0: GameMode) = this.method_7336(arg0)
