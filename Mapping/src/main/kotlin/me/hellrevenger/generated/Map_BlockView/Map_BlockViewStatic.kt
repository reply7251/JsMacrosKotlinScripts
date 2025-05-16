package me.hellrevenger.generated.Map_BlockView
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockViewKt {
    /**
     * method_61714
     */
    fun collectCollisionsBetween(oldPos: Vec3d?, newPos: Vec3d?, boundingBox: Box?) = BlockView.method_61714(oldPos, newPos, boundingBox)
    /**
     * method_17744
     */
    fun <T, C>raycast(start: Vec3d?, end: Vec3d?, context: C, blockHitFactory: BiFunction<C, BlockPos, T>?, missFactory: function_Function<C, T>?) = BlockView.method_17744<T, C>(start, end, context, blockHitFactory, missFactory)
}