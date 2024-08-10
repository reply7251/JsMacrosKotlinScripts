package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TripwireBlock

val TripwireBlock.SOUTH by aliasStatic(TripwireBlock::field_11678)
val TripwireBlock.DISARMED by aliasStatic(TripwireBlock::field_11679)
val TripwireBlock.POWERED by aliasStatic(TripwireBlock::field_11680)
val TripwireBlock.ATTACHED by aliasStatic(TripwireBlock::field_11683)
val TripwireBlock.EAST by aliasStatic(TripwireBlock::field_11673)
val TripwireBlock.WEST by aliasStatic(TripwireBlock::field_11674)
val TripwireBlock.NORTH by aliasStatic(TripwireBlock::field_11675)
fun TripwireBlock.shouldConnectTo(arg0: BlockState, arg1: Direction) = this.method_10778(arg0, arg1)
