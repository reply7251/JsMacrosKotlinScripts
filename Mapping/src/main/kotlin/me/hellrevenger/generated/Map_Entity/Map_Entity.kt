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
 * field_5971
 */
var Entity.lastRenderY by alias(Entity::field_5971)
/**
 * field_5960
 */
var Entity.noClip by alias(Entity::field_5960)
/**
 * field_28627
 */
var Entity.speed by alias(Entity::field_28627)
/**
 * field_5989
 */
var Entity.lastRenderZ by alias(Entity::field_5989)
/**
 * field_5976
 */
var Entity.horizontalCollision by alias(Entity::field_5976)
/**
 * field_51994
 */
var Entity.portalManager by alias(Entity::field_51994)
/**
 * field_44784
 */
var Entity.supportingBlockPos by alias(Entity::field_44784)
/**
 * field_34927
 */
var Entity.collidedSoftly by alias(Entity::field_34927)
/**
 * field_36331
 */
var Entity.groundCollision by alias(Entity::field_36331)
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
fun Entity.canExplosionDestroyBlock(explosion: Explosion?, world: BlockView?, pos: BlockPos?, state: BlockState?, explosionPower: Float) = this.method_5853(explosion, world, pos, state, explosionPower)
/**
 * method_5751
 */
fun Entity.getStandingEyeHeight() = this.method_5751()
/**
 * method_5650
 */
fun Entity.remove(reason: net.minecraft.class_1297.class_5529?) = this.method_5650(reason)
/**
 * method_5645
 */
fun Entity.isTeamPlayer(team: AbstractTeam?) = this.method_5645(team)
/**
 * method_60951
 */
fun Entity.lerpYaw(delta: Float) = this.method_60951(delta)
/**
 * method_17682
 */
fun Entity.getHeight() = this.method_17682()
/**
 * method_41328
 */
fun Entity.isInPose(pose: EntityPose?) = this.method_41328(pose)
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
fun Entity.doesNotCollide(offsetX: Double, arg1: Double, offsetY: Double) = this.method_5654(offsetX, arg1, offsetY)
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
fun Entity.getRotationVec(tickDelta: Float) = this.method_5828(tickDelta)
/**
 * method_17681
 */
fun Entity.getWidth() = this.method_17681()
/**
 * method_5694
 */
fun Entity.onPlayerCollision(player: PlayerEntity?) = this.method_5694(player)
/**
 * method_46395
 */
fun Entity.extinguishWithSound() = this.method_46395()
/**
 * method_5834
 */
fun Entity.setGlowing(glowing: Boolean) = this.method_5834(glowing)
/**
 * method_5872
 */
fun Entity.changeLookDirection(cursorDeltaX: Double, arg1: Double) = this.method_5872(cursorDeltaX, arg1)
/**
 * method_5763
 */
fun Entity.applyMirror(mirror: BlockMirror?) = this.method_5763(mirror)
/**
 * method_5822
 */
fun Entity.canUsePortals(allowVehicles: Boolean) = this.method_5822(allowVehicles)
/**
 * method_31481
 */
fun Entity.isRemoved() = this.method_31481()
/**
 * method_5680
 */
fun Entity.canBeSpectated(spectator: ServerPlayerEntity?) = this.method_5680(spectator)
/**
 * method_45321
 */
fun Entity.getLeashOffset(tickDelta: Float) = this.method_45321(tickDelta)
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
fun Entity.kill(world: ServerWorld?) = this.method_5768(world)
/**
 * method_5700
 */
fun Entity.onBubbleColumnSurfaceCollision(drag: Boolean) = this.method_5700(drag)
/**
 * method_5640
 */
fun Entity.shouldRender(distance: Double) = this.method_5640(distance)
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
fun Entity.positionInPortal(portalAxis: net.minecraft.class_2350.class_2351?, portalRect: net.minecraft.class_5459.class_5460?) = this.method_30633(portalAxis, portalRect)
/**
 * method_43259
 */
fun Entity.isInRange(entity: Entity?, horizontalRadius: Double, arg2: Double) = this.method_43259(entity, horizontalRadius, arg2)
/**
 * method_48922
 */
fun Entity.onDamaged(damageSource: DamageSource?) = this.method_48922(damageSource)
/**
 * method_5767
 */
fun Entity.isInvisible() = this.method_5767()
/**
 * method_31471
 */
fun Entity.onSpawnPacket(packet: EntitySpawnS2CPacket?) = this.method_31471(packet)
/**
 * method_5664
 */
fun Entity.interactAt(player: PlayerEntity?, hitPos: Vec3d?, hand: Hand?) = this.method_5664(player, hitPos, hand)
/**
 * method_32876
 */
fun Entity.emitGameEvent(event: RegistryEntry<GameEvent>?) = this.method_32876(event)
/**
 * method_48105
 */
fun Entity.teleport(world: ServerWorld?, destX: Double, arg2: Double, destY: Double, arg4: Set<PositionFlag>?, destZ: Float, arg6: Float, flags: Boolean) = this.method_48105(world, destX, arg2, destY, arg4, destZ, arg6, flags)
/**
 * method_5692
 */
fun Entity.updateMovementInFluid(tag: TagKey<Fluid>?, speed: Double) = this.method_5692(tag, speed)
/**
 * method_5698
 */
fun Entity.handleAttack(attacker: Entity?) = this.method_5698(attacker)
/**
 * method_5777
 */
fun Entity.isSubmergedIn(fluidTag: TagKey<Fluid>?) = this.method_5777(fluidTag)
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
fun Entity.setSilent(silent: Boolean) = this.method_5803(silent)
/**
 * method_5730
 */
fun Entity.setOnFireFromLava() = this.method_5730()
/**
 * method_5861
 */
fun Entity.getFluidHeight(fluid: TagKey<Fluid>?) = this.method_5861(fluid)
/**
 * method_5851
 */
fun Entity.isGlowing() = this.method_5851()
/**
 * method_33567
 */
fun Entity.requestTeleportAndDismount(destX: Double, arg1: Double, destY: Double) = this.method_33567(destX, arg1, destY)
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
fun Entity.setAngles(yaw: Float, pitch: Float) = this.method_60608(yaw, pitch)
/**
 * method_64578
 */
fun Entity.rotate(yaw: Float, pitch: Float) = this.method_64578(yaw, pitch)
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
fun Entity.addCommandTag(tag: String?) = this.method_5780(tag)
/**
 * method_5765
 */
fun Entity.hasVehicle() = this.method_5765()
/**
 * method_5697
 */
fun Entity.pushAwayFrom(entity: Entity?) = this.method_5697(entity)
/**
 * method_5707
 */
fun Entity.squaredDistanceTo(vector: Vec3d?) = this.method_5707(vector)
/**
 * method_42148
 */
fun Entity.hasControllingPassenger() = this.method_42148()
/**
 * method_5762
 */
fun Entity.addVelocity(deltaX: Double, arg1: Double, deltaY: Double) = this.method_5762(deltaX, arg1, deltaY)
/**
 * method_5716
 */
fun Entity.updateKilledAdvancementCriterion(entityKilled: Entity?, damageSource: DamageSource?) = this.method_5716(entityKilled, damageSource)
/**
 * method_5750
 */
fun Entity.setVelocityClient(x: Double, arg1: Double, y: Double) = this.method_5750(x, arg1, y)
/**
 * method_5850
 */
fun Entity.getSafeFallDistance() = this.method_5850()
/**
 * method_64420
 */
fun Entity.sidedDamage(source: DamageSource?, amount: Float) = this.method_64420(source, amount)
/**
 * method_5802
 */
fun Entity.getRotationClient() = this.method_5802()
/**
 * method_45166
 */
fun Entity.requestTeleportOffset(offsetX: Double, arg1: Double, offsetY: Double) = this.method_45166(offsetX, arg1, offsetY)
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
fun Entity.setSprinting(sprinting: Boolean) = this.method_5728(sprinting)
/**
 * method_5759
 */
fun Entity.updateTrackedPositionAndAngles(x: Double, arg1: Double, y: Double, arg3: Float, z: Float, arg5: Int) = this.method_5759(x, arg1, y, arg3, z, arg5)
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
fun Entity.applyRotation(rotation: BlockRotation?) = this.method_5832(rotation)
/**
 * method_5794
 */
fun Entity.isConnectedThroughVehicle(entity: Entity?) = this.method_5794(entity)
/**
 * method_65342
 */
fun Entity.setMovement(onGround: Boolean, movement: Vec3d?) = this.method_65342(onGround, movement)
/**
 * method_5836
 */
fun Entity.getCameraPosVec(tickDelta: Float) = this.method_5836(tickDelta)
/**
 * method_24516
 */
fun Entity.isInRange(entity: Entity?, radius: Double) = this.method_24516(entity, radius)
/**
 * method_5748
 */
fun Entity.getMaxAir() = this.method_5748()
/**
 * method_18380
 */
fun Entity.setPose(pose: EntityPose?) = this.method_18380(pose)
/**
 * method_5688
 */
fun Entity.interact(player: PlayerEntity?, hand: Hand?) = this.method_5688(player, hand)
/**
 * method_24203
 */
fun Entity.refreshPositionAfterTeleport(x: Double, arg1: Double, y: Double) = this.method_24203(x, arg1, y)
/**
 * method_52538
 */
fun Entity.getPassengerRidingPos(passenger: Entity?) = this.method_52538(passenger)
/**
 * method_29241
 */
fun Entity.getSwimHeight() = this.method_29241()
/**
 * method_43077
 */
fun Entity.playSoundIfNotSilent(event: SoundEvent?) = this.method_43077(event)
/**
 * method_54757
 */
fun Entity.getPlayerPassengers() = this.method_54757()
/**
 * method_5747
 */
fun Entity.handleFallDamage(fallDistance: Float, damageMultiplier: Float, damageSource: DamageSource?) = this.method_5747(fallDistance, damageMultiplier, damageSource)
/**
 * method_5870
 */
fun Entity.dropItem(world: ServerWorld?, item: ItemConvertible?, offsetY: Int) = this.method_5870(world, item, offsetY)
/**
 * method_61414
 */
fun Entity.getLerpedPitch(tickDelta: Float) = this.method_61414(tickDelta)
/**
 * method_18381
 */
fun Entity.getEyeHeight(pose: EntityPose?) = this.method_18381(pose)
/**
 * method_5879
 */
fun Entity.animateDamage(yaw: Float) = this.method_5879(yaw)
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
fun Entity.updatePositionAndAngles(x: Double, arg1: Double, y: Double, arg3: Float, z: Float) = this.method_5641(x, arg1, y, arg3, z)
/**
 * method_63615
 */
fun Entity.setPrevPositionAndAngles(pos: Vec3d?, yaw: Float, pitch: Float) = this.method_63615(pos, yaw, pitch)
/**
 * method_31476
 */
fun Entity.getChunkPos() = this.method_31476()
/**
 * method_5636
 */
fun Entity.setBodyYaw(bodyYaw: Float) = this.method_5636(bodyYaw)
/**
 * method_60491
 */
fun Entity.addVelocity(velocity: Vec3d?) = this.method_60491(velocity)
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
fun Entity.updateEventHandler(callback: BiConsumer<EntityGameEventHandler<*>, ServerWorld>?) = this.method_42147(callback)
/**
 * method_5721
 */
fun Entity.isTouchingWaterOrRain() = this.method_5721()
/**
 * method_5859
 */
fun Entity.requestTeleport(destX: Double, arg1: Double, destY: Double) = this.method_5859(destX, arg1, destY)
/**
 * method_60478
 */
fun Entity.getMovement() = this.method_60478()
/**
 * method_36971
 */
fun Entity.canModifyAt(world: ServerWorld?, pos: BlockPos?) = this.method_36971(world, pos)
/**
 * method_32313
 */
fun Entity.getFreezingScale() = this.method_32313()
/**
 * method_5706
 */
fun Entity.dropItem(world: ServerWorld?, item: ItemConvertible?) = this.method_5706(world, item)
/**
 * method_5685
 */
fun Entity.getPassengerList() = this.method_5685()
/**
 * method_43391
 */
fun Entity.updateTrackedPosition(x: Double, arg1: Double, y: Double) = this.method_43391(x, arg1, y)
/**
 * method_31479
 */
fun Entity.getBlockZ() = this.method_31479()
/**
 * method_5719
 */
fun Entity.copyPositionAndRotation(entity: Entity?) = this.method_5719(entity)
/**
 * method_5732
 */
fun Entity.isAttackable() = this.method_5732()
/**
 * method_5874
 */
fun Entity.onKilledOther(world: ServerWorld?, other: LivingEntity?) = this.method_5874(world, other)
/**
 * method_45319
 */
fun Entity.addVelocityInternal(velocity: Vec3d?) = this.method_45319(velocity)
/**
 * method_5804
 */
fun Entity.startRiding(entity: Entity?) = this.method_5804(entity)
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
fun Entity.isImmuneToExplosion(explosion: Explosion?) = this.method_5659(explosion)
/**
 * method_61415
 */
fun Entity.getLerpedYaw(tickDelta: Float) = this.method_61415(tickDelta)
/**
 * method_5711
 */
fun Entity.handleStatus(status: Byte) = this.method_5711(status)
/**
 * method_61411
 */
fun Entity.getLastRenderPos() = this.method_61411()
/**
 * method_5873
 */
fun Entity.startRiding(entity: Entity?, force: Boolean) = this.method_5873(entity, force)
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
fun Entity.setHeadYaw(headYaw: Float) = this.method_5847(headYaw)
/**
 * method_23324
 */
fun Entity.getBodyZ(widthScale: Double) = this.method_23324(widthScale)
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
fun Entity.onExplodedBy(entity: Entity?) = this.method_56918(entity)
/**
 * method_5844
 */
fun Entity.slowMovement(state: BlockState?, multiplier: Vec3d?) = this.method_5844(state, multiplier)
/**
 * method_56072
 */
fun Entity.getAttachments() = this.method_56072()
/**
 * method_64419
 */
fun Entity.serverDamage(source: DamageSource?, amount: Float) = this.method_64419(source, amount)
/**
 * method_36361
 */
fun Entity.isGlowingLocal() = this.method_36361()
/**
 * method_32316
 */
fun Entity.canFreeze() = this.method_32316()
/**
 * method_5702
 */
fun Entity.lookAt(anchorPoint: net.minecraft.class_2183.class_2184?, target: Vec3d?) = this.method_5702(anchorPoint, target)
/**
 * method_5855
 */
fun Entity.setAir(air: Int) = this.method_5855(air)
/**
 * method_23323
 */
fun Entity.getBodyY(heightScale: Double) = this.method_23323(heightScale)
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
fun Entity.setOnGround(onGround: Boolean) = this.method_24830(onGround)
/**
 * method_64397
 */
fun Entity.damage(world: ServerWorld?, source: DamageSource?, amount: Float) = this.method_64397(world, source, amount)
/**
 * method_56073
 */
fun Entity.setOnFireForTicks(ticks: Int) = this.method_56073(ticks)
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
fun Entity.setOnFireFor(seconds: Float) = this.method_5639(seconds)
/**
 * method_23322
 */
fun Entity.getParticleX(widthScale: Double) = this.method_23322(widthScale)
/**
 * method_23321
 */
fun Entity.getZ() = this.method_23321()
/**
 * method_5647
 */
fun Entity.writeNbt(nbt: NbtCompound?) = this.method_5647(nbt)
/**
 * method_5784
 */
fun Entity.move(type: MovementType?, movement: Vec3d?) = this.method_5784(type, movement)
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
fun Entity.dropStack(world: ServerWorld?, stack: ItemStack?) = this.method_5775(world, stack)
/**
 * method_5720
 */
fun Entity.getRotationVector() = this.method_5720()
/**
 * method_5649
 */
fun Entity.squaredDistanceTo(x: Double, arg1: Double, y: Double) = this.method_5649(x, arg1, y)
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
fun Entity.raycast(maxDistance: Double, arg1: Float, tickDelta: Boolean) = this.method_5745(maxDistance, arg1, tickDelta)
/**
 * method_20803
 */
fun Entity.setFireTicks(fireTicks: Int) = this.method_20803(fireTicks)
/**
 * method_5651
 */
fun Entity.readNbt(nbt: NbtCompound?) = this.method_5651(nbt)
/**
 * method_23327
 */
fun Entity.setPos(x: Double, arg1: Double, y: Double) = this.method_23327(x, arg1, y)
/**
 * method_5880
 */
fun Entity.setCustomNameVisible(visible: Boolean) = this.method_5880(visible)
/**
 * method_14245
 */
fun Entity.getWorldSpawnPos(world: ServerWorld?, basePos: BlockPos?) = this.method_14245(world, basePos)
/**
 * method_33574
 */
fun Entity.setPosition(pos: Vec3d?) = this.method_33574(pos)
/**
 * method_23316
 */
fun Entity.getBodyX(widthScale: Double) = this.method_23316(widthScale)
/**
 * method_5738
 */
fun Entity.removeCommandTag(tag: String?) = this.method_5738(tag)
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
fun Entity.getHandPosOffset(item: Item?) = this.method_40123(item)
/**
 * method_5682
 */
fun Entity.getServer() = this.method_5682()
/**
 * method_5662
 */
fun Entity.saveNbt(nbt: NbtCompound?) = this.method_5662(nbt)
/**
 * method_27298
 */
fun Entity.shouldSpawnSprintingParticles() = this.method_27298()
/**
 * method_5821
 */
fun Entity.hasPassengerDeep(passenger: Entity?) = this.method_5821(passenger)
/**
 * method_38785
 */
fun Entity.onLanding() = this.method_38785()
/**
 * method_56071
 */
fun Entity.getProjectileDeflection(projectile: ProjectileEntity?) = this.method_56071(projectile)
/**
 * method_5858
 */
fun Entity.squaredDistanceTo(entity: Entity?) = this.method_5858(entity)
/**
 * method_60490
 */
fun Entity.recalculateDimensions(previous: EntityDimensions?) = this.method_60490(previous)
/**
 * method_6034
 */
fun Entity.canMoveVoluntarily() = this.method_6034()
/**
 * method_5705
 */
fun Entity.getYaw(tickDelta: Float) = this.method_5705(tickDelta)
/**
 * method_5808
 */
fun Entity.refreshPositionAndAngles(x: Double, arg1: Double, y: Double, arg3: Float, z: Float) = this.method_5808(x, arg1, y, arg3, z)
/**
 * method_18382
 */
fun Entity.calculateDimensions() = this.method_18382()
/**
 * method_5786
 */
fun Entity.saveSelfNbt(nbt: NbtCompound?) = this.method_5786(nbt)
/**
 * method_60697
 */
fun Entity.tryUsePortal(portal: Portal?, pos: BlockPos?) = this.method_60697(portal, pos)
/**
 * method_5718
 */
fun Entity.getBrightnessAtEyes() = this.method_5718()
/**
 * method_5660
 */
fun Entity.setSneaking(sneaking: Boolean) = this.method_5660(sneaking)
/**
 * method_5684
 */
fun Entity.setInvulnerable(invulnerable: Boolean) = this.method_5684(invulnerable)
/**
 * method_18799
 */
fun Entity.setVelocity(velocity: Vec3d?) = this.method_18799(velocity)
/**
 * method_32317
 */
fun Entity.setFrozenTicks(frozenTicks: Int) = this.method_32317(frozenTicks)
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
fun Entity.hasPassenger(passenger: Entity?) = this.method_5626(passenger)
/**
 * method_5643
 */
fun Entity.clientDamage(source: DamageSource?) = this.method_5643(source)
/**
 * method_24829
 */
fun Entity.updatePassengerForDismount(passenger: LivingEntity?) = this.method_24829(passenger)
/**
 * method_51849
 */
fun Entity.isSupportedBy(pos: BlockPos?) = this.method_51849(pos)
/**
 * method_5722
 */
fun Entity.isTeammate(other: Entity?) = this.method_5722(other)
/**
 * method_23325
 */
fun Entity.getParticleZ(widthScale: Double) = this.method_23325(widthScale)
/**
 * method_24201
 */
fun Entity.updatePassengerPosition(passenger: Entity?) = this.method_24201(passenger)
/**
 * method_18002
 */
fun Entity.createSpawnPacket(entityTrackerEntry: EntityTrackerEntry?) = this.method_18002(entityTrackerEntry)
/**
 * method_56989
 */
fun Entity.getFinalGravity() = this.method_56989()
/**
 * method_30949
 */
fun Entity.collidesWith(other: Entity?) = this.method_30949(other)
/**
 * method_31166
 */
fun Entity.getClientCameraPosVec(tickDelta: Float) = this.method_31166(tickDelta)
/**
 * method_36454
 */
fun Entity.getYaw() = this.method_36454()
/**
 * method_64166
 */
fun Entity.tickBlockCollision(lastRenderPos: Vec3d?, pos: Vec3d?) = this.method_64166(lastRenderPos, pos)
/**
 * method_23319
 */
fun Entity.getRandomBodyY() = this.method_23319()
/**
 * method_60607
 */
fun Entity.setMovement(onGround: Boolean, horizontalCollision: Boolean, movement: Vec3d?) = this.method_60607(onGround, horizontalCollision, movement)
/**
 * method_33572
 */
fun Entity.setOnFire(onFire: Boolean) = this.method_33572(onFire)
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
fun Entity.setBoundingBox(boundingBox: Box?) = this.method_5857(boundingBox)
/**
 * method_5727
 */
fun Entity.shouldRender(cameraX: Double, arg1: Double, cameraY: Double) = this.method_5727(cameraX, arg1, cameraY)
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
fun Entity.setCustomName(name: Text?) = this.method_5665(name)
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
fun Entity.hasPassenger(predicate: Predicate<Entity>?) = this.method_5703(predicate)
/**
 * method_5742
 */
fun Entity.onStoppedTrackingBy(player: ServerPlayerEntity?) = this.method_5742(player)
/**
 * method_64168
 */
fun Entity.queueBlockCollisionCheck(oldPos: Vec3d?, newPos: Vec3d?) = this.method_64168(oldPos, newPos)
/**
 * method_5838
 */
fun Entity.setId(id: Int) = this.method_5838(id)
/**
 * method_32318
 */
fun Entity.getStackReference(mappedIndex: Int) = this.method_32318(mappedIndex)
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
fun Entity.setPosition(x: Double, arg1: Double, y: Double) = this.method_5814(x, arg1, y)
/**
 * method_5796
 */
fun Entity.setSwimming(swimming: Boolean) = this.method_5796(swimming)
/**
 * method_19538
 */
fun Entity.getPos() = this.method_19538()
/**
 * method_5756
 */
fun Entity.isInvisibleTo(player: PlayerEntity?) = this.method_5756(player)
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
fun Entity.getRotationVector(pitch: Float, yaw: Float) = this.method_5631(pitch, yaw)
/**
 * method_5739
 */
fun Entity.distanceTo(entity: Entity?) = this.method_5739(entity)
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
fun Entity.updateTrackedHeadRotation(yaw: Float, interpolationSteps: Int) = this.method_5683(yaw, interpolationSteps)
/**
 * method_43260
 */
fun Entity.getLandingPos() = this.method_43260()
/**
 * method_29495
 */
fun Entity.refreshPositionAfterTeleport(pos: Vec3d?) = this.method_29495(pos)
/**
 * method_21750
 */
fun Entity.bypassesLandingEffects() = this.method_21750()
/**
 * method_55668
 */
fun Entity.getVehicleAttachmentPos(vehicle: Entity?) = this.method_55668(vehicle)
/**
 * method_5837
 */
fun Entity.onStartedTrackingBy(player: ServerPlayerEntity?) = this.method_5837(player)
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
fun Entity.setPitch(pitch: Float) = this.method_36457(pitch)
/**
 * method_30634
 */
fun Entity.updatePosition(x: Double, arg1: Double, y: Double) = this.method_30634(x, arg1, y)
/**
 * method_5729
 */
fun Entity.setFlag(index: Int, value: Boolean) = this.method_5729(index, value)
/**
 * method_5725
 */
fun Entity.refreshPositionAndAngles(pos: BlockPos?, yaw: Float, pitch: Float) = this.method_5725(pos, yaw, pitch)
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
fun Entity.setNoGravity(noGravity: Boolean) = this.method_5875(noGravity)
/**
 * method_5644
 */
fun Entity.onPassengerLookAround(passenger: Entity?) = this.method_5644(passenger)
/**
 * method_33189
 */
fun Entity.occludeVibrationSignals() = this.method_33189()
/**
 * method_60950
 */
fun Entity.addPortalChunkTicketAt(pos: BlockPos?) = this.method_60950(pos)
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
fun Entity.canTeleportBetween(from: world_World?, to: world_World?) = this.method_61113(from, to)
/**
 * method_5699
 */
fun Entity.dropStack(world: ServerWorld?, stack: ItemStack?, yOffset: Float) = this.method_5699(world, stack, yOffset)
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
fun Entity.onRemove(reason: net.minecraft.class_1297.class_5529?) = this.method_64615(reason)
/**
 * method_22861
 */
fun Entity.getTeamColorValue() = this.method_22861()
/**
 * method_5671
 */
fun Entity.getCommandSource(world: ServerWorld?) = this.method_5671(world)
/**
 * method_5764
 */
fun Entity.onBubbleColumnCollision(drag: Boolean) = this.method_5764(drag)
/**
 * method_5783
 */
fun Entity.playSound(sound: SoundEvent?, volume: Float, pitch: Float) = this.method_5783(sound, volume, pitch)
/**
 * method_24828
 */
fun Entity.isOnGround() = this.method_24828()
/**
 * method_18377
 */
fun Entity.getDimensions(pose: EntityPose?) = this.method_18377(pose)
/**
 * method_36456
 */
fun Entity.setYaw(yaw: Float) = this.method_36456(yaw)
/**
 * method_18864
 */
fun Entity.getOppositeRotationVector(tickDelta: Float) = this.method_18864(tickDelta)
/**
 * method_5809
 */
fun Entity.isOnFire() = this.method_5809()
/**
 * method_51850
 */
fun Entity.setPortalCooldown(portalCooldown: Int) = this.method_51850(portalCooldown)
/**
 * method_49476
 */
fun Entity.getStepHeight() = this.method_49476()
/**
 * method_5819
 */
fun Entity.populateCrashReport(section: CrashReportSection?) = this.method_5819(section)
/**
 * method_30950
 */
fun Entity.getLerpedPos(delta: Float) = this.method_30950(delta)
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
fun Entity.refreshPositionAndAngles(pos: Vec3d?, yaw: Float, pitch: Float) = this.method_60949(pos, yaw, pitch)
/**
 * method_5774
 */
fun Entity.getEffectiveExplosionResistance(explosion: Explosion?, world: BlockView?, pos: BlockPos?, blockState: BlockState?, fluidState: FluidState?, max: Float) = this.method_5774(explosion, world, pos, blockState, fluidState, max)
/**
 * method_48155
 */
fun Entity.canSprintAsVehicle() = this.method_48155()
/**
 * method_5826
 */
fun Entity.setUuid(uuid: UUID?) = this.method_5826(uuid)
/**
 * method_64610
 */
fun Entity.resetLerp() = this.method_64610()
/**
 * method_5878
 */
fun Entity.copyFrom(original: Entity?) = this.method_5878(original)
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
fun Entity.onStruckByLightning(world: ServerWorld?, lightning: LightningEntity?) = this.method_5800(world, lightning)
/**
 * method_5724
 */
fun Entity.updateVelocity(speed: Float, movementInput: Vec3d?) = this.method_5724(speed, movementInput)
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
fun Entity.setPosition(pos: PlayerPosition?, flags: Set<PositionFlag>?) = this.method_61412(pos, flags)
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
fun Entity.collidesWithStateAtPos(pos: BlockPos?, state: BlockState?) = this.method_30632(pos, state)
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
fun Entity.setInvisible(invisible: Boolean) = this.method_5648(invisible)
/**
 * method_21752
 */
fun Entity.isDescending() = this.method_21752()
/**
 * method_65942
 */
fun Entity.handleFall(xDifference: Double, arg1: Double, yDifference: Double, arg3: Boolean) = this.method_65942(xDifference, arg1, yDifference, arg3)
/**
 * method_18800
 */
fun Entity.setVelocity(x: Double, arg1: Double, y: Double) = this.method_18800(x, arg1, y)
/**
 * method_53829
 */
fun Entity.getLerpTargetPitch() = this.method_53829()
/**
 * method_5695
 */
fun Entity.getPitch(tickDelta: Float) = this.method_5695(tickDelta)
/**
 * method_29239
 */
fun Entity.dismountVehicle() = this.method_29239()
/**
 * method_32875
 */
fun Entity.emitGameEvent(event: RegistryEntry<GameEvent>?, entity: Entity?) = this.method_32875(event, entity)
/**
 * method_5752
 */
fun Entity.getCommandTags() = this.method_5752()
/**
 * method_30951
 */
fun Entity.getLeashPos(delta: Float) = this.method_30951(delta)
/**
 * method_5779
 */
fun Entity.isPartOf(entity: Entity?) = this.method_5779(entity)
/**
 * method_5731
 */
fun Entity.teleportTo(teleportTarget: TeleportTarget?) = this.method_5731(teleportTarget)
/**
 * method_5642
 */
fun Entity.getControllingPassenger() = this.method_5642()
