package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TripwireBlock

val KClass<TripwireBlock>.SOUTH by aliasStatic(TripwireBlock::field_11678)
val KClass<TripwireBlock>.DISARMED by aliasStatic(TripwireBlock::field_11679)
val KClass<TripwireBlock>.POWERED by aliasStatic(TripwireBlock::field_11680)
val KClass<TripwireBlock>.ATTACHED by aliasStatic(TripwireBlock::field_11683)
val KClass<TripwireBlock>.EAST by aliasStatic(TripwireBlock::field_11673)
val KClass<TripwireBlock>.WEST by aliasStatic(TripwireBlock::field_11674)
val KClass<TripwireBlock>.NORTH by aliasStatic(TripwireBlock::field_11675)
fun TripwireBlock.shouldConnectTo(arg0: BlockState, arg1: Direction) = this.method_10778(arg0, arg1)
