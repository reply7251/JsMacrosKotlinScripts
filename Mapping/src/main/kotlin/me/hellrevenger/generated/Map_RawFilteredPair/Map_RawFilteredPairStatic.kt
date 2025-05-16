package me.hellrevenger.generated.Map_RawFilteredPair
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RawFilteredPairKt {
    /**
     * method_57137
     */
    fun <T>of(raw: T) = RawFilteredPair.method_57137<T>(raw)
    /**
     * method_57139
     */
    fun <T, B>createPacketCodec(basePacketCodec: PacketCodec<B, T>?) where B: ByteBuf = RawFilteredPair.method_57139<B, T>(basePacketCodec)
    /**
     * method_57134
     */
    fun <T>of(message: FilteredMessage?) = RawFilteredPair.method_57134(message)
    /**
     * method_57135
     */
    fun <T>createCodec(baseCodec: Codec<T>?) = RawFilteredPair.method_57135<T>(baseCodec)
}