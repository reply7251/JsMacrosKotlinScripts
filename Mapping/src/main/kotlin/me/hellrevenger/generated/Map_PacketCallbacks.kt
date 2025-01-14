package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PacketCallbacks

fun PacketCallbacks.onSuccess() = this.method_45083()
fun KClass<PacketCallbacks>.of(arg0: Supplier<Packet<*>>) = PacketCallbacks.method_45085(arg0)
fun PacketCallbacks.getFailurePacket() = this.method_45086()
fun KClass<PacketCallbacks>.always(arg0: Runnable) = PacketCallbacks.method_45084(arg0)
