package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructurePiecesList

fun StructurePiecesList.isEmpty() = this.method_38708()
fun StructurePiecesList.getBoundingBox() = this.method_38712()
fun KClass<StructurePiecesList>.fromNbt(arg0: NbtList, arg1: StructureContext) = StructurePiecesList.method_38711(arg0, arg1)
fun StructurePiecesList.toNbt(arg0: StructureContext) = this.method_38709(arg0)
fun StructurePiecesList.contains(arg0: BlockPos) = this.method_38710(arg0)
fun StructurePiecesList.pieces() = this.comp_132()
