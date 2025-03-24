package me.hellrevenger.generated.Map_ContainerLock
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_5817
 */
val KClass<ContainerLock>.EMPTY by aliasStatic(ContainerLock::field_5817)
/**
 * field_29956
 */
val KClass<ContainerLock>.LOCK_KEY by aliasStatic(ContainerLock::field_29956)
/**
 * method_5472
 */
fun ContainerLock.canOpen(arg0: ItemStack) = this.method_5472(arg0)
/**
 * method_5474
 */
fun ContainerLock.writeNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = this.method_5474(arg0, arg1)
/**
 * method_5473
 */
fun KClass<ContainerLock>.fromNbt(arg0: NbtCompound, arg1: net.minecraft.class_7225.class_7874) = ContainerLock.method_5473(arg0, arg1)
/**
 * comp_3222
 */
fun ContainerLock.predicate() = this.comp_3222()
