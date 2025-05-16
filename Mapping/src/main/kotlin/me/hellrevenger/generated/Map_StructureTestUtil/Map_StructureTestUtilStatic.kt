package me.hellrevenger.generated.Map_StructureTestUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object StructureTestUtilKt {
    /**
     * field_33173
     */
    val TEST_STRUCTURES_DIRECTORY_NAME by aliasStatic(StructureTestUtil::field_33173)
    /**
     * field_20579
     */
    val testStructuresDirectoryName by aliasStatic(StructureTestUtil::field_20579)
    /**
     * method_29409
     */
    fun getStructureBlockBox(pos: BlockPos?, relativePos: Vec3i?, rotation: BlockRotation?) = StructureTestUtil.method_29409(pos, relativePos, rotation)
    /**
     * method_22255
     */
    fun findNearestStructureBlock(pos: BlockPos?, radius: Int, world: ServerWorld?) = StructureTestUtil.method_22255(pos, radius, world)
    /**
     * method_22258
     */
    fun findStructureBlocks(pos: BlockPos?, radius: Int, world: ServerWorld?) = StructureTestUtil.method_22258(pos, radius, world)
    /**
     * method_59782
     */
    fun findStructureBlocks(pos: BlockPos?, radius: Int, world: ServerWorld?, templateName: String?) = StructureTestUtil.method_59782(pos, radius, world, templateName)
    /**
     * method_62774
     */
    fun getPlacementPos(state: GameTestState?, pos: BlockPos?, rotation: BlockRotation?, world: ServerWorld?) = StructureTestUtil.method_62774(state, pos, rotation, world)
    /**
     * method_56252
     */
    fun findTargetedStructureBlock(pos: BlockPos?, entity: Entity?, world: ServerWorld?) = StructureTestUtil.method_56252(pos, entity, world)
    /**
     * method_54849
     */
    fun getOrigin(structureBlockEntity: StructureBlockBlockEntity?) = StructureTestUtil.method_54849(structureBlockEntity)
    /**
     * method_54903
     */
    fun initStructure(state: GameTestState?, pos: BlockPos?, rotation: BlockRotation?, world: ServerWorld?) = StructureTestUtil.method_54903(state, pos, rotation, world)
    /**
     * method_29410
     */
    fun getStructureBlockBox(structureBlockEntity: StructureBlockBlockEntity?) = StructureTestUtil.method_29410(structureBlockEntity)
    /**
     * method_57102
     */
    fun placeBarrierBox(box: Box?, world: ServerWorld?, noSkyAccess: Boolean) = StructureTestUtil.method_57102(box, world, noSkyAccess)
    /**
     * method_54847
     */
    fun getStructureBlockBoxCornerPos(pos: BlockPos?, size: Vec3i?, rotation: BlockRotation?) = StructureTestUtil.method_54847(pos, size, rotation)
    /**
     * method_57101
     */
    fun clearBarrierBox(box: Box?, world: ServerWorld?) = StructureTestUtil.method_57101(box, world)
    /**
     * method_22246
     */
    fun clearArea(area: BlockBox?, world: ServerWorld?) = StructureTestUtil.method_22246(area, world)
    /**
     * method_22244
     */
    fun findContainingStructureBlock(pos: BlockPos?, radius: Int, world: ServerWorld?) = StructureTestUtil.method_22244(pos, radius, world)
    /**
     * method_22251
     */
    fun createTestArea(testName: String?, pos: BlockPos?, relativePos: Vec3i?, rotation: BlockRotation?, world: ServerWorld?) = StructureTestUtil.method_22251(testName, pos, relativePos, rotation, world)
    /**
     * method_22242
     */
    fun getStructureBoundingBox(structureBlockEntity: StructureBlockBlockEntity?) = StructureTestUtil.method_22242(structureBlockEntity)
    /**
     * method_29408
     */
    fun getRotation(steps: Int) = StructureTestUtil.method_29408(steps)
    /**
     * method_36105
     */
    fun getRotationSteps(rotation: BlockRotation?) = StructureTestUtil.method_36105(rotation)
    /**
     * method_22248
     */
    fun placeStartButton(pos: BlockPos?, relativePos: BlockPos?, rotation: BlockRotation?, world: ServerWorld?) = StructureTestUtil.method_22248(pos, relativePos, rotation, world)
}