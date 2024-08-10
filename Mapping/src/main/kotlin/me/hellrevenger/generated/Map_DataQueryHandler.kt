package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DataQueryHandler

val DataQueryHandler.expectedTransactionId by alias(DataQueryHandler::field_1641)
fun DataQueryHandler.queryEntityNbt(arg0: Int, arg1: Consumer<NbtCompound>) = this.method_1405(arg0, arg1)
fun DataQueryHandler.handleQueryResponse(arg0: Int, arg1: NbtCompound) = this.method_1404(arg0, arg1)
fun DataQueryHandler.queryBlockNbt(arg0: BlockPos, arg1: Consumer<NbtCompound>) = this.method_1403(arg0, arg1)
