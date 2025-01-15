package me.hellrevenger.generated.Map_CampfireBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<CampfireBlock>.FACING by aliasStatic(CampfireBlock::field_17564)
val KClass<CampfireBlock>.LIT by aliasStatic(CampfireBlock::field_17352)
val KClass<CampfireBlock>.SIGNAL_FIRE by aliasStatic(CampfireBlock::field_17353)
val KClass<CampfireBlock>.WATERLOGGED by aliasStatic(CampfireBlock::field_17354)
fun KClass<CampfireBlock>.isLitCampfireInRange(arg0: world_World, arg1: BlockPos) = CampfireBlock.method_23895(arg0, arg1)
fun KClass<CampfireBlock>.canBeLit(arg0: BlockState) = CampfireBlock.method_30035(arg0)
fun KClass<CampfireBlock>.extinguish(arg0: Entity, arg1: WorldAccess, arg2: BlockPos, arg3: BlockState) = CampfireBlock.method_29288(arg0, arg1, arg2, arg3)
fun KClass<CampfireBlock>.spawnSmokeParticle(arg0: world_World, arg1: BlockPos, arg2: Boolean, arg3: Boolean) = CampfireBlock.method_17455(arg0, arg1, arg2, arg3)
fun KClass<CampfireBlock>.isLitCampfire(arg0: BlockState) = CampfireBlock.method_23896(arg0)
