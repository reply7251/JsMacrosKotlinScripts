package me.hellrevenger.generated.Map_ChunkSection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_49526
 */
fun ChunkSection.readBiomePacket(buf: PacketByteBuf) = this.method_49526(buf)
/**
 * method_16676
 */
fun ChunkSection.lock() = this.method_16676()
/**
 * method_38292
 */
fun ChunkSection.isEmpty() = this.method_38292()
/**
 * method_12265
 */
fun ChunkSection.getBlockStateContainer() = this.method_12265()
/**
 * method_12256
 */
fun ChunkSection.setBlockState(x: Int, y: Int, z: Int, state: BlockState, lock: Boolean) = this.method_12256(x, y, z, state, lock)
/**
 * method_38291
 */
fun ChunkSection.populateBiomes(biomeSupplier: BiomeSupplier, sampler: net.minecraft.class_6544.class_6552, x: Int, y: Int, z: Int) = this.method_38291(biomeSupplier, sampler, x, y, z)
/**
 * method_16675
 */
fun ChunkSection.setBlockState(x: Int, y: Int, z: Int, state: BlockState) = this.method_16675(x, y, z, state)
/**
 * method_12260
 */
fun ChunkSection.getPacketSize() = this.method_12260()
/**
 * method_12254
 */
fun ChunkSection.getBlockState(x: Int, y: Int, z: Int) = this.method_12254(x, y, z)
/**
 * method_12262
 */
fun ChunkSection.hasRandomTicks() = this.method_12262()
/**
 * method_61771
 */
fun ChunkSection.copy() = this.method_61771()
/**
 * method_12258
 */
fun ChunkSection.readDataPacket(buf: PacketByteBuf) = this.method_12258(buf)
/**
 * method_12264
 */
fun ChunkSection.hasRandomFluidTicks() = this.method_12264()
/**
 * method_19523
 */
fun ChunkSection.hasAny(predicate: Predicate<BlockState>) = this.method_19523(predicate)
/**
 * method_16677
 */
fun ChunkSection.unlock() = this.method_16677()
/**
 * method_12255
 */
fun ChunkSection.getFluidState(x: Int, y: Int, z: Int) = this.method_12255(x, y, z)
/**
 * method_12253
 */
fun ChunkSection.calculateCounts() = this.method_12253()
/**
 * method_12257
 */
fun ChunkSection.toPacket(buf: PacketByteBuf) = this.method_12257(buf)
/**
 * method_12263
 */
fun ChunkSection.hasRandomBlockTicks() = this.method_12263()
/**
 * method_38293
 */
fun ChunkSection.getBiome(x: Int, y: Int, z: Int) = this.method_38293(x, y, z)
/**
 * method_38294
 */
fun ChunkSection.getBiomeContainer() = this.method_38294()
