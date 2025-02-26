package me.hellrevenger.generated.Map_ArmadilloEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_49082
 */
val ArmadilloEntity.scaredAnimationState by alias(ArmadilloEntity::field_49082)
/**
 * field_49081
 */
val ArmadilloEntity.rollingAnimationState by alias(ArmadilloEntity::field_49081)
/**
 * field_49080
 */
val ArmadilloEntity.unrollingAnimationState by alias(ArmadilloEntity::field_49080)
/**
 * method_55711
 */
fun ArmadilloEntity.isRolledUp() = this.method_55711()
/**
 * method_55723
 */
fun ArmadilloEntity.isNotIdle() = this.method_55723()
/**
 * method_55716
 */
fun ArmadilloEntity.brushScute() = this.method_55716()
/**
 * method_55722
 */
fun KClass<ArmadilloEntity>.createArmadilloAttributes() = ArmadilloEntity.method_55722()
/**
 * method_55714
 */
fun ArmadilloEntity.shouldSwitchToScaredState() = this.method_55714()
/**
 * method_55721
 */
fun ArmadilloEntity.isEntityThreatening(arg0: LivingEntity) = this.method_55721(arg0)
/**
 * method_55713
 */
fun ArmadilloEntity.setState(arg0: net.minecraft.class_9069.class_9070) = this.method_55713(arg0)
/**
 * method_56083
 */
fun KClass<ArmadilloEntity>.canSpawn(arg0: EntityType<ArmadilloEntity>, arg1: WorldAccess, arg2: SpawnReason, arg3: BlockPos, arg4: Random) = ArmadilloEntity.method_56083(arg0, arg1, arg2, arg3, arg4)
/**
 * method_55715
 */
fun ArmadilloEntity.startRolling() = this.method_55715()
/**
 * method_55717
 */
fun ArmadilloEntity.canRollUp() = this.method_55717()
/**
 * method_55724
 */
fun ArmadilloEntity.unroll() = this.method_55724()
/**
 * method_55718
 */
fun ArmadilloEntity.getState() = this.method_55718()
