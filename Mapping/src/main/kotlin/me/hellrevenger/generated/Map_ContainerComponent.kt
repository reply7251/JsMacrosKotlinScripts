package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ContainerComponent

val KClass<ContainerComponent>.DEFAULT by aliasStatic(ContainerComponent::field_49334)
fun ContainerComponent.copyFirstStack() = this.method_58114()
fun ContainerComponent.copyTo(arg0: DefaultedList<ItemStack>) = this.method_57492(arg0)
fun KClass<ContainerComponent>.fromStacks(arg0: MutableList<ItemStack>) = ContainerComponent.method_57493(arg0)
fun ContainerComponent.iterateNonEmpty() = this.method_59714()
fun ContainerComponent.stream() = this.method_57489()
fun ContainerComponent.iterateNonEmptyCopy() = this.method_59715()
fun ContainerComponent.streamNonEmpty() = this.method_59712()
