package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NavigationDirection

val KClass<NavigationDirection>.RIGHT by aliasEnum(NavigationDirection::class, "field_41829")
val KClass<NavigationDirection>.UP by aliasEnum(NavigationDirection::class, "field_41826")
val KClass<NavigationDirection>.DOWN by aliasEnum(NavigationDirection::class, "field_41827")
val KClass<NavigationDirection>.LEFT by aliasEnum(NavigationDirection::class, "field_41828")
fun NavigationDirection.getComparator() = this.method_48243()
fun NavigationDirection.getOpposite() = this.method_48239()
fun NavigationDirection.isBefore(arg0: Int, arg1: Int) = this.method_48240(arg0, arg1)
fun NavigationDirection.getAxis() = this.method_48237()
fun NavigationDirection.isPositive() = this.method_48241()
fun NavigationDirection.isAfter(arg0: Int, arg1: Int) = this.method_48238(arg0, arg1)
