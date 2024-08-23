package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.StructurePiece

fun StructurePiece.generate(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos, arg6: BlockPos) = this.method_14931(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun StructurePiece.setOrientation(arg0: Direction) = this.method_14926(arg0)
fun StructurePiece.setChainLength(arg0: Int) = this.method_41620(arg0)
fun StructurePiece.getRotation() = this.method_16888()
fun StructurePiece.intersectsChunk(arg0: ChunkPos, arg1: Int) = this.method_16654(arg0, arg1)
fun StructurePiece.fillOpenings(arg0: StructurePiece, arg1: StructurePiecesHolder, arg2: Random) = this.method_14918(arg0, arg1, arg2)
fun StructurePiece.getChainLength() = this.method_14923()
fun StructurePiece.getCenter() = this.method_35458()
fun StructurePiece.getType() = this.method_16653()
fun KClass<StructurePiece>.orientateChest(arg0: BlockView, arg1: BlockPos, arg2: BlockState) = StructurePiece.method_14916(arg0, arg1, arg2)
fun StructurePiece.translate(arg0: Int, arg1: Int, arg2: Int) = this.method_14922(arg0, arg1, arg2)
fun KClass<StructurePiece>.firstIntersecting(arg0: MutableList<StructurePiece>, arg1: BlockBox) = StructurePiece.method_38702(arg0, arg1)
fun StructurePiece.getBoundingBox() = this.method_14935()
fun StructurePiece.getMirror() = this.method_35460()
fun StructurePiece.toNbt(arg0: StructureContext) = this.method_14946(arg0)
fun KClass<StructurePiece>.boundingBox(arg0: Stream<StructurePiece>) = StructurePiece.method_38703(arg0)
fun StructurePiece.getFacing() = this.method_14934()
