package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientLoginPacketListener

fun ClientLoginPacketListener.onHello(arg0: LoginHelloS2CPacket) = this.method_12587(arg0)
fun ClientLoginPacketListener.onQueryRequest(arg0: LoginQueryRequestS2CPacket) = this.method_12586(arg0)
fun ClientLoginPacketListener.onDisconnect(arg0: LoginDisconnectS2CPacket) = this.method_12584(arg0)
fun ClientLoginPacketListener.onCompression(arg0: LoginCompressionS2CPacket) = this.method_12585(arg0)
fun ClientLoginPacketListener.onSuccess(arg0: LoginSuccessS2CPacket) = this.method_12588(arg0)
