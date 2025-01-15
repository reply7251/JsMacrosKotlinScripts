package me.hellrevenger.generated.Map_CaveSurface
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<CaveSurface>.createHalfWithCeiling(arg0: Int) = CaveSurface.method_32981(arg0)
fun KClass<CaveSurface>.create(arg0: OptionalInt, arg1: OptionalInt) = CaveSurface.method_32984(arg0, arg1)
fun KClass<CaveSurface>.create(arg0: TestableWorld, arg1: BlockPos, arg2: Int, arg3: Predicate<BlockState>, arg4: Predicate<BlockState>) = CaveSurface.method_32982(arg0, arg1, arg2, arg3, arg4)
fun CaveSurface.withCeiling(arg0: OptionalInt) = this.method_35328(arg0)
fun KClass<CaveSurface>.createEmpty() = CaveSurface.method_32980()
fun KClass<CaveSurface>.createBounded(arg0: Int, arg1: Int) = CaveSurface.method_32986(arg0, arg1)
fun CaveSurface.withFloor(arg0: OptionalInt) = this.method_32983(arg0)
fun CaveSurface.getCeilingHeight() = this.method_32985()
fun CaveSurface.getFloorHeight() = this.method_32987()
fun CaveSurface.getOptionalHeight() = this.method_33385()
fun KClass<CaveSurface>.createHalfWithFloor(arg0: Int) = CaveSurface.method_32988(arg0)
