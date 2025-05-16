package me.hellrevenger.generated.Map_RegistryEntryListCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryEntryListCodecKt {
    /**
     * method_40388
     */
    fun <E>create(registryRef: RegistryKey<out Registry<E>>?, entryCodec: Codec<RegistryEntry<E>>?, alwaysSerializeAsList: Boolean) = RegistryEntryListCodec.method_40388<E>(registryRef, entryCodec, alwaysSerializeAsList)
}