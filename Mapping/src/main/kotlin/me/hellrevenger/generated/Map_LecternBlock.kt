package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LecternBlock

val KClass<LecternBlock>.HAS_BOOK by aliasStatic(LecternBlock::field_17366)
val KClass<LecternBlock>.EAST_SHAPE by aliasStatic(LecternBlock::field_17371)
val KClass<LecternBlock>.SOUTH_SHAPE by aliasStatic(LecternBlock::field_17372)
val KClass<LecternBlock>.NORTH_SHAPE by aliasStatic(LecternBlock::field_17370)
val KClass<LecternBlock>.BOTTOM_SHAPE by aliasStatic(LecternBlock::field_16406)
val KClass<LecternBlock>.POWERED by aliasStatic(LecternBlock::field_17365)
val KClass<LecternBlock>.MIDDLE_SHAPE by aliasStatic(LecternBlock::field_16405)
val KClass<LecternBlock>.BASE_SHAPE by aliasStatic(LecternBlock::field_16403)
val KClass<LecternBlock>.FACING by aliasStatic(LecternBlock::field_16404)
val KClass<LecternBlock>.COLLISION_SHAPE by aliasStatic(LecternBlock::field_17368)
val KClass<LecternBlock>.WEST_SHAPE by aliasStatic(LecternBlock::field_17369)
val KClass<LecternBlock>.COLLISION_SHAPE_TOP by aliasStatic(LecternBlock::field_17367)
fun KClass<LecternBlock>.setPowered(arg0: world_World, arg1: BlockPos, arg2: BlockState) = LecternBlock.method_17471(arg0, arg1, arg2)
fun KClass<LecternBlock>.setHasBook(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: BlockState, arg4: Boolean) = LecternBlock.method_17473(arg0, arg1, arg2, arg3, arg4)
fun KClass<LecternBlock>.putBookIfAbsent(arg0: LivingEntity, arg1: world_World, arg2: BlockPos, arg3: BlockState, arg4: ItemStack) = LecternBlock.method_17472(arg0, arg1, arg2, arg3, arg4)
