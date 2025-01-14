package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RegistryCodecs

fun <E>KClass<RegistryCodecs>.entryList(arg0: RegistryKey<out Registry<E>>, arg1: Boolean) = RegistryCodecs.method_40349<E>(arg0, arg1)
fun <E>KClass<RegistryCodecs>.entryList(arg0: RegistryKey<out Registry<E>>, arg1: Codec<E>) = RegistryCodecs.method_40341<E>(arg0, arg1)
fun <E>KClass<RegistryCodecs>.entryList(arg0: RegistryKey<out Registry<E>>, arg1: Codec<E>, arg2: Boolean) = RegistryCodecs.method_40343<E>(arg0, arg1, arg2)
fun <E>KClass<RegistryCodecs>.entryList(arg0: RegistryKey<out Registry<E>>) = RegistryCodecs.method_40340<E>(arg0)
