package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FlowableFluid

val KClass<FlowableFluid>.LEVEL by aliasStatic(FlowableFluid::field_15900)
val KClass<FlowableFluid>.FALLING by aliasStatic(FlowableFluid::field_15902)
fun FlowableFluid.getStill() = this.method_15751()
fun FlowableFluid.getFlowing(arg0: Int, arg1: Boolean) = this.method_15728(arg0, arg1)
fun FlowableFluid.getStill(arg0: Boolean) = this.method_15729(arg0)
fun FlowableFluid.getFlowing() = this.method_15750()
