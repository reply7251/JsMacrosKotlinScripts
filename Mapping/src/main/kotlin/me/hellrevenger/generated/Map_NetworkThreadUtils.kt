package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkThreadUtils

fun <T>KClass<NetworkThreadUtils>.createCrashException(arg0: Exception, arg1: Packet<T>, arg2: T) where T: PacketListener = NetworkThreadUtils.method_59854<T>(arg0, arg1, arg2)
fun <T>KClass<NetworkThreadUtils>.forceMainThread(arg0: Packet<T>, arg1: T, arg2: ServerWorld) where T: PacketListener = NetworkThreadUtils.method_11073<T>(arg0, arg1, arg2)
fun <T>KClass<NetworkThreadUtils>.forceMainThread(arg0: Packet<T>, arg1: T, arg2: ThreadExecutor<*>) where T: PacketListener = NetworkThreadUtils.method_11074<T>(arg0, arg1, arg2)
fun <T>KClass<NetworkThreadUtils>.fillCrashReport(arg0: CrashReport, arg1: T, arg2: Packet<T>) where T: PacketListener = NetworkThreadUtils.method_59803<T>(arg0, arg1, arg2)
