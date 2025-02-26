package me.hellrevenger.generated.Map_StructureAccessor
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_26973
 */
fun StructureAccessor.addStructureReference(arg0: ChunkSectionPos, arg1: Structure, arg2: Long, arg3: StructureHolder) = this.method_26973(arg0, arg1, arg2, arg3)
/**
 * method_41037
 */
fun StructureAccessor.getStructureReferences(arg0: BlockPos) = this.method_41037(arg0)
/**
 * method_41032
 */
fun StructureAccessor.acceptStructureStarts(arg0: Structure, arg1: LongSet, arg2: Consumer<StructureStart>) = this.method_41032(arg0, arg1, arg2)
/**
 * method_41033
 */
fun StructureAccessor.structureContains(arg0: BlockPos, arg1: StructureStart) = this.method_41033(arg0, arg1)
/**
 * method_28388
 */
fun StructureAccessor.getStructureAt(arg0: BlockPos, arg1: Structure) = this.method_28388(arg0, arg1)
/**
 * method_39783
 */
fun StructureAccessor.getStructurePresence(arg0: ChunkPos, arg1: Structure, arg2: StructurePlacement, arg3: Boolean) = this.method_39783(arg0, arg1, arg2, arg3)
/**
 * method_27834
 */
fun StructureAccessor.shouldGenerateStructures() = this.method_27834()
/**
 * method_26975
 */
fun StructureAccessor.getStructureStart(arg0: ChunkSectionPos, arg1: Structure, arg2: StructureHolder) = this.method_26975(arg0, arg1, arg2)
/**
 * method_26976
 */
fun StructureAccessor.setStructureStart(arg0: ChunkSectionPos, arg1: Structure, arg2: StructureStart, arg3: StructureHolder) = this.method_26976(arg0, arg1, arg2, arg3)
/**
 * method_39784
 */
fun StructureAccessor.incrementReferences(arg0: StructureStart) = this.method_39784(arg0)
/**
 * method_41413
 */
fun StructureAccessor.getStructureContaining(arg0: BlockPos, arg1: Predicate<RegistryEntry<Structure>>) = this.method_41413(arg0, arg1)
/**
 * method_38852
 */
fun StructureAccessor.hasStructureReferences(arg0: BlockPos) = this.method_38852(arg0)
/**
 * method_29951
 */
fun StructureAccessor.forRegion(arg0: ChunkRegion) = this.method_29951(arg0)
/**
 * method_41034
 */
fun StructureAccessor.getStructureContaining(arg0: BlockPos, arg1: RegistryEntryList<Structure>) = this.method_41034(arg0, arg1)
/**
 * method_57560
 */
fun StructureAccessor.getStructureContaining(arg0: BlockPos, arg1: TagKey<Structure>) = this.method_57560(arg0, arg1)
/**
 * method_41035
 */
fun StructureAccessor.getStructureStarts(arg0: ChunkPos, arg1: Predicate<Structure>) = this.method_41035(arg0, arg1)
/**
 * method_38854
 */
fun StructureAccessor.getStructureContaining(arg0: BlockPos, arg1: Structure) = this.method_38854(arg0, arg1)
/**
 * method_41036
 */
fun StructureAccessor.getRegistryManager() = this.method_41036()
/**
 * method_38853
 */
fun StructureAccessor.getStructureStarts(arg0: ChunkSectionPos, arg1: Structure) = this.method_38853(arg0, arg1)
