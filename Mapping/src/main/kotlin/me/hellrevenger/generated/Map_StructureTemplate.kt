package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructureTemplate

val StructureTemplate.ENTITIES_NBT_KEY by aliasStatic(StructureTemplate::field_31696)
val StructureTemplate.PALETTES_KEY by aliasStatic(StructureTemplate::field_31688)
val StructureTemplate.BLOCKS_STATE_KEY by aliasStatic(StructureTemplate::field_31692)
val StructureTemplate.ENTITIES_BLOCK_POS_KEY by aliasStatic(StructureTemplate::field_31695)
val StructureTemplate.PALETTE_KEY by aliasStatic(StructureTemplate::field_31687)
val StructureTemplate.BLOCKS_POS_KEY by aliasStatic(StructureTemplate::field_31691)
val StructureTemplate.ENTITIES_POS_KEY by aliasStatic(StructureTemplate::field_31694)
val StructureTemplate.BLOCKS_KEY by aliasStatic(StructureTemplate::field_31690)
val StructureTemplate.SIZE_KEY by aliasStatic(StructureTemplate::field_31697)
val StructureTemplate.ENTITIES_KEY by aliasStatic(StructureTemplate::field_31689)
val StructureTemplate.BLOCKS_NBT_KEY by aliasStatic(StructureTemplate::field_31693)
fun StructureTemplate.getRotatedSize(arg0: BlockRotation) = this.method_15166(arg0)
fun KClass<StructureTemplate>.transformAround(arg0: Vec3d, arg1: BlockMirror, arg2: BlockRotation, arg3: BlockPos) = StructureTemplate.method_15176(arg0, arg1, arg2, arg3)
fun KClass<StructureTemplate>.transformAround(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation, arg3: BlockPos) = StructureTemplate.method_15168(arg0, arg1, arg2, arg3)
fun StructureTemplate.calculateBoundingBox(arg0: StructurePlacementData, arg1: BlockPos) = this.method_16187(arg0, arg1)
fun StructureTemplate.saveFromWorld(arg0: world_World, arg1: BlockPos, arg2: Vec3i, arg3: Boolean, arg4: Block) = this.method_15174(arg0, arg1, arg2, arg3, arg4)
fun StructureTemplate.transformBox(arg0: StructurePlacementData, arg1: BlockPos, arg2: StructurePlacementData, arg3: BlockPos) = this.method_15180(arg0, arg1, arg2, arg3)
fun StructureTemplate.getInfosForBlock(arg0: BlockPos, arg1: StructurePlacementData, arg2: Block, arg3: Boolean) = this.method_15165(arg0, arg1, arg2, arg3)
fun StructureTemplate.place(arg0: ServerWorldAccess, arg1: BlockPos, arg2: BlockPos, arg3: StructurePlacementData, arg4: Random, arg5: Int) = this.method_15172(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<StructureTemplate>.updateCorner(arg0: WorldAccess, arg1: Int, arg2: VoxelSet, arg3: Int, arg4: Int, arg5: Int) = StructureTemplate.method_20532(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<StructureTemplate>.process(arg0: ServerWorldAccess, arg1: BlockPos, arg2: BlockPos, arg3: StructurePlacementData, arg4: List<net.minecraft.class_3499.class_3501>) = StructureTemplate.method_16446(arg0, arg1, arg2, arg3, arg4)
fun KClass<StructureTemplate>.transform(arg0: StructurePlacementData, arg1: BlockPos) = StructureTemplate.method_15171(arg0, arg1)
fun StructureTemplate.writeNbt(arg0: NbtCompound) = this.method_15175(arg0)
fun StructureTemplate.getInfosForBlock(arg0: BlockPos, arg1: StructurePlacementData, arg2: Block) = this.method_16445(arg0, arg1, arg2)
fun KClass<StructureTemplate>.updateCorner(arg0: WorldAccess, arg1: Int, arg2: VoxelSet, arg3: BlockPos) = StructureTemplate.method_58190(arg0, arg1, arg2, arg3)
fun StructureTemplate.offsetByTransformedSize(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation) = this.method_15167(arg0, arg1, arg2)
fun StructureTemplate.calculateBoundingBox(arg0: BlockPos, arg1: BlockRotation, arg2: BlockPos, arg3: BlockMirror) = this.method_27267(arg0, arg1, arg2, arg3)
fun StructureTemplate.readNbt(arg0: RegistryEntryLookup<Block>, arg1: NbtCompound) = this.method_15183(arg0, arg1)
fun StructureTemplate.setAuthor(arg0: String) = this.method_15161(arg0)
fun KClass<StructureTemplate>.applyTransformedOffset(arg0: BlockPos, arg1: BlockMirror, arg2: BlockRotation, arg3: Int, arg4: Int) = StructureTemplate.method_15162(arg0, arg1, arg2, arg3, arg4)
