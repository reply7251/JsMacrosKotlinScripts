package me.hellrevenger.generated.Map_WolfEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<WolfEntity>.FOLLOW_TAMED_PREDICATE by aliasStatic(WolfEntity::field_18004)
fun KClass<WolfEntity>.canSpawn(arg0: EntityType<WolfEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = WolfEntity.method_39450(arg0, arg1, arg2, arg3, arg4)
fun WolfEntity.createChild(arg0: ServerWorld, arg1: PassiveEntity) = this.method_6717(arg0, arg1)
fun WolfEntity.getShakeAnimationProgress(arg0: Float, arg1: Float) = this.method_6715(arg0, arg1)
fun WolfEntity.getVariant() = this.method_58062()
fun WolfEntity.setBegging(arg0: Boolean) = this.method_6712(arg0)
fun WolfEntity.getTextureId() = this.method_58061()
fun WolfEntity.isBegging() = this.method_6710()
fun WolfEntity.setVariant(arg0: RegistryEntry<WolfVariant>) = this.method_58063(arg0)
fun KClass<WolfEntity>.createWolfAttributes() = WolfEntity.method_26897()
fun WolfEntity.getTailAngle() = this.method_6714()
fun WolfEntity.getCollarColor() = this.method_6713()
fun WolfEntity.getFurWetBrightnessMultiplier(arg0: Float) = this.method_6707(arg0)
fun WolfEntity.isFurWet() = this.method_6711()
fun WolfEntity.getBegAnimationProgress(arg0: Float) = this.method_6719(arg0)
fun WolfEntity.hasArmor() = this.method_55710()
