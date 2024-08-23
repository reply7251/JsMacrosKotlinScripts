package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DependencyTracker

fun <K, V>DependencyTracker<K, V>.traverse(arg0: BiConsumer<K, V>) where V: net.minecraft.class_8523.class_8524<K> = this.method_51487(arg0)
fun <K, V>DependencyTracker<K, V>.add(arg0: K, arg1: V) where V: net.minecraft.class_8523.class_8524<K> = this.method_51486(arg0, arg1)
