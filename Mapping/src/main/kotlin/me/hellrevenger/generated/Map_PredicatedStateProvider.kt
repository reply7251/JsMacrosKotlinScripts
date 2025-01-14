package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PredicatedStateProvider

fun KClass<PredicatedStateProvider>.of(arg0: BlockStateProvider) = PredicatedStateProvider.method_43314(arg0)
fun KClass<PredicatedStateProvider>.of(arg0: Block) = PredicatedStateProvider.method_43312(arg0)
fun PredicatedStateProvider.getBlockState(arg0: StructureWorldAccess, arg1: Random, arg2: BlockPos) = this.method_43311(arg0, arg1, arg2)
fun PredicatedStateProvider.fallback() = this.comp_725()
fun PredicatedStateProvider.rules() = this.comp_726()
