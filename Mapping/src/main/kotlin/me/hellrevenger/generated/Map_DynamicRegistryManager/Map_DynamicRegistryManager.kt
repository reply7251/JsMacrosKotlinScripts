package me.hellrevenger.generated.Map_DynamicRegistryManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_30530
 */
fun <E>DynamicRegistryManager.get(arg0: RegistryKey<out Registry<out E>>) = this.method_30530<E>(arg0)
/**
 * method_40302
 */
fun KClass<DynamicRegistryManager>.of(arg0: Registry<out Registry<*>>) = DynamicRegistryManager.method_40302(arg0)
/**
 * method_41201
 */
fun DynamicRegistryManager.getRegistryLifecycle() = this.method_41201()
/**
 * method_40311
 */
fun DynamicRegistryManager.streamAllRegistries() = this.method_40311()
/**
 * method_33310
 */
fun <E>DynamicRegistryManager.getOptional(arg0: RegistryKey<out Registry<out E>>) = this.method_33310<E>(arg0)
/**
 * method_40316
 */
fun DynamicRegistryManager.toImmutable() = this.method_40316()
