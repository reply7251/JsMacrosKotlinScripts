package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Tasks

fun <E>KClass<Tasks>.weighted(arg0: List<util_Pair<out TaskRunnable<in E>, Int>>, arg1: net.minecraft.class_4103.class_4104, arg2: net.minecraft.class_4103.class_4216) where E: LivingEntity = Tasks.method_47167<E>(arg0, arg1, arg2)
fun <E>KClass<Tasks>.pickRandomly(arg0: List<util_Pair<out TaskRunnable<in E>, Int>>) where E: LivingEntity = Tasks.method_47166<E>(arg0)
