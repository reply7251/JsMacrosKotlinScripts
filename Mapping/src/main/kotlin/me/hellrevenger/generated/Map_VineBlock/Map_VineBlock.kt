package me.hellrevenger.generated.Map_VineBlock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<VineBlock>.NORTH by aliasStatic(VineBlock::field_11706)
val KClass<VineBlock>.UP by aliasStatic(VineBlock::field_11703)
val KClass<VineBlock>.EAST by aliasStatic(VineBlock::field_11702)
val KClass<VineBlock>.SOUTH by aliasStatic(VineBlock::field_11699)
val KClass<VineBlock>.WEST by aliasStatic(VineBlock::field_11696)
val KClass<VineBlock>.FACING_PROPERTIES by aliasStatic(VineBlock::field_11697)
fun KClass<VineBlock>.shouldConnectTo(arg0: BlockView, arg1: BlockPos, arg2: Direction) = VineBlock.method_10821(arg0, arg1, arg2)
fun KClass<VineBlock>.getFacingProperty(arg0: Direction) = VineBlock.method_10828(arg0)
