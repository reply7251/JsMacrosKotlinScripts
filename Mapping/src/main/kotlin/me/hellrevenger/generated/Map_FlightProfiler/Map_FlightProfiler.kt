package me.hellrevenger.generated.Map_FlightProfiler
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_38656
 */
fun FlightProfiler.onPacketReceived(state: NetworkPhase, type: PacketType<*>, remoteAddress: SocketAddress, bytes: Int) = this.method_38656(state, type, remoteAddress, bytes)
/**
 * method_65105
 */
fun FlightProfiler.startStructureGenerationProfiling(chunkPos: ChunkPos, world: RegistryKey<world_World>, structure: RegistryEntry<Structure>) = this.method_65105(chunkPos, world, structure)
/**
 * method_38659
 */
fun FlightProfiler.startWorldLoadProfiling() = this.method_38659()
/**
 * method_38654
 */
fun FlightProfiler.onTick(tickTime: Float) = this.method_38654(tickTime)
/**
 * method_56980
 */
fun FlightProfiler.onChunkRegionWrite(key: StorageKey, chunkPos: ChunkPos, format: ChunkCompressionFormat, bytes: Int) = this.method_56980(key, chunkPos, format, bytes)
/**
 * method_38658
 */
fun FlightProfiler.isAvailable() = this.method_38658()
/**
 * method_38657
 */
fun FlightProfiler.onPacketSent(state: NetworkPhase, type: PacketType<*>, remoteAddress: SocketAddress, bytes: Int) = this.method_38657(state, type, remoteAddress, bytes)
/**
 * method_38655
 */
fun FlightProfiler.startChunkGenerationProfiling(chunkPos: ChunkPos, world: RegistryKey<world_World>, targetStatus: String) = this.method_38655(chunkPos, world, targetStatus)
/**
 * method_56979
 */
fun FlightProfiler.onChunkRegionRead(key: StorageKey, chunkPos: ChunkPos, format: ChunkCompressionFormat, bytes: Int) = this.method_56979(key, chunkPos, format, bytes)
/**
 * method_37981
 */
fun FlightProfiler.start(instanceType: InstanceType) = this.method_37981(instanceType)
/**
 * method_37984
 */
fun FlightProfiler.isProfiling() = this.method_37984()
/**
 * method_37980
 */
fun FlightProfiler.stop() = this.method_37980()
