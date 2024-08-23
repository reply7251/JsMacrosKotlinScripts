package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FireBlock

val KClass<FireBlock>.WEST by aliasStatic(FireBlock::field_11088)
val KClass<FireBlock>.NORTH by aliasStatic(FireBlock::field_11096)
val KClass<FireBlock>.AGE by aliasStatic(FireBlock::field_11092)
val KClass<FireBlock>.EAST by aliasStatic(FireBlock::field_11094)
val KClass<FireBlock>.SOUTH by aliasStatic(FireBlock::field_11089)
val KClass<FireBlock>.UP by aliasStatic(FireBlock::field_11093)
fun FireBlock.registerFlammableBlock(arg0: Block, arg1: Int, arg2: Int) = this.method_10189(arg0, arg1, arg2)
fun KClass<FireBlock>.registerDefaultFlammables() = FireBlock.method_10199()
