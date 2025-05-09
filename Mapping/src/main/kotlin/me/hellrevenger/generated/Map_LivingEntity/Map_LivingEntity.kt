package me.hellrevenger.generated.Map_LivingEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_6251
 */
var LivingEntity.handSwingProgress by alias(LivingEntity::field_6251)
/**
 * field_6250
 */
var LivingEntity.forwardSpeed by alias(LivingEntity::field_6250)
/**
 * field_6262
 */
val LivingEntity.randomSmallSeed by alias(LivingEntity::field_6262)
/**
 * field_6252
 */
var LivingEntity.handSwinging by alias(LivingEntity::field_6252)
/**
 * field_6241
 */
var LivingEntity.headYaw by alias(LivingEntity::field_6241)
/**
 * field_52447
 */
val LivingEntity.elytraFlightController by alias(LivingEntity::field_52447)
/**
 * field_6279
 */
var LivingEntity.handSwingTicks by alias(LivingEntity::field_6279)
/**
 * field_6254
 */
var LivingEntity.maxHurtTime by alias(LivingEntity::field_6254)
/**
 * field_6269
 */
val LivingEntity.defaultMaxHealth by alias(LivingEntity::field_6269)
/**
 * field_6244
 */
val LivingEntity.randomLargeSeed by alias(LivingEntity::field_6244)
/**
 * field_6220
 */
var LivingEntity.prevBodyYaw by alias(LivingEntity::field_6220)
/**
 * field_6283
 */
var LivingEntity.bodyYaw by alias(LivingEntity::field_6283)
/**
 * field_6218
 */
var LivingEntity.stuckArrowTimer by alias(LivingEntity::field_6218)
/**
 * field_42108
 */
val LivingEntity.limbAnimator by alias(LivingEntity::field_42108)
/**
 * field_20347
 */
var LivingEntity.stuckStingerTimer by alias(LivingEntity::field_20347)
/**
 * field_6259
 */
var LivingEntity.prevHeadYaw by alias(LivingEntity::field_6259)
/**
 * field_6235
 */
var LivingEntity.hurtTime by alias(LivingEntity::field_6235)
/**
 * field_6213
 */
var LivingEntity.deathTime by alias(LivingEntity::field_6213)
/**
 * field_6212
 */
var LivingEntity.sidewaysSpeed by alias(LivingEntity::field_6212)
/**
 * field_6227
 */
var LivingEntity.upwardSpeed by alias(LivingEntity::field_6227)
/**
 * field_6266
 */
var LivingEntity.preferredHand by alias(LivingEntity::field_6266)
/**
 * field_6229
 */
var LivingEntity.lastHandSwingProgress by alias(LivingEntity::field_6229)
/**
 * method_18400
 */
fun LivingEntity.wakeUp() = this.method_18400()
/**
 * method_59923
 */
fun LivingEntity.getExperienceToDrop(world: ServerWorld, attacker: Entity) = this.method_59923(world, attacker)
/**
 * method_18401
 */
fun LivingEntity.getSleepingDirection() = this.method_18401()
/**
 * method_6096
 */
fun LivingEntity.getArmor() = this.method_6096()
/**
 * method_63625
 */
fun LivingEntity.canEquipFromDispenser(stack: ItemStack) = this.method_63625(stack)
/**
 * method_5679
 */
fun LivingEntity.isInvulnerableTo(world: ServerWorld, source: DamageSource) = this.method_5679(world, source)
/**
 * method_51851
 */
fun LivingEntity.getLootTableSeed() = this.method_51851()
/**
 * method_45324
 */
fun LivingEntity.areItemsDifferent(stack: ItemStack, stack2: ItemStack) = this.method_45324(stack, stack2)
/**
 * method_21755
 */
fun LivingEntity.setStingerCount(stingerCount: Int) = this.method_21755(stingerCount)
/**
 * method_48761
 */
fun LivingEntity.tiltScreen(deltaX: Double, arg1: Double) = this.method_48761(deltaX, arg1)
/**
 * method_24833
 */
fun LivingEntity.getBoundingBox(pose: EntityPose) = this.method_24833(pose)
/**
 * method_35054
 */
fun LivingEntity.setNoDrag(noDrag: Boolean) = this.method_35054(noDrag)
/**
 * method_6086
 */
fun LivingEntity.isAffectedBySplashPotions() = this.method_6086()
/**
 * method_63623
 */
fun LivingEntity.canEquip(stack: ItemStack, slot: EquipmentSlot) = this.method_63623(stack, slot)
/**
 * method_29499
 */
fun LivingEntity.triggerItemPickedUpByEntityCriteria(item: ItemEntity) = this.method_29499(item)
/**
 * method_6073
 */
fun LivingEntity.setAbsorptionAmount(absorptionAmount: Float) = this.method_6073(absorptionAmount)
/**
 * method_6049
 */
fun LivingEntity.canHaveStatusEffect(effect: StatusEffectInstance) = this.method_6049(effect)
/**
 * method_56675
 */
fun LivingEntity.getEquippedItems() = this.method_56675()
/**
 * method_55693
 */
fun LivingEntity.getScale() = this.method_55693()
/**
 * method_6063
 */
fun LivingEntity.getMaxHealth() = this.method_6063()
/**
 * method_6026
 */
fun LivingEntity.getStatusEffects() = this.method_6026()
/**
 * method_6065
 */
fun LivingEntity.getAttacker() = this.method_6065()
/**
 * method_6068
 */
fun LivingEntity.getMainArm() = this.method_6068()
/**
 * method_6047
 */
fun LivingEntity.getMainHandStack() = this.method_6047()
/**
 * method_6082
 */
fun LivingEntity.teleport(x: Double, arg1: Double, y: Double, arg3: Boolean) = this.method_6082(x, arg1, y, arg3)
/**
 * method_41330
 */
fun LivingEntity.isExperienceDroppingDisabled() = this.method_41330()
/**
 * method_56674
 */
fun LivingEntity.getAllArmorItems() = this.method_56674()
/**
 * method_5877
 */
fun LivingEntity.getHandItems() = this.method_5877()
/**
 * method_5999
 */
fun LivingEntity.hasInvertedHealingAndHarm() = this.method_5999()
/**
 * method_6103
 */
fun LivingEntity.sendPickup(item: Entity, count: Int) = this.method_6103(item, count)
/**
 * method_6052
 */
fun LivingEntity.getAttacking() = this.method_6052()
/**
 * method_65897
 */
fun LivingEntity.canBeNameTagged() = this.method_65897()
/**
 * method_5973
 */
fun LivingEntity.canTarget(type: EntityType<*>) = this.method_5973(type)
/**
 * method_6081
 */
fun LivingEntity.getRecentDamageSource() = this.method_6081()
/**
 * method_45326
 */
fun LivingEntity.getAttributeBaseValue(attribute: RegistryEntry<EntityAttribute>) = this.method_45326(attribute)
/**
 * method_29504
 */
fun LivingEntity.isDead() = this.method_29504()
/**
 * method_16826
 */
fun LivingEntity.setDespawnCounter(despawnCounter: Int) = this.method_16826(despawnCounter)
/**
 * method_45325
 */
fun LivingEntity.getAttributeValue(attribute: RegistryEntry<EntityAttribute>) = this.method_45325(attribute)
/**
 * method_6094
 */
fun LivingEntity.canBreatheInWater() = this.method_6094()
/**
 * method_6083
 */
fun LivingEntity.getLastAttackTime() = this.method_6083()
/**
 * method_29242
 */
fun LivingEntity.updateLimbs(flutter: Boolean) = this.method_29242(flutter)
/**
 * method_6043
 */
fun LivingEntity.jump() = this.method_6043()
/**
 * method_24520
 */
fun LivingEntity.isHolding(predicate: Predicate<ItemStack>) = this.method_24520(predicate)
/**
 * method_26082
 */
fun LivingEntity.setStatusEffect(effect: StatusEffectInstance, source: Entity) = this.method_26082(effect, source)
/**
 * method_6032
 */
fun LivingEntity.getHealth() = this.method_6032()
/**
 * method_6088
 */
fun LivingEntity.getActiveStatusEffects() = this.method_6088()
/**
 * method_6044
 */
fun LivingEntity.endCombat() = this.method_6044()
/**
 * method_23667
 */
fun LivingEntity.swingHand(hand: Hand, fromServerPlayer: Boolean) = this.method_23667(hand, fromServerPlayer)
/**
 * method_42149
 */
fun LivingEntity.disablesShield() = this.method_42149()
/**
 * method_6056
 */
fun LivingEntity.damageShield(amount: Float) = this.method_6056(amount)
/**
 * method_35053
 */
fun LivingEntity.hasNoDrag() = this.method_35053()
/**
 * method_6021
 */
fun LivingEntity.clearActiveItem() = this.method_6021()
/**
 * method_6033
 */
fun LivingEntity.setHealth(health: Float) = this.method_6033(health)
/**
 * method_36608
 */
fun LivingEntity.isPartOfGame() = this.method_36608()
/**
 * method_33190
 */
fun LivingEntity.canTakeDamage() = this.method_33190()
/**
 * method_6022
 */
fun LivingEntity.getStuckArrowCount() = this.method_6022()
/**
 * method_6131
 */
fun LivingEntity.getDespawnCounter() = this.method_6131()
/**
 * method_64169
 */
fun LivingEntity.forEachGiftedItem(world: ServerWorld, lootTableKey: RegistryKey<LootTable>, lootConsumer: BiConsumer<ServerWorld, ItemStack>) = this.method_64169(world, lootTableKey, lootConsumer)
/**
 * method_6078
 */
fun LivingEntity.onDeath(damageSource: DamageSource) = this.method_6078(damageSource)
/**
 * method_39760
 */
fun LivingEntity.getFallSounds() = this.method_39760()
/**
 * method_6100
 */
fun LivingEntity.setJumping(jumping: Boolean) = this.method_6100(jumping)
/**
 * method_5936
 */
fun LivingEntity.canPickUpLoot() = this.method_5936()
/**
 * method_6127
 */
fun LivingEntity.getAttributes() = this.method_6127()
/**
 * method_6075
 */
fun LivingEntity.stopUsingItem() = this.method_6075()
/**
 * method_36977
 */
fun LivingEntity.damageHelmet(source: DamageSource, amount: Float) = this.method_36977(source, amount)
/**
 * method_6006
 */
fun LivingEntity.setNearbySongPlaying(songPosition: BlockPos, playing: Boolean) = this.method_6006(songPosition, playing)
/**
 * method_6097
 */
fun LivingEntity.setStuckArrowCount(stuckArrowCount: Int) = this.method_6097(stuckArrowCount)
/**
 * method_37222
 */
fun LivingEntity.addStatusEffect(effect: StatusEffectInstance, source: Entity) = this.method_37222(effect, source)
/**
 * method_6118
 */
fun LivingEntity.getEquippedStack(slot: EquipmentSlot) = this.method_6118(slot)
/**
 * method_24831
 */
fun LivingEntity.getPoses() = this.method_24831()
/**
 * method_6124
 */
fun LivingEntity.getPrimeAdversary() = this.method_6124()
/**
 * method_59926
 */
fun LivingEntity.getLocationBasedEnchantmentEffects(slot: EquipmentSlot) = this.method_59926(slot)
/**
 * method_61420
 */
fun LivingEntity.getStackInArm(arm: Arm) = this.method_61420(arm)
/**
 * method_26319
 */
fun LivingEntity.canWalkOnFluid(state: FluidState) = this.method_26319(state)
/**
 * method_18390
 */
fun LivingEntity.getAttackDistanceScalingFactor(entity: Entity) = this.method_18390(entity)
/**
 * method_6054
 */
fun LivingEntity.shouldDropExperience() = this.method_6054()
/**
 * method_6114
 */
fun LivingEntity.onAttacking(target: Entity) = this.method_6114(target)
/**
 * method_6066
 */
fun LivingEntity.getDamageTracker() = this.method_6066()
/**
 * method_64399
 */
fun LivingEntity.giveOrDropStack(stack: ItemStack) = this.method_64399(stack)
/**
 * method_6067
 */
fun LivingEntity.getAbsorptionAmount() = this.method_6067()
/**
 * method_18398
 */
fun LivingEntity.getSleepingPosition() = this.method_18398()
/**
 * method_6039
 */
fun LivingEntity.isBlocking() = this.method_6039()
/**
 * method_6019
 */
fun LivingEntity.setCurrentHand(hand: Hand) = this.method_6019(hand)
/**
 * method_6061
 */
fun LivingEntity.blockedByShield(source: DamageSource) = this.method_6061(source)
/**
 * method_6029
 */
fun LivingEntity.getMovementSpeed() = this.method_6029()
/**
 * method_6017
 */
fun LivingEntity.getSoundPitch() = this.method_6017()
/**
 * method_18396
 */
fun LivingEntity.getArmorVisibility() = this.method_18396()
/**
 * method_6113
 */
fun LivingEntity.isSleeping() = this.method_6113()
/**
 * method_6101
 */
fun LivingEntity.isClimbing() = this.method_6101()
/**
 * method_6084
 */
fun LivingEntity.hasStackEquipped(slot: EquipmentSlot) = this.method_6084(slot)
/**
 * method_6125
 */
fun LivingEntity.setMovementSpeed(movementSpeed: Float) = this.method_6125(movementSpeed)
/**
 * method_56078
 */
fun LivingEntity.playSound(sound: SoundEvent) = this.method_56078(sound)
/**
 * method_20235
 */
fun LivingEntity.sendEquipmentBreakStatus(item: Item, slot: EquipmentSlot) = this.method_20235(item, slot)
/**
 * method_6102
 */
fun LivingEntity.isMobOrPlayer() = this.method_6102()
/**
 * method_6122
 */
fun LivingEntity.setStackInHand(hand: Hand, stack: ItemStack) = this.method_6122(hand, stack)
/**
 * method_5661
 */
fun LivingEntity.getArmorItems() = this.method_5661()
/**
 * method_6005
 */
fun LivingEntity.takeKnockback(strength: Double, arg1: Double, x: Double) = this.method_6005(strength, arg1, x)
/**
 * method_6115
 */
fun LivingEntity.isUsingItem() = this.method_6115()
/**
 * method_6058
 */
fun LivingEntity.getActiveHand() = this.method_6058()
/**
 * method_6037
 */
fun LivingEntity.spawnItemParticles(stack: ItemStack, count: Int) = this.method_6037(stack, count)
/**
 * method_6007
 */
fun LivingEntity.tickMovement() = this.method_6007()
/**
 * method_64619
 */
fun LivingEntity.isEntityLookingAtMe(entity: LivingEntity, arg1: Double, arg2: Boolean, arg3: Boolean, visualShape: DoubleArray) = this.method_64619(entity, arg1, arg2, arg3, *visualShape)
/**
 * method_52541
 */
fun LivingEntity.getMaxAbsorption() = this.method_52541()
/**
 * method_18399
 */
fun LivingEntity.clearSleepingPosition() = this.method_18399()
/**
 * method_6015
 */
fun LivingEntity.setAttacker(attacker: LivingEntity) = this.method_6015(attacker)
/**
 * method_6048
 */
fun LivingEntity.getItemUseTime() = this.method_6048()
/**
 * method_6091
 */
fun LivingEntity.travel(movementInput: Vec3d) = this.method_6091(movementInput)
/**
 * method_6024
 */
fun LivingEntity.getLeaningPitch(tickDelta: Float) = this.method_6024(tickDelta)
/**
 * method_6000
 */
fun LivingEntity.enterCombat() = this.method_6000()
/**
 * method_6012
 */
fun LivingEntity.clearStatusEffects() = this.method_6012()
/**
 * method_52197
 */
fun LivingEntity.sendEffectToControllingPlayer(effect: StatusEffectInstance) = this.method_52197(effect)
/**
 * method_6105
 */
fun LivingEntity.damageArmor(source: DamageSource, amount: Float) = this.method_6105(source, amount)
/**
 * method_18808
 */
fun LivingEntity.getProjectileType(stack: ItemStack) = this.method_18808(stack)
/**
 * method_6025
 */
fun LivingEntity.heal(amount: Float) = this.method_6025(amount)
/**
 * method_6014
 */
fun LivingEntity.getItemUseTimeLeft() = this.method_6014()
/**
 * method_63627
 */
fun LivingEntity.getPlayerHitTimer() = this.method_63627()
/**
 * method_5998
 */
fun LivingEntity.getStackInHand(hand: Hand) = this.method_5998(hand)
/**
 * method_59925
 */
fun LivingEntity.hasLandedInFluid() = this.method_59925()
/**
 * method_6123
 */
fun LivingEntity.isUsingRiptide() = this.method_6123()
/**
 * method_18868
 */
fun LivingEntity.getBrain() = this.method_18868()
/**
 * method_6057
 */
fun LivingEntity.canSee(entity: Entity) = this.method_6057(entity)
/**
 * method_6003
 */
fun LivingEntity.getGlidingTicks() = this.method_6003()
/**
 * method_6112
 */
fun LivingEntity.getStatusEffect(effect: RegistryEntry<StatusEffect>) = this.method_6112(effect)
/**
 * method_6059
 */
fun LivingEntity.hasStatusEffect(effect: RegistryEntry<StatusEffect>) = this.method_6059(effect)
/**
 * method_21753
 */
fun LivingEntity.getStingerCount() = this.method_21753()
/**
 * method_6079
 */
fun LivingEntity.getOffHandStack() = this.method_6079()
/**
 * method_26317
 */
fun LivingEntity.applyFluidMovingSpeed(gravity: Double, arg1: Boolean, falling: Vec3d) = this.method_26317(gravity, arg1, falling)
/**
 * method_18402
 */
fun LivingEntity.setSleepingPosition(pos: BlockPos) = this.method_18402(pos)
/**
 * method_6109
 */
fun LivingEntity.isBaby() = this.method_6109()
/**
 * method_62821
 */
fun LivingEntity.getBlockingItem() = this.method_62821()
/**
 * method_6111
 */
fun LivingEntity.removeStatusEffectInternal(effect: RegistryEntry<StatusEffect>) = this.method_6111(effect)
/**
 * method_32326
 */
fun LivingEntity.getPreferredEquipmentSlot(stack: ItemStack) = this.method_32326(stack)
/**
 * method_29503
 */
fun LivingEntity.hurtByWater() = this.method_29503()
/**
 * method_6116
 */
fun LivingEntity.onEquipStack(slot: EquipmentSlot, oldStack: ItemStack, newStack: ItemStack) = this.method_6116(slot, oldStack, newStack)
/**
 * method_6030
 */
fun LivingEntity.getActiveItem() = this.method_6030()
/**
 * method_37416
 */
fun LivingEntity.getJumpBoostVelocityModifier() = this.method_37416()
/**
 * method_41329
 */
fun LivingEntity.disableExperienceDropping() = this.method_41329()
/**
 * method_6121
 */
fun LivingEntity.tryAttack(world: ServerWorld, target: Entity) = this.method_6121(world, target)
/**
 * method_48157
 */
fun LivingEntity.getDamageTiltYaw() = this.method_48157()
/**
 * method_18403
 */
fun LivingEntity.sleep(pos: BlockPos) = this.method_18403(pos)
/**
 * method_6117
 */
fun LivingEntity.getLastAttackedTime() = this.method_6117()
/**
 * method_6128
 */
fun LivingEntity.isGliding() = this.method_6128()
/**
 * method_36549
 */
fun LivingEntity.addDeathParticles() = this.method_36549()
/**
 * method_29505
 */
fun LivingEntity.setAttacking(attacking: PlayerEntity) = this.method_29505(attacking)
/**
 * method_56992
 */
fun LivingEntity.isInCreativeMode() = this.method_56992()
/**
 * method_6016
 */
fun LivingEntity.removeStatusEffect(effect: RegistryEntry<StatusEffect>) = this.method_6016(effect)
/**
 * method_56991
 */
fun LivingEntity.canUseSlot(slot: EquipmentSlot) = this.method_56991(slot)
/**
 * method_24832
 */
fun LivingEntity.getClimbingPos() = this.method_24832()
/**
 * method_21754
 */
fun LivingEntity.isHoldingOntoLadder() = this.method_21754()
/**
 * method_17825
 */
fun LivingEntity.getScaleFactor() = this.method_17825()
/**
 * method_5673
 */
fun LivingEntity.equipStack(slot: EquipmentSlot, stack: ItemStack) = this.method_5673(slot, stack)
/**
 * method_5996
 */
fun LivingEntity.getAttributeInstance(attribute: RegistryEntry<EntityAttribute>) = this.method_5996(attribute)
