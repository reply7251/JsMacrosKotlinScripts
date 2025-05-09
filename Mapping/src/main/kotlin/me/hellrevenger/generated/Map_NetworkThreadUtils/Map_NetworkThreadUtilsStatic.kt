package me.hellrevenger.generated.Map_NetworkThreadUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetworkThreadUtilsKt {
    /**
     * method_59854
     */
    fun <T>createCrashException(exception: Exception, packet: Packet<T>, listener: T) where T: PacketListener = NetworkThreadUtils.method_59854<T>(exception, packet, listener)
    /**
     * method_11073
     */
    fun <T>forceMainThread(packet: Packet<T>, listener: T, world: ServerWorld) where T: PacketListener = NetworkThreadUtils.method_11073<T>(packet, listener, world)
    /**
     * method_11074
     */
    fun <T>forceMainThread(packet: Packet<T>, listener: T, engine: ThreadExecutor<*>) where T: PacketListener = NetworkThreadUtils.method_11074<T>(packet, listener, engine)
    /**
     * method_59803
     */
    fun <T>fillCrashReport(report: CrashReport, listener: T, packet: Packet<T>) where T: PacketListener = NetworkThreadUtils.method_59803<T>(report, listener, packet)
}