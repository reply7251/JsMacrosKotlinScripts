package me.hellrevenger.generated.Map_StructureTemplate
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_15166
 */
fun StructureTemplate.getRotatedSize(rotation: BlockRotation?) = this.method_15166(rotation)
/**
 * method_16187
 */
fun StructureTemplate.calculateBoundingBox(placementData: StructurePlacementData?, pos: BlockPos?) = this.method_16187(placementData, pos)
/**
 * method_64822
 */
fun StructureTemplate.getJigsawInfos(pos: BlockPos?, rotation: BlockRotation?) = this.method_64822(pos, rotation)
/**
 * method_15174
 */
fun StructureTemplate.saveFromWorld(world: world_World?, start: BlockPos?, dimensions: Vec3i?, includeEntities: Boolean, ignoredBlock: Block?) = this.method_15174(world, start, dimensions, includeEntities, ignoredBlock)
/**
 * method_15180
 */
fun StructureTemplate.transformBox(placementData1: StructurePlacementData?, pos1: BlockPos?, placementData2: StructurePlacementData?, pos2: BlockPos?) = this.method_15180(placementData1, pos1, placementData2, pos2)
/**
 * method_15165
 */
fun StructureTemplate.getInfosForBlock(pos: BlockPos?, placementData: StructurePlacementData?, block: Block?, transformed: Boolean) = this.method_15165(pos, placementData, block, transformed)
/**
 * method_15172
 */
fun StructureTemplate.place(world: ServerWorldAccess?, pos: BlockPos?, pivot: BlockPos?, placementData: StructurePlacementData?, random: Random?, flags: Int) = this.method_15172(world, pos, pivot, placementData, random, flags)
/**
 * method_15160
 */
fun StructureTemplate.getSize() = this.method_15160()
/**
 * method_15181
 */
fun StructureTemplate.getAuthor() = this.method_15181()
/**
 * method_15175
 */
fun StructureTemplate.writeNbt(nbt: NbtCompound?) = this.method_15175(nbt)
/**
 * method_16445
 */
fun StructureTemplate.getInfosForBlock(pos: BlockPos?, placementData: StructurePlacementData?, block: Block?) = this.method_16445(pos, placementData, block)
/**
 * method_15167
 */
fun StructureTemplate.offsetByTransformedSize(pos: BlockPos?, mirror: BlockMirror?, rotation: BlockRotation?) = this.method_15167(pos, mirror, rotation)
/**
 * method_27267
 */
fun StructureTemplate.calculateBoundingBox(pos: BlockPos?, rotation: BlockRotation?, pivot: BlockPos?, mirror: BlockMirror?) = this.method_27267(pos, rotation, pivot, mirror)
/**
 * method_15183
 */
fun StructureTemplate.readNbt(blockLookup: RegistryEntryLookup<Block>?, nbt: NbtCompound?) = this.method_15183(blockLookup, nbt)
/**
 * method_15161
 */
fun StructureTemplate.setAuthor(author: String?) = this.method_15161(author)
