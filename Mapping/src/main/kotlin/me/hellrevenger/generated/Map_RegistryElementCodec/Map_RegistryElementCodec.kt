package me.hellrevenger.generated.Map_RegistryElementCodec
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <E>KClass<RegistryElementCodec<E>>.of(arg0: RegistryKey<out Registry<E>>, arg1: Codec<E>) = RegistryElementCodec.method_29749<E>(arg0, arg1)
fun <E>KClass<RegistryElementCodec<E>>.of(arg0: RegistryKey<out Registry<E>>, arg1: Codec<E>, arg2: Boolean) = RegistryElementCodec.method_31192<E>(arg0, arg1, arg2)
fun <E, T>RegistryElementCodec<E>.encode(arg0: RegistryEntry<E>, arg1: DynamicOps<T>, arg2: T) = this.method_29748<T>(arg0, arg1, arg2)
