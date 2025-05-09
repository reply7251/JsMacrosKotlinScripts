package me.hellrevenger.generated.Map_CollisionView
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_20812
 */
fun CollisionView.getBlockCollisions(entity: Entity, box: Box) = this.method_20812(entity, box)
/**
 * method_39454
 */
fun CollisionView.canCollide(entity: Entity, box: Box) = this.method_39454(entity, box)
/**
 * method_8628
 */
fun CollisionView.canPlace(state: BlockState, pos: BlockPos, context: ShapeContext) = this.method_8628(state, pos, context)
/**
 * method_18026
 */
fun CollisionView.isSpaceEmpty(box: Box) = this.method_18026(box)
/**
 * method_61716
 */
fun CollisionView.isSpaceEmpty(entity: Entity, box: Box, checkFluid: Boolean) = this.method_61716(entity, box, checkFluid)
/**
 * method_61717
 */
fun CollisionView.getCollisionsIncludingWorldBorder(context: RaycastContext) = this.method_61717(context)
/**
 * method_8611
 */
fun CollisionView.doesNotIntersectEntities(except: Entity, shape: VoxelShape) = this.method_8611(except, shape)
/**
 * method_52569
 */
fun CollisionView.isBlockSpaceEmpty(entity: Entity, box: Box) = this.method_52569(entity, box)
/**
 * method_22338
 */
fun CollisionView.getChunkAsView(chunkX: Int, chunkZ: Int) = this.method_22338(chunkX, chunkZ)
/**
 * method_8587
 */
fun CollisionView.isSpaceEmpty(entity: Entity, box: Box) = this.method_8587(entity, box)
/**
 * method_8621
 */
fun CollisionView.getWorldBorder() = this.method_8621()
/**
 * method_20743
 */
fun CollisionView.getEntityCollisions(entity: Entity, box: Box) = this.method_20743(entity, box)
/**
 * method_17892
 */
fun CollisionView.isSpaceEmpty(entity: Entity) = this.method_17892(entity)
/**
 * method_33594
 */
fun CollisionView.findClosestCollision(entity: Entity, shape: VoxelShape, target: Vec3d, x: Double, arg4: Double, y: Double) = this.method_33594(entity, shape, target, x, arg4, y)
/**
 * method_8606
 */
fun CollisionView.doesNotIntersectEntities(entity: Entity) = this.method_8606(entity)
/**
 * method_61719
 */
fun CollisionView.getBlockOrFluidCollisions(entity: Entity, box: Box) = this.method_61719(entity, box)
/**
 * method_51718
 */
fun CollisionView.findSupportingBlockPos(entity: Entity, box: Box) = this.method_51718(entity, box)
/**
 * method_8600
 */
fun CollisionView.getCollisions(entity: Entity, box: Box) = this.method_8600(entity, box)
