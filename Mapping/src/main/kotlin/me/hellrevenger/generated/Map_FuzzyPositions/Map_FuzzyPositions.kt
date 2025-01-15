package me.hellrevenger.generated.Map_FuzzyPositions
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<FuzzyPositions>.guessBest(arg0: Supplier<BlockPos>, arg1: ToDoubleFunction<BlockPos>) = FuzzyPositions.method_31543(arg0, arg1)
fun KClass<FuzzyPositions>.guessBestPathTarget(arg0: PathAwareEntity, arg1: Supplier<BlockPos>) = FuzzyPositions.method_31538(arg0, arg1)
fun KClass<FuzzyPositions>.upWhile(arg0: BlockPos, arg1: Int, arg2: Predicate<BlockPos>) = FuzzyPositions.method_31540(arg0, arg1, arg2)
fun KClass<FuzzyPositions>.upWhile(arg0: BlockPos, arg1: Int, arg2: Int, arg3: Predicate<BlockPos>) = FuzzyPositions.method_31539(arg0, arg1, arg2, arg3)
fun KClass<FuzzyPositions>.towardTarget(arg0: PathAwareEntity, arg1: Int, arg2: Random, arg3: BlockPos) = FuzzyPositions.method_31537(arg0, arg1, arg2, arg3)
fun KClass<FuzzyPositions>.localFuzz(arg0: Random, arg1: Int, arg2: Int, arg3: Int, arg4: Double, arg5: Double, arg6: Double) = FuzzyPositions.method_31542(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun KClass<FuzzyPositions>.localFuzz(arg0: Random, arg1: Int, arg2: Int) = FuzzyPositions.method_31541(arg0, arg1, arg2)
