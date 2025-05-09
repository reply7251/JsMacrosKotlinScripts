package me.hellrevenger.generated.Map_PacketCallbacks
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketCallbacksKt {
    /**
     * method_45085
     */
    fun of(failurePacket: Supplier<Packet<*>>) = PacketCallbacks.method_45085(failurePacket)
    /**
     * method_45084
     */
    fun always(runnable: Runnable) = PacketCallbacks.method_45084(runnable)
}