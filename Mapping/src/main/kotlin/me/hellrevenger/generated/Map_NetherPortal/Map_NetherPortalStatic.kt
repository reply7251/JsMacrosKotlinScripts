package me.hellrevenger.generated.Map_NetherPortal
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetherPortalKt {
    /**
     * field_31823
     */
    val MAX_WIDTH by aliasStatic(NetherPortal::field_31823)
    /**
     * field_31824
     */
    val MAX_HEIGHT by aliasStatic(NetherPortal::field_31824)
    /**
     * method_30486
     */
    fun getOrEmpty(world: WorldAccess?, pos: BlockPos?, validator: Predicate<NetherPortal>?, firstCheckedAxis: net.minecraft.class_2350.class_2351?) = NetherPortal.method_30486(world, pos, validator, firstCheckedAxis)
    /**
     * method_47382
     */
    fun findOpenPosition(fallback: Vec3d?, world: ServerWorld?, entity: Entity?, dimensions: EntityDimensions?) = NetherPortal.method_47382(fallback, world, entity, dimensions)
    /**
     * method_30494
     */
    fun entityPosInPortal(portalRect: net.minecraft.class_5459.class_5460?, portalAxis: net.minecraft.class_2350.class_2351?, entityPos: Vec3d?, entityDimensions: EntityDimensions?) = NetherPortal.method_30494(portalRect, portalAxis, entityPos, entityDimensions)
    /**
     * method_30485
     */
    fun getNewPortal(world: WorldAccess?, pos: BlockPos?, firstCheckedAxis: net.minecraft.class_2350.class_2351?) = NetherPortal.method_30485(world, pos, firstCheckedAxis)
    /**
     * method_64314
     */
    fun getOnAxis(world: BlockView?, pos: BlockPos?, axis: net.minecraft.class_2350.class_2351?) = NetherPortal.method_64314(world, pos, axis)
}