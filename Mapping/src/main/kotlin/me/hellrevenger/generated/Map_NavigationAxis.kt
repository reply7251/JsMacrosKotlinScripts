package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NavigationAxis

val KClass<NavigationAxis>.HORIZONTAL by aliasEnum(NavigationAxis::class, "field_41822")
val KClass<NavigationAxis>.VERTICAL by aliasEnum(NavigationAxis::class, "field_41823")
fun NavigationAxis.getPositiveDirection() = this.method_48234()
fun NavigationAxis.getOther() = this.method_48232()
fun NavigationAxis.getNegativeDirection() = this.method_48235()
fun NavigationAxis.getDirection(arg0: Boolean) = this.method_48233(arg0)
