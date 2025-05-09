package me.hellrevenger.generated.Map_MobEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_6191
 */
var MobEntity.ambientSoundChance by alias(MobEntity::field_6191)
/**
 * method_5966
 */
fun MobEntity.playAmbientSound() = this.method_5966()
/**
 * method_63631
 */
fun <T>MobEntity.convertTo(entityType: EntityType<T>, context: EntityConversionContext, reason: SpawnReason, finalizer: net.minecraft.class_10179.class_10180<T>) where T: MobEntity = this.method_63631<T>(entityType, context, reason, finalizer)
/**
 * method_5942
 */
fun MobEntity.getNavigation() = this.method_5942()
/**
 * method_5970
 */
fun MobEntity.getMinAmbientSoundDelay() = this.method_5970()
/**
 * method_5962
 */
fun MobEntity.getMoveControl() = this.method_5962()
/**
 * method_5988
 */
fun MobEntity.getLookControl() = this.method_5988()
/**
 * method_5978
 */
fun MobEntity.getMaxLookPitchChange() = this.method_5978()
/**
 * method_60972
 */
fun MobEntity.dropEquipment(world: ServerWorld, dropPredicate: Predicate<ItemStack>) = this.method_60972(world, dropPredicate)
/**
 * method_18410
 */
fun MobEntity.hasPositionTarget() = this.method_18410()
/**
 * method_63634
 */
fun MobEntity.getHandDropChances() = this.method_63634()
/**
 * method_25938
 */
fun MobEntity.canUseRangedWeapon(weapon: RangedWeaponItem) = this.method_25938(weapon)
/**
 * method_18411
 */
fun MobEntity.isInWalkTargetRange() = this.method_18411()
/**
 * method_5976
 */
fun MobEntity.setUpwardSpeed(upwardSpeed: Float) = this.method_5976(upwardSpeed)
/**
 * method_5941
 */
fun MobEntity.setPathfindingPenalty(nodeType: PathNodeType, penalty: Float) = this.method_5941(nodeType, penalty)
/**
 * method_5969
 */
fun MobEntity.spawnsTooManyForEachTry(count: Int) = this.method_5969(count)
/**
 * method_5957
 */
fun MobEntity.canSpawn(world: WorldView) = this.method_5957(world)
/**
 * method_47825
 */
fun MobEntity.clearGoals(predicate: Predicate<Goal>) = this.method_47825(predicate)
/**
 * method_18407
 */
fun MobEntity.isInWalkTargetRange(pos: BlockPos) = this.method_18407(pos)
/**
 * method_63635
 */
fun MobEntity.getArmorDropChances() = this.method_63635()
/**
 * method_35056
 */
fun MobEntity.clearGoalsAndTasks() = this.method_35056()
/**
 * method_58634
 */
fun MobEntity.setEquipmentFromTable(equipmentTable: EquipmentTable) = this.method_58634(equipmentTable)
/**
 * method_56676
 */
fun MobEntity.getBodyArmor() = this.method_56676()
/**
 * method_20240
 */
fun MobEntity.getMaxLookYawChange() = this.method_20240()
/**
 * method_7217
 */
fun MobEntity.setBaby(baby: Boolean) = this.method_7217(baby)
/**
 * method_18413
 */
fun MobEntity.getPositionTargetRange() = this.method_18413()
/**
 * method_17326
 */
fun MobEntity.cannotDespawn() = this.method_17326()
/**
 * method_5993
 */
fun MobEntity.getJumpControl() = this.method_5993()
/**
 * method_56677
 */
fun MobEntity.isWearingBodyArmor() = this.method_56677()
/**
 * method_5987
 */
fun MobEntity.isAiDisabled() = this.method_5987()
/**
 * method_51504
 */
fun MobEntity.onStartPathfinding() = this.method_51504()
/**
 * method_5947
 */
fun MobEntity.isPersistent() = this.method_5947()
/**
 * method_56678
 */
fun MobEntity.equipBodyArmor(stack: ItemStack) = this.method_56678(stack)
/**
 * method_5990
 */
fun MobEntity.playSpawnEffects() = this.method_5990()
/**
 * method_51503
 */
fun MobEntity.onFinishPathfinding() = this.method_51503()
/**
 * method_6510
 */
fun MobEntity.isAttacking() = this.method_6510()
/**
 * method_29243
 */
fun <T>MobEntity.convertTo(entityType: EntityType<T>, context: EntityConversionContext, finalizer: net.minecraft.class_10179.class_10180<T>) where T: MobEntity = this.method_29243<T>(entityType, context, finalizer)
/**
 * method_5985
 */
fun MobEntity.getVisibilityCache() = this.method_5985()
/**
 * method_5986
 */
fun MobEntity.getMaxHeadRotation() = this.method_5986()
/**
 * method_5977
 */
fun MobEntity.setAiDisabled(aiDisabled: Boolean) = this.method_5977(aiDisabled)
/**
 * method_18408
 */
fun MobEntity.setPositionTarget(target: BlockPos, range: Int) = this.method_18408(target, range)
/**
 * method_5961
 */
fun MobEntity.isLeftHanded() = this.method_5961()
/**
 * method_18412
 */
fun MobEntity.getPositionTarget() = this.method_18412()
/**
 * method_5937
 */
fun MobEntity.setLeftHanded(leftHanded: Boolean) = this.method_5937(leftHanded)
/**
 * method_35055
 */
fun MobEntity.clearPositionTarget() = this.method_35055()
/**
 * method_5974
 */
fun MobEntity.canImmediatelyDespawn(distanceSquared: Double) = this.method_5974(distanceSquared)
/**
 * method_19540
 */
fun MobEntity.setAttacking(attacking: Boolean) = this.method_19540(attacking)
/**
 * method_20820
 */
fun MobEntity.canGather(world: ServerWorld, stack: ItemStack) = this.method_20820(world, stack)
/**
 * method_5945
 */
fun MobEntity.getLimitPerChunk() = this.method_5945()
/**
 * method_59665
 */
fun MobEntity.setEquipmentFromTable(lootTable: RegistryKey<LootTable>, slotDropChances: Map<EquipmentSlot, Float>) = this.method_59665(lootTable, slotDropChances)
/**
 * method_5952
 */
fun MobEntity.setCanPickUpLoot(canPickUpLoot: Boolean) = this.method_5952(canPickUpLoot)
/**
 * method_5939
 */
fun MobEntity.canPickupItem(stack: ItemStack) = this.method_5939(stack)
/**
 * method_55695
 */
fun MobEntity.stopMovement() = this.method_55695()
/**
 * method_5951
 */
fun MobEntity.lookAtEntity(targetEntity: Entity, maxYawChange: Float, maxPitchChange: Float) = this.method_5951(targetEntity, maxYawChange, maxPitchChange)
/**
 * method_25939
 */
fun MobEntity.updateDropChances(slot: EquipmentSlot) = this.method_25939(slot)
/**
 * method_26320
 */
fun MobEntity.prefersNewDamageableItem(newStack: ItemStack, oldStack: ItemStack) = this.method_26320(newStack, oldStack)
/**
 * method_60973
 */
fun MobEntity.dropAllEquipment(world: ServerWorld) = this.method_60973(world)
/**
 * method_5979
 */
fun MobEntity.canSpawn(world: WorldAccess, spawnReason: SpawnReason) = this.method_5979(world, spawnReason)
/**
 * method_5980
 */
fun MobEntity.setTarget(target: LivingEntity) = this.method_5980(target)
/**
 * method_5971
 */
fun MobEntity.setPersistent() = this.method_5971()
/**
 * method_5983
 */
fun MobEntity.onEatingGrass() = this.method_5983()
/**
 * method_24523
 */
fun MobEntity.tryEquip(world: ServerWorld, stack: ItemStack) = this.method_24523(world, stack)
/**
 * method_5930
 */
fun MobEntity.setForwardSpeed(forwardSpeed: Float) = this.method_5930(forwardSpeed)
/**
 * method_5944
 */
fun MobEntity.getPathfindingPenalty(nodeType: PathNodeType) = this.method_5944(nodeType)
/**
 * method_5938
 */
fun MobEntity.setSidewaysSpeed(sidewaysSpeed: Float) = this.method_5938(sidewaysSpeed)
/**
 * method_65345
 */
fun MobEntity.getPreferredWeapons() = this.method_65345()
/**
 * method_42150
 */
fun MobEntity.isInAttackRange(entity: LivingEntity) = this.method_42150(entity)
/**
 * method_5943
 */
fun MobEntity.initialize(world: ServerWorldAccess, difficulty: LocalDifficulty, spawnReason: SpawnReason, entityData: EntityData) = this.method_5943(world, difficulty, spawnReason, entityData)
