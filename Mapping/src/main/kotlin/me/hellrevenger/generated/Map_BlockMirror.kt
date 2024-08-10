package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockMirror

val BlockMirror.LEFT_RIGHT by aliasEnum(BlockMirror::class, "field_11300")
val BlockMirror.FRONT_BACK by aliasEnum(BlockMirror::class, "field_11301")
val BlockMirror.NONE by aliasEnum(BlockMirror::class, "field_11302")
fun BlockMirror.apply(arg0: Direction) = this.method_10343(arg0)
fun BlockMirror.getRotation(arg0: Direction) = this.method_10345(arg0)
fun BlockMirror.mirror(arg0: Int, arg1: Int) = this.method_10344(arg0, arg1)
