package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AxisCycleDirection

val KClass<AxisCycleDirection>.AXES by aliasStatic(AxisCycleDirection::field_10961)
val KClass<AxisCycleDirection>.VALUES by aliasStatic(AxisCycleDirection::field_10960)
val KClass<AxisCycleDirection>.BACKWARD by aliasEnum(AxisCycleDirection::class, "field_10965")
val KClass<AxisCycleDirection>.FORWARD by aliasEnum(AxisCycleDirection::class, "field_10963")
val KClass<AxisCycleDirection>.NONE by aliasEnum(AxisCycleDirection::class, "field_10962")
fun AxisCycleDirection.choose(arg0: Int, arg1: Int, arg2: Int, arg3: net.minecraft.class_2350.class_2351) = this.method_10056(arg0, arg1, arg2, arg3)
fun AxisCycleDirection.cycle(arg0: net.minecraft.class_2350.class_2351) = this.method_10058(arg0)
fun KClass<AxisCycleDirection>.between(arg0: net.minecraft.class_2350.class_2351, arg1: net.minecraft.class_2350.class_2351) = AxisCycleDirection.method_10057(arg0, arg1)
fun AxisCycleDirection.opposite() = this.method_10055()
fun AxisCycleDirection.choose(arg0: Double, arg1: Double, arg2: Double, arg3: net.minecraft.class_2350.class_2351) = this.method_35819(arg0, arg1, arg2, arg3)
