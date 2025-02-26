package me.hellrevenger.generated.Map_RegistryEntryListCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_40384
 */
fun <E, T>RegistryEntryListCodec<E>.encode(arg0: RegistryEntryList<E>, arg1: DynamicOps<T>, arg2: T) = this.method_40384<T>(arg0, arg1, arg2)
/**
 * method_40388
 */
fun <E>KClass<RegistryEntryListCodec<E>>.create(arg0: RegistryKey<out Registry<E>>, arg1: Codec<RegistryEntry<E>>, arg2: Boolean) = RegistryEntryListCodec.method_40388<E>(arg0, arg1, arg2)
