package me.hellrevenger.generated.Map_StructureTemplate
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StructureTemplateKt {
    /**
     * field_31696
     */
    val ENTITIES_NBT_KEY by aliasStatic(StructureTemplate::field_31696)
    /**
     * field_31688
     */
    val PALETTES_KEY by aliasStatic(StructureTemplate::field_31688)
    /**
     * field_31692
     */
    val BLOCKS_STATE_KEY by aliasStatic(StructureTemplate::field_31692)
    /**
     * field_31695
     */
    val ENTITIES_BLOCK_POS_KEY by aliasStatic(StructureTemplate::field_31695)
    /**
     * field_31687
     */
    val PALETTE_KEY by aliasStatic(StructureTemplate::field_31687)
    /**
     * field_31691
     */
    val BLOCKS_POS_KEY by aliasStatic(StructureTemplate::field_31691)
    /**
     * field_31694
     */
    val ENTITIES_POS_KEY by aliasStatic(StructureTemplate::field_31694)
    /**
     * field_31690
     */
    val BLOCKS_KEY by aliasStatic(StructureTemplate::field_31690)
    /**
     * field_31697
     */
    val SIZE_KEY by aliasStatic(StructureTemplate::field_31697)
    /**
     * field_31689
     */
    val ENTITIES_KEY by aliasStatic(StructureTemplate::field_31689)
    /**
     * field_31693
     */
    val BLOCKS_NBT_KEY by aliasStatic(StructureTemplate::field_31693)
    /**
     * method_15176
     */
    fun transformAround(point: Vec3d?, mirror: BlockMirror?, rotation: BlockRotation?, pivot: BlockPos?) = StructureTemplate.method_15176(point, mirror, rotation, pivot)
    /**
     * method_15168
     */
    fun transformAround(pos: BlockPos?, mirror: BlockMirror?, rotation: BlockRotation?, pivot: BlockPos?) = StructureTemplate.method_15168(pos, mirror, rotation, pivot)
    /**
     * method_20532
     */
    fun updateCorner(world: WorldAccess?, flags: Int, set: VoxelSet?, startX: Int, startY: Int, startZ: Int) = StructureTemplate.method_20532(world, flags, set, startX, startY, startZ)
    /**
     * method_16446
     */
    fun process(world: ServerWorldAccess?, pos: BlockPos?, pivot: BlockPos?, placementData: StructurePlacementData?, infos: MutableList<net.minecraft.class_3499.class_3501>?) = StructureTemplate.method_16446(world, pos, pivot, placementData, infos)
    /**
     * method_15171
     */
    fun transform(placementData: StructurePlacementData?, pos: BlockPos?) = StructureTemplate.method_15171(placementData, pos)
    /**
     * method_58190
     */
    fun updateCorner(world: WorldAccess?, flags: Int, set: VoxelSet?, startPos: BlockPos?) = StructureTemplate.method_58190(world, flags, set, startPos)
    /**
     * method_64823
     */
    fun readJoint(nbt: NbtCompound?, state: BlockState?) = StructureTemplate.method_64823(nbt, state)
    /**
     * method_15162
     */
    fun applyTransformedOffset(pos: BlockPos?, mirror: BlockMirror?, rotation: BlockRotation?, offsetX: Int, offsetZ: Int) = StructureTemplate.method_15162(pos, mirror, rotation, offsetX, offsetZ)
}