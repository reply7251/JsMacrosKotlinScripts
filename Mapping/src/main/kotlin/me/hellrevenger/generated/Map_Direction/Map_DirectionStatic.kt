package me.hellrevenger.generated.Map_Direction
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DirectionKt {
    /**
     * field_48449
     */
    val ID_TO_VALUE_FUNCTION by aliasStatic(Direction::field_48449)
    /**
     * field_11043
     */
    val NORTH by aliasEnum(Direction::class, "field_11043")
    /**
     * field_11039
     */
    val WEST by aliasEnum(Direction::class, "field_11039")
    /**
     * field_11036
     */
    val UP by aliasEnum(Direction::class, "field_11036")
    /**
     * field_11035
     */
    val SOUTH by aliasEnum(Direction::class, "field_11035")
    /**
     * field_11034
     */
    val EAST by aliasEnum(Direction::class, "field_11034")
    /**
     * field_11033
     */
    val DOWN by aliasEnum(Direction::class, "field_11033")
    /**
     * method_62672
     */
    fun fromVector(x: Int, y: Int, z: Int, fallback: Direction) = Direction.method_62672(x, y, z, fallback)
    /**
     * method_10147
     */
    fun getFacing(x: Float, y: Float, z: Float) = Direction.method_10147(x, y, z)
    /**
     * method_10156
     */
    fun get(direction: net.minecraft.class_2350.class_2352, axis: net.minecraft.class_2350.class_2351) = Direction.method_10156(direction, axis)
    /**
     * method_10169
     */
    fun from(axis: net.minecraft.class_2350.class_2351, direction: net.minecraft.class_2350.class_2352) = Direction.method_10169(axis, direction)
    /**
     * method_10139
     */
    fun fromHorizontalQuarterTurns(quarterTurns: Int) = Direction.method_10139(quarterTurns)
    /**
     * method_32801
     */
    fun getLookDirectionForAxis(entity: Entity, axis: net.minecraft.class_2350.class_2351) = Direction.method_32801(entity, axis)
    /**
     * method_58251
     */
    fun getFacing(vec: Vec3d) = Direction.method_58251(vec)
    /**
     * method_10143
     */
    fun byId(id: Int) = Direction.method_10143(id)
    /**
     * method_62674
     */
    fun fromVector(vec: Vec3i, fallback: Direction) = Direction.method_62674(vec, fallback)
    /**
     * method_10142
     */
    fun getFacing(x: Double, arg1: Double, y: Double) = Direction.method_10142(x, arg1, y)
    /**
     * method_42013
     */
    fun stream() = Direction.method_42013()
    /**
     * method_10159
     */
    fun getEntityFacingOrder(entity: Entity) = Direction.method_10159(entity)
    /**
     * method_23225
     */
    fun transform(matrix: Matrix4f, direction: Direction) = Direction.method_23225(matrix, direction)
    /**
     * method_42014
     */
    fun shuffle(random: Random) = Direction.method_42014(random)
    /**
     * method_10168
     */
    fun byName(name: String) = Direction.method_10168(name)
    /**
     * method_62673
     */
    fun getHorizontalDegreesOrThrow(direction: Direction) = Direction.method_62673(direction)
    /**
     * method_10150
     */
    fun fromHorizontalDegrees(angle: Double) = Direction.method_10150(angle)
    /**
     * method_10162
     */
    fun random(random: Random) = Direction.method_10162(random)
}