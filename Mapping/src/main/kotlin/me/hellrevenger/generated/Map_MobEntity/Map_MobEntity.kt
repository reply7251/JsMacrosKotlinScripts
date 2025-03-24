package me.hellrevenger.generated.Map_MobEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30084
 */
val KClass<MobEntity>.BASE_ENCHANTED_ARMOR_CHANCE by aliasStatic(MobEntity::field_30084)
/**
 * field_30085
 */
val KClass<MobEntity>.BASE_ENCHANTED_MAIN_HAND_EQUIPMENT_CHANCE by aliasStatic(MobEntity::field_30085)
/**
 * field_6191
 */
var MobEntity.ambientSoundChance by alias(MobEntity::field_6191)
/**
 * field_30083
 */
val KClass<MobEntity>.DEFAULT_CAN_PICKUP_LOOT_CHANCE by aliasStatic(MobEntity::field_30083)
/**
 * field_30091
 */
val KClass<MobEntity>.BASE_SPAWN_EQUIPMENT_CHANCE by aliasStatic(MobEntity::field_30091)
/**
 * field_34043
 */
val KClass<MobEntity>.DEFAULT_DROP_CHANCE by aliasStatic(MobEntity::field_34043)
/**
 * method_5966
 */
fun MobEntity.playAmbientSound() = this.method_5966()
/**
 * method_63631
 */
fun <T>MobEntity.convertTo(arg0: EntityType<T>, arg1: EntityConversionContext, arg2: SpawnReason, arg3: net.minecraft.class_10179.class_10180<T>) where T: MobEntity = this.method_63631<T>(arg0, arg1, arg2, arg3)
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
fun MobEntity.dropEquipment(arg0: ServerWorld, arg1: Predicate<ItemStack>) = this.method_60972(arg0, arg1)
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
fun MobEntity.canUseRangedWeapon(arg0: RangedWeaponItem) = this.method_25938(arg0)
/**
 * method_18411
 */
fun MobEntity.isInWalkTargetRange() = this.method_18411()
/**
 * method_5976
 */
fun MobEntity.setUpwardSpeed(arg0: Float) = this.method_5976(arg0)
/**
 * method_5941
 */
fun MobEntity.setPathfindingPenalty(arg0: PathNodeType, arg1: Float) = this.method_5941(arg0, arg1)
/**
 * method_5969
 */
fun MobEntity.spawnsTooManyForEachTry(arg0: Int) = this.method_5969(arg0)
/**
 * method_5957
 */
fun MobEntity.canSpawn(arg0: WorldView) = this.method_5957(arg0)
/**
 * method_47825
 */
fun MobEntity.clearGoals(arg0: Predicate<Goal>) = this.method_47825(arg0)
/**
 * method_18407
 */
fun MobEntity.isInWalkTargetRange(arg0: BlockPos) = this.method_18407(arg0)
/**
 * method_5948
 */
fun KClass<MobEntity>.getEquipmentForSlot(arg0: EquipmentSlot, arg1: Int) = MobEntity.method_5948(arg0, arg1)
/**
 * method_63635
 */
fun MobEntity.getArmorDropChances() = this.method_63635()
/**
 * method_20636
 */
fun KClass<MobEntity>.canMobSpawn(arg0: EntityType<out MobEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = MobEntity.method_20636(arg0, arg1, arg2, arg3, arg4)
/**
 * method_35056
 */
fun MobEntity.clearGoalsAndTasks() = this.method_35056()
/**
 * method_58634
 */
fun MobEntity.setEquipmentFromTable(arg0: EquipmentTable) = this.method_58634(arg0)
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
fun MobEntity.setBaby(arg0: Boolean) = this.method_7217(arg0)
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
 * method_26828
 */
fun KClass<MobEntity>.createMobAttributes() = MobEntity.method_26828()
/**
 * method_56678
 */
fun MobEntity.equipBodyArmor(arg0: ItemStack) = this.method_56678(arg0)
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
fun <T>MobEntity.convertTo(arg0: EntityType<T>, arg1: EntityConversionContext, arg2: net.minecraft.class_10179.class_10180<T>) where T: MobEntity = this.method_29243<T>(arg0, arg1, arg2)
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
fun MobEntity.setAiDisabled(arg0: Boolean) = this.method_5977(arg0)
/**
 * method_18408
 */
fun MobEntity.setPositionTarget(arg0: BlockPos, arg1: Int) = this.method_18408(arg0, arg1)
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
fun MobEntity.setLeftHanded(arg0: Boolean) = this.method_5937(arg0)
/**
 * method_35055
 */
fun MobEntity.clearPositionTarget() = this.method_35055()
/**
 * method_5974
 */
fun MobEntity.canImmediatelyDespawn(arg0: Double) = this.method_5974(arg0)
/**
 * method_19540
 */
fun MobEntity.setAttacking(arg0: Boolean) = this.method_19540(arg0)
/**
 * method_20820
 */
fun MobEntity.canGather(arg0: ServerWorld, arg1: ItemStack) = this.method_20820(arg0, arg1)
/**
 * method_5945
 */
fun MobEntity.getLimitPerChunk() = this.method_5945()
/**
 * method_59665
 */
fun MobEntity.setEquipmentFromTable(arg0: RegistryKey<LootTable>, arg1: Map<EquipmentSlot, Float>) = this.method_59665(arg0, arg1)
/**
 * method_5952
 */
fun MobEntity.setCanPickUpLoot(arg0: Boolean) = this.method_5952(arg0)
/**
 * method_5939
 */
fun MobEntity.canPickupItem(arg0: ItemStack) = this.method_5939(arg0)
/**
 * method_55695
 */
fun MobEntity.stopMovement() = this.method_55695()
/**
 * method_5951
 */
fun MobEntity.lookAtEntity(arg0: Entity, arg1: Float, arg2: Float) = this.method_5951(arg0, arg1, arg2)
/**
 * method_25939
 */
fun MobEntity.updateDropChances(arg0: EquipmentSlot) = this.method_25939(arg0)
/**
 * method_26320
 */
fun MobEntity.prefersNewDamageableItem(arg0: ItemStack, arg1: ItemStack) = this.method_26320(arg0, arg1)
/**
 * method_60973
 */
fun MobEntity.dropAllEquipment(arg0: ServerWorld) = this.method_60973(arg0)
/**
 * method_5979
 */
fun MobEntity.canSpawn(arg0: WorldAccess, arg1: SpawnReason) = this.method_5979(arg0, arg1)
/**
 * method_5980
 */
fun MobEntity.setTarget(arg0: LivingEntity) = this.method_5980(arg0)
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
fun MobEntity.tryEquip(arg0: ServerWorld, arg1: ItemStack) = this.method_24523(arg0, arg1)
/**
 * method_5930
 */
fun MobEntity.setForwardSpeed(arg0: Float) = this.method_5930(arg0)
/**
 * method_5944
 */
fun MobEntity.getPathfindingPenalty(arg0: PathNodeType) = this.method_5944(arg0)
/**
 * method_5938
 */
fun MobEntity.setSidewaysSpeed(arg0: Float) = this.method_5938(arg0)
/**
 * method_65345
 */
fun MobEntity.getPreferredWeapons() = this.method_65345()
/**
 * method_42150
 */
fun MobEntity.isInAttackRange(arg0: LivingEntity) = this.method_42150(arg0)
/**
 * method_5943
 */
fun MobEntity.initialize(arg0: ServerWorldAccess, arg1: LocalDifficulty, arg2: SpawnReason, arg3: EntityData) = this.method_5943(arg0, arg1, arg2, arg3)
