package me.hellrevenger.generated.Map_FuzzyTargeting
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FuzzyTargetingKt {
    /**
     * method_31533
     */
    fun validate(entity: PathAwareEntity, pos: BlockPos) = FuzzyTargeting.method_31533(entity, pos)
    /**
     * method_31528
     */
    fun findTo(entity: PathAwareEntity, horizontalRange: Int, verticalRange: Int, end: Vec3d) = FuzzyTargeting.method_31528(entity, horizontalRange, verticalRange, end)
    /**
     * method_31534
     */
    fun findFrom(entity: PathAwareEntity, horizontalRange: Int, verticalRange: Int, start: Vec3d) = FuzzyTargeting.method_31534(entity, horizontalRange, verticalRange, start)
    /**
     * method_31532
     */
    fun towardTarget(entity: PathAwareEntity, horizontalRange: Int, posTargetInRange: Boolean, relativeInRangePos: BlockPos) = FuzzyTargeting.method_31532(entity, horizontalRange, posTargetInRange, relativeInRangePos)
    /**
     * method_31530
     */
    fun find(entity: PathAwareEntity, horizontalRange: Int, verticalRange: Int, scorer: ToDoubleFunction<BlockPos>) = FuzzyTargeting.method_31530(entity, horizontalRange, verticalRange, scorer)
}