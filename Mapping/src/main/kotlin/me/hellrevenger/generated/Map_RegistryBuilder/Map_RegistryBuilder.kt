package me.hellrevenger.generated.Map_RegistryBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_40941
 */
val RegistryBuilder.registries by alias(RegistryBuilder::field_40941)
/**
 * method_46777
 */
fun <T>RegistryBuilder.addRegistry(registryRef: RegistryKey<out Registry<T>>?, bootstrapFunction: net.minecraft.class_7877.class_7882<T>?) = this.method_46777<T>(registryRef, bootstrapFunction)
/**
 * method_46776
 */
fun <T>RegistryBuilder.addRegistry(registryRef: RegistryKey<out Registry<T>>?, lifecycle: Lifecycle?, bootstrapFunction: net.minecraft.class_7877.class_7882<T>?) = this.method_46776<T>(registryRef, lifecycle, bootstrapFunction)
/**
 * method_46781
 */
fun RegistryBuilder.createWrapperLookup(baseRegistryManager: DynamicRegistryManager?, registries: net.minecraft.class_7225.class_7874?, cloneableRegistries: net.minecraft.class_8990.class_8991?) = this.method_46781(baseRegistryManager, registries, cloneableRegistries)
/**
 * method_46780
 */
fun RegistryBuilder.createWrapperLookup(registryManager: DynamicRegistryManager?) = this.method_46780(registryManager)
