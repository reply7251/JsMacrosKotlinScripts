package me.hellrevenger.generated.Map_NetworkStateBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetworkStateBuilderKt {
    /**
     * method_56455
     */
    fun <T, B>s2c(type: NetworkPhase?, registrar: Consumer<NetworkStateBuilder<T, B>>?) where T: PacketListener, T: ClientPacketListener, B: ByteBuf = NetworkStateBuilder.method_56455<T, B>(type, registrar)
    /**
     * method_56451
     */
    fun <T, B>c2s(type: NetworkPhase?, registrar: Consumer<NetworkStateBuilder<T, B>>?) where T: PacketListener, T: ServerPacketListener, B: ByteBuf = NetworkStateBuilder.method_56451<T, B>(type, registrar)
}