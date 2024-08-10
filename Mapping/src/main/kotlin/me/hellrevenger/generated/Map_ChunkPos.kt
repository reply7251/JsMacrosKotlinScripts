package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkPos

val ChunkPos.z by alias(ChunkPos::field_9180)
val ChunkPos.x by alias(ChunkPos::field_9181)
val ChunkPos.ORIGIN by aliasStatic(ChunkPos::field_35107)
val ChunkPos.MARKER by aliasStatic(ChunkPos::field_17348)
fun KClass<ChunkPos>.hashCode(arg0: Int, arg1: Int) = ChunkPos.method_42307(arg0, arg1)
fun KClass<ChunkPos>.fromRegionCenter(arg0: Int, arg1: Int) = ChunkPos.method_42306(arg0, arg1)
fun ChunkPos.getStartPos() = this.method_8323()
fun ChunkPos.getChebyshevDistance(arg0: ChunkPos) = this.method_24022(arg0)
fun ChunkPos.toLong() = this.method_8324()
fun KClass<ChunkPos>.toLong(arg0: Int, arg1: Int) = ChunkPos.method_8331(arg0, arg1)
fun ChunkPos.getRegionRelativeX() = this.method_17887()
fun ChunkPos.getRegionX() = this.method_17885()
fun ChunkPos.getCenterX() = this.method_33940()
fun KClass<ChunkPos>.getPackedX(arg0: Long) = ChunkPos.method_8325(arg0)
fun ChunkPos.getCenterZ() = this.method_33942()
fun ChunkPos.getStartX() = this.method_8326()
fun ChunkPos.getSquaredDistance(arg0: ChunkPos) = this.method_52566(arg0)
fun ChunkPos.getStartZ() = this.method_8328()
fun ChunkPos.getBlockPos(arg0: Int, arg1: Int, arg2: Int) = this.method_35231(arg0, arg1, arg2)
fun ChunkPos.getOffsetX(arg0: Int) = this.method_33939(arg0)
fun KClass<ChunkPos>.fromRegion(arg0: Int, arg1: Int) = ChunkPos.method_42305(arg0, arg1)
fun KClass<ChunkPos>.stream(arg0: ChunkPos, arg1: ChunkPos) = ChunkPos.method_19281(arg0, arg1)
fun KClass<ChunkPos>.toLong(arg0: BlockPos) = ChunkPos.method_37232(arg0)
fun ChunkPos.getSquaredDistance(arg0: Long) = this.method_52567(arg0)
fun ChunkPos.getOffsetZ(arg0: Int) = this.method_33941(arg0)
fun ChunkPos.getChebyshevDistance(arg0: Int, arg1: Int) = this.method_60510(arg0, arg1)
fun ChunkPos.getRegionRelativeZ() = this.method_17888()
fun ChunkPos.getCenterAtY(arg0: Int) = this.method_33943(arg0)
fun ChunkPos.getRegionZ() = this.method_17886()
fun ChunkPos.getEndX() = this.method_8327()
fun ChunkPos.getEndZ() = this.method_8329()
fun KClass<ChunkPos>.getPackedZ(arg0: Long) = ChunkPos.method_8332(arg0)
fun KClass<ChunkPos>.stream(arg0: ChunkPos, arg1: Int) = ChunkPos.method_19280(arg0, arg1)
