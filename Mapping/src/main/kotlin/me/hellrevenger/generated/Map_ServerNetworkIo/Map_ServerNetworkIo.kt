package me.hellrevenger.generated.Map_ServerNetworkIo
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_14105
 */
val KClass<ServerNetworkIo>.EPOLL_CHANNEL by aliasStatic(ServerNetworkIo::field_14105)
/**
 * field_14111
 */
val KClass<ServerNetworkIo>.DEFAULT_CHANNEL by aliasStatic(ServerNetworkIo::field_14111)
/**
 * field_14108
 */
val ServerNetworkIo.active by alias(ServerNetworkIo::field_14108)
/**
 * method_37909
 */
fun ServerNetworkIo.getConnections() = this.method_37909()
/**
 * method_14357
 */
fun ServerNetworkIo.tick() = this.method_14357()
/**
 * method_14356
 */
fun ServerNetworkIo.stop() = this.method_14356()
/**
 * method_14354
 */
fun ServerNetworkIo.bind(arg0: InetAddress, arg1: Int) = this.method_14354(arg0, arg1)
/**
 * method_14351
 */
fun ServerNetworkIo.getServer() = this.method_14351()
/**
 * method_14353
 */
fun ServerNetworkIo.bindLocal() = this.method_14353()
