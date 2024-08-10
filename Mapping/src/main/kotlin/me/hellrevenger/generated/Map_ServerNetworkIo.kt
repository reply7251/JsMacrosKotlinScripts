package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ServerNetworkIo

val ServerNetworkIo.EPOLL_CHANNEL by aliasStatic(ServerNetworkIo::field_14105)
val ServerNetworkIo.DEFAULT_CHANNEL by aliasStatic(ServerNetworkIo::field_14111)
val ServerNetworkIo.active by alias(ServerNetworkIo::field_14108)
fun ServerNetworkIo.tick() = this.method_14357()
fun ServerNetworkIo.stop() = this.method_14356()
fun ServerNetworkIo.bind(arg0: InetAddress, arg1: Int) = this.method_14354(arg0, arg1)
fun ServerNetworkIo.bindLocal() = this.method_14353()
