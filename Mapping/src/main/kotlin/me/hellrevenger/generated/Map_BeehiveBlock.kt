package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BeehiveBlock

val KClass<BeehiveBlock>.FULL_HONEY_LEVEL by aliasStatic(BeehiveBlock::field_31011)
val KClass<BeehiveBlock>.FACING by aliasStatic(BeehiveBlock::field_20419)
val KClass<BeehiveBlock>.HONEY_LEVEL by aliasStatic(BeehiveBlock::field_20420)
fun BeehiveBlock.takeHoney(arg0: world_World, arg1: BlockState, arg2: BlockPos) = this.method_23754(arg0, arg1, arg2)
fun BeehiveBlock.takeHoney(arg0: world_World, arg1: BlockState, arg2: BlockPos, arg3: PlayerEntity, arg4: net.minecraft.class_4482.class_4484) = this.method_21841(arg0, arg1, arg2, arg3, arg4)
fun KClass<BeehiveBlock>.dropHoneycomb(arg0: world_World, arg1: BlockPos) = BeehiveBlock.method_21842(arg0, arg1)
