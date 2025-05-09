package me.hellrevenger.generated.Map_NetworkStateTransitions
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetworkStateTransitionsKt {
    /**
     * method_56356
     */
    fun <T>decoderTransitioner(newState: NetworkState<T>) where T: PacketListener = NetworkStateTransitions.method_56356<T>(newState)
    /**
     * method_56357
     */
    fun <T>encoderTransitioner(newState: NetworkState<T>) where T: PacketListener = NetworkStateTransitions.method_56357<T>(newState)
}