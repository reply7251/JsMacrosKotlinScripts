package me.hellrevenger.generated.Map_NavigationConditions
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NavigationConditionsKt {
    /**
     * method_31519
     */
    fun isInvalidPosition(navigation: EntityNavigation?, pos: BlockPos?) = NavigationConditions.method_31519(navigation, pos)
    /**
     * method_30955
     */
    fun hasMobNavigation(entity: MobEntity?) = NavigationConditions.method_30955(entity)
    /**
     * method_31518
     */
    fun isWaterAt(entity: PathAwareEntity?, pos: BlockPos?) = NavigationConditions.method_31518(entity, pos)
    /**
     * method_31520
     */
    fun isHeightInvalid(pos: BlockPos?, entity: PathAwareEntity?) = NavigationConditions.method_31520(pos, entity)
    /**
     * method_31522
     */
    fun hasPathfindingPenalty(entity: PathAwareEntity?, pos: BlockPos?) = NavigationConditions.method_31522(entity, pos)
    /**
     * method_31517
     */
    fun isPositionTargetInRange(entity: PathAwareEntity?, extraDistance: Int) = NavigationConditions.method_31517(entity, extraDistance)
    /**
     * method_31521
     */
    fun isPositionTargetOutOfWalkRange(posTargetInRange: Boolean, entity: PathAwareEntity?, pos: BlockPos?) = NavigationConditions.method_31521(posTargetInRange, entity, pos)
    /**
     * method_31523
     */
    fun isSolidAt(entity: PathAwareEntity?, pos: BlockPos?) = NavigationConditions.method_31523(entity, pos)
}