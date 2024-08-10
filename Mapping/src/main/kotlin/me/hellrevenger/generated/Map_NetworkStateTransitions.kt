package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkStateTransitions

fun <T>KClass<NetworkStateTransitions>.decoderTransitioner(arg0: NetworkState<T>) where T: PacketListener = NetworkStateTransitions.method_56356<T>(arg0)
fun <T>KClass<NetworkStateTransitions>.encoderTransitioner(arg0: NetworkState<T>) where T: PacketListener = NetworkStateTransitions.method_56357<T>(arg0)
