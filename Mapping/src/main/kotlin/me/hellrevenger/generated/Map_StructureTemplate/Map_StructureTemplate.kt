package me.hellrevenger.generated.Map_StructureTemplate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_31696
 */
val KClass<StructureTemplate>.ENTITIES_NBT_KEY by aliasStatic(StructureTemplate::field_31696)
/**
 * field_31688
 */
val KClass<StructureTemplate>.PALETTES_KEY by aliasStatic(StructureTemplate::field_31688)
/**
 * field_31692
 */
val KClass<StructureTemplate>.BLOCKS_STATE_KEY by aliasStatic(StructureTemplate::field_31692)
/**
 * field_31695
 */
val KClass<StructureTemplate>.ENTITIES_BLOCK_POS_KEY by aliasStatic(StructureTemplate::field_31695)
/**
 * field_31687
 */
val KClass<StructureTemplate>.PALETTE_KEY by aliasStatic(StructureTemplate::field_31687)
/**
 * field_31691
 */
val KClass<StructureTemplate>.BLOCKS_POS_KEY by aliasStatic(StructureTemplate::field_31691)
/**
 * field_31694
 */
val KClass<StructureTemplate>.ENTITIES_POS_KEY by aliasStatic(StructureTemplate::field_31694)
/**
 * field_31690
 */
val KClass<StructureTemplate>.BLOCKS_KEY by aliasStatic(StructureTemplate::field_31690)
/**
 * field_31697
 */
val KClass<StructureTemplate>.SIZE_KEY by aliasStatic(StructureTemplate::field_31697)
/**
 * field_31689
 */
val KClass<StructureTemplate>.ENTITIES_KEY by aliasStatic(StructureTemplate::field_31689)
/**
 * field_31693
 */
val KClass<StructureTemplate>.BLOCKS_NBT_KEY by aliasStatic(StructureTemplate::field_31693)
/**
 * method_15166
 */
fun StructureTemplate.getRotatedSize(arg0: BlockRotation) = this.method_15166(arg0)
/**
 * method_15176
 */
fun KClass<StructureTemplate>.transformAround(arg0: Vec3d, arg1: BlockMirror, arg2: BlockRotation, arg3: BlockPos) = StructureTemplate.method_15176(arg0, arg1, arg2, arg3)
/**
 * method_15168
 */
fun KClass<StructureTemplate>.transformAround(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation, arg3: BlockPos) = StructureTemplate.method_15168(arg0, arg1, arg2, arg3)
/**
 * method_16187
 */
fun StructureTemplate.calculateBoundingBox(arg0: StructurePlacementData, arg1: BlockPos) = this.method_16187(arg0, arg1)
/**
 * method_15174
 */
fun StructureTemplate.saveFromWorld(arg0: world_World, arg1: BlockPos, arg2: Vec3i, arg3: Boolean, arg4: Block) = this.method_15174(arg0, arg1, arg2, arg3, arg4)
/**
 * method_15180
 */
fun StructureTemplate.transformBox(arg0: StructurePlacementData, arg1: BlockPos, arg2: StructurePlacementData, arg3: BlockPos) = this.method_15180(arg0, arg1, arg2, arg3)
/**
 * method_15165
 */
fun StructureTemplate.getInfosForBlock(arg0: BlockPos, arg1: StructurePlacementData, arg2: Block, arg3: Boolean) = this.method_15165(arg0, arg1, arg2, arg3)
/**
 * method_15172
 */
fun StructureTemplate.place(arg0: ServerWorldAccess, arg1: BlockPos, arg2: BlockPos, arg3: StructurePlacementData, arg4: Random, arg5: Int) = this.method_15172(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_20532
 */
fun KClass<StructureTemplate>.updateCorner(arg0: WorldAccess, arg1: Int, arg2: VoxelSet, arg3: Int, arg4: Int, arg5: Int) = StructureTemplate.method_20532(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_16446
 */
fun KClass<StructureTemplate>.process(arg0: ServerWorldAccess, arg1: BlockPos, arg2: BlockPos, arg3: StructurePlacementData, arg4: MutableList<net.minecraft.class_3499.class_3501>) = StructureTemplate.method_16446(arg0, arg1, arg2, arg3, arg4)
/**
 * method_15160
 */
fun StructureTemplate.getSize() = this.method_15160()
/**
 * method_15181
 */
fun StructureTemplate.getAuthor() = this.method_15181()
/**
 * method_15171
 */
fun KClass<StructureTemplate>.transform(arg0: StructurePlacementData, arg1: BlockPos) = StructureTemplate.method_15171(arg0, arg1)
/**
 * method_15175
 */
fun StructureTemplate.writeNbt(arg0: NbtCompound) = this.method_15175(arg0)
/**
 * method_16445
 */
fun StructureTemplate.getInfosForBlock(arg0: BlockPos, arg1: StructurePlacementData, arg2: Block) = this.method_16445(arg0, arg1, arg2)
/**
 * method_58190
 */
fun KClass<StructureTemplate>.updateCorner(arg0: WorldAccess, arg1: Int, arg2: VoxelSet, arg3: BlockPos) = StructureTemplate.method_58190(arg0, arg1, arg2, arg3)
/**
 * method_15167
 */
fun StructureTemplate.offsetByTransformedSize(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation) = this.method_15167(arg0, arg1, arg2)
/**
 * method_27267
 */
fun StructureTemplate.calculateBoundingBox(arg0: BlockPos, arg1: BlockRotation, arg2: BlockPos, arg3: BlockMirror) = this.method_27267(arg0, arg1, arg2, arg3)
/**
 * method_15183
 */
fun StructureTemplate.readNbt(arg0: RegistryEntryLookup<Block>, arg1: NbtCompound) = this.method_15183(arg0, arg1)
/**
 * method_15161
 */
fun StructureTemplate.setAuthor(arg0: String) = this.method_15161(arg0)
/**
 * method_15162
 */
fun KClass<StructureTemplate>.applyTransformedOffset(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation, arg3: Int, arg4: Int) = StructureTemplate.method_15162(arg0, arg1, arg2, arg3, arg4)
