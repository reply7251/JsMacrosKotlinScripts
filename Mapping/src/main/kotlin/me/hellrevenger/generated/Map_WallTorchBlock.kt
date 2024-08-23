package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WallTorchBlock

val KClass<WallTorchBlock>.FACING by aliasStatic(WallTorchBlock::field_11731)
fun KClass<WallTorchBlock>.getBoundingShape(arg0: BlockState) = WallTorchBlock.method_10841(arg0)
fun KClass<WallTorchBlock>.canPlaceAt(arg0: WorldView, arg1: BlockPos, arg2: Direction) = WallTorchBlock.method_56118(arg0, arg1, arg2)
