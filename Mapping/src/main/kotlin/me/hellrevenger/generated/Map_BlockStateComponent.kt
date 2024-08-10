package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockStateComponent

val BlockStateComponent.PACKET_CODEC by aliasStatic(BlockStateComponent::field_49286)
val BlockStateComponent.DEFAULT by aliasStatic(BlockStateComponent::field_49284)
fun <T>BlockStateComponent.with(arg0: property_Property<T>, arg1: T) where T: Comparable<T> = this.method_57420<T>(arg0, arg1)
fun BlockStateComponent.isEmpty() = this.method_57414()
fun BlockStateComponent.applyToState(arg0: BlockState) = this.method_57415(arg0)
fun <T>BlockStateComponent.with(arg0: property_Property<T>, arg1: BlockState) where T: Comparable<T> = this.method_57419<T>(arg0, arg1)
fun <T>BlockStateComponent.getValue(arg0: property_Property<T>) where T: Comparable<T> = this.method_57418<T>(arg0)
fun BlockStateComponent.properties() = this.comp_2381()
