package me.hellrevenger.generated.Map_Dismounting
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun KClass<Dismounting>.getCeilingHeight(arg0: BlockPos, arg1: Int, arg2: java.util.function.Function<BlockPos, VoxelShape>) = Dismounting.method_30343(arg0, arg1, arg2)
fun KClass<Dismounting>.canDismountInBlock(arg0: Double) = Dismounting.method_27932(arg0)
fun KClass<Dismounting>.getCollisionShape(arg0: BlockView, arg1: BlockPos) = Dismounting.method_30341(arg0, arg1)
fun KClass<Dismounting>.findRespawnPos(arg0: EntityType<*>, arg1: CollisionView, arg2: BlockPos, arg3: Boolean) = Dismounting.method_30769(arg0, arg1, arg2, arg3)
fun KClass<Dismounting>.canPlaceEntityAt(arg0: CollisionView, arg1: Vec3d, arg2: LivingEntity, arg3: EntityPose) = Dismounting.method_33353(arg0, arg1, arg2, arg3)
fun KClass<Dismounting>.canPlaceEntityAt(arg0: CollisionView, arg1: LivingEntity, arg2: Box) = Dismounting.method_27933(arg0, arg1, arg2)
fun KClass<Dismounting>.getDismountOffsets(arg0: Direction) = Dismounting.method_27934(arg0)
