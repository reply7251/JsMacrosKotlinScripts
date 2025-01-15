package me.hellrevenger.generated.Map_RegistryBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*

val RegistryBuilder.registries by alias(RegistryBuilder::field_40941)
fun <T>RegistryBuilder.addRegistry(arg0: RegistryKey<out Registry<T>>, arg1: net.minecraft.class_7877.class_7882<T>) = this.method_46777<T>(arg0, arg1)
fun <T>RegistryBuilder.addRegistry(arg0: RegistryKey<out Registry<T>>, arg1: Lifecycle, arg2: net.minecraft.class_7877.class_7882<T>) = this.method_46776<T>(arg0, arg1, arg2)
fun RegistryBuilder.createWrapperLookup(arg0: DynamicRegistryManager, arg1: net.minecraft.class_7225.class_7874, arg2: net.minecraft.class_8990.class_8991) = this.method_46781(arg0, arg1, arg2)
fun RegistryBuilder.createWrapperLookup(arg0: DynamicRegistryManager) = this.method_46780(arg0)
