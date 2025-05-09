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
     * method_49638
     */
    fun ofFloored(pos: Position) = BlockPos.method_49638(pos)
    /**
     * method_27156
     */
    fun iterateRandomly(random: Random, count: Int, minX: Int, minY: Int, minZ: Int, maxX: Int, maxY: Int, maxZ: Int) = BlockPos.method_27156(random, count, minX, minY, minZ, maxX, maxY, maxZ)
    /**
     * method_34848
     */
    fun iterateRandomly(random: Random, count: Int, around: BlockPos, range: Int) = BlockPos.method_34848(random, count, around, range)
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
     * method_20437
     */
    fun stream(start: BlockPos, end: BlockPos) = BlockPos.method_20437(start, end)
    /**
     * method_58249
     */
    fun min(a: BlockPos, b: BlockPos) = BlockPos.method_58249(a, b)
    /**
     * method_10064
     */
    fun asLong(x: Int, y: Int, z: Int) = BlockPos.method_10064(x, y, z)
    /**
     * method_10094
     */
    fun iterate(startX: Int, startY: Int, startZ: Int, endX: Int, endY: Int, endZ: Int) = BlockPos.method_10094(startX, startY, startZ, endX, endY, endZ)
    /**
     * method_23627
     */
    fun stream(box: BlockBox) = BlockPos.method_23627(box)
    /**
     * method_25996
     */
    fun iterateOutwards(center: BlockPos, rangeX: Int, rangeY: Int, rangeZ: Int) = BlockPos.method_25996(center, rangeX, rangeY, rangeZ)
    /**
     * method_17962
     */
    fun stream(startX: Int, startY: Int, startZ: Int, endX: Int, endY: Int, endZ: Int) = BlockPos.method_17962(startX, startY, startZ, endX, endY, endZ)
    /**
     * method_25997
     */
    fun findClosest(pos: BlockPos, horizontalRange: Int, verticalRange: Int, condition: Predicate<BlockPos>) = BlockPos.method_25997(pos, horizontalRange, verticalRange, condition)
    /**
     * method_49925
     */
    fun iterateRecursively(pos: BlockPos, maxDepth: Int, maxIterations: Int, nextQueuer: BiConsumer<BlockPos, Consumer<BlockPos>>, callback: function_Function<BlockPos, net.minecraft.class_2338.class_10384>) = BlockPos.method_49925(pos, maxDepth, maxIterations, nextQueuer, callback)
    /**
     * method_10097
     */
    fun iterate(start: BlockPos, end: BlockPos) = BlockPos.method_10097(start, end)
    /**
     * method_10061
     */
    fun unpackLongX(packedPos: Long) = BlockPos.method_10061(packedPos)
    /**
     * method_10060
     */
    fun offset(value: Long, arg1: Direction) = BlockPos.method_10060(value, arg1)
}