package me.hellrevenger.generated.Map_Dismounting
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DismountingKt {
    /**
     * method_30343
     */
    fun getCeilingHeight(pos: BlockPos, maxDistance: Int, collisionShapeGetter: function_Function<BlockPos, VoxelShape>) = Dismounting.method_30343(pos, maxDistance, collisionShapeGetter)
    /**
     * method_27932
     */
    fun canDismountInBlock(height: Double) = Dismounting.method_27932(height)
    /**
     * method_30341
     */
    fun getCollisionShape(world: BlockView, pos: BlockPos) = Dismounting.method_30341(world, pos)
    /**
     * method_30769
     */
    fun findRespawnPos(entityType: EntityType<*>, world: CollisionView, pos: BlockPos, ignoreInvalidPos: Boolean) = Dismounting.method_30769(entityType, world, pos, ignoreInvalidPos)
    /**
     * method_33353
     */
    fun canPlaceEntityAt(world: CollisionView, offset: Vec3d, entity: LivingEntity, pose: EntityPose) = Dismounting.method_33353(world, offset, entity, pose)
    /**
     * method_27934
     */
    fun getDismountOffsets(movementDirection: Direction) = Dismounting.method_27934(movementDirection)
}