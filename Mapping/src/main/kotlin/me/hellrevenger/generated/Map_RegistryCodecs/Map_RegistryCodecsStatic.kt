package me.hellrevenger.generated.Map_RegistryCodecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryCodecsKt {
    /**
     * method_40349
     */
    fun <E>entryList(registryRef: RegistryKey<out Registry<E>>, alwaysSerializeAsList: Boolean) = RegistryCodecs.method_40349<E>(registryRef, alwaysSerializeAsList)
    /**
     * method_40341
     */
    fun <E>entryList(registryRef: RegistryKey<out Registry<E>>, elementCodec: Codec<E>) = RegistryCodecs.method_40341<E>(registryRef, elementCodec)
    /**
     * method_40343
     */
    fun <E>entryList(registryRef: RegistryKey<out Registry<E>>, elementCodec: Codec<E>, alwaysSerializeAsList: Boolean) = RegistryCodecs.method_40343<E>(registryRef, elementCodec, alwaysSerializeAsList)
    /**
     * method_40340
     */
    fun <E>entryList(registryRef: RegistryKey<out Registry<E>>) = RegistryCodecs.method_40340<E>(registryRef)
}