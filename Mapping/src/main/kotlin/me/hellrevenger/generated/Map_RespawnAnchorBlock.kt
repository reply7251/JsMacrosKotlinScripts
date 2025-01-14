package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RespawnAnchorBlock

val KClass<RespawnAnchorBlock>.NO_CHARGES by aliasStatic(RespawnAnchorBlock::field_31231)
val KClass<RespawnAnchorBlock>.MAX_CHARGES by aliasStatic(RespawnAnchorBlock::field_31232)
val KClass<RespawnAnchorBlock>.CHARGES by aliasStatic(RespawnAnchorBlock::field_23153)
fun KClass<RespawnAnchorBlock>.findRespawnPosition(arg0: EntityType<*>, arg1: CollisionView, arg2: BlockPos) = RespawnAnchorBlock.method_26156(arg0, arg1, arg2)
fun KClass<RespawnAnchorBlock>.getLightLevel(arg0: BlockState, arg1: Int) = RespawnAnchorBlock.method_26157(arg0, arg1)
fun KClass<RespawnAnchorBlock>.isNether(arg0: world_World) = RespawnAnchorBlock.method_27353(arg0)
fun KClass<RespawnAnchorBlock>.charge(arg0: Entity, arg1: world_World, arg2: BlockPos, arg3: BlockState) = RespawnAnchorBlock.method_26382(arg0, arg1, arg2, arg3)
