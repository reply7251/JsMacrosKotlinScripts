package me.hellrevenger.generated.Map_LivingEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_6251
 */
var LivingEntity.handSwingProgress by alias(LivingEntity::field_6251)
/**
 * field_6218
 */
var LivingEntity.stuckArrowTimer by alias(LivingEntity::field_6218)
/**
 * field_42108
 */
val LivingEntity.limbAnimator by alias(LivingEntity::field_42108)
/**
 * field_6250
 */
var LivingEntity.forwardSpeed by alias(LivingEntity::field_6250)
/**
 * field_6262
 */
val LivingEntity.randomSmallSeed by alias(LivingEntity::field_6262)
/**
 * field_20347
 */
var LivingEntity.stuckStingerTimer by alias(LivingEntity::field_20347)
/**
 * field_6252
 */
var LivingEntity.handSwinging by alias(LivingEntity::field_6252)
/**
 * field_6241
 */
var LivingEntity.headYaw by alias(LivingEntity::field_6241)
/**
 * field_30068
 */
val KClass<LivingEntity>.BABY_SCALE_FACTOR by aliasStatic(LivingEntity::field_30068)
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
 * field_6259
 */
var LivingEntity.prevHeadYaw by alias(LivingEntity::field_6259)
/**
 * field_6235
 */
var LivingEntity.hurtTime by alias(LivingEntity::field_6235)
/**
 * field_30073
 */
val KClass<LivingEntity>.GLOWING_FLAG by aliasStatic(LivingEntity::field_30073)
/**
 * field_6213
 */
var LivingEntity.deathTime by alias(LivingEntity::field_6213)
/**
 * field_30071
 */
val KClass<LivingEntity>.EQUIPMENT_SLOT_ID by aliasStatic(LivingEntity::field_30071)
/**
 * field_6212
 */
var LivingEntity.sidewaysSpeed by alias(LivingEntity::field_6212)
/**
 * field_6227
 */
var LivingEntity.upwardSpeed by alias(LivingEntity::field_6227)
/**
 * field_6283
 */
var LivingEntity.bodyYaw by alias(LivingEntity::field_6283)
/**
 * field_30077
 */
val KClass<LivingEntity>.DEATH_TICKS by aliasStatic(LivingEntity::field_30077)
/**
 * field_6266
 */
var LivingEntity.preferredHand by alias(LivingEntity::field_6266)
/**
 * field_6229
 */
var LivingEntity.lastHandSwingProgress by alias(LivingEntity::field_6229)
/**
 * field_30076
 */
val KClass<LivingEntity>.GRAVITY by aliasStatic(LivingEntity::field_30076)
/**
 * field_51995
 */
val KClass<LivingEntity>.ATTRIBUTES_NBT_KEY by aliasStatic(LivingEntity::field_51995)
/**
 * method_18400
 */
fun LivingEntity.wakeUp() = this.method_18400()
/**
 * method_59923
 */
fun LivingEntity.getXpToDrop(arg0: ServerWorld, arg1: Entity) = this.method_59923(arg0, arg1)
/**
 * method_18398
 */
fun LivingEntity.getSleepingPosition() = this.method_18398()
/**
 * method_6039
 */
fun LivingEntity.isBlocking() = this.method_6039()
/**
 * method_6104
 */
fun LivingEntity.swingHand(arg0: Hand) = this.method_6104(arg0)
/**
 * method_6019
 */
fun LivingEntity.setCurrentHand(arg0: Hand) = this.method_6019(arg0)
/**
 * method_18869
 */
fun LivingEntity.getEatSound(arg0: ItemStack) = this.method_18869(arg0)
/**
 * method_18401
 */
fun LivingEntity.getSleepingDirection() = this.method_18401()
/**
 * method_6096
 */
fun LivingEntity.getArmor() = this.method_6096()
/**
 * method_6061
 */
fun LivingEntity.blockedByShield(arg0: DamageSource) = this.method_6061(arg0)
/**
 * method_18397
 */
fun LivingEntity.canEquip(arg0: ItemStack) = this.method_18397(arg0)
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
 * method_51851
 */
fun LivingEntity.getLootTableSeed() = this.method_51851()
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
fun LivingEntity.hasStackEquipped(arg0: EquipmentSlot) = this.method_6084(arg0)
/**
 * method_6125
 */
fun LivingEntity.setMovementSpeed(arg0: Float) = this.method_6125(arg0)
/**
 * method_56078
 */
fun LivingEntity.playSound(arg0: SoundEvent) = this.method_56078(arg0)
/**
 * method_45324
 */
fun LivingEntity.areItemsDifferent(arg0: ItemStack, arg1: ItemStack) = this.method_45324(arg0, arg1)
/**
 * method_21755
 */
fun LivingEntity.setStingerCount(arg0: Int) = this.method_21755(arg0)
/**
 * method_48761
 */
fun LivingEntity.tiltScreen(arg0: Double, arg1: Double) = this.method_48761(arg0, arg1)
/**
 * method_5989
 */
fun LivingEntity.getLootTable() = this.method_5989()
/**
 * method_20235
 */
fun LivingEntity.sendEquipmentBreakStatus(arg0: Item, arg1: EquipmentSlot) = this.method_20235(arg0, arg1)
/**
 * method_24833
 */
fun LivingEntity.getBoundingBox(arg0: EntityPose) = this.method_24833(arg0)
/**
 * method_6102
 */
fun LivingEntity.isMobOrPlayer() = this.method_6102()
/**
 * method_6122
 */
fun LivingEntity.setStackInHand(arg0: Hand, arg1: ItemStack) = this.method_6122(arg0, arg1)
/**
 * method_5661
 */
fun LivingEntity.getArmorItems() = this.method_5661()
/**
 * method_35054
 */
fun LivingEntity.setNoDrag(arg0: Boolean) = this.method_35054(arg0)
/**
 * method_6086
 */
fun LivingEntity.isAffectedBySplashPotions() = this.method_6086()
/**
 * method_31079
 */
fun KClass<LivingEntity>.positionInPortal(arg0: Vec3d) = LivingEntity.method_31079(arg0)
/**
 * method_29499
 */
fun LivingEntity.triggerItemPickedUpByEntityCriteria(arg0: ItemEntity) = this.method_29499(arg0)
/**
 * method_6005
 */
fun LivingEntity.takeKnockback(arg0: Double, arg1: Double, arg2: Double) = this.method_6005(arg0, arg1, arg2)
/**
 * method_6115
 */
fun LivingEntity.isUsingItem() = this.method_6115()
/**
 * method_6058
 */
fun LivingEntity.getActiveHand() = this.method_6058()
/**
 * method_6073
 */
fun LivingEntity.setAbsorptionAmount(arg0: Float) = this.method_6073(arg0)
/**
 * method_6049
 */
fun LivingEntity.canHaveStatusEffect(arg0: StatusEffectInstance) = this.method_6049(arg0)
/**
 * method_56675
 */
fun LivingEntity.getEquippedItems() = this.method_56675()
/**
 * method_55693
 */
fun LivingEntity.getScale() = this.method_55693()
/**
 * method_6007
 */
fun LivingEntity.tickMovement() = this.method_6007()
/**
 * method_6063
 */
fun LivingEntity.getMaxHealth() = this.method_6063()
/**
 * method_52541
 */
fun LivingEntity.getMaxAbsorption() = this.method_52541()
/**
 * method_6026
 */
fun LivingEntity.getStatusEffects() = this.method_6026()
/**
 * method_18399
 */
fun LivingEntity.clearSleepingPosition() = this.method_18399()
/**
 * method_6065
 */
fun LivingEntity.getAttacker() = this.method_6065()
/**
 * method_6068
 */
fun LivingEntity.getMainArm() = this.method_6068()
/**
 * method_6015
 */
fun LivingEntity.setAttacker(arg0: LivingEntity) = this.method_6015(arg0)
/**
 * method_6047
 */
fun LivingEntity.getMainHandStack() = this.method_6047()
/**
 * method_6082
 */
fun LivingEntity.teleport(arg0: Double, arg1: Double, arg2: Double, arg3: Boolean) = this.method_6082(arg0, arg1, arg2, arg3)
/**
 * method_41330
 */
fun LivingEntity.isExperienceDroppingDisabled() = this.method_41330()
/**
 * method_56674
 */
fun LivingEntity.getAllArmorItems() = this.method_56674()
/**
 * method_6121
 */
fun LivingEntity.tryAttack(arg0: Entity) = this.method_6121(arg0)
/**
 * method_6048
 */
fun LivingEntity.getItemUseTime() = this.method_6048()
/**
 * method_5877
 */
fun LivingEntity.getHandItems() = this.method_5877()
/**
 * method_5999
 */
fun LivingEntity.hasInvertedHealingAndHarm() = this.method_5999()
/**
 * method_6091
 */
fun LivingEntity.travel(arg0: Vec3d) = this.method_6091(arg0)
/**
 * method_6024
 */
fun LivingEntity.getLeaningPitch(arg0: Float) = this.method_6024(arg0)
/**
 * method_6103
 */
fun LivingEntity.sendPickup(arg0: Entity, arg1: Int) = this.method_6103(arg0, arg1)
/**
 * method_26827
 */
fun KClass<LivingEntity>.createLivingAttributes() = LivingEntity.method_26827()
/**
 * method_6052
 */
fun LivingEntity.getAttacking() = this.method_6052()
/**
 * method_6000
 */
fun LivingEntity.enterCombat() = this.method_6000()
/**
 * method_5973
 */
fun LivingEntity.canTarget(arg0: EntityType<*>) = this.method_5973(arg0)
/**
 * method_6012
 */
fun LivingEntity.clearStatusEffects() = this.method_6012()
/**
 * method_52197
 */
fun LivingEntity.sendEffectToControllingPlayer(arg0: StatusEffectInstance) = this.method_52197(arg0)
/**
 * method_6081
 */
fun LivingEntity.getRecentDamageSource() = this.method_6081()
/**
 * method_45326
 */
fun LivingEntity.getAttributeBaseValue(arg0: RegistryEntry<EntityAttribute>) = this.method_45326(arg0)
/**
 * method_29504
 */
fun LivingEntity.isDead() = this.method_29504()
/**
 * method_16826
 */
fun LivingEntity.setDespawnCounter(arg0: Int) = this.method_16826(arg0)
/**
 * method_6105
 */
fun LivingEntity.damageArmor(arg0: DamageSource, arg1: Float) = this.method_6105(arg0, arg1)
/**
 * method_18808
 */
fun LivingEntity.getProjectileType(arg0: ItemStack) = this.method_18808(arg0)
/**
 * method_6025
 */
fun LivingEntity.heal(arg0: Float) = this.method_6025(arg0)
/**
 * method_6014
 */
fun LivingEntity.getItemUseTimeLeft() = this.method_6014()
/**
 * method_45325
 */
fun LivingEntity.getAttributeValue(arg0: RegistryEntry<EntityAttribute>) = this.method_45325(arg0)
/**
 * method_6094
 */
fun LivingEntity.canBreatheInWater() = this.method_6094()
/**
 * method_5998
 */
fun LivingEntity.getStackInHand(arg0: Hand) = this.method_5998(arg0)
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
 * method_6083
 */
fun LivingEntity.getLastAttackTime() = this.method_6083()
/**
 * method_26318
 */
fun LivingEntity.applyMovementInput(arg0: Vec3d, arg1: Float) = this.method_26318(arg0, arg1)
/**
 * method_6057
 */
fun LivingEntity.canSee(arg0: Entity) = this.method_6057(arg0)
/**
 * method_29242
 */
fun LivingEntity.updateLimbs(arg0: Boolean) = this.method_29242(arg0)
/**
 * method_6003
 */
fun LivingEntity.getFallFlyingTicks() = this.method_6003()
/**
 * method_24518
 */
fun LivingEntity.isHolding(arg0: Item) = this.method_24518(arg0)
/**
 * method_6112
 */
fun LivingEntity.getStatusEffect(arg0: RegistryEntry<StatusEffect>) = this.method_6112(arg0)
/**
 * method_6059
 */
fun LivingEntity.hasStatusEffect(arg0: RegistryEntry<StatusEffect>) = this.method_6059(arg0)
/**
 * method_21753
 */
fun LivingEntity.getStingerCount() = this.method_21753()
/**
 * method_6079
 */
fun LivingEntity.getOffHandStack() = this.method_6079()
/**
 * method_6043
 */
fun LivingEntity.jump() = this.method_6043()
/**
 * method_24520
 */
fun LivingEntity.isHolding(arg0: Predicate<ItemStack>) = this.method_24520(arg0)
/**
 * method_26317
 */
fun LivingEntity.applyFluidMovingSpeed(arg0: Double, arg1: Boolean, arg2: Vec3d) = this.method_26317(arg0, arg1, arg2)
/**
 * method_26082
 */
fun LivingEntity.setStatusEffect(arg0: StatusEffectInstance, arg1: Entity) = this.method_26082(arg0, arg1)
/**
 * method_18402
 */
fun LivingEntity.setSleepingPosition(arg0: BlockPos) = this.method_18402(arg0)
/**
 * method_6109
 */
fun LivingEntity.isBaby() = this.method_6109()
/**
 * method_6032
 */
fun LivingEntity.getHealth() = this.method_6032()
/**
 * method_6111
 */
fun LivingEntity.removeStatusEffectInternal(arg0: RegistryEntry<StatusEffect>) = this.method_6111(arg0)
/**
 * method_32326
 */
fun LivingEntity.getPreferredEquipmentSlot(arg0: ItemStack) = this.method_32326(arg0)
/**
 * method_29503
 */
fun LivingEntity.hurtByWater() = this.method_29503()
/**
 * method_6116
 */
fun LivingEntity.onEquipStack(arg0: EquipmentSlot, arg1: ItemStack, arg2: ItemStack) = this.method_6116(arg0, arg1, arg2)
/**
 * method_6088
 */
fun LivingEntity.getActiveStatusEffects() = this.method_6088()
/**
 * method_6044
 */
fun LivingEntity.endCombat() = this.method_6044()
/**
 * method_6030
 */
fun LivingEntity.getActiveItem() = this.method_6030()
/**
 * method_23667
 */
fun LivingEntity.swingHand(arg0: Hand, arg1: Boolean) = this.method_23667(arg0, arg1)
/**
 * method_42149
 */
fun LivingEntity.disablesShield() = this.method_42149()
/**
 * method_6056
 */
fun LivingEntity.damageShield(arg0: Float) = this.method_6056(arg0)
/**
 * method_35053
 */
fun LivingEntity.hasNoDrag() = this.method_35053()
/**
 * method_6021
 */
fun LivingEntity.clearActiveItem() = this.method_6021()
/**
 * method_60492
 */
fun LivingEntity.tryEatFood(arg0: world_World, arg1: ItemStack) = this.method_60492(arg0, arg1)
/**
 * method_37416
 */
fun LivingEntity.getJumpBoostVelocityModifier() = this.method_37416()
/**
 * method_18866
 */
fun LivingEntity.eatFood(arg0: world_World, arg1: ItemStack, arg2: FoodComponent) = this.method_18866(arg0, arg1, arg2)
/**
 * method_6033
 */
fun LivingEntity.setHealth(arg0: Float) = this.method_6033(arg0)
/**
 * method_36608
 */
fun LivingEntity.isPartOfGame() = this.method_36608()
/**
 * method_33190
 */
fun LivingEntity.canTakeDamage() = this.method_33190()
/**
 * method_41329
 */
fun LivingEntity.disableExperienceDropping() = this.method_41329()
/**
 * method_6022
 */
fun LivingEntity.getStuckArrowCount() = this.method_6022()
/**
 * method_6131
 */
fun LivingEntity.getDespawnCounter() = this.method_6131()
/**
 * method_6078
 */
fun LivingEntity.onDeath(arg0: DamageSource) = this.method_6078(arg0)
/**
 * method_48157
 */
fun LivingEntity.getDamageTiltYaw() = this.method_48157()
/**
 * method_39760
 */
fun LivingEntity.getFallSounds() = this.method_39760()
/**
 * method_18403
 */
fun LivingEntity.sleep(arg0: BlockPos) = this.method_18403(arg0)
/**
 * method_18395
 */
fun LivingEntity.canTarget(arg0: LivingEntity) = this.method_18395(arg0)
/**
 * method_59926
 */
fun LivingEntity.getLocationBasedEnchantmentEffects() = this.method_59926()
/**
 * method_6100
 */
fun LivingEntity.setJumping(arg0: Boolean) = this.method_6100(arg0)
/**
 * method_6117
 */
fun LivingEntity.getLastAttackedTime() = this.method_6117()
/**
 * method_6128
 */
fun LivingEntity.isFallFlying() = this.method_6128()
/**
 * method_6127
 */
fun LivingEntity.getAttributes() = this.method_6127()
/**
 * method_6075
 */
fun LivingEntity.stopUsingItem() = this.method_6075()
/**
 * method_6092
 */
fun LivingEntity.addStatusEffect(arg0: StatusEffectInstance) = this.method_6092(arg0)
/**
 * method_36977
 */
fun LivingEntity.damageHelmet(arg0: DamageSource, arg1: Float) = this.method_36977(arg0, arg1)
/**
 * method_29505
 */
fun LivingEntity.setAttacking(arg0: PlayerEntity) = this.method_29505(arg0)
/**
 * method_6006
 */
fun LivingEntity.setNearbySongPlaying(arg0: BlockPos, arg1: Boolean) = this.method_6006(arg0, arg1)
/**
 * method_56992
 */
fun LivingEntity.isInCreativeMode() = this.method_56992()
/**
 * method_6016
 */
fun LivingEntity.removeStatusEffect(arg0: RegistryEntry<StatusEffect>) = this.method_6016(arg0)
/**
 * method_56991
 */
fun LivingEntity.canUseSlot(arg0: EquipmentSlot) = this.method_56991(arg0)
/**
 * method_6097
 */
fun LivingEntity.setStuckArrowCount(arg0: Int) = this.method_6097(arg0)
/**
 * method_24832
 */
fun LivingEntity.getClimbingPos() = this.method_24832()
/**
 * method_37222
 */
fun LivingEntity.addStatusEffect(arg0: StatusEffectInstance, arg1: Entity) = this.method_37222(arg0, arg1)
/**
 * method_6118
 */
fun LivingEntity.getEquippedStack(arg0: EquipmentSlot) = this.method_6118(arg0)
/**
 * method_24831
 */
fun LivingEntity.getPoses() = this.method_24831()
/**
 * method_18391
 */
fun LivingEntity.isTarget(arg0: LivingEntity, arg1: TargetPredicate) = this.method_18391(arg0, arg1)
/**
 * method_6124
 */
fun LivingEntity.getPrimeAdversary() = this.method_6124()
/**
 * method_26319
 */
fun LivingEntity.canWalkOnFluid(arg0: FluidState) = this.method_26319(arg0)
/**
 * method_21754
 */
fun LivingEntity.isHoldingOntoLadder() = this.method_21754()
/**
 * method_18390
 */
fun LivingEntity.getAttackDistanceScalingFactor(arg0: Entity) = this.method_18390(arg0)
/**
 * method_6054
 */
fun LivingEntity.shouldDropXp() = this.method_6054()
/**
 * method_17825
 */
fun LivingEntity.getScaleFactor() = this.method_17825()
/**
 * method_6114
 */
fun LivingEntity.onAttacking(arg0: Entity) = this.method_6114(arg0)
/**
 * method_6066
 */
fun LivingEntity.getDamageTracker() = this.method_6066()
/**
 * method_56079
 */
fun KClass<LivingEntity>.getSlotForHand(arg0: Hand) = LivingEntity.method_56079(arg0)
/**
 * method_6089
 */
fun KClass<LivingEntity>.containsOnlyAmbientEffects(arg0: Collection<StatusEffectInstance>) = LivingEntity.method_6089(arg0)
/**
 * method_6067
 */
fun LivingEntity.getAbsorptionAmount() = this.method_6067()
/**
 * method_5673
 */
fun LivingEntity.equipStack(arg0: EquipmentSlot, arg1: ItemStack) = this.method_5673(arg0, arg1)
/**
 * method_5996
 */
fun LivingEntity.getAttributeInstance(arg0: RegistryEntry<EntityAttribute>) = this.method_5996(arg0)
