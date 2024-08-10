package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RandomSeed

val RandomSeed.GOLDEN_RATIO_64 by aliasStatic(RandomSeed::field_35133)
val RandomSeed.SILVER_RATIO_64 by aliasStatic(RandomSeed::field_35134)
fun KClass<RandomSeed>.createXoroshiroSeed(arg0: String) = RandomSeed.method_52180(arg0)
fun KClass<RandomSeed>.getSeed() = RandomSeed.method_39001()
fun KClass<RandomSeed>.createXoroshiroSeed(arg0: Long) = RandomSeed.method_39003(arg0)
fun KClass<RandomSeed>.createUnmixedXoroshiroSeed(arg0: Long) = RandomSeed.method_52211(arg0)
fun KClass<RandomSeed>.mixStafford13(arg0: Long) = RandomSeed.method_39002(arg0)
