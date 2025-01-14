package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractRailBlock

val KClass<AbstractRailBlock>.WATERLOGGED by aliasStatic(AbstractRailBlock::field_27096)
fun AbstractRailBlock.getShapeProperty() = this.method_9474()
fun AbstractRailBlock.cannotMakeCurves() = this.method_9478()
fun KClass<AbstractRailBlock>.isRail(arg0: BlockState) = AbstractRailBlock.method_9476(arg0)
fun KClass<AbstractRailBlock>.isRail(arg0: world_World, arg1: BlockPos) = AbstractRailBlock.method_9479(arg0, arg1)
