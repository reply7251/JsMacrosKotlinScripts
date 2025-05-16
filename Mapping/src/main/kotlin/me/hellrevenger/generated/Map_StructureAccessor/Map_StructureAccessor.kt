package me.hellrevenger.generated.Map_StructureAccessor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_26973
 */
fun StructureAccessor.addStructureReference(pos: ChunkSectionPos?, structure: Structure?, reference: Long, arg3: StructureHolder?) = this.method_26973(pos, structure, reference, arg3)
/**
 * method_41037
 */
fun StructureAccessor.getStructureReferences(pos: BlockPos?) = this.method_41037(pos)
/**
 * method_41032
 */
fun StructureAccessor.acceptStructureStarts(structure: Structure?, structureStartPositions: LongSet?, consumer: Consumer<StructureStart>?) = this.method_41032(structure, structureStartPositions, consumer)
/**
 * method_41033
 */
fun StructureAccessor.structureContains(pos: BlockPos?, structureStart: StructureStart?) = this.method_41033(pos, structureStart)
/**
 * method_28388
 */
fun StructureAccessor.getStructureAt(pos: BlockPos?, structure: Structure?) = this.method_28388(pos, structure)
/**
 * method_39783
 */
fun StructureAccessor.getStructurePresence(chunkPos: ChunkPos?, structure: Structure?, placement: StructurePlacement?, skipReferencedStructures: Boolean) = this.method_39783(chunkPos, structure, placement, skipReferencedStructures)
/**
 * method_27834
 */
fun StructureAccessor.shouldGenerateStructures() = this.method_27834()
/**
 * method_26975
 */
fun StructureAccessor.getStructureStart(pos: ChunkSectionPos?, structure: Structure?, holder: StructureHolder?) = this.method_26975(pos, structure, holder)
/**
 * method_26976
 */
fun StructureAccessor.setStructureStart(pos: ChunkSectionPos?, structure: Structure?, structureStart: StructureStart?, holder: StructureHolder?) = this.method_26976(pos, structure, structureStart, holder)
/**
 * method_39784
 */
fun StructureAccessor.incrementReferences(structureStart: StructureStart?) = this.method_39784(structureStart)
/**
 * method_41413
 */
fun StructureAccessor.getStructureContaining(pos: BlockPos?, predicate: Predicate<RegistryEntry<Structure>>?) = this.method_41413(pos, predicate)
/**
 * method_38852
 */
fun StructureAccessor.hasStructureReferences(pos: BlockPos?) = this.method_38852(pos)
/**
 * method_29951
 */
fun StructureAccessor.forRegion(region: ChunkRegion?) = this.method_29951(region)
/**
 * method_41034
 */
fun StructureAccessor.getStructureContaining(pos: BlockPos?, structures: RegistryEntryList<Structure>?) = this.method_41034(pos, structures)
/**
 * method_57560
 */
fun StructureAccessor.getStructureContaining(pos: BlockPos?, tag: TagKey<Structure>?) = this.method_57560(pos, tag)
/**
 * method_41035
 */
fun StructureAccessor.getStructureStarts(pos: ChunkPos?, predicate: Predicate<Structure>?) = this.method_41035(pos, predicate)
/**
 * method_38854
 */
fun StructureAccessor.getStructureContaining(pos: BlockPos?, structure: Structure?) = this.method_38854(pos, structure)
/**
 * method_41036
 */
fun StructureAccessor.getRegistryManager() = this.method_41036()
/**
 * method_38853
 */
fun StructureAccessor.getStructureStarts(sectionPos: ChunkSectionPos?, structure: Structure?) = this.method_38853(sectionPos, structure)
