package me.hellrevenger.generated.Map_ChunkSection
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun ChunkSection.readBiomePacket(arg0: PacketByteBuf) = this.method_49526(arg0)
fun ChunkSection.lock() = this.method_16676()
fun ChunkSection.isEmpty() = this.method_38292()
fun ChunkSection.getBlockStateContainer() = this.method_12265()
fun ChunkSection.setBlockState(arg0: Int, arg1: Int, arg2: Int, arg3: BlockState, arg4: Boolean) = this.method_12256(arg0, arg1, arg2, arg3, arg4)
fun ChunkSection.populateBiomes(arg0: BiomeSupplier, arg1: net.minecraft.class_6544.class_6552, arg2: Int, arg3: Int, arg4: Int) = this.method_38291(arg0, arg1, arg2, arg3, arg4)
fun ChunkSection.setBlockState(arg0: Int, arg1: Int, arg2: Int, arg3: BlockState) = this.method_16675(arg0, arg1, arg2, arg3)
fun ChunkSection.getPacketSize() = this.method_12260()
fun ChunkSection.getBlockState(arg0: Int, arg1: Int, arg2: Int) = this.method_12254(arg0, arg1, arg2)
fun ChunkSection.hasRandomTicks() = this.method_12262()
fun ChunkSection.readDataPacket(arg0: PacketByteBuf) = this.method_12258(arg0)
fun ChunkSection.hasRandomFluidTicks() = this.method_12264()
fun ChunkSection.hasAny(arg0: Predicate<BlockState>) = this.method_19523(arg0)
fun ChunkSection.unlock() = this.method_16677()
fun ChunkSection.getFluidState(arg0: Int, arg1: Int, arg2: Int) = this.method_12255(arg0, arg1, arg2)
fun ChunkSection.calculateCounts() = this.method_12253()
fun ChunkSection.toPacket(arg0: PacketByteBuf) = this.method_12257(arg0)
fun ChunkSection.hasRandomBlockTicks() = this.method_12263()
fun ChunkSection.getBiome(arg0: Int, arg1: Int, arg2: Int) = this.method_38293(arg0, arg1, arg2)
fun ChunkSection.getBiomeContainer() = this.method_38294()
