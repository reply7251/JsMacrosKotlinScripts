package me.hellrevenger.generated.Map_FuzzyPositions
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FuzzyPositionsKt {
    /**
     * method_31543
     */
    fun guessBest(factory: Supplier<BlockPos>, scorer: ToDoubleFunction<BlockPos>) = FuzzyPositions.method_31543(factory, scorer)
    /**
     * method_31538
     */
    fun guessBestPathTarget(entity: PathAwareEntity, factory: Supplier<BlockPos>) = FuzzyPositions.method_31538(entity, factory)
    /**
     * method_31540
     */
    fun upWhile(pos: BlockPos, maxY: Int, condition: Predicate<BlockPos>) = FuzzyPositions.method_31540(pos, maxY, condition)
    /**
     * method_31539
     */
    fun upWhile(pos: BlockPos, extraAbove: Int, max: Int, condition: Predicate<BlockPos>) = FuzzyPositions.method_31539(pos, extraAbove, max, condition)
    /**
     * method_31537
     */
    fun towardTarget(entity: PathAwareEntity, horizontalRange: Int, random: Random, fuzz: BlockPos) = FuzzyPositions.method_31537(entity, horizontalRange, random, fuzz)
    /**
     * method_31542
     */
    fun localFuzz(random: Random, horizontalRange: Int, verticalRange: Int, startHeight: Int, directionX: Double, arg5: Double, directionZ: Double) = FuzzyPositions.method_31542(random, horizontalRange, verticalRange, startHeight, directionX, arg5, directionZ)
    /**
     * method_31541
     */
    fun localFuzz(random: Random, horizontalRange: Int, verticalRange: Int) = FuzzyPositions.method_31541(random, horizontalRange, verticalRange)
}