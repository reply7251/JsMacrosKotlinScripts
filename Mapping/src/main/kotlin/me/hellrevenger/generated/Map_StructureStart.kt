package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructureStart

val StructureStart.DEFAULT by aliasStatic(StructureStart::field_16713)
val StructureStart.INVALID by aliasStatic(StructureStart::field_31662)
fun StructureStart.incrementReferences() = this.method_14964()
fun StructureStart.isNeverReferenced() = this.method_14979()
fun StructureStart.hasChildren() = this.method_16657()
fun StructureStart.place(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos) = this.method_14974(arg0, arg1, arg2, arg3, arg4, arg5)
fun KClass<StructureStart>.fromNbt(arg0: StructureContext, arg1: NbtCompound, arg2: Long) = StructureStart.method_41621(arg0, arg1, arg2)
fun StructureStart.toNbt(arg0: StructureContext, arg1: ChunkPos) = this.method_14972(arg0, arg1)
