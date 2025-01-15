package me.hellrevenger.generated.Map_NavigationConditions
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<NavigationConditions>.isInvalidPosition(arg0: EntityNavigation, arg1: BlockPos) = NavigationConditions.method_31519(arg0, arg1)
fun KClass<NavigationConditions>.hasMobNavigation(arg0: MobEntity) = NavigationConditions.method_30955(arg0)
fun KClass<NavigationConditions>.isWaterAt(arg0: PathAwareEntity, arg1: BlockPos) = NavigationConditions.method_31518(arg0, arg1)
fun KClass<NavigationConditions>.isHeightInvalid(arg0: BlockPos, arg1: PathAwareEntity) = NavigationConditions.method_31520(arg0, arg1)
fun KClass<NavigationConditions>.hasPathfindingPenalty(arg0: PathAwareEntity, arg1: BlockPos) = NavigationConditions.method_31522(arg0, arg1)
fun KClass<NavigationConditions>.isPositionTargetInRange(arg0: PathAwareEntity, arg1: Int) = NavigationConditions.method_31517(arg0, arg1)
fun KClass<NavigationConditions>.isPositionTargetOutOfWalkRange(arg0: Boolean, arg1: PathAwareEntity, arg2: BlockPos) = NavigationConditions.method_31521(arg0, arg1, arg2)
fun KClass<NavigationConditions>.isSolidAt(arg0: PathAwareEntity, arg1: BlockPos) = NavigationConditions.method_31523(arg0, arg1)
