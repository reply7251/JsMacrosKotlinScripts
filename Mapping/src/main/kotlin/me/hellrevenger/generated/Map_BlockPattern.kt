package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockPattern

fun BlockPattern.getPattern() = this.method_35301()
fun BlockPattern.getWidth() = this.method_11710()
fun BlockPattern.testTransform(arg0: WorldView, arg1: BlockPos, arg2: Direction, arg3: Direction) = this.method_35300(arg0, arg1, arg2, arg3)
fun BlockPattern.searchAround(arg0: WorldView, arg1: BlockPos) = this.method_11708(arg0, arg1)
fun KClass<BlockPattern>.makeCache(arg0: WorldView, arg1: Boolean) = BlockPattern.method_11709(arg0, arg1)
fun BlockPattern.getDepth() = this.method_11712()
fun BlockPattern.getHeight() = this.method_11713()
