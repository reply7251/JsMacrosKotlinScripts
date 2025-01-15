package me.hellrevenger.generated.Map_GoatEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<GoatEntity>.FALL_DAMAGE_SUBTRACTOR by aliasStatic(GoatEntity::field_30402)
val KClass<GoatEntity>.SCREAMING_CHANCE by aliasStatic(GoatEntity::field_30403)
val KClass<GoatEntity>.LONG_JUMPING_DIMENSIONS by aliasStatic(GoatEntity::field_30399)
fun GoatEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_35177(arg0, arg1)
fun KClass<GoatEntity>.canSpawn(arg0: EntityType<out AnimalEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = GoatEntity.method_38067(arg0, arg1, arg2, arg3, arg4)
fun GoatEntity.hasRightHorn() = this.method_43539()
fun GoatEntity.hasLeftHorn() = this.method_43538()
fun GoatEntity.isScreaming() = this.method_35178()
fun GoatEntity.getHeadPitch() = this.method_36283()
fun GoatEntity.removeHorns() = this.method_43542()
fun GoatEntity.addHorns() = this.method_43541()
fun GoatEntity.setScreaming(arg0: Boolean) = this.method_36284(arg0)
fun GoatEntity.dropHorn() = this.method_43540()
fun KClass<GoatEntity>.createGoatAttributes() = GoatEntity.method_35179()
fun GoatEntity.getGoatHornStack() = this.method_43690()
