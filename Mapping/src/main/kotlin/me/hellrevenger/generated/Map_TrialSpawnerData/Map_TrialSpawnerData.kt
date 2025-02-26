package me.hellrevenger.generated.Map_TrialSpawnerData
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_47369
 */
val KClass<TrialSpawnerData>.SPAWN_DATA_KEY by aliasStatic(TrialSpawnerData::field_47369)
/**
 * field_47370
 */
val KClass<TrialSpawnerData>.codec by aliasStatic(TrialSpawnerData::field_47370)
/**
 * method_55185
 */
fun TrialSpawnerData.canSpawnMore(arg0: ServerWorld, arg1: TrialSpawnerConfig, arg2: Int) = this.method_55185(arg0, arg1, arg2)
/**
 * method_55198
 */
fun TrialSpawnerData.isCooldownAtRepeating(arg0: ServerWorld, arg1: Float, arg2: Int) = this.method_55198(arg0, arg1, arg2)
/**
 * method_55195
 */
fun TrialSpawnerData.getAdditionalPlayers(arg0: BlockPos) = this.method_55195(arg0)
/**
 * method_55194
 */
fun TrialSpawnerData.getSpawnDataNbt(arg0: TrialSpawnerState) = this.method_55194(arg0)
/**
 * method_55184
 */
fun TrialSpawnerData.isCooldownPast(arg0: ServerWorld, arg1: Float, arg2: Int) = this.method_55184(arg0, arg1, arg2)
/**
 * method_58717
 */
fun TrialSpawnerData.resetAndClearMobs(arg0: TrialSpawnerLogic, arg1: ServerWorld) = this.method_58717(arg0, arg1)
/**
 * method_55200
 */
fun TrialSpawnerData.areMobsDead() = this.method_55200()
/**
 * method_55189
 */
fun TrialSpawnerData.setEntityType(arg0: TrialSpawnerLogic, arg1: Random, arg2: EntityType<*>) = this.method_55189(arg0, arg1, arg2)
/**
 * method_55197
 */
fun TrialSpawnerData.hasSpawnData(arg0: TrialSpawnerLogic, arg1: Random) = this.method_55197(arg0, arg1)
/**
 * method_55190
 */
fun TrialSpawnerData.setDisplayEntity(arg0: TrialSpawnerLogic, arg1: world_World, arg2: TrialSpawnerState) = this.method_55190(arg0, arg1, arg2)
/**
 * method_55192
 */
fun TrialSpawnerData.hasSpawnedAllMobs(arg0: TrialSpawnerConfig, arg1: Int) = this.method_55192(arg0, arg1)
/**
 * method_55186
 */
fun TrialSpawnerData.updatePlayers(arg0: ServerWorld, arg1: BlockPos, arg2: TrialSpawnerLogic) = this.method_55186(arg0, arg1, arg2)
/**
 * method_55202
 */
fun TrialSpawnerData.getDisplayEntityRotation() = this.method_55202()
/**
 * method_55182
 */
fun TrialSpawnerData.reset() = this.method_55182()
/**
 * method_55183
 */
fun TrialSpawnerData.isCooldownOver(arg0: ServerWorld) = this.method_55183(arg0)
/**
 * method_55204
 */
fun TrialSpawnerData.getLastDisplayEntityRotation() = this.method_55204()
