package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LandPathNodeMaker

val KClass<LandPathNodeMaker>.Y_OFFSET by aliasStatic(LandPathNodeMaker::field_31809)
fun KClass<LandPathNodeMaker>.getLandNodeType(arg0: MobEntity, arg1: BlockPos) = LandPathNodeMaker.method_57625(arg0, arg1)
fun KClass<LandPathNodeMaker>.getNodeTypeFromNeighbors(arg0: PathContext, arg1: Int, arg2: Int, arg3: Int, arg4: PathNodeType) = LandPathNodeMaker.method_59(arg0, arg1, arg2, arg3, arg4)
fun LandPathNodeMaker.getCollidingNodeTypes(arg0: PathContext, arg1: Int, arg2: Int, arg3: Int) = this.method_57090(arg0, arg1, arg2, arg3)
fun KClass<LandPathNodeMaker>.getFeetY(arg0: BlockView, arg1: BlockPos) = LandPathNodeMaker.method_60(arg0, arg1)
fun KClass<LandPathNodeMaker>.getLandNodeType(arg0: PathContext, arg1: net.minecraft.class_2338.class_2339) = LandPathNodeMaker.method_23476(arg0, arg1)
