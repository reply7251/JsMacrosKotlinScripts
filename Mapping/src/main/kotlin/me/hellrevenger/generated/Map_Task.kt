package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Task

fun <E>Task<E>.getName() where E: LivingEntity = this.method_46910()
fun <E>Task<E>.getStatus() where E: LivingEntity = this.method_18921()
fun <E>Task<E>.stop(arg0: ServerWorld, arg1: E, arg2: Long) where E: LivingEntity = this.method_18925(arg0, arg1, arg2)
fun <E>Task<E>.tick(arg0: ServerWorld, arg1: E, arg2: Long) where E: LivingEntity = this.method_18923(arg0, arg1, arg2)
fun <E>Task<E>.tryStarting(arg0: ServerWorld, arg1: E, arg2: Long) where E: LivingEntity = this.method_18922(arg0, arg1, arg2)
