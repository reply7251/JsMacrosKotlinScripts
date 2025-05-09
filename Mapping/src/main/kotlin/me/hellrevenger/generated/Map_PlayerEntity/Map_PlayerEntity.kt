package me.hellrevenger.generated.Map_PlayerEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
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
 * method_7335
 */
fun PlayerEntity.unlockRecipes(recipes: MutableList<RegistryKey<Recipe<*>>>) = this.method_7335(recipes)
/**
 * method_7266
 */
fun PlayerEntity.resetStat(stat: Stat<*>) = this.method_7266(stat)
/**
 * method_45015
 */
fun PlayerEntity.shouldCloseHandledScreenOnRespawn() = this.method_45015()
/**
 * method_56094
 */
fun PlayerEntity.canInteractWithEntity(entity: Entity, additionalRange: Double) = this.method_56094(entity, additionalRange)
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
 * method_61498
 */
fun PlayerEntity.shouldRotateWithMinecart() = this.method_61498()
/**
 * method_7342
 */
fun PlayerEntity.increaseStat(stat: Stat<*>, amount: Int) = this.method_7342(stat, amount)
/**
 * method_21701
 */
fun PlayerEntity.isBlockBreakingRestricted(world: world_World, pos: BlockPos, gameMode: GameMode) = this.method_21701(world, pos, gameMode)
/**
 * method_7261
 */
fun PlayerEntity.getAttackCooldownProgress(baseTime: Float) = this.method_7261(baseTime)
/**
 * method_64271
 */
fun PlayerEntity.canDropItems() = this.method_64271()
/**
 * method_7269
 */
fun PlayerEntity.trySleep(pos: BlockPos) = this.method_7269(pos)
/**
 * method_7315
 */
fun PlayerEntity.useBook(book: ItemStack, hand: Hand) = this.method_7315(book, hand)
/**
 * method_7355
 */
fun PlayerEntity.sendAbilitiesUpdate() = this.method_7355()
/**
 * method_5691
 */
fun PlayerEntity.getPermissionLevel() = this.method_5691()
/**
 * method_65352
 */
fun PlayerEntity.setLoaded(loaded: Boolean) = this.method_65352(loaded)
/**
 * method_7331
 */
fun PlayerEntity.requestRespawn() = this.method_7331()
/**
 * method_7343
 */
fun PlayerEntity.canPlaceOn(pos: BlockPos, facing: Direction, stack: ItemStack) = this.method_7343(pos, facing, stack)
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
fun PlayerEntity.addEnchantedHitParticles(target: Entity) = this.method_7304(target)
/**
 * method_7281
 */
fun PlayerEntity.incrementStat(stat: Identifier) = this.method_7281(stat)
/**
 * method_7311
 */
fun PlayerEntity.openEditSignScreen(sign: SignBlockEntity, front: Boolean) = this.method_7311(sign, front)
/**
 * method_7279
 */
fun PlayerEntity.getAttackCooldownProgressPerTick() = this.method_7279()
/**
 * method_7316
 */
fun PlayerEntity.addExperienceLevels(levels: Int) = this.method_7316(levels)
/**
 * method_51283
 */
fun PlayerEntity.onRecipeCrafted(recipe: RecipeEntry<*>, ingredients: MutableList<ItemStack>) = this.method_51283(recipe, ingredients)
/**
 * method_7320
 */
fun PlayerEntity.setScore(score: Int) = this.method_7320(score)
/**
 * method_7328
 */
fun PlayerEntity.dropItem(stack: ItemStack, retainOwnership: Boolean) = this.method_7328(stack, retainOwnership)
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
fun PlayerEntity.addShoulderEntity(entityNbt: NbtCompound) = this.method_7298(entityNbt)
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
 * method_7332
 */
fun PlayerEntity.canConsume(ignoreHunger: Boolean) = this.method_7332(ignoreHunger)
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
fun PlayerEntity.setMainArm(arm: Arm) = this.method_7283(arm)
/**
 * method_7286
 */
fun PlayerEntity.applyEnchantmentCosts(enchantedItem: ItemStack, experienceLevels: Int) = this.method_7286(enchantedItem, experienceLevels)
/**
 * method_7272
 */
fun PlayerEntity.getScore() = this.method_7272()
/**
 * method_40126
 */
fun PlayerEntity.useRiptide(riptideTicks: Int, riptideAttackDamage: Float, stack: ItemStack) = this.method_40126(riptideTicks, riptideAttackDamage, stack)
/**
 * method_7337
 */
fun PlayerEntity.isCreative() = this.method_7337()
/**
 * method_65350
 */
fun PlayerEntity.isLoaded() = this.method_65350()
/**
 * method_7284
 */
fun PlayerEntity.disableShield(shield: ItemStack) = this.method_7284(shield)
/**
 * method_7268
 */
fun PlayerEntity.setReducedDebugInfo(reducedDebugInfo: Boolean) = this.method_7268(reducedDebugInfo)
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
fun PlayerEntity.addCritParticles(target: Entity) = this.method_7277(target)
/**
 * method_7291
 */
fun PlayerEntity.openHorseInventory(horse: AbstractHorseEntity, inventory: Inventory) = this.method_7291(horse, inventory)
/**
 * method_33592
 */
fun PlayerEntity.onPickupSlotClick(cursorStack: ItemStack, slotStack: ItemStack, clickType: ClickType) = this.method_33592(cursorStack, slotStack, clickType)
/**
 * method_65351
 */
fun PlayerEntity.tickLoaded() = this.method_65351()
/**
 * method_7305
 */
fun PlayerEntity.canHarvest(state: BlockState) = this.method_7305(state)
/**
 * method_7358
 */
fun PlayerEntity.wakeUp(skipSleepTimer: Boolean, updateSleepingPlayers: Boolean) = this.method_7358(skipSleepTimer, updateSleepingPlayers)
/**
 * method_7334
 */
fun PlayerEntity.getGameProfile() = this.method_7334()
/**
 * method_7285
 */
fun PlayerEntity.addScore(score: Int) = this.method_7285(score)
/**
 * method_7303
 */
fun PlayerEntity.openStructureBlockScreen(structureBlock: StructureBlockBlockEntity) = this.method_7303(structureBlock)
/**
 * method_7350
 */
fun PlayerEntity.resetLastAttackedTicks() = this.method_7350()
/**
 * method_56092
 */
fun PlayerEntity.canInteractWithEntityIn(box: Box, additionalRange: Double) = this.method_56092(box, additionalRange)
/**
 * method_7333
 */
fun PlayerEntity.lockRecipes(recipes: Collection<RecipeEntry<*>>) = this.method_7333(recipes)
/**
 * method_7351
 */
fun PlayerEntity.getBlockBreakingSpeed(block: BlockState) = this.method_7351(block)
/**
 * method_23670
 */
fun PlayerEntity.stopGliding() = this.method_23670()
/**
 * method_55755
 */
fun PlayerEntity.getEntityInteractionRange() = this.method_55755()
/**
 * method_60984
 */
fun PlayerEntity.setIgnoreFallDamageFromCurrentExplosion(ignoreFallDamageFromCurrentExplosion: Boolean) = this.method_60984(ignoreFallDamageFromCurrentExplosion)
/**
 * method_7287
 */
fun PlayerEntity.interact(entity: Entity, hand: Hand) = this.method_7287(entity, hand)
/**
 * method_61499
 */
fun PlayerEntity.dropCreativeStack(stack: ItemStack) = this.method_61499(stack)
/**
 * method_7278
 */
fun PlayerEntity.getEnchantingTableSeed() = this.method_7278()
/**
 * method_7270
 */
fun PlayerEntity.giveItemStack(stack: ItemStack) = this.method_7270(stack)
/**
 * method_33793
 */
fun PlayerEntity.shouldFilterText() = this.method_33793()
/**
 * method_7322
 */
fun PlayerEntity.addExhaustion(exhaustion: Float) = this.method_7322(exhaustion)
/**
 * method_56093
 */
fun PlayerEntity.canInteractWithBlockAt(pos: BlockPos, additionalRange: Double) = this.method_56093(pos, additionalRange)
/**
 * method_7308
 */
fun PlayerEntity.getShoulderEntityRight() = this.method_7308()
/**
 * method_7324
 */
fun PlayerEntity.attack(target: Entity) = this.method_7324(target)
/**
 * method_55754
 */
fun PlayerEntity.getBlockInteractionRange() = this.method_55754()
/**
 * method_7256
 */
fun PlayerEntity.shouldDamagePlayer(player: PlayerEntity) = this.method_7256(player)
/**
 * method_21823
 */
fun PlayerEntity.shouldCancelInteraction() = this.method_21823()
/**
 * method_7255
 */
fun PlayerEntity.addExperience(experience: Int) = this.method_7255(experience)
/**
 * method_7348
 */
fun PlayerEntity.isPartVisible(modelPart: PlayerModelPart) = this.method_7348(modelPart)
/**
 * method_64475
 */
fun PlayerEntity.hasPermissionLevel(level: Int) = this.method_64475(level)
/**
 * method_61165
 */
fun PlayerEntity.shouldIgnoreFallDamageFromCurrentExplosion() = this.method_61165()
/**
 * method_7353
 */
fun PlayerEntity.sendMessage(message: Text, overlay: Boolean) = this.method_7353(message, overlay)
/**
 * method_7263
 */
fun PlayerEntity.spawnSweepAttackParticles() = this.method_7263()
/**
 * method_7323
 */
fun PlayerEntity.openCommandBlockScreen(commandBlock: CommandBlockBlockEntity) = this.method_7323(commandBlock)
/**
 * method_17355
 */
fun PlayerEntity.openHandledScreen(factory: NamedScreenHandlerFactory) = this.method_17355(factory)
/**
 * method_23668
 */
fun PlayerEntity.checkGliding() = this.method_23668()
/**
 * method_43120
 */
fun PlayerEntity.setLastDeathPos(lastDeathPos: Optional<GlobalPos>) = this.method_43120(lastDeathPos)
/**
 * method_17354
 */
fun PlayerEntity.sendTradeOffers(syncId: Int, offers: TradeOfferList, levelProgress: Int, experience: Int, leveled: Boolean, refreshable: Boolean) = this.method_17354(syncId, offers, levelProgress, experience, leveled, refreshable)
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
fun PlayerEntity.startGliding() = this.method_23669()
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
fun PlayerEntity.playSoundToPlayer(sound: SoundEvent, category: SoundCategory, volume: Float, pitch: Float) = this.method_17356(sound, category, volume, pitch)
/**
 * method_31549
 */
fun PlayerEntity.getAbilities() = this.method_31549()
/**
 * method_7257
 */
fun PlayerEntity.openCommandBlockMinecartScreen(commandBlockExecutor: CommandBlockExecutor) = this.method_7257(commandBlockExecutor)
/**
 * method_16354
 */
fun PlayerEntity.openJigsawScreen(jigsaw: JigsawBlockEntity) = this.method_16354(jigsaw)
/**
 * method_7317
 */
fun PlayerEntity.canFoodHeal() = this.method_7317()
