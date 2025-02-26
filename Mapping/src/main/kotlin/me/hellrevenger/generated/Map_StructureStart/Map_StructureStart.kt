package me.hellrevenger.generated.Map_StructureStart
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_16713
 */
val KClass<StructureStart>.DEFAULT by aliasStatic(StructureStart::field_16713)
/**
 * field_31662
 */
val KClass<StructureStart>.INVALID by aliasStatic(StructureStart::field_31662)
/**
 * method_23676
 */
fun StructureStart.getReferences() = this.method_23676()
/**
 * method_14969
 */
fun StructureStart.getBoundingBox() = this.method_14969()
/**
 * method_16656
 */
fun StructureStart.getStructure() = this.method_16656()
/**
 * method_14963
 */
fun StructureStart.getChildren() = this.method_14963()
/**
 * method_14964
 */
fun StructureStart.incrementReferences() = this.method_14964()
/**
 * method_14979
 */
fun StructureStart.isNeverReferenced() = this.method_14979()
/**
 * method_16657
 */
fun StructureStart.hasChildren() = this.method_16657()
/**
 * method_14974
 */
fun StructureStart.place(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos) = this.method_14974(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_41621
 */
fun KClass<StructureStart>.fromNbt(arg0: StructureContext, arg1: NbtCompound, arg2: Long) = StructureStart.method_41621(arg0, arg1, arg2)
/**
 * method_34000
 */
fun StructureStart.getPos() = this.method_34000()
/**
 * method_14972
 */
fun StructureStart.toNbt(arg0: StructureContext, arg1: ChunkPos) = this.method_14972(arg0, arg1)
