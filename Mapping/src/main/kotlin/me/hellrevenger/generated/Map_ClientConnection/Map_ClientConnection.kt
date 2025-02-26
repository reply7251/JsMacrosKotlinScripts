package me.hellrevenger.generated.Map_ClientConnection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_11657
 */
val KClass<ClientConnection>.EPOLL_CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11657)
/**
 * field_11649
 */
val KClass<ClientConnection>.LOCAL_CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11649)
/**
 * field_11650
 */
val KClass<ClientConnection>.CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11650)
/**
 * field_11641
 */
val KClass<ClientConnection>.NETWORK_MARKER by aliasStatic(ClientConnection::field_11641)
/**
 * field_11651
 */
var ClientConnection.channel by alias(ClientConnection::field_11651)
/**
 * field_36379
 */
val KClass<ClientConnection>.PACKET_RECEIVED_MARKER by aliasStatic(ClientConnection::field_36379)
/**
 * field_11639
 */
val KClass<ClientConnection>.NETWORK_PACKETS_MARKER by aliasStatic(ClientConnection::field_11639)
/**
 * field_36380
 */
val KClass<ClientConnection>.PACKET_SENT_MARKER by aliasStatic(ClientConnection::field_36380)
/**
 * method_36121
 */
fun ClientConnection.getSide() = this.method_36121()
/**
 * method_56330
 */
fun <T>ClientConnection.transitionInbound(arg0: NetworkState<T>, arg1: T) where T: PacketListener = this.method_56330<T>(arg0, arg1)
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
fun ClientConnection.disconnect(arg0: DisconnectionInfo) = this.method_60924(arg0)
/**
 * method_10757
 */
fun ClientConnection.tryDisableAutoRead() = this.method_10757()
/**
 * method_52902
 */
fun ClientConnection.connect(arg0: String, arg1: Int, arg2: ClientLoginPacketListener) = this.method_52902(arg0, arg1, arg2)
/**
 * method_53505
 */
fun ClientConnection.resetPacketSizeLog(arg0: MultiValueDebugSampleLogImpl) = this.method_53505(arg0)
/**
 * method_48311
 */
fun KClass<ClientConnection>.addHandlers(arg0: ChannelPipeline, arg1: NetworkSide, arg2: Boolean, arg3: PacketSizeLogger) = ClientConnection.method_48311(arg0, arg1, arg2, arg3)
/**
 * method_10752
 */
fun ClientConnection.send(arg0: Packet<*>, arg1: PacketCallbacks) = this.method_10752(arg0, arg1)
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
fun ClientConnection.transitionOutbound(arg0: NetworkState<*>) = this.method_56329(arg0)
/**
 * method_10747
 */
fun ClientConnection.disconnect(arg0: Text) = this.method_10747(arg0)
/**
 * method_52905
 */
fun ClientConnection.submit(arg0: Consumer<ClientConnection>) = this.method_52905(arg0)
/**
 * method_10756
 */
fun ClientConnection.isLocal() = this.method_10756()
/**
 * method_52912
 */
fun ClientConnection.setInitialPacketListener(arg0: PacketListener) = this.method_52912(arg0)
/**
 * method_52911
 */
fun KClass<ClientConnection>.addLocalValidator(arg0: ChannelPipeline, arg1: NetworkSide) = ClientConnection.method_52911(arg0, arg1)
/**
 * method_10768
 */
fun ClientConnection.handleDisconnection() = this.method_10768()
/**
 * method_10753
 */
fun KClass<ClientConnection>.connect(arg0: InetSocketAddress, arg1: Boolean, arg2: MultiValueDebugSampleLogImpl) = ClientConnection.method_10753(arg0, arg1, arg2)
/**
 * method_56326
 */
fun <S, C>ClientConnection.connect(arg0: String, arg1: Int, arg2: NetworkState<S>, arg3: NetworkState<C>, arg4: C, arg5: Boolean) where S: ServerPacketListener, C: ClientPacketListener = this.method_56326<S, C>(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_10743
 */
fun ClientConnection.send(arg0: Packet<*>) = this.method_10743(arg0)
/**
 * method_10769
 */
fun KClass<ClientConnection>.connectLocal(arg0: SocketAddress) = ClientConnection.method_10769(arg0)
/**
 * method_53859
 */
fun ClientConnection.addFlowControlHandler(arg0: ChannelPipeline) = this.method_53859(arg0)
/**
 * method_10746
 */
fun ClientConnection.setupEncryption(arg0: Cipher, arg1: Cipher) = this.method_10746(arg0, arg1)
/**
 * method_52903
 */
fun ClientConnection.connect(arg0: String, arg1: Int, arg2: ClientQueryPacketListener) = this.method_52903(arg0, arg1, arg2)
/**
 * method_10760
 */
fun ClientConnection.setCompressionThreshold(arg0: Int, arg1: Boolean) = this.method_10760(arg0, arg1)
/**
 * method_10762
 */
fun ClientConnection.getAveragePacketsReceived() = this.method_10762()
/**
 * method_52906
 */
fun ClientConnection.send(arg0: Packet<*>, arg1: PacketCallbacks, arg2: Boolean) = this.method_52906(arg0, arg1, arg2)
/**
 * method_36122
 */
fun ClientConnection.getOppositeSide() = this.method_36122()
/**
 * method_52909
 */
fun ClientConnection.getAddressAsString(arg0: Boolean) = this.method_52909(arg0)
/**
 * method_10754
 */
fun ClientConnection.tick() = this.method_10754()
/**
 * method_10758
 */
fun ClientConnection.isOpen() = this.method_10758()
/**
 * method_52271
 */
fun KClass<ClientConnection>.connect(arg0: InetSocketAddress, arg1: Boolean, arg2: ClientConnection) = ClientConnection.method_52271(arg0, arg1, arg2)
/**
 * method_10744
 */
fun ClientConnection.getPacketListener() = this.method_10744()
