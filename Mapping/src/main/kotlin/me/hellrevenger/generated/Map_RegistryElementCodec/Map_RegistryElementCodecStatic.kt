package me.hellrevenger.generated.Map_RegistryElementCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryElementCodecKt {
    /**
     * method_29749
     */
    fun <E>of(registryRef: RegistryKey<out Registry<E>>?, elementCodec: Codec<E>?) = RegistryElementCodec.method_29749<E>(registryRef, elementCodec)
    /**
     * method_31192
     */
    fun <E>of(registryRef: RegistryKey<out Registry<E>>?, elementCodec: Codec<E>?, allowInlineDefinitions: Boolean) = RegistryElementCodec.method_31192<E>(registryRef, elementCodec, allowInlineDefinitions)
}