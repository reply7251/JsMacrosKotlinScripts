package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryOps

fun <T, E>RegistryOps<T>.getEntryLookup(arg0: RegistryKey<out Registry<out E>>) = this.method_46634<E>(arg0)
fun <T>KClass<RegistryOps<T>>.of(arg0: DynamicOps<T>, arg1: net.minecraft.class_6903.class_7863) = RegistryOps.method_40414<T>(arg0, arg1)
fun <T, U>RegistryOps<T>.withDelegate(arg0: DynamicOps<U>) = this.method_57110<U>(arg0)
fun <T>KClass<RegistryOps<T>>.withRegistry(arg0: Dynamic<T>, arg1: net.minecraft.class_7225.class_7874) = RegistryOps.method_56622<T>(arg0, arg1)
fun <T>KClass<RegistryOps<T>>.of(arg0: DynamicOps<T>, arg1: net.minecraft.class_7225.class_7874) = RegistryOps.method_46632<T>(arg0, arg1)
fun <T, E>RegistryOps<T>.getOwner(arg0: RegistryKey<out Registry<out E>>) = this.method_46628<E>(arg0)
fun <T, E, O>KClass<RegistryOps<T>>.getEntryCodec(arg0: RegistryKey<E>) = RegistryOps.method_46637<E, O>(arg0)
fun <T, E, O>KClass<RegistryOps<T>>.getEntryLookupCodec(arg0: RegistryKey<out Registry<out E>>) = RegistryOps.method_46636<E, O>(arg0)
