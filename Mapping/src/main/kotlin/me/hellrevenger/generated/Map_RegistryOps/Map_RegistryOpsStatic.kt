package me.hellrevenger.generated.Map_RegistryOps
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RegistryOpsKt {
    /**
     * method_40414
     */
    fun <T>of(delegate: DynamicOps<T>?, registryInfoGetter: net.minecraft.class_6903.class_7863?) = RegistryOps.method_40414<T>(delegate, registryInfoGetter)
    /**
     * method_56622
     */
    fun <T>withRegistry(dynamic: Dynamic<T>?, registries: net.minecraft.class_7225.class_7874?) = RegistryOps.method_56622<T>(dynamic, registries)
    /**
     * method_46632
     */
    fun <T>of(delegate: DynamicOps<T>?, registries: net.minecraft.class_7225.class_7874?) = RegistryOps.method_46632<T>(delegate, registries)
    /**
     * method_46637
     */
    fun <T, E, O>getEntryCodec(key: RegistryKey<E>?) = RegistryOps.method_46637<E, O>(key)
    /**
     * method_46636
     */
    fun <T, E, O>getEntryLookupCodec(registryRef: RegistryKey<out Registry<out E>>?) = RegistryOps.method_46636<E, O>(registryRef)
}