package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BelowZeroRetrogen

val KClass<BelowZeroRetrogen>.BELOW_ZERO_VIEW by aliasStatic(BelowZeroRetrogen::field_35591)
fun KClass<BelowZeroRetrogen>.getBiomeSupplier(arg0: BiomeSupplier, arg1: Chunk) = BelowZeroRetrogen.method_39767(arg0, arg1)
fun KClass<BelowZeroRetrogen>.fromNbt(arg0: NbtCompound) = BelowZeroRetrogen.method_39326(arg0)
fun BelowZeroRetrogen.hasMissingBedrock() = this.method_39897()
fun BelowZeroRetrogen.isColumnMissingBedrock(arg0: Int, arg1: Int) = this.method_39895(arg0, arg1)
fun BelowZeroRetrogen.getTargetStatus() = this.method_39319()
fun KClass<BelowZeroRetrogen>.replaceOldBedrock(arg0: ProtoChunk) = BelowZeroRetrogen.method_39467(arg0)
fun BelowZeroRetrogen.fillColumnsWithAirIfMissingBedrock(arg0: ProtoChunk) = this.method_39898(arg0)
