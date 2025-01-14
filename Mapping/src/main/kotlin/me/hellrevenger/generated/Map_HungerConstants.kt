package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.HungerConstants

val KClass<HungerConstants>.FULL_FOOD_LEVEL by aliasStatic(HungerConstants::field_30704)
val KClass<HungerConstants>.SLOW_HEALING_FOOD_LEVEL by aliasStatic(HungerConstants::field_30711)
val KClass<HungerConstants>.FAST_HEALING_INTERVAL by aliasStatic(HungerConstants::field_30710)
val KClass<HungerConstants>.STARVING_FOOD_LEVEL by aliasStatic(HungerConstants::field_30713)
val KClass<HungerConstants>.EXHAUSTION_PER_HITPOINT by aliasStatic(HungerConstants::field_30712)
val KClass<HungerConstants>.EXHAUSTION_UNIT by aliasStatic(HungerConstants::field_30708)
val KClass<HungerConstants>.INITIAL_SATURATION_LEVEL by aliasStatic(HungerConstants::field_30706)
val KClass<HungerConstants>.SLOW_HEALING_STARVING_INTERVAL by aliasStatic(HungerConstants::field_30709)
fun KClass<HungerConstants>.calculateSaturation(arg0: Int, arg1: Float) = HungerConstants.method_59683(arg0, arg1)
