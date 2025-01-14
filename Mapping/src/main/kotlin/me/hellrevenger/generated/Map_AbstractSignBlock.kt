package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbstractSignBlock

val KClass<AbstractSignBlock>.WATERLOGGED by aliasStatic(AbstractSignBlock::field_11491)
fun AbstractSignBlock.getWoodType() = this.method_24025()
fun KClass<AbstractSignBlock>.getWoodType(arg0: Block) = AbstractSignBlock.method_45459(arg0)
fun AbstractSignBlock.getCenter(arg0: BlockState) = this.method_50003(arg0)
fun AbstractSignBlock.getRotationDegrees(arg0: BlockState) = this.method_49814(arg0)
fun AbstractSignBlock.openEditScreen(arg0: PlayerEntity, arg1: SignBlockEntity, arg2: Boolean) = this.method_49825(arg0, arg1, arg2)
