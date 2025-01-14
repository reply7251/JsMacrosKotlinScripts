package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DynamicRegistryManager

fun <E>DynamicRegistryManager.get(arg0: RegistryKey<out Registry<out E>>) = this.method_30530<E>(arg0)
fun KClass<DynamicRegistryManager>.of(arg0: Registry<out Registry<*>>) = DynamicRegistryManager.method_40302(arg0)
fun DynamicRegistryManager.getRegistryLifecycle() = this.method_41201()
fun DynamicRegistryManager.streamAllRegistries() = this.method_40311()
fun <E>DynamicRegistryManager.getOptional(arg0: RegistryKey<out Registry<out E>>) = this.method_33310<E>(arg0)
fun DynamicRegistryManager.toImmutable() = this.method_40316()
