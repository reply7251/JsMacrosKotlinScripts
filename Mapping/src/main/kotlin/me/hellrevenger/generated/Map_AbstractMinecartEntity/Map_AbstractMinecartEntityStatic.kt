package me.hellrevenger.generated.Map_AbstractMinecartEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object AbstractMinecartEntityKt {
    /**
     * method_61566
     */
    fun areMinecartImprovementsEnabled(world: world_World) = AbstractMinecartEntity.method_61566(world)
    /**
     * method_7523
     */
    fun <T>create(world: world_World, x: Double, arg2: Double, y: Double, arg4: EntityType<T>, z: SpawnReason, arg6: ItemStack, type: PlayerEntity) where T: AbstractMinecartEntity = AbstractMinecartEntity.method_7523<T>(world, x, arg2, y, arg4, z, arg6, type)
    /**
     * method_22864
     */
    fun getAdjacentRailPositionsByShape(shape: RailShape) = AbstractMinecartEntity.method_22864(shape)
}