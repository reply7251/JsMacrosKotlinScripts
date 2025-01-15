package me.hellrevenger.generated.Map_ServerCommonNetworkHandler
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ServerCommonNetworkHandler>.KEEP_ALIVE_INTERVAL by aliasStatic(ServerCommonNetworkHandler::field_45011)
fun ServerCommonNetworkHandler.getLatency() = this.method_52405()
fun ServerCommonNetworkHandler.disableFlush() = this.method_53046()
fun ServerCommonNetworkHandler.sendPacket(arg0: Packet<*>) = this.method_14364(arg0)
fun ServerCommonNetworkHandler.send(arg0: Packet<*>, arg1: PacketCallbacks) = this.method_52391(arg0, arg1)
fun ServerCommonNetworkHandler.disconnect(arg0: Text) = this.method_52396(arg0)
fun ServerCommonNetworkHandler.enableFlush() = this.method_53047()
fun ServerCommonNetworkHandler.getDebugProfile() = this.method_52404()
fun ServerCommonNetworkHandler.disconnect(arg0: DisconnectionInfo) = this.method_60673(arg0)
