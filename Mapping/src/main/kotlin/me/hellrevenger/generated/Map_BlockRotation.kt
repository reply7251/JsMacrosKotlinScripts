package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockRotation

val BlockRotation.CLOCKWISE_180 by aliasEnum(BlockRotation::class, "field_11464")
val BlockRotation.COUNTERCLOCKWISE_90 by aliasEnum(BlockRotation::class, "field_11465")
val BlockRotation.NONE by aliasEnum(BlockRotation::class, "field_11467")
val BlockRotation.CLOCKWISE_90 by aliasEnum(BlockRotation::class, "field_11463")
fun KClass<BlockRotation>.random(arg0: Random) = BlockRotation.method_16548(arg0)
fun BlockRotation.rotate(arg0: Direction) = this.method_10503(arg0)
fun BlockRotation.rotate(arg0: BlockRotation) = this.method_10501(arg0)
fun BlockRotation.rotate(arg0: Int, arg1: Int) = this.method_10502(arg0, arg1)
fun KClass<BlockRotation>.randomRotationOrder(arg0: Random) = BlockRotation.method_16547(arg0)
