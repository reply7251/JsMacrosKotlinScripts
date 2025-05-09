package me.hellrevenger.generated.Map_LandPathNodeMaker
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LandPathNodeMakerKt {
    /**
     * field_31809
     */
    val Y_OFFSET by aliasStatic(LandPathNodeMaker::field_31809)
    /**
     * method_57625
     */
    fun getLandNodeType(entity: MobEntity, pos: BlockPos) = LandPathNodeMaker.method_57625(entity, pos)
    /**
     * method_59
     */
    fun getNodeTypeFromNeighbors(context: PathContext, x: Int, y: Int, z: Int, fallback: PathNodeType) = LandPathNodeMaker.method_59(context, x, y, z, fallback)
    /**
     * method_60
     */
    fun getFeetY(world: BlockView, pos: BlockPos) = LandPathNodeMaker.method_60(world, pos)
    /**
     * method_23476
     */
    fun getLandNodeType(context: PathContext, pos: net.minecraft.class_2338.class_2339) = LandPathNodeMaker.method_23476(context, pos)
}