package me.hellrevenger.generated.Map_CaveSurface
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CaveSurfaceKt {
    /**
     * method_32981
     */
    fun createHalfWithCeiling(ceiling: Int) = CaveSurface.method_32981(ceiling)
    /**
     * method_32984
     */
    fun create(ceilingHeight: OptionalInt, floorHeight: OptionalInt) = CaveSurface.method_32984(ceilingHeight, floorHeight)
    /**
     * method_32982
     */
    fun create(world: TestableWorld, pos: BlockPos, height: Int, canGenerate: Predicate<BlockState>, canReplace: Predicate<BlockState>) = CaveSurface.method_32982(world, pos, height, canGenerate, canReplace)
    /**
     * method_32980
     */
    fun createEmpty() = CaveSurface.method_32980()
    /**
     * method_32986
     */
    fun createBounded(floor: Int, ceiling: Int) = CaveSurface.method_32986(floor, ceiling)
    /**
     * method_32988
     */
    fun createHalfWithFloor(floor: Int) = CaveSurface.method_32988(floor)
}