package me.hellrevenger.generated.Map_Direction
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_48449
 */
val KClass<Direction>.ID_TO_VALUE_FUNCTION by aliasStatic(Direction::field_48449)
/**
 * field_11043
 */
val KClass<Direction>.NORTH by aliasEnum(Direction::class, "field_11043")
/**
 * field_11039
 */
val KClass<Direction>.WEST by aliasEnum(Direction::class, "field_11039")
/**
 * field_11036
 */
val KClass<Direction>.UP by aliasEnum(Direction::class, "field_11036")
/**
 * field_11035
 */
val KClass<Direction>.SOUTH by aliasEnum(Direction::class, "field_11035")
/**
 * field_11034
 */
val KClass<Direction>.EAST by aliasEnum(Direction::class, "field_11034")
/**
 * field_11033
 */
val KClass<Direction>.DOWN by aliasEnum(Direction::class, "field_11033")
/**
 * method_62672
 */
fun KClass<Direction>.fromVector(arg0: Int, arg1: Int, arg2: Int, arg3: Direction) = Direction.method_62672(arg0, arg1, arg2, arg3)
/**
 * method_10147
 */
fun KClass<Direction>.getFacing(x: Float, y: Float, z: Float) = Direction.method_10147(x, y, z)
/**
 * method_10170
 */
fun Direction.rotateYClockwise() = this.method_10170()
/**
 * method_10156
 */
fun KClass<Direction>.get(arg0: net.minecraft.class_2350.class_2352, arg1: net.minecraft.class_2350.class_2351) = Direction.method_10156(arg0, arg1)
/**
 * method_10169
 */
fun KClass<Direction>.from(arg0: net.minecraft.class_2350.class_2351, arg1: net.minecraft.class_2350.class_2352) = Direction.method_10169(arg0, arg1)
/**
 * method_10139
 */
fun KClass<Direction>.fromHorizontalQuarterTurns(arg0: Int) = Direction.method_10139(arg0)
/**
 * method_32801
 */
fun KClass<Direction>.getLookDirectionForAxis(arg0: Entity, arg1: net.minecraft.class_2350.class_2351) = Direction.method_32801(arg0, arg1)
/**
 * method_58251
 */
fun KClass<Direction>.getFacing(arg0: Vec3d) = Direction.method_58251(arg0)
/**
 * method_10143
 */
fun KClass<Direction>.byId(arg0: Int) = Direction.method_10143(arg0)
/**
 * method_10146
 */
fun Direction.getId() = this.method_10146()
/**
 * method_35833
 */
fun Direction.rotateClockwise(arg0: net.minecraft.class_2350.class_2351) = this.method_35833(arg0)
/**
 * method_10166
 */
fun Direction.getAxis() = this.method_10166()
/**
 * method_23955
 */
fun Direction.getUnitVector() = this.method_23955()
/**
 * method_62674
 */
fun KClass<Direction>.fromVector(arg0: Vec3i, arg1: Direction) = Direction.method_62674(arg0, arg1)
/**
 * method_10142
 */
fun KClass<Direction>.getFacing(arg0: Double, arg1: Double, arg2: Double) = Direction.method_10142(arg0, arg1, arg2)
/**
 * method_42013
 */
fun KClass<Direction>.stream() = Direction.method_42013()
/**
 * method_23224
 */
fun Direction.getRotationQuaternion() = this.method_23224()
/**
 * method_62675
 */
fun Direction.getVector() = this.method_62675()
/**
 * method_10151
 */
fun Direction.getName() = this.method_10151()
/**
 * method_35834
 */
fun Direction.rotateCounterclockwise(arg0: net.minecraft.class_2350.class_2351) = this.method_35834(arg0)
/**
 * method_10160
 */
fun Direction.rotateYCounterclockwise() = this.method_10160()
/**
 * method_10159
 */
fun KClass<Direction>.getEntityFacingOrder(arg0: Entity) = Direction.method_10159(arg0)
/**
 * method_23225
 */
fun KClass<Direction>.transform(arg0: Matrix4f, arg1: Direction) = Direction.method_23225(arg0, arg1)
/**
 * method_42014
 */
fun KClass<Direction>.shuffle(arg0: Random) = Direction.method_42014(arg0)
/**
 * method_62676
 */
fun Direction.getDoubleVector() = this.method_62676()
/**
 * method_10148
 */
fun Direction.getOffsetX() = this.method_10148()
/**
 * method_30928
 */
fun Direction.pointsTo(arg0: Float) = this.method_30928(arg0)
/**
 * method_10144
 */
fun Direction.getPositiveHorizontalDegrees() = this.method_10144()
/**
 * method_10168
 */
fun KClass<Direction>.byName(arg0: String) = Direction.method_10168(arg0)
/**
 * method_62673
 */
fun KClass<Direction>.getHorizontalDegreesOrThrow(arg0: Direction) = Direction.method_62673(arg0)
/**
 * method_10150
 */
fun KClass<Direction>.fromHorizontalDegrees(arg0: Double) = Direction.method_10150(arg0)
/**
 * method_10153
 */
fun Direction.getOpposite() = this.method_10153()
/**
 * method_10162
 */
fun KClass<Direction>.random(arg0: Random) = Direction.method_10162(arg0)
/**
 * method_10164
 */
fun Direction.getOffsetY() = this.method_10164()
/**
 * method_10161
 */
fun Direction.getHorizontalQuarterTurns() = this.method_10161()
/**
 * method_10171
 */
fun Direction.getDirection() = this.method_10171()
/**
 * method_10165
 */
fun Direction.getOffsetZ() = this.method_10165()
