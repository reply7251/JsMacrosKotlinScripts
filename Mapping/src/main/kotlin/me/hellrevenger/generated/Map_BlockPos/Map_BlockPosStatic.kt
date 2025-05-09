package me.hellrevenger.generated.Map_BlockPos
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockPosKt {
    /**
     * field_10980
     */
    val ORIGIN by aliasStatic(BlockPos::field_10980)
    /**
     * field_10975
     */
    val SIZE_BITS_Y by aliasStatic(BlockPos::field_10975)
    /**
     * field_54978
     */
    val SIZE_BITS_XZ by aliasStatic(BlockPos::field_54978)
    /**
     * field_54979
     */
    val MAX_XZ by aliasStatic(BlockPos::field_54979)
    /**
     * method_10096
     */
    fun add(value: Long, arg1: Int, x: Int, y: Int) = BlockPos.method_10096(value, arg1, x, y)
    /**
     * method_58250
     */
    fun max(a: BlockPos, b: BlockPos) = BlockPos.method_58250(a, b)
    /**
     * method_25998
     */
    fun streamOutwards(center: BlockPos, maxX: Int, maxY: Int, maxZ: Int) = BlockPos.method_25998(center, maxX, maxY, maxZ)
    /**
     * method_49637
     */
    fun ofFloored(x: Double, arg1: Double, y: Double) = BlockPos.method_49637(x, arg1, y)
    /**
     * method_51686
     */
    fun streamSouthEastSquare(pos: BlockPos) = BlockPos.method_51686(pos)
    /**
     * method_29715
     */
    fun stream(box: Box) = BlockPos.method_29715(box)
    /**
     * method_27156
     */
    fun iterateRandomly(random: Random, count: Int, minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = BlockPos.method_27156(random, count, minX, minY, minZ, maxX, maxY, maxZ)
    /**
     * method_10091
     */
    fun removeChunkSectionLocalY(y: Long) = BlockPos.method_10091(y)
    /**
     * method_10071
     */
    fun unpackLongY(packedPos: Long) = BlockPos.method_10071(packedPos)
    /**
     * method_30512
     */
    fun iterateInSquare(center: BlockPos, radius: Int, firstDirection: Direction, secondDirection: Direction) = BlockPos.method_30512(center, radius, firstDirection, secondDirection)
    /**
     * method_10083
     */
    fun unpackLongZ(packedPos: Long) = BlockPos.method_10083(packedPos)
    /**
     * method_10092
     */
    fun fromLong(packedPos: Long) = BlockPos.method_10092(packedPos)
    /**
     * method_62671
     */
    fun iterate(box: Box) = BlockPos.method_62671(box)
    /**
     * method_58249
     */
    fun min(a: BlockPos, b: BlockPos) = BlockPos.method_58249(a, b)
    /**
     * method_25996
     */
    fun iterateOutwards(center: BlockPos, rangeX: Int, rangeY: Int, rangeZ: Int) = BlockPos.method_25996(center, rangeX, rangeY, rangeZ)
    /**
     * method_25997
     */
    fun findClosest(pos: BlockPos, horizontalRange: Int, verticalRange: Int, condition: Predicate<BlockPos>) = BlockPos.method_25997(pos, horizontalRange, verticalRange, condition)
    /**
     * method_49925
     */
    fun iterateRecursively(pos: BlockPos, maxDepth: Int, maxIterations: Int, nextQueuer: BiConsumer<BlockPos, Consumer<BlockPos>>, callback: function_Function<BlockPos, net.minecraft.class_2338.class_10384>) = BlockPos.method_49925(pos, maxDepth, maxIterations, nextQueuer, callback)
    /**
     * method_10061
     */
    fun unpackLongX(packedPos: Long) = BlockPos.method_10061(packedPos)
}