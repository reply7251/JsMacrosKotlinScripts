package me.hellrevenger.generated.Map_Entity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_28628
 */
var Entity.wasInPowderSnow by alias(Entity::field_28628)
/**
 * field_5969
 */
var Entity.prevZ by alias(Entity::field_5969)
/**
 * field_23807
 */
var Entity.intersectionChecked by alias(Entity::field_23807)
/**
 * field_27857
 */
var Entity.inPowderSnow by alias(Entity::field_27857)
/**
 * field_6012
 */
var Entity.age by alias(Entity::field_6012)
/**
 * field_6036
 */
var Entity.prevY by alias(Entity::field_6036)
/**
 * field_29988
 */
val KClass<Entity>.DEFAULT_PORTAL_COOLDOWN by aliasStatic(Entity::field_29988)
/**
 * field_5971
 */
var Entity.lastRenderY by alias(Entity::field_5971)
/**
 * field_29987
 */
val KClass<Entity>.MAX_RIDING_COOLDOWN by aliasStatic(Entity::field_29987)
/**
 * field_5960
 */
var Entity.noClip by alias(Entity::field_5960)
/**
 * field_29994
 */
val KClass<Entity>.UUID_KEY by aliasStatic(Entity::field_29994)
/**
 * field_29989
 */
val KClass<Entity>.MAX_COMMAND_TAGS by aliasStatic(Entity::field_29989)
/**
 * field_6027
 */
val KClass<Entity>.CUSTOM_NAME by aliasStatic(Entity::field_6027)
/**
 * field_28627
 */
var Entity.speed by alias(Entity::field_28627)
/**
 * field_5989
 */
var Entity.lastRenderZ by alias(Entity::field_5989)
/**
 * field_29986
 */
val KClass<Entity>.PASSENGERS_KEY by aliasStatic(Entity::field_29986)
/**
 * field_5976
 */
var Entity.horizontalCollision by alias(Entity::field_5976)
/**
 * field_51994
 */
var Entity.portalManager by alias(Entity::field_51994)
/**
 * field_29985
 */
val KClass<Entity>.ID_KEY by aliasStatic(Entity::field_29985)
/**
 * field_29992
 */
val KClass<Entity>.DEFAULT_MIN_FREEZE_DAMAGE_TICKS by aliasStatic(Entity::field_29992)
/**
 * field_44784
 */
var Entity.supportingBlockPos by alias(Entity::field_44784)
/**
 * field_5975
 */
val KClass<Entity>.NAME_VISIBLE by aliasStatic(Entity::field_5975)
/**
 * field_34927
 */
var Entity.collidedSoftly by alias(Entity::field_34927)
/**
 * field_36331
 */
var Entity.groundCollision by alias(Entity::field_36331)
/**
 * field_29993
 */
val KClass<Entity>.FREEZING_DAMAGE_INTERVAL by aliasStatic(Entity::field_29993)
/**
 * field_29974
 */
val KClass<Entity>.MIN_RISING_BUBBLE_COLUMN_SPEED by aliasStatic(Entity::field_29974)
/**
 * field_5992
 */
var Entity.verticalCollision by alias(Entity::field_5992)
/**
 * field_5982
 */
var Entity.prevYaw by alias(Entity::field_5982)
/**
 * field_5994
 */
var Entity.distanceTraveled by alias(Entity::field_5994)
/**
 * field_29973
 */
val KClass<Entity>.DEFAULT_FRICTION by aliasStatic(Entity::field_29973)
/**
 * field_6037
 */
var Entity.velocityModified by alias(Entity::field_6037)
/**
 * field_6014
 */
var Entity.prevX by alias(Entity::field_6014)
/**
 * field_6038
 */
var Entity.lastRenderX by alias(Entity::field_6038)
/**
 * field_6017
 */
var Entity.fallDistance by alias(Entity::field_6017)
/**
 * field_6004
 */
var Entity.prevPitch by alias(Entity::field_6004)
/**
 * field_6007
 */
var Entity.velocityDirty by alias(Entity::field_6007)
/**
 * field_6008
 */
var Entity.timeUntilRegen by alias(Entity::field_6008)
/**
 * method_5799
 */
fun Entity.isTouchingWater() = this.method_5799()
/**
 * method_5787
 */
fun Entity.isLogicalSideForUpdatingMovement() = this.method_5787()
/**
 * method_5853
 */
fun Entity.canExplosionDestroyBlock(arg0: Explosion, arg1: BlockView, arg2: BlockPos, arg3: BlockState, arg4: Float) = this.method_5853(arg0, arg1, arg2, arg3, arg4)
/**
 * method_5751
 */
fun Entity.getStandingEyeHeight() = this.method_5751()
/**
 * method_5650
 */
fun Entity.remove(arg0: net.minecraft.class_1297.class_5529) = this.method_5650(arg0)
/**
 * method_5645
 */
fun Entity.isTeamPlayer(arg0: AbstractTeam) = this.method_5645(arg0)
/**
 * method_60951
 */
fun Entity.lerpYaw(arg0: Float) = this.method_60951(arg0)
/**
 * method_17682
 */
fun Entity.getHeight() = this.method_17682()
/**
 * method_41328
 */
fun Entity.isInPose(arg0: EntityPose) = this.method_41328(arg0)
/**
 * method_35049
 */
fun Entity.getRemovalReason() = this.method_35049()
/**
 * method_61409
 */
fun Entity.tickBlockCollision() = this.method_61409()
/**
 * method_5654
 */
fun Entity.doesNotCollide(arg0: Double, arg1: Double, arg2: Double) = this.method_5654(arg0, arg1, arg2)
/**
 * method_5871
 */
fun Entity.getTargetingMargin() = this.method_5871()
/**
 * method_5773
 */
fun Entity.tick() = this.method_5773()
/**
 * method_5828
 */
fun Entity.getRotationVec(arg0: Float) = this.method_5828(arg0)
/**
 * method_17681
 */
fun Entity.getWidth() = this.method_17681()
/**
 * method_5694
 */
fun Entity.onPlayerCollision(arg0: PlayerEntity) = this.method_5694(arg0)
/**
 * method_46395
 */
fun Entity.extinguishWithSound() = this.method_46395()
/**
 * method_5834
 */
fun Entity.setGlowing(arg0: Boolean) = this.method_5834(arg0)
/**
 * method_5872
 */
fun Entity.changeLookDirection(arg0: Double, arg1: Double) = this.method_5872(arg0, arg1)
/**
 * method_5763
 */
fun Entity.applyMirror(arg0: BlockMirror) = this.method_5763(arg0)
/**
 * method_5822
 */
fun Entity.canUsePortals(arg0: Boolean) = this.method_5822(arg0)
/**
 * method_31481
 */
fun Entity.isRemoved() = this.method_31481()
/**
 * method_5680
 */
fun Entity.canBeSpectated(arg0: ServerPlayerEntity) = this.method_5680(arg0)
/**
 * method_45321
 */
fun Entity.getLeashOffset(arg0: Float) = this.method_45321(arg0)
/**
 * method_5668
 */
fun Entity.getRootVehicle() = this.method_5668()
/**
 * method_5736
 */
fun Entity.getPassengersDeep() = this.method_5736()
/**
 * method_5768
 */
fun Entity.kill(arg0: ServerWorld) = this.method_5768(arg0)
/**
 * method_5700
 */
fun Entity.onBubbleColumnSurfaceCollision(arg0: Boolean) = this.method_5700(arg0)
/**
 * method_5640
 */
fun Entity.shouldRender(arg0: Double) = this.method_5640(arg0)
/**
 * method_5675
 */
fun Entity.isPushedByFluids() = this.method_5675()
/**
 * method_5772
 */
fun Entity.removeAllPassengers() = this.method_5772()
/**
 * method_30633
 */
fun Entity.positionInPortal(arg0: net.minecraft.class_2350.class_2351, arg1: net.minecraft.class_5459.class_5460) = this.method_30633(arg0, arg1)
/**
 * method_43259
 */
fun Entity.isInRange(arg0: Entity, arg1: Double, arg2: Double) = this.method_43259(arg0, arg1, arg2)
/**
 * method_48922
 */
fun Entity.onDamaged(arg0: DamageSource) = this.method_48922(arg0)
/**
 * method_5767
 */
fun Entity.isInvisible() = this.method_5767()
/**
 * method_31471
 */
fun Entity.onSpawnPacket(arg0: EntitySpawnS2CPacket) = this.method_31471(arg0)
/**
 * method_5664
 */
fun Entity.interactAt(arg0: PlayerEntity, arg1: Vec3d, arg2: Hand) = this.method_5664(arg0, arg1, arg2)
/**
 * method_32876
 */
fun Entity.emitGameEvent(arg0: RegistryEntry<GameEvent>) = this.method_32876(arg0)
/**
 * method_48105
 */
fun Entity.teleport(arg0: ServerWorld, arg1: Double, arg2: Double, arg3: Double, arg4: Set<PositionFlag>, arg5: Float, arg6: Float, arg7: Boolean) = this.method_48105(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7)
/**
 * method_5692
 */
fun Entity.updateMovementInFluid(arg0: TagKey<Fluid>, arg1: Double) = this.method_5692(arg0, arg1)
/**
 * method_5698
 */
fun Entity.handleAttack(arg0: Entity) = this.method_5698(arg0)
/**
 * method_5777
 */
fun Entity.isSubmergedIn(arg0: TagKey<Fluid>) = this.method_5777(arg0)
/**
 * method_53830
 */
fun Entity.getLerpTargetX() = this.method_53830()
/**
 * method_31472
 */
fun Entity.discard() = this.method_31472()
/**
 * method_52535
 */
fun Entity.isInFluid() = this.method_52535()
/**
 * method_5770
 */
fun Entity.getEntityWorld() = this.method_5770()
/**
 * method_5646
 */
fun Entity.extinguish() = this.method_5646()
/**
 * method_5803
 */
fun Entity.setSilent(arg0: Boolean) = this.method_5803(arg0)
/**
 * method_5730
 */
fun Entity.setOnFireFromLava() = this.method_5730()
/**
 * method_5840
 */
fun KClass<Entity>.setRenderDistanceMultiplier(arg0: Double) = Entity.method_5840(arg0)
/**
 * method_5861
 */
fun Entity.getFluidHeight(arg0: TagKey<Fluid>) = this.method_5861(arg0)
/**
 * method_5851
 */
fun Entity.isGlowing() = this.method_5851()
/**
 * method_33567
 */
fun Entity.requestTeleportAndDismount(arg0: Double, arg1: Double, arg2: Double) = this.method_33567(arg0, arg1, arg2)
/**
 * method_5863
 */
fun Entity.canHit() = this.method_5863()
/**
 * method_31483
 */
fun Entity.getFirstPassenger() = this.method_31483()
/**
 * method_49108
 */
fun Entity.canBeHitByProjectile() = this.method_49108()
/**
 * method_31473
 */
fun Entity.attemptTickInVoid() = this.method_31473()
/**
 * method_5669
 */
fun Entity.getAir() = this.method_5669()
/**
 * method_53831
 */
fun Entity.getLerpTargetYaw() = this.method_53831()
/**
 * method_60608
 */
fun Entity.setAngles(arg0: Float, arg1: Float) = this.method_60608(arg0, arg1)
/**
 * method_64578
 */
fun Entity.rotate(arg0: Float, arg1: Float) = this.method_64578(arg0, arg1)
/**
 * method_5862
 */
fun Entity.doesRenderOnFire() = this.method_5862()
/**
 * method_5753
 */
fun Entity.isFireImmune() = this.method_5753()
/**
 * method_5780
 */
fun Entity.addCommandTag(arg0: String) = this.method_5780(arg0)
/**
 * method_5765
 */
fun Entity.hasVehicle() = this.method_5765()
/**
 * method_5697
 */
fun Entity.pushAwayFrom(arg0: Entity) = this.method_5697(arg0)
/**
 * method_5707
 */
fun Entity.squaredDistanceTo(arg0: Vec3d) = this.method_5707(arg0)
/**
 * method_42148
 */
fun Entity.hasControllingPassenger() = this.method_42148()
/**
 * method_5762
 */
fun Entity.addVelocity(arg0: Double, arg1: Double, arg2: Double) = this.method_5762(arg0, arg1, arg2)
/**
 * method_5716
 */
fun Entity.updateKilledAdvancementCriterion(arg0: Entity, arg1: DamageSource) = this.method_5716(arg0, arg1)
/**
 * method_5750
 */
fun Entity.setVelocityClient(arg0: Double, arg1: Double, arg2: Double) = this.method_5750(arg0, arg1, arg2)
/**
 * method_5850
 */
fun Entity.getSafeFallDistance() = this.method_5850()
/**
 * method_64420
 */
fun Entity.sidedDamage(arg0: DamageSource, arg1: Float) = this.method_64420(arg0, arg1)
/**
 * method_5802
 */
fun Entity.getRotationClient() = this.method_5802()
/**
 * method_45166
 */
fun Entity.requestTeleportOffset(arg0: Double, arg1: Double, arg2: Double) = this.method_45166(arg0, arg1, arg2)
/**
 * method_21749
 */
fun Entity.bypassesSteppingEffects() = this.method_21749()
/**
 * method_45318
 */
fun Entity.limitFallDistance() = this.method_45318()
/**
 * method_5728
 */
fun Entity.setSprinting(arg0: Boolean) = this.method_5728(arg0)
/**
 * method_5759
 */
fun Entity.updateTrackedPositionAndAngles(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float, arg5: Int) = this.method_5759(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_5740
 */
fun Entity.hasNoGravity() = this.method_5740()
/**
 * method_5655
 */
fun Entity.isInvulnerable() = this.method_5655()
/**
 * method_5982
 */
fun Entity.checkDespawn() = this.method_5982()
/**
 * method_5841
 */
fun Entity.getDataTracker() = this.method_5841()
/**
 * method_5832
 */
fun Entity.applyRotation(arg0: BlockRotation) = this.method_5832(arg0)
/**
 * method_5794
 */
fun Entity.isConnectedThroughVehicle(arg0: Entity) = this.method_5794(arg0)
/**
 * method_65342
 */
fun Entity.setMovement(arg0: Boolean, arg1: Vec3d) = this.method_65342(arg0, arg1)
/**
 * method_5836
 */
fun Entity.getCameraPosVec(arg0: Float) = this.method_5836(arg0)
/**
 * method_24516
 */
fun Entity.isInRange(arg0: Entity, arg1: Double) = this.method_24516(arg0, arg1)
/**
 * method_5748
 */
fun Entity.getMaxAir() = this.method_5748()
/**
 * method_18380
 */
fun Entity.setPose(arg0: EntityPose) = this.method_18380(arg0)
/**
 * method_5688
 */
fun Entity.interact(arg0: PlayerEntity, arg1: Hand) = this.method_5688(arg0, arg1)
/**
 * method_24203
 */
fun Entity.refreshPositionAfterTeleport(arg0: Double, arg1: Double, arg2: Double) = this.method_24203(arg0, arg1, arg2)
/**
 * method_52538
 */
fun Entity.getPassengerRidingPos(arg0: Entity) = this.method_52538(arg0)
/**
 * method_29241
 */
fun Entity.getSwimHeight() = this.method_29241()
/**
 * method_43077
 */
fun Entity.playSoundIfNotSilent(arg0: SoundEvent) = this.method_43077(arg0)
/**
 * method_54757
 */
fun Entity.getPlayerPassengers() = this.method_54757()
/**
 * method_5747
 */
fun Entity.handleFallDamage(arg0: Float, arg1: Float, arg2: DamageSource) = this.method_5747(arg0, arg1, arg2)
/**
 * method_5870
 */
fun Entity.dropItem(arg0: ServerWorld, arg1: ItemConvertible, arg2: Int) = this.method_5870(arg0, arg1, arg2)
/**
 * method_61414
 */
fun Entity.getLerpedPitch(arg0: Float) = this.method_61414(arg0)
/**
 * method_18381
 */
fun Entity.getEyeHeight(arg0: EntityPose) = this.method_18381(arg0)
/**
 * method_5879
 */
fun Entity.animateDamage(arg0: Float) = this.method_5879(arg0)
/**
 * method_48923
 */
fun Entity.getDamageSources() = this.method_48923()
/**
 * method_31477
 */
fun Entity.getBlockX() = this.method_31477()
/**
 * method_5637
 */
fun Entity.isWet() = this.method_5637()
/**
 * method_5735
 */
fun Entity.getHorizontalFacing() = this.method_5735()
/**
 * method_43389
 */
fun Entity.getTrackedPosition() = this.method_43389()
/**
 * method_5641
 */
fun Entity.updatePositionAndAngles(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float) = this.method_5641(arg0, arg1, arg2, arg3, arg4)
/**
 * method_63615
 */
fun Entity.setPrevPositionAndAngles(arg0: Vec3d, arg1: Float, arg2: Float) = this.method_63615(arg0, arg1, arg2)
/**
 * method_31476
 */
fun Entity.getChunkPos() = this.method_31476()
/**
 * method_5636
 */
fun Entity.setBodyYaw(arg0: Float) = this.method_5636(arg0)
/**
 * method_60491
 */
fun Entity.addVelocity(arg0: Vec3d) = this.method_60491(arg0)
/**
 * method_32312
 */
fun Entity.getFrozenTicks() = this.method_32312()
/**
 * method_31478
 */
fun Entity.getBlockY() = this.method_31478()
/**
 * method_5624
 */
fun Entity.isSprinting() = this.method_5624()
/**
 * method_5733
 */
fun Entity.shouldRenderName() = this.method_5733()
/**
 * method_5757
 */
fun Entity.isInsideWall() = this.method_5757()
/**
 * method_5842
 */
fun Entity.tickRiding() = this.method_5842()
/**
 * method_42147
 */
fun Entity.updateEventHandler(arg0: BiConsumer<EntityGameEventHandler<*>, ServerWorld>) = this.method_42147(arg0)
/**
 * method_5721
 */
fun Entity.isTouchingWaterOrRain() = this.method_5721()
/**
 * method_5859
 */
fun Entity.requestTeleport(arg0: Double, arg1: Double, arg2: Double) = this.method_5859(arg0, arg1, arg2)
/**
 * method_60478
 */
fun Entity.getMovement() = this.method_60478()
/**
 * method_36971
 */
fun Entity.canModifyAt(arg0: ServerWorld, arg1: BlockPos) = this.method_36971(arg0, arg1)
/**
 * method_32313
 */
fun Entity.getFreezingScale() = this.method_32313()
/**
 * method_5706
 */
fun Entity.dropItem(arg0: ServerWorld, arg1: ItemConvertible) = this.method_5706(arg0, arg1)
/**
 * method_5685
 */
fun Entity.getPassengerList() = this.method_5685()
/**
 * method_43391
 */
fun Entity.updateTrackedPosition(arg0: Double, arg1: Double, arg2: Double) = this.method_43391(arg0, arg1, arg2)
/**
 * method_31479
 */
fun Entity.getBlockZ() = this.method_31479()
/**
 * method_5719
 */
fun Entity.copyPositionAndRotation(arg0: Entity) = this.method_5719(arg0)
/**
 * method_5732
 */
fun Entity.isAttackable() = this.method_5732()
/**
 * method_5874
 */
fun Entity.onKilledOther(arg0: ServerWorld, arg1: LivingEntity) = this.method_5874(arg0, arg1)
/**
 * method_45319
 */
fun Entity.addVelocityInternal(arg0: Vec3d) = this.method_45319(arg0)
/**
 * method_5804
 */
fun Entity.startRiding(arg0: Entity) = this.method_5804(arg0)
/**
 * method_32314
 */
fun Entity.isFrozen() = this.method_32314()
/**
 * method_63616
 */
fun Entity.isLocalPlayerOrLogicalSideForUpdatingMovement() = this.method_63616()
/**
 * method_43390
 */
fun Entity.getSyncedPos() = this.method_43390()
/**
 * method_52534
 */
fun Entity.shouldControlVehicles() = this.method_52534()
/**
 * method_5659
 */
fun Entity.isImmuneToExplosion(arg0: Explosion) = this.method_5659(arg0)
/**
 * method_61415
 */
fun Entity.getLerpedYaw(arg0: Float) = this.method_61415(arg0)
/**
 * method_5711
 */
fun Entity.handleStatus(arg0: Byte) = this.method_5711(arg0)
/**
 * method_61411
 */
fun Entity.getLastRenderPos() = this.method_61411()
/**
 * method_5873
 */
fun Entity.startRiding(arg0: Entity, arg1: Boolean) = this.method_5873(arg0, arg1)
/**
 * method_30229
 */
fun Entity.resetPortalCooldown() = this.method_30229()
/**
 * method_40071
 */
fun Entity.shouldEscapePowderSnow() = this.method_40071()
/**
 * method_5847
 */
fun Entity.setHeadYaw(arg0: Float) = this.method_5847(arg0)
/**
 * method_23324
 */
fun Entity.getBodyZ(arg0: Double) = this.method_23324(arg0)
/**
 * method_5848
 */
fun Entity.stopRiding() = this.method_5848()
/**
 * method_5715
 */
fun Entity.isSneaking() = this.method_5715()
/**
 * method_32315
 */
fun Entity.getMinFreezeDamageTicks() = this.method_32315()
/**
 * method_5991
 */
fun Entity.getLootTableKey() = this.method_5991()
/**
 * method_56918
 */
fun Entity.onExplodedBy(arg0: Entity) = this.method_56918(arg0)
/**
 * method_5844
 */
fun Entity.slowMovement(arg0: BlockState, arg1: Vec3d) = this.method_5844(arg0, arg1)
/**
 * method_56072
 */
fun Entity.getAttachments() = this.method_56072()
/**
 * method_64419
 */
fun Entity.serverDamage(arg0: DamageSource, arg1: Float) = this.method_64419(arg0, arg1)
/**
 * method_36361
 */
fun Entity.isGlowingLocal() = this.method_36361()
/**
 * method_5824
 */
fun KClass<Entity>.getRenderDistanceMultiplier() = Entity.method_5824()
/**
 * method_32316
 */
fun Entity.canFreeze() = this.method_32316()
/**
 * method_5702
 */
fun Entity.lookAt(arg0: net.minecraft.class_2183.class_2184, arg1: Vec3d) = this.method_5702(arg0, arg1)
/**
 * method_5855
 */
fun Entity.setAir(arg0: Int) = this.method_5855(arg0)
/**
 * method_23323
 */
fun Entity.getBodyY(arg0: Double) = this.method_23323(arg0)
/**
 * method_5755
 */
fun Entity.getMovementDirection() = this.method_5755()
/**
 * method_5810
 */
fun Entity.isPushable() = this.method_5810()
/**
 * method_5701
 */
fun Entity.isSilent() = this.method_5701()
/**
 * method_24830
 */
fun Entity.setOnGround(arg0: Boolean) = this.method_24830(arg0)
/**
 * method_64397
 */
fun Entity.damage(arg0: ServerWorld, arg1: DamageSource, arg2: Float) = this.method_64397(arg0, arg1, arg2)
/**
 * method_56073
 */
fun Entity.setOnFireForTicks(arg0: Int) = this.method_56073(arg0)
/**
 * method_5864
 */
fun Entity.getType() = this.method_5864()
/**
 * method_5854
 */
fun Entity.getVehicle() = this.method_5854()
/**
 * method_5639
 */
fun Entity.setOnFireFor(arg0: Float) = this.method_5639(arg0)
/**
 * method_23322
 */
fun Entity.getParticleX(arg0: Double) = this.method_23322(arg0)
/**
 * method_23321
 */
fun Entity.getZ() = this.method_23321()
/**
 * method_5647
 */
fun Entity.writeNbt(arg0: NbtCompound) = this.method_5647(arg0)
/**
 * method_5784
 */
fun Entity.move(arg0: MovementType, arg1: Vec3d) = this.method_5784(arg0, arg1)
/**
 * method_65038
 */
fun Entity.isControlledByPlayer() = this.method_65038()
/**
 * method_20802
 */
fun Entity.getFireTicks() = this.method_20802()
/**
 * method_5775
 */
fun Entity.dropStack(arg0: ServerWorld, arg1: ItemStack) = this.method_5775(arg0, arg1)
/**
 * method_5720
 */
fun Entity.getRotationVector() = this.method_5720()
/**
 * method_5649
 */
fun Entity.squaredDistanceTo(arg0: Double, arg1: Double, arg2: Double) = this.method_5649(arg0, arg1, arg2)
/**
 * method_23320
 */
fun Entity.getEyeY() = this.method_23320()
/**
 * method_5869
 */
fun Entity.isSubmergedInWater() = this.method_5869()
/**
 * method_5745
 */
fun Entity.raycast(arg0: Double, arg1: Float, arg2: Boolean) = this.method_5745(arg0, arg1, arg2)
/**
 * method_20803
 */
fun Entity.setFireTicks(arg0: Int) = this.method_20803(arg0)
/**
 * method_5651
 */
fun Entity.readNbt(arg0: NbtCompound) = this.method_5651(arg0)
/**
 * method_23327
 */
fun Entity.setPos(arg0: Double, arg1: Double, arg2: Double) = this.method_23327(arg0, arg1, arg2)
/**
 * method_5880
 */
fun Entity.setCustomNameVisible(arg0: Boolean) = this.method_5880(arg0)
/**
 * method_14245
 */
fun Entity.getWorldSpawnPos(arg0: ServerWorld, arg1: BlockPos) = this.method_14245(arg0, arg1)
/**
 * method_33574
 */
fun Entity.setPosition(arg0: Vec3d) = this.method_33574(arg0)
/**
 * method_23316
 */
fun Entity.getBodyX(arg0: Double) = this.method_23316(arg0)
/**
 * method_5738
 */
fun Entity.removeCommandTag(arg0: String) = this.method_5738(arg0)
/**
 * method_55667
 */
fun Entity.getBlockStateAtPos() = this.method_55667()
/**
 * method_33724
 */
fun Entity.isRegionUnloaded() = this.method_33724()
/**
 * method_5816
 */
fun Entity.isInsideWaterOrBubbleColumn() = this.method_5816()
/**
 * method_40123
 */
fun Entity.getHandPosOffset(arg0: Item) = this.method_40123(arg0)
/**
 * method_5682
 */
fun Entity.getServer() = this.method_5682()
/**
 * method_5662
 */
fun Entity.saveNbt(arg0: NbtCompound) = this.method_5662(arg0)
/**
 * method_20736
 */
fun KClass<Entity>.adjustMovementForCollisions(arg0: Entity, arg1: Vec3d, arg2: Box, arg3: world_World, arg4: MutableList<VoxelShape>) = Entity.method_20736(arg0, arg1, arg2, arg3, arg4)
/**
 * method_27298
 */
fun Entity.shouldSpawnSprintingParticles() = this.method_27298()
/**
 * method_5821
 */
fun Entity.hasPassengerDeep(arg0: Entity) = this.method_5821(arg0)
/**
 * method_38785
 */
fun Entity.onLanding() = this.method_38785()
/**
 * method_56071
 */
fun Entity.getProjectileDeflection(arg0: ProjectileEntity) = this.method_56071(arg0)
/**
 * method_5858
 */
fun Entity.squaredDistanceTo(arg0: Entity) = this.method_5858(arg0)
/**
 * method_60490
 */
fun Entity.recalculateDimensions(arg0: EntityDimensions) = this.method_60490(arg0)
/**
 * method_6034
 */
fun Entity.canMoveVoluntarily() = this.method_6034()
/**
 * method_5705
 */
fun Entity.getYaw(arg0: Float) = this.method_5705(arg0)
/**
 * method_5808
 */
fun Entity.refreshPositionAndAngles(arg0: Double, arg1: Double, arg2: Double, arg3: Float, arg4: Float) = this.method_5808(arg0, arg1, arg2, arg3, arg4)
/**
 * method_18382
 */
fun Entity.calculateDimensions() = this.method_18382()
/**
 * method_5786
 */
fun Entity.saveSelfNbt(arg0: NbtCompound) = this.method_5786(arg0)
/**
 * method_60697
 */
fun Entity.tryUsePortal(arg0: Portal, arg1: BlockPos) = this.method_60697(arg0, arg1)
/**
 * method_5718
 */
fun Entity.getBrightnessAtEyes() = this.method_5718()
/**
 * method_5660
 */
fun Entity.setSneaking(arg0: Boolean) = this.method_5660(arg0)
/**
 * method_5684
 */
fun Entity.setInvulnerable(arg0: Boolean) = this.method_5684(arg0)
/**
 * method_18799
 */
fun Entity.setVelocity(arg0: Vec3d) = this.method_18799(arg0)
/**
 * method_32317
 */
fun Entity.setFrozenTicks(arg0: Int) = this.method_32317(arg0)
/**
 * method_31480
 */
fun Entity.getPickBlockStack() = this.method_31480()
/**
 * method_33571
 */
fun Entity.getEyePos() = this.method_33571()
/**
 * method_5626
 */
fun Entity.hasPassenger(arg0: Entity) = this.method_5626(arg0)
/**
 * method_5643
 */
fun Entity.clientDamage(arg0: DamageSource) = this.method_5643(arg0)
/**
 * method_24829
 */
fun Entity.updatePassengerForDismount(arg0: LivingEntity) = this.method_24829(arg0)
/**
 * method_51849
 */
fun Entity.isSupportedBy(arg0: BlockPos) = this.method_51849(arg0)
/**
 * method_5722
 */
fun Entity.isTeammate(arg0: Entity) = this.method_5722(arg0)
/**
 * method_23325
 */
fun Entity.getParticleZ(arg0: Double) = this.method_23325(arg0)
/**
 * method_24201
 */
fun Entity.updatePassengerPosition(arg0: Entity) = this.method_24201(arg0)
/**
 * method_18002
 */
fun Entity.createSpawnPacket(arg0: EntityTrackerEntry) = this.method_18002(arg0)
/**
 * method_56989
 */
fun Entity.getFinalGravity() = this.method_56989()
/**
 * method_30949
 */
fun Entity.collidesWith(arg0: Entity) = this.method_30949(arg0)
/**
 * method_31166
 */
fun Entity.getClientCameraPosVec(arg0: Float) = this.method_31166(arg0)
/**
 * method_36454
 */
fun Entity.getYaw() = this.method_36454()
/**
 * method_64166
 */
fun Entity.tickBlockCollision(arg0: Vec3d, arg1: Vec3d) = this.method_64166(arg0, arg1)
/**
 * method_23319
 */
fun Entity.getRandomBodyY() = this.method_23319()
/**
 * method_60607
 */
fun Entity.setMovement(arg0: Boolean, arg1: Boolean, arg2: Vec3d) = this.method_60607(arg0, arg1, arg2)
/**
 * method_33572
 */
fun Entity.setOnFire(arg0: Boolean) = this.method_33572(arg0)
/**
 * method_36455
 */
fun Entity.getPitch() = this.method_36455()
/**
 * method_18276
 */
fun Entity.isInSneakingPose() = this.method_18276()
/**
 * method_37908
 */
fun Entity.getWorld() = this.method_37908()
/**
 * method_5857
 */
fun Entity.setBoundingBox(arg0: Box) = this.method_5857(arg0)
/**
 * method_5727
 */
fun Entity.shouldRender(arg0: Double, arg1: Double, arg2: Double) = this.method_5727(arg0, arg1, arg2)
/**
 * method_5781
 */
fun Entity.getScoreboardTeam() = this.method_5781()
/**
 * method_23318
 */
fun Entity.getY() = this.method_23318()
/**
 * method_5665
 */
fun Entity.setCustomName(arg0: Text) = this.method_5665(arg0)
/**
 * method_43078
 */
fun Entity.getBodyYaw() = this.method_43078()
/**
 * method_63614
 */
fun Entity.updatePrevAngles() = this.method_63614()
/**
 * method_18798
 */
fun Entity.getVelocity() = this.method_18798()
/**
 * method_5807
 */
fun Entity.isCustomNameVisible() = this.method_5807()
/**
 * method_5703
 */
fun Entity.hasPassenger(arg0: Predicate<Entity>) = this.method_5703(arg0)
/**
 * method_5742
 */
fun Entity.onStoppedTrackingBy(arg0: ServerPlayerEntity) = this.method_5742(arg0)
/**
 * method_64168
 */
fun Entity.queueBlockCollisionCheck(arg0: Vec3d, arg1: Vec3d) = this.method_64168(arg0, arg1)
/**
 * method_5838
 */
fun Entity.setId(arg0: Int) = this.method_5838(arg0)
/**
 * method_32318
 */
fun Entity.getStackReference(arg0: Int) = this.method_32318(arg0)
/**
 * method_23317
 */
fun Entity.getX() = this.method_23317()
/**
 * method_5709
 */
fun Entity.isLiving() = this.method_5709()
/**
 * method_18375
 */
fun Entity.detach() = this.method_18375()
/**
 * method_30230
 */
fun Entity.hasPortalCooldown() = this.method_30230()
/**
 * method_5806
 */
fun Entity.getDefaultPortalCooldown() = this.method_5806()
/**
 * method_5814
 */
fun Entity.setPosition(arg0: Double, arg1: Double, arg2: Double) = this.method_5814(arg0, arg1, arg2)
/**
 * method_5796
 */
fun Entity.setSwimming(arg0: Boolean) = this.method_5796(arg0)
/**
 * method_19538
 */
fun Entity.getPos() = this.method_19538()
/**
 * method_5756
 */
fun Entity.isInvisibleTo(arg0: PlayerEntity) = this.method_5756(arg0)
/**
 * method_5845
 */
fun Entity.getUuidAsString() = this.method_5845()
/**
 * method_5663
 */
fun Entity.getRotationVecClient() = this.method_5663()
/**
 * method_5631
 */
fun Entity.getRotationVector(arg0: Float, arg1: Float) = this.method_5631(arg0, arg1)
/**
 * method_5739
 */
fun Entity.distanceTo(arg0: Entity) = this.method_5739(arg0)
/**
 * method_58149
 */
fun Entity.getFacing() = this.method_58149()
/**
 * method_20232
 */
fun Entity.isInSwimmingPose() = this.method_20232()
/**
 * method_5805
 */
fun Entity.isAlive() = this.method_5805()
/**
 * method_5817
 */
fun Entity.hasPlayerRider() = this.method_5817()
/**
 * method_5670
 */
fun Entity.baseTick() = this.method_5670()
/**
 * method_5683
 */
fun Entity.updateTrackedHeadRotation(arg0: Float, arg1: Int) = this.method_5683(arg0, arg1)
/**
 * method_43260
 */
fun Entity.getLandingPos() = this.method_43260()
/**
 * method_29495
 */
fun Entity.refreshPositionAfterTeleport(arg0: Vec3d) = this.method_29495(arg0)
/**
 * method_21750
 */
fun Entity.bypassesLandingEffects() = this.method_21750()
/**
 * method_55668
 */
fun Entity.getVehicleAttachmentPos(arg0: Entity) = this.method_55668(arg0)
/**
 * method_5837
 */
fun Entity.onStartedTrackingBy(arg0: ServerPlayerEntity) = this.method_5837(arg0)
/**
 * method_25936
 */
fun Entity.getSteppingBlockState() = this.method_25936()
/**
 * method_23312
 */
fun Entity.getSteppingPos() = this.method_23312()
/**
 * method_5791
 */
fun Entity.getHeadYaw() = this.method_5791()
/**
 * method_5657
 */
fun Entity.getPistonBehavior() = this.method_5657()
/**
 * method_36457
 */
fun Entity.setPitch(arg0: Float) = this.method_36457(arg0)
/**
 * method_30634
 */
fun Entity.updatePosition(arg0: Double, arg1: Double, arg2: Double) = this.method_30634(arg0, arg1, arg2)
/**
 * method_5729
 */
fun Entity.setFlag(arg0: Int, arg1: Boolean) = this.method_5729(arg0, arg1)
/**
 * method_5725
 */
fun Entity.refreshPositionAndAngles(arg0: BlockPos, arg1: Float, arg2: Float) = this.method_5725(arg0, arg1, arg2)
/**
 * method_21751
 */
fun Entity.isSneaky() = this.method_21751()
/**
 * method_5681
 */
fun Entity.isSwimming() = this.method_5681()
/**
 * method_5790
 */
fun Entity.updateSwimming() = this.method_5790()
/**
 * method_5875
 */
fun Entity.setNoGravity(arg0: Boolean) = this.method_5875(arg0)
/**
 * method_5644
 */
fun Entity.onPassengerLookAround(arg0: Entity) = this.method_5644(arg0)
/**
 * method_33189
 */
fun Entity.occludeVibrationSignals() = this.method_33189()
/**
 * method_60950
 */
fun Entity.addPortalChunkTicketAt(arg0: BlockPos) = this.method_60950(arg0)
/**
 * method_52172
 */
fun Entity.isOnRail() = this.method_52172()
/**
 * method_59958
 */
fun Entity.getWeaponStack() = this.method_59958()
/**
 * method_61113
 */
fun Entity.canTeleportBetween(arg0: world_World, arg1: world_World) = this.method_61113(arg0, arg1)
/**
 * method_5699
 */
fun Entity.dropStack(arg0: ServerWorld, arg1: ItemStack, arg2: Float) = this.method_5699(arg0, arg1, arg2)
/**
 * method_23314
 */
fun Entity.getVelocityAffectingPos() = this.method_23314()
/**
 * method_18376
 */
fun Entity.getPose() = this.method_18376()
/**
 * method_22862
 */
fun Entity.resetPosition() = this.method_22862()
/**
 * method_64615
 */
fun Entity.onRemove(arg0: net.minecraft.class_1297.class_5529) = this.method_64615(arg0)
/**
 * method_22861
 */
fun Entity.getTeamColorValue() = this.method_22861()
/**
 * method_5671
 */
fun Entity.getCommandSource(arg0: ServerWorld) = this.method_5671(arg0)
/**
 * method_5764
 */
fun Entity.onBubbleColumnCollision(arg0: Boolean) = this.method_5764(arg0)
/**
 * method_5783
 */
fun Entity.playSound(arg0: SoundEvent, arg1: Float, arg2: Float) = this.method_5783(arg0, arg1, arg2)
/**
 * method_24828
 */
fun Entity.isOnGround() = this.method_24828()
/**
 * method_18377
 */
fun Entity.getDimensions(arg0: EntityPose) = this.method_18377(arg0)
/**
 * method_36456
 */
fun Entity.setYaw(arg0: Float) = this.method_36456(arg0)
/**
 * method_18864
 */
fun Entity.getOppositeRotationVector(arg0: Float) = this.method_18864(arg0)
/**
 * method_5809
 */
fun Entity.isOnFire() = this.method_5809()
/**
 * method_51850
 */
fun Entity.setPortalCooldown(arg0: Int) = this.method_51850(arg0)
/**
 * method_49476
 */
fun Entity.getStepHeight() = this.method_49476()
/**
 * method_5819
 */
fun Entity.populateCrashReport(arg0: CrashReportSection) = this.method_5819(arg0)
/**
 * method_30950
 */
fun Entity.getLerpedPos(arg0: Float) = this.method_30950(arg0)
/**
 * method_49693
 */
fun Entity.shouldDismountUnderwater() = this.method_49693()
/**
 * method_5771
 */
fun Entity.isInLava() = this.method_5771()
/**
 * method_30948
 */
fun Entity.isCollidable() = this.method_30948()
/**
 * method_53827
 */
fun Entity.getLerpTargetY() = this.method_53827()
/**
 * method_60949
 */
fun Entity.refreshPositionAndAngles(arg0: Vec3d, arg1: Float, arg2: Float) = this.method_60949(arg0, arg1, arg2)
/**
 * method_5774
 */
fun Entity.getEffectiveExplosionResistance(arg0: Explosion, arg1: BlockView, arg2: BlockPos, arg3: BlockState, arg4: FluidState, arg5: Float) = this.method_5774(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_48155
 */
fun Entity.canSprintAsVehicle() = this.method_48155()
/**
 * method_5826
 */
fun Entity.setUuid(arg0: UUID) = this.method_5826(arg0)
/**
 * method_64610
 */
fun Entity.resetLerp() = this.method_64610()
/**
 * method_5878
 */
fun Entity.copyFrom(arg0: Entity) = this.method_5878(arg0)
/**
 * method_5782
 */
fun Entity.hasPassengers() = this.method_5782()
/**
 * method_53828
 */
fun Entity.getLerpTargetZ() = this.method_53828()
/**
 * method_5800
 */
fun Entity.onStruckByLightning(arg0: ServerWorld, arg1: LightningEntity) = this.method_5800(arg0, arg1)
/**
 * method_5724
 */
fun Entity.updateVelocity(arg0: Float, arg1: Vec3d) = this.method_5724(arg0, arg1)
/**
 * method_20448
 */
fun Entity.isCrawling() = this.method_20448()
/**
 * method_51848
 */
fun Entity.getPortalCooldown() = this.method_51848()
/**
 * method_61412
 */
fun Entity.setPosition(arg0: PlayerPosition, arg1: Set<PositionFlag>) = this.method_61412(arg0, arg1)
/**
 * method_49694
 */
fun Entity.getControllingVehicle() = this.method_49694()
/**
 * method_36209
 */
fun Entity.onRemoved() = this.method_36209()
/**
 * method_7325
 */
fun Entity.isSpectator() = this.method_7325()
/**
 * method_5634
 */
fun Entity.getSoundCategory() = this.method_5634()
/**
 * method_30632
 */
fun Entity.collidesWithStateAtPos(arg0: BlockPos, arg1: BlockState) = this.method_30632(arg0, arg1)
/**
 * method_56673
 */
fun Entity.getRegistryManager() = this.method_56673()
/**
 * method_59922
 */
fun Entity.getRandom() = this.method_59922()
/**
 * method_5696
 */
fun Entity.canAvoidTraps() = this.method_5696()
/**
 * method_5648
 */
fun Entity.setInvisible(arg0: Boolean) = this.method_5648(arg0)
/**
 * method_21752
 */
fun Entity.isDescending() = this.method_21752()
/**
 * method_65942
 */
fun Entity.handleFall(arg0: Double, arg1: Double, arg2: Double, arg3: Boolean) = this.method_65942(arg0, arg1, arg2, arg3)
/**
 * method_18800
 */
fun Entity.setVelocity(arg0: Double, arg1: Double, arg2: Double) = this.method_18800(arg0, arg1, arg2)
/**
 * method_53829
 */
fun Entity.getLerpTargetPitch() = this.method_53829()
/**
 * method_5695
 */
fun Entity.getPitch(arg0: Float) = this.method_5695(arg0)
/**
 * method_29239
 */
fun Entity.dismountVehicle() = this.method_29239()
/**
 * method_32875
 */
fun Entity.emitGameEvent(arg0: RegistryEntry<GameEvent>, arg1: Entity) = this.method_32875(arg0, arg1)
/**
 * method_5752
 */
fun Entity.getCommandTags() = this.method_5752()
/**
 * method_30951
 */
fun Entity.getLeashPos(arg0: Float) = this.method_30951(arg0)
/**
 * method_5779
 */
fun Entity.isPartOf(arg0: Entity) = this.method_5779(arg0)
/**
 * method_5731
 */
fun Entity.teleportTo(arg0: TeleportTarget) = this.method_5731(arg0)
/**
 * method_5642
 */
fun Entity.getControllingPassenger() = this.method_5642()
