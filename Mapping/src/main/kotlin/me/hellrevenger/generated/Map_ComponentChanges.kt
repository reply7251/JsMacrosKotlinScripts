package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ComponentChanges

val KClass<ComponentChanges>.EMPTY by aliasStatic(ComponentChanges::field_49588)
fun ComponentChanges.withRemovedIf(arg0: Predicate<ComponentType<*>>) = this.method_58757(arg0)
fun ComponentChanges.entrySet() = this.method_57846()
fun ComponentChanges.isEmpty() = this.method_57848()
fun ComponentChanges.toAddedRemovedPair() = this.method_58759()
fun <T>ComponentChanges.get(arg0: ComponentType<out T>) = this.method_57845<T>(arg0)
fun KClass<ComponentChanges>.builder() = ComponentChanges.method_57841()
fun ComponentChanges.size() = this.method_57847()
