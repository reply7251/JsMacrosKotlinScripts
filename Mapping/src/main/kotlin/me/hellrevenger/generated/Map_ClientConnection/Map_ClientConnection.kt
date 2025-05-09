package me.hellrevenger.generated.Map_ClientConnection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_11651
 */
var ClientConnection.channel by alias(ClientConnection::field_11651)
/**
 * method_36121
 */
fun ClientConnection.getSide() = this.method_36121()
/**
 * method_56330
 */
fun <T>ClientConnection.transitionInbound(state: NetworkState<T>, packetListener: T) where T: PacketListener = this.method_56330<T>(state, packetListener)
/**
 * method_10745
 */
fun ClientConnection.getAveragePacketsSent() = this.method_10745()
/**
 * method_10772
 */
fun ClientConnection.isChannelAbsent() = this.method_10772()
/**
 * method_60924
 */
fun ClientConnection.disconnect(disconnectionInfo: DisconnectionInfo) = this.method_60924(disconnectionInfo)
/**
 * method_10757
 */
fun ClientConnection.tryDisableAutoRead() = this.method_10757()
/**
 * method_52902
 */
fun ClientConnection.connect(address: String, port: Int, listener: ClientLoginPacketListener) = this.method_52902(address, port, listener)
/**
 * method_53505
 */
fun ClientConnection.resetPacketSizeLog(log: MultiValueDebugSampleLogImpl) = this.method_53505(log)
/**
 * method_10752
 */
fun ClientConnection.send(packet: Packet<*>, callbacks: PacketCallbacks) = this.method_10752(packet, callbacks)
/**
 * method_10771
 */
fun ClientConnection.isEncrypted() = this.method_10771()
/**
 * method_10755
 */
fun ClientConnection.getAddress() = this.method_10755()
/**
 * method_52915
 */
fun ClientConnection.flush() = this.method_52915()
/**
 * method_56329
 */
fun ClientConnection.transitionOutbound(newState: NetworkState<*>) = this.method_56329(newState)
/**
 * method_10747
 */
fun ClientConnection.disconnect(disconnectReason: Text) = this.method_10747(disconnectReason)
/**
 * method_52905
 */
fun ClientConnection.submit(task: Consumer<ClientConnection>) = this.method_52905(task)
/**
 * method_10756
 */
fun ClientConnection.isLocal() = this.method_10756()
/**
 * method_52912
 */
fun ClientConnection.setInitialPacketListener(packetListener: PacketListener) = this.method_52912(packetListener)
/**
 * method_10768
 */
fun ClientConnection.handleDisconnection() = this.method_10768()
/**
 * method_56326
 */
fun <S, C>ClientConnection.connect(address: String, port: Int, outboundState: NetworkState<S>, inboundState: NetworkState<C>, prePlayStateListener: C, transfer: Boolean) where S: ServerPacketListener, C: ClientPacketListener = this.method_56326<S, C>(address, port, outboundState, inboundState, prePlayStateListener, transfer)
/**
 * method_10743
 */
fun ClientConnection.send(packet: Packet<*>) = this.method_10743(packet)
/**
 * method_53859
 */
fun ClientConnection.addFlowControlHandler(pipeline: ChannelPipeline) = this.method_53859(pipeline)
/**
 * method_10746
 */
fun ClientConnection.setupEncryption(decryptionCipher: Cipher, encryptionCipher: Cipher) = this.method_10746(decryptionCipher, encryptionCipher)
/**
 * method_52903
 */
fun ClientConnection.connect(address: String, port: Int, listener: ClientQueryPacketListener) = this.method_52903(address, port, listener)
/**
 * method_10760
 */
fun ClientConnection.setCompressionThreshold(compressionThreshold: Int, rejectsBadPackets: Boolean) = this.method_10760(compressionThreshold, rejectsBadPackets)
/**
 * method_10762
 */
fun ClientConnection.getAveragePacketsReceived() = this.method_10762()
/**
 * method_52906
 */
fun ClientConnection.send(packet: Packet<*>, callbacks: PacketCallbacks, flush: Boolean) = this.method_52906(packet, callbacks, flush)
/**
 * method_36122
 */
fun ClientConnection.getOppositeSide() = this.method_36122()
/**
 * method_52909
 */
fun ClientConnection.getAddressAsString(logIps: Boolean) = this.method_52909(logIps)
/**
 * method_10754
 */
fun ClientConnection.tick() = this.method_10754()
/**
 * method_10758
 */
fun ClientConnection.isOpen() = this.method_10758()
/**
 * method_10744
 */
fun ClientConnection.getPacketListener() = this.method_10744()
