package me.hellrevenger.generated.Map_TagKey
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TagKeyKt {
    /**
     * method_40093
     */
    fun <T>codec(registryRef: RegistryKey<out Registry<T>>?) = TagKey.method_40093<T>(registryRef)
    /**
     * method_64143
     */
    fun <T>packetCodec(registryRef: RegistryKey<out Registry<T>>?) = TagKey.method_64143<T>(registryRef)
    /**
     * method_40090
     */
    fun <T>unprefixedCodec(registryRef: RegistryKey<out Registry<T>>?) = TagKey.method_40090<T>(registryRef)
    /**
     * method_40092
     */
    fun <T>of(registryRef: RegistryKey<out Registry<T>>?, id: Identifier?) = TagKey.method_40092<T>(registryRef, id)
}