package me.hellrevenger.generated.Map_RegistryPair
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryPairKt {
    /**
     * method_60737
     */
    fun <T>createPacketCodec(registryRef: RegistryKey<Registry<T>>?, entryPacketCodec: PacketCodec<RegistryByteBuf, RegistryEntry<T>>?) = RegistryPair.method_60737<T>(registryRef, entryPacketCodec)
    /**
     * method_60738
     */
    fun <T>create(entryOrKey: Either<RegistryEntry<T>, RegistryKey<T>>?) = RegistryPair.method_60738<T>(entryOrKey)
    /**
     * method_60736
     */
    fun <T>createCodec(registryRef: RegistryKey<Registry<T>>?, entryCodec: Codec<RegistryEntry<T>>?) = RegistryPair.method_60736<T>(registryRef, entryCodec)
}