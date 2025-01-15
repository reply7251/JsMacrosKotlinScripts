package me.hellrevenger.generated.Map_CollisionView
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun CollisionView.getBlockCollisions(arg0: Entity, arg1: Box) = this.method_20812(arg0, arg1)
fun CollisionView.canCollide(arg0: Entity, arg1: Box) = this.method_39454(arg0, arg1)
fun CollisionView.getWorldBorder() = this.method_8621()
fun CollisionView.getEntityCollisions(arg0: Entity, arg1: Box) = this.method_20743(arg0, arg1)
fun CollisionView.isSpaceEmpty(arg0: Entity) = this.method_17892(arg0)
fun CollisionView.canPlace(arg0: BlockState, arg1: BlockPos, arg2: ShapeContext) = this.method_8628(arg0, arg1, arg2)
fun CollisionView.findClosestCollision(arg0: Entity, arg1: VoxelShape, arg2: Vec3d, arg3: Double, arg4: Double, arg5: Double) = this.method_33594(arg0, arg1, arg2, arg3, arg4, arg5)
fun CollisionView.isSpaceEmpty(arg0: Box) = this.method_18026(arg0)
fun CollisionView.doesNotIntersectEntities(arg0: Entity) = this.method_8606(arg0)
fun CollisionView.doesNotIntersectEntities(arg0: Entity, arg1: VoxelShape) = this.method_8611(arg0, arg1)
fun CollisionView.isBlockSpaceEmpty(arg0: Entity, arg1: Box) = this.method_52569(arg0, arg1)
fun CollisionView.findSupportingBlockPos(arg0: Entity, arg1: Box) = this.method_51718(arg0, arg1)
fun CollisionView.getCollisions(arg0: Entity, arg1: Box) = this.method_8600(arg0, arg1)
fun CollisionView.getChunkAsView(arg0: Int, arg1: Int) = this.method_22338(arg0, arg1)
fun CollisionView.isSpaceEmpty(arg0: Entity, arg1: Box) = this.method_8587(arg0, arg1)
