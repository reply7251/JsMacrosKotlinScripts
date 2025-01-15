package me.hellrevenger.generated.Map_FlightProfiler
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun FlightProfiler.onTick(arg0: Float) = this.method_38654(arg0)
fun FlightProfiler.onPacketReceived(arg0: NetworkPhase, arg1: PacketType<*>, arg2: SocketAddress, arg3: Int) = this.method_38656(arg0, arg1, arg2, arg3)
fun FlightProfiler.onChunkRegionWrite(arg0: StorageKey, arg1: ChunkPos, arg2: ChunkCompressionFormat, arg3: Int) = this.method_56980(arg0, arg1, arg2, arg3)
fun FlightProfiler.isAvailable() = this.method_38658()
fun FlightProfiler.onPacketSent(arg0: NetworkPhase, arg1: PacketType<*>, arg2: SocketAddress, arg3: Int) = this.method_38657(arg0, arg1, arg2, arg3)
fun FlightProfiler.startChunkGenerationProfiling(arg0: ChunkPos, arg1: RegistryKey<world_World>, arg2: String) = this.method_38655(arg0, arg1, arg2)
fun FlightProfiler.onChunkRegionRead(arg0: StorageKey, arg1: ChunkPos, arg2: ChunkCompressionFormat, arg3: Int) = this.method_56979(arg0, arg1, arg2, arg3)
fun FlightProfiler.start(arg0: InstanceType) = this.method_37981(arg0)
fun FlightProfiler.isProfiling() = this.method_37984()
fun FlightProfiler.stop() = this.method_37980()
fun FlightProfiler.startWorldLoadProfiling() = this.method_38659()
