package me.hellrevenger.generated.Map_GoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_30402
 */
val KClass<GoatEntity>.FALL_DAMAGE_SUBTRACTOR by aliasStatic(GoatEntity::field_30402)
/**
 * field_30403
 */
val KClass<GoatEntity>.SCREAMING_CHANCE by aliasStatic(GoatEntity::field_30403)
/**
 * field_30399
 */
val KClass<GoatEntity>.LONG_JUMPING_DIMENSIONS by aliasStatic(GoatEntity::field_30399)
/**
 * method_35177
 */
fun GoatEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_35177(arg0, arg1)
/**
 * method_38067
 */
fun KClass<GoatEntity>.canSpawn(arg0: EntityType<out AnimalEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = GoatEntity.method_38067(arg0, arg1, arg2, arg3, arg4)
/**
 * method_43539
 */
fun GoatEntity.hasRightHorn() = this.method_43539()
/**
 * method_43538
 */
fun GoatEntity.hasLeftHorn() = this.method_43538()
/**
 * method_35178
 */
fun GoatEntity.isScreaming() = this.method_35178()
/**
 * method_36283
 */
fun GoatEntity.getHeadPitch() = this.method_36283()
/**
 * method_43542
 */
fun GoatEntity.removeHorns() = this.method_43542()
/**
 * method_43541
 */
fun GoatEntity.addHorns() = this.method_43541()
/**
 * method_36284
 */
fun GoatEntity.setScreaming(arg0: Boolean) = this.method_36284(arg0)
/**
 * method_43540
 */
fun GoatEntity.dropHorn() = this.method_43540()
/**
 * method_35179
 */
fun KClass<GoatEntity>.createGoatAttributes() = GoatEntity.method_35179()
/**
 * method_43690
 */
fun GoatEntity.getGoatHornStack() = this.method_43690()
