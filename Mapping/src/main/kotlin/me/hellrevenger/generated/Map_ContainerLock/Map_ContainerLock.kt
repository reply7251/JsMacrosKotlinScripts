package me.hellrevenger.generated.Map_ContainerLock
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<ContainerLock>.EMPTY by aliasStatic(ContainerLock::field_5817)
val KClass<ContainerLock>.LOCK_KEY by aliasStatic(ContainerLock::field_29956)
fun ContainerLock.writeNbt(arg0: NbtCompound) = this.method_5474(arg0)
fun ContainerLock.canOpen(arg0: ItemStack) = this.method_5472(arg0)
fun ContainerLock.key() = this.comp_2371()
fun KClass<ContainerLock>.fromNbt(arg0: NbtCompound) = ContainerLock.method_5473(arg0)
