package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TallPlantBlock

val TallPlantBlock.HALF by aliasStatic(TallPlantBlock::field_10929)
fun KClass<TallPlantBlock>.placeAt(arg0: WorldAccess, arg1: BlockState, arg2: BlockPos, arg3: Int) = TallPlantBlock.method_10021(arg0, arg1, arg2, arg3)
fun KClass<TallPlantBlock>.withWaterloggedState(arg0: WorldView, arg1: BlockPos, arg2: BlockState) = TallPlantBlock.method_37458(arg0, arg1, arg2)
