package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LecternBlock

val LecternBlock.HAS_BOOK by aliasStatic(LecternBlock::field_17366)
val LecternBlock.EAST_SHAPE by aliasStatic(LecternBlock::field_17371)
val LecternBlock.SOUTH_SHAPE by aliasStatic(LecternBlock::field_17372)
val LecternBlock.NORTH_SHAPE by aliasStatic(LecternBlock::field_17370)
val LecternBlock.BOTTOM_SHAPE by aliasStatic(LecternBlock::field_16406)
val LecternBlock.POWERED by aliasStatic(LecternBlock::field_17365)
val LecternBlock.MIDDLE_SHAPE by aliasStatic(LecternBlock::field_16405)
val LecternBlock.BASE_SHAPE by aliasStatic(LecternBlock::field_16403)
val LecternBlock.FACING by aliasStatic(LecternBlock::field_16404)
val LecternBlock.COLLISION_SHAPE by aliasStatic(LecternBlock::field_17368)
val LecternBlock.WEST_SHAPE by aliasStatic(LecternBlock::field_17369)
val LecternBlock.COLLISION_SHAPE_TOP by aliasStatic(LecternBlock::field_17367)
fun KClass<LecternBlock>.setPowered(arg0: world_World, arg1: BlockPos, arg2: BlockState) = LecternBlock.method_17471(arg0, arg1, arg2)
fun KClass<LecternBlock>.setHasBook(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: BlockState, arg4: Boolean) = LecternBlock.method_17473(arg0, arg1, arg2, arg3, arg4)
fun KClass<LecternBlock>.putBookIfAbsent(arg0: LivingEntity, arg1: world_World, arg2: BlockPos, arg3: BlockState, arg4: ItemStack) = LecternBlock.method_17472(arg0, arg1, arg2, arg3, arg4)
