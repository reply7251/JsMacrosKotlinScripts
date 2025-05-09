package me.hellrevenger.generated.Map_ClientConnection
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ClientConnectionKt {
    /**
     * field_11657
     */
    val EPOLL_CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11657)
    /**
     * field_11649
     */
    val LOCAL_CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11649)
    /**
     * field_11650
     */
    val CLIENT_IO_GROUP by aliasStatic(ClientConnection::field_11650)
    /**
     * field_11641
     */
    val NETWORK_MARKER by aliasStatic(ClientConnection::field_11641)
    /**
     * field_36379
     */
    val PACKET_RECEIVED_MARKER by aliasStatic(ClientConnection::field_36379)
    /**
     * field_11639
     */
    val NETWORK_PACKETS_MARKER by aliasStatic(ClientConnection::field_11639)
    /**
     * field_36380
     */
    val PACKET_SENT_MARKER by aliasStatic(ClientConnection::field_36380)
    /**
     * method_48311
     */
    fun addHandlers(pipeline: ChannelPipeline, side: NetworkSide, local: Boolean, packetSizeLogger: PacketSizeLogger) = ClientConnection.method_48311(pipeline, side, local, packetSizeLogger)
    /**
     * method_52911
     */
    fun addLocalValidator(pipeline: ChannelPipeline, side: NetworkSide) = ClientConnection.method_52911(pipeline, side)
    /**
     * method_10753
     */
    fun connect(address: InetSocketAddress, useEpoll: Boolean, packetSizeLog: MultiValueDebugSampleLogImpl) = ClientConnection.method_10753(address, useEpoll, packetSizeLog)
    /**
     * method_10769
     */
    fun connectLocal(address: SocketAddress) = ClientConnection.method_10769(address)
    /**
     * method_52271
     */
    fun connect(address: InetSocketAddress, useEpoll: Boolean, connection: ClientConnection) = ClientConnection.method_52271(address, useEpoll, connection)
}