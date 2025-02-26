package me.hellrevenger.generated.Map_StructurePiece
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_14931
 */
fun StructurePiece.generate(arg0: StructureWorldAccess, arg1: StructureAccessor, arg2: ChunkGenerator, arg3: Random, arg4: BlockBox, arg5: ChunkPos, arg6: BlockPos) = this.method_14931(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_14926
 */
fun StructurePiece.setOrientation(arg0: Direction) = this.method_14926(arg0)
/**
 * method_41620
 */
fun StructurePiece.setChainLength(arg0: Int) = this.method_41620(arg0)
/**
 * method_16888
 */
fun StructurePiece.getRotation() = this.method_16888()
/**
 * method_16654
 */
fun StructurePiece.intersectsChunk(arg0: ChunkPos, arg1: Int) = this.method_16654(arg0, arg1)
/**
 * method_14918
 */
fun StructurePiece.fillOpenings(arg0: StructurePiece, arg1: StructurePiecesHolder, arg2: Random) = this.method_14918(arg0, arg1, arg2)
/**
 * method_14923
 */
fun StructurePiece.getChainLength() = this.method_14923()
/**
 * method_35458
 */
fun StructurePiece.getCenter() = this.method_35458()
/**
 * method_16653
 */
fun StructurePiece.getType() = this.method_16653()
/**
 * method_14916
 */
fun KClass<StructurePiece>.orientateChest(arg0: BlockView, arg1: BlockPos, arg2: BlockState) = StructurePiece.method_14916(arg0, arg1, arg2)
/**
 * method_14922
 */
fun StructurePiece.translate(arg0: Int, arg1: Int, arg2: Int) = this.method_14922(arg0, arg1, arg2)
/**
 * method_38702
 */
fun KClass<StructurePiece>.firstIntersecting(arg0: MutableList<StructurePiece>, arg1: BlockBox) = StructurePiece.method_38702(arg0, arg1)
/**
 * method_14935
 */
fun StructurePiece.getBoundingBox() = this.method_14935()
/**
 * method_35460
 */
fun StructurePiece.getMirror() = this.method_35460()
/**
 * method_14946
 */
fun StructurePiece.toNbt(arg0: StructureContext) = this.method_14946(arg0)
/**
 * method_38703
 */
fun KClass<StructurePiece>.boundingBox(arg0: Stream<StructurePiece>) = StructurePiece.method_38703(arg0)
/**
 * method_14934
 */
fun StructurePiece.getFacing() = this.method_14934()
