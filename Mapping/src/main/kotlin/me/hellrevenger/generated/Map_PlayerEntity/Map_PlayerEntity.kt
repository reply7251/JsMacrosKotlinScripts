package me.hellrevenger.generated.Map_PlayerEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30651
 */
val KClass<PlayerEntity>.DEFAULT_EYE_HEIGHT by aliasStatic(PlayerEntity::field_30651)
/**
 * field_49990
 */
var PlayerEntity.explodedBy by alias(PlayerEntity::field_49990)
/**
 * field_7521
 */
var PlayerEntity.capeY by alias(PlayerEntity::field_7521)
/**
 * field_7512
 */
var PlayerEntity.currentScreenHandler by alias(PlayerEntity::field_7512)
/**
 * field_7513
 */
var PlayerEntity.fishHook by alias(PlayerEntity::field_7513)
/**
 * field_7520
 */
var PlayerEntity.experienceLevel by alias(PlayerEntity::field_7520)
/**
 * field_46174
 */
val KClass<PlayerEntity>.DEFAULT_MAIN_ARM by aliasStatic(PlayerEntity::field_46174)
/**
 * field_7499
 */
var PlayerEntity.capeZ by alias(PlayerEntity::field_7499)
/**
 * field_7504
 */
var PlayerEntity.experiencePickUpDelay by alias(PlayerEntity::field_7504)
/**
 * field_7505
 */
var PlayerEntity.prevStrideDistance by alias(PlayerEntity::field_7505)
/**
 * field_18135
 */
val KClass<PlayerEntity>.STANDING_DIMENSIONS by aliasStatic(PlayerEntity::field_18135)
/**
 * field_47821
 */
val KClass<PlayerEntity>.VEHICLE_ATTACHMENT_POS by aliasStatic(PlayerEntity::field_47821)
/**
 * field_7502
 */
var PlayerEntity.prevCapeY by alias(PlayerEntity::field_7502)
/**
 * field_49989
 */
var PlayerEntity.currentExplosionImpactPos by alias(PlayerEntity::field_49989)
/**
 * field_7495
 */
var PlayerEntity.totalExperience by alias(PlayerEntity::field_7495)
/**
 * field_7483
 */
var PlayerEntity.strideDistance by alias(PlayerEntity::field_7483)
/**
 * field_7524
 */
var PlayerEntity.prevCapeX by alias(PlayerEntity::field_7524)
/**
 * field_7500
 */
var PlayerEntity.capeX by alias(PlayerEntity::field_7500)
/**
 * field_7510
 */
var PlayerEntity.experienceProgress by alias(PlayerEntity::field_7510)
/**
 * field_7522
 */
var PlayerEntity.prevCapeZ by alias(PlayerEntity::field_7522)
/**
 * field_7498
 */
val PlayerEntity.playerScreenHandler by alias(PlayerEntity::field_7498)
/**
 * method_7284
 */
fun PlayerEntity.disableShield() = this.method_7284()
/**
 * method_7335
 */
fun PlayerEntity.unlockRecipes(arg0: MutableList<Identifier>) = this.method_7335(arg0)
/**
 * method_7266
 */
fun PlayerEntity.resetStat(arg0: Stat<*>) = this.method_7266(arg0)
/**
 * method_45015
 */
fun PlayerEntity.shouldCloseHandledScreenOnRespawn() = this.method_45015()
/**
 * method_56094
 */
fun PlayerEntity.canInteractWithEntity(arg0: Entity, arg1: Double) = this.method_56094(arg0, arg1)
/**
 * method_7297
 */
fun PlayerEntity.getSleepTimer() = this.method_7297()
/**
 * method_7338
 */
fun PlayerEntity.isCreativeLevelTwoOp() = this.method_7338()
/**
 * method_7302
 */
fun PlayerEntity.hasReducedDebugInfo() = this.method_7302()
/**
 * method_7342
 */
fun PlayerEntity.increaseStat(arg0: Stat<*>, arg1: Int) = this.method_7342(arg0, arg1)
/**
 * method_21701
 */
fun PlayerEntity.isBlockBreakingRestricted(arg0: world_World, arg1: BlockPos, arg2: GameMode) = this.method_21701(arg0, arg1, arg2)
/**
 * method_7261
 */
fun PlayerEntity.getAttackCooldownProgress(arg0: Float) = this.method_7261(arg0)
/**
 * method_7269
 */
fun PlayerEntity.trySleep(arg0: BlockPos) = this.method_7269(arg0)
/**
 * method_7315
 */
fun PlayerEntity.useBook(arg0: ItemStack, arg1: Hand) = this.method_7315(arg0, arg1)
/**
 * method_7355
 */
fun PlayerEntity.sendAbilitiesUpdate() = this.method_7355()
/**
 * method_7331
 */
fun PlayerEntity.requestRespawn() = this.method_7331()
/**
 * method_7343
 */
fun PlayerEntity.canPlaceOn(arg0: BlockPos, arg1: Direction, arg2: ItemStack) = this.method_7343(arg0, arg1, arg2)
/**
 * method_7356
 */
fun PlayerEntity.getShoulderEntityLeft() = this.method_7356()
/**
 * method_7294
 */
fun PlayerEntity.canModifyBlocks() = this.method_7294()
/**
 * method_7304
 */
fun PlayerEntity.addEnchantedHitParticles(arg0: Entity) = this.method_7304(arg0)
/**
 * method_7281
 */
fun PlayerEntity.incrementStat(arg0: Identifier) = this.method_7281(arg0)
/**
 * method_7311
 */
fun PlayerEntity.openEditSignScreen(arg0: SignBlockEntity, arg1: Boolean) = this.method_7311(arg0, arg1)
/**
 * method_7279
 */
fun PlayerEntity.getAttackCooldownProgressPerTick() = this.method_7279()
/**
 * method_7316
 */
fun PlayerEntity.addExperienceLevels(arg0: Int) = this.method_7316(arg0)
/**
 * method_51283
 */
fun PlayerEntity.onRecipeCrafted(arg0: RecipeEntry<*>, arg1: MutableList<ItemStack>) = this.method_51283(arg0, arg1)
/**
 * method_7320
 */
fun PlayerEntity.setScore(arg0: Int) = this.method_7320(arg0)
/**
 * method_7328
 */
fun PlayerEntity.dropItem(arg0: ItemStack, arg1: Boolean) = this.method_7328(arg0, arg1)
/**
 * method_7344
 */
fun PlayerEntity.getHungerManager() = this.method_7344()
/**
 * method_7327
 */
fun PlayerEntity.getScoreboard() = this.method_7327()
/**
 * method_7298
 */
fun PlayerEntity.addShoulderEntity(arg0: NbtCompound) = this.method_7298(arg0)
/**
 * method_7340
 */
fun PlayerEntity.isMainPlayer() = this.method_7340()
/**
 * method_42272
 */
fun PlayerEntity.getSculkShriekerWarningManager() = this.method_42272()
/**
 * method_60983
 */
fun PlayerEntity.tryClearCurrentExplosion() = this.method_60983()
/**
 * method_7254
 */
fun PlayerEntity.unlockRecipes(arg0: Collection<RecipeEntry<*>>) = this.method_7254(arg0)
/**
 * method_7332
 */
fun PlayerEntity.canConsume(arg0: Boolean) = this.method_7332(arg0)
/**
 * method_7349
 */
fun PlayerEntity.getNextLevelExperience() = this.method_7349()
/**
 * method_7274
 */
fun PlayerEntity.getEnderChestInventory() = this.method_7274()
/**
 * method_7283
 */
fun PlayerEntity.setMainArm(arg0: Arm) = this.method_7283(arg0)
/**
 * method_7286
 */
fun PlayerEntity.applyEnchantmentCosts(arg0: ItemStack, arg1: Int) = this.method_7286(arg0, arg1)
/**
 * method_7272
 */
fun PlayerEntity.getScore() = this.method_7272()
/**
 * method_40126
 */
fun PlayerEntity.useRiptide(arg0: Int, arg1: Float, arg2: ItemStack) = this.method_40126(arg0, arg1, arg2)
/**
 * method_7337
 */
fun PlayerEntity.isCreative() = this.method_7337()
/**
 * method_7268
 */
fun PlayerEntity.setReducedDebugInfo(arg0: Boolean) = this.method_7268(arg0)
/**
 * method_7276
 */
fun PlayerEntity.canResetTimeBySleeping() = this.method_7276()
/**
 * method_58396
 */
fun PlayerEntity.clearCurrentExplosion() = this.method_58396()
/**
 * method_31550
 */
fun PlayerEntity.isUsingSpyglass() = this.method_31550()
/**
 * method_7277
 */
fun PlayerEntity.addCritParticles(arg0: Entity) = this.method_7277(arg0)
/**
 * method_26956
 */
fun KClass<PlayerEntity>.createPlayerAttributes() = PlayerEntity.method_26956()
/**
 * method_7291
 */
fun PlayerEntity.openHorseInventory(arg0: AbstractHorseEntity, arg1: Inventory) = this.method_7291(arg0, arg1)
/**
 * method_33592
 */
fun PlayerEntity.onPickupSlotClick(arg0: ItemStack, arg1: ItemStack, arg2: ClickType) = this.method_33592(arg0, arg1, arg2)
/**
 * method_7305
 */
fun PlayerEntity.canHarvest(arg0: BlockState) = this.method_7305(arg0)
/**
 * method_7358
 */
fun PlayerEntity.wakeUp(arg0: Boolean, arg1: Boolean) = this.method_7358(arg0, arg1)
/**
 * method_7334
 */
fun PlayerEntity.getGameProfile() = this.method_7334()
/**
 * method_7285
 */
fun PlayerEntity.addScore(arg0: Int) = this.method_7285(arg0)
/**
 * method_7303
 */
fun PlayerEntity.openStructureBlockScreen(arg0: StructureBlockBlockEntity) = this.method_7303(arg0)
/**
 * method_7350
 */
fun PlayerEntity.resetLastAttackedTicks() = this.method_7350()
/**
 * method_56092
 */
fun PlayerEntity.canInteractWithEntityIn(arg0: Box, arg1: Double) = this.method_56092(arg0, arg1)
/**
 * method_7333
 */
fun PlayerEntity.lockRecipes(arg0: Collection<RecipeEntry<*>>) = this.method_7333(arg0)
/**
 * method_7351
 */
fun PlayerEntity.getBlockBreakingSpeed(arg0: BlockState) = this.method_7351(arg0)
/**
 * method_23670
 */
fun PlayerEntity.stopFallFlying() = this.method_23670()
/**
 * method_55755
 */
fun PlayerEntity.getEntityInteractionRange() = this.method_55755()
/**
 * method_60984
 */
fun PlayerEntity.setIgnoreFallDamageFromCurrentExplosion(arg0: Boolean) = this.method_60984(arg0)
/**
 * method_7287
 */
fun PlayerEntity.interact(arg0: Entity, arg1: Hand) = this.method_7287(arg0, arg1)
/**
 * method_7339
 */
fun PlayerEntity.increaseStat(arg0: Identifier, arg1: Int) = this.method_7339(arg0, arg1)
/**
 * method_7278
 */
fun PlayerEntity.getEnchantmentTableSeed() = this.method_7278()
/**
 * method_7270
 */
fun PlayerEntity.giveItemStack(arg0: ItemStack) = this.method_7270(arg0)
/**
 * method_33793
 */
fun PlayerEntity.shouldFilterText() = this.method_33793()
/**
 * method_7322
 */
fun PlayerEntity.addExhaustion(arg0: Float) = this.method_7322(arg0)
/**
 * method_56093
 */
fun PlayerEntity.canInteractWithBlockAt(arg0: BlockPos, arg1: Double) = this.method_56093(arg0, arg1)
/**
 * method_7308
 */
fun PlayerEntity.getShoulderEntityRight() = this.method_7308()
/**
 * method_7324
 */
fun PlayerEntity.attack(arg0: Entity) = this.method_7324(arg0)
/**
 * method_55754
 */
fun PlayerEntity.getBlockInteractionRange() = this.method_55754()
/**
 * method_7256
 */
fun PlayerEntity.shouldDamagePlayer(arg0: PlayerEntity) = this.method_7256(arg0)
/**
 * method_21823
 */
fun PlayerEntity.shouldCancelInteraction() = this.method_21823()
/**
 * method_7255
 */
fun PlayerEntity.addExperience(arg0: Int) = this.method_7255(arg0)
/**
 * method_7348
 */
fun PlayerEntity.isPartVisible(arg0: PlayerModelPart) = this.method_7348(arg0)
/**
 * method_61165
 */
fun PlayerEntity.shouldIgnoreFallDamageFromCurrentExplosion() = this.method_61165()
/**
 * method_7353
 */
fun PlayerEntity.sendMessage(arg0: Text, arg1: Boolean) = this.method_7353(arg0, arg1)
/**
 * method_7263
 */
fun PlayerEntity.spawnSweepAttackParticles() = this.method_7263()
/**
 * method_7323
 */
fun PlayerEntity.openCommandBlockScreen(arg0: CommandBlockBlockEntity) = this.method_7323(arg0)
/**
 * method_7329
 */
fun PlayerEntity.dropItem(arg0: ItemStack, arg1: Boolean, arg2: Boolean) = this.method_7329(arg0, arg1, arg2)
/**
 * method_17355
 */
fun PlayerEntity.openHandledScreen(arg0: NamedScreenHandlerFactory) = this.method_17355(arg0)
/**
 * method_23668
 */
fun PlayerEntity.checkFallFlying() = this.method_23668()
/**
 * method_7259
 */
fun PlayerEntity.incrementStat(arg0: Stat<*>) = this.method_7259(arg0)
/**
 * method_43120
 */
fun PlayerEntity.setLastDeathPos(arg0: Optional<GlobalPos>) = this.method_43120(arg0)
/**
 * method_17354
 */
fun PlayerEntity.sendTradeOffers(arg0: Int, arg1: TradeOfferList, arg2: Int, arg3: Int, arg4: Boolean, arg5: Boolean) = this.method_17354(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_7292
 */
fun PlayerEntity.getLuck() = this.method_7292()
/**
 * method_31548
 */
fun PlayerEntity.getInventory() = this.method_31548()
/**
 * method_23669
 */
fun PlayerEntity.startFallFlying() = this.method_23669()
/**
 * method_43122
 */
fun PlayerEntity.getLastDeathPos() = this.method_43122()
/**
 * method_7357
 */
fun PlayerEntity.getItemCooldownManager() = this.method_7357()
/**
 * method_17356
 */
fun PlayerEntity.playSoundToPlayer(arg0: SoundEvent, arg1: SoundCategory, arg2: Float, arg3: Float) = this.method_17356(arg0, arg1, arg2, arg3)
/**
 * method_31549
 */
fun PlayerEntity.getAbilities() = this.method_31549()
/**
 * method_7257
 */
fun PlayerEntity.openCommandBlockMinecartScreen(arg0: CommandBlockExecutor) = this.method_7257(arg0)
/**
 * method_16354
 */
fun PlayerEntity.openJigsawScreen(arg0: JigsawBlockEntity) = this.method_16354(arg0)
/**
 * method_7317
 */
fun PlayerEntity.canFoodHeal() = this.method_7317()
