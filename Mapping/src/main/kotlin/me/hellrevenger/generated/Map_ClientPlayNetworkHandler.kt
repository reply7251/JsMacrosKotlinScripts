package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ClientPlayNetworkHandler

fun ClientPlayNetworkHandler.acknowledge(arg0: SignedMessage, arg1: Boolean) = this.method_44940(arg0, arg1)
fun ClientPlayNetworkHandler.getServerLinks() = this.method_60885()
fun ClientPlayNetworkHandler.getRegistryManager() = this.method_29091()
fun ClientPlayNetworkHandler.hasFeature(arg0: FeatureSet) = this.method_45720(arg0)
fun ClientPlayNetworkHandler.getServerInfo() = this.method_45734()
fun ClientPlayNetworkHandler.getPlayerListEntry(arg0: UUID) = this.method_2871(arg0)
fun ClientPlayNetworkHandler.sendChatMessage(arg0: String) = this.method_45729(arg0)
fun ClientPlayNetworkHandler.getPlayerUuids() = this.method_31363()
fun ClientPlayNetworkHandler.sendCommand(arg0: String) = this.method_45731(arg0)
fun ClientPlayNetworkHandler.clearWorld() = this.method_54134()
fun ClientPlayNetworkHandler.getPlayerList() = this.method_2880()
fun ClientPlayNetworkHandler.getPlayerListEntry(arg0: String) = this.method_2874(arg0)
fun ClientPlayNetworkHandler.refreshSearchManager() = this.method_60346()
fun ClientPlayNetworkHandler.updateKeyPair(arg0: PlayerKeyPair) = this.method_47657(arg0)
fun ClientPlayNetworkHandler.getConnection() = this.method_48296()
fun ClientPlayNetworkHandler.unloadWorld() = this.method_47658()
fun ClientPlayNetworkHandler.sendChatCommand(arg0: String) = this.method_45730(arg0)
