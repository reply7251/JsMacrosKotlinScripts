package me.hellrevenger.generated.Map_BlockMirror
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BlockMirror>.LEFT_RIGHT by aliasEnum(BlockMirror::class, "field_11300")
val KClass<BlockMirror>.FRONT_BACK by aliasEnum(BlockMirror::class, "field_11301")
val KClass<BlockMirror>.NONE by aliasEnum(BlockMirror::class, "field_11302")
fun BlockMirror.getDirectionTransformation() = this.method_26380()
fun BlockMirror.apply(arg0: Direction) = this.method_10343(arg0)
fun BlockMirror.getRotation(arg0: Direction) = this.method_10345(arg0)
fun BlockMirror.getName() = this.method_32354()
fun BlockMirror.mirror(arg0: Int, arg1: Int) = this.method_10344(arg0, arg1)
