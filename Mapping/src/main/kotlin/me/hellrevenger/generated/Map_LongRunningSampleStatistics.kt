package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LongRunningSampleStatistics

fun <T>LongRunningSampleStatistics<T>.fastestSample() where T: LongRunningSample = this.comp_54()
fun <T>LongRunningSampleStatistics<T>.count() where T: LongRunningSample = this.comp_57()
fun <T>LongRunningSampleStatistics<T>.totalDuration() where T: LongRunningSample = this.comp_59()
fun <T>LongRunningSampleStatistics<T>.secondSlowestSample() where T: LongRunningSample = this.comp_56()
fun <T>LongRunningSampleStatistics<T>.slowestSample() where T: LongRunningSample = this.comp_55()
fun <T>KClass<LongRunningSampleStatistics<T>>.fromSamples(arg0: List<T>) where T: LongRunningSample = LongRunningSampleStatistics.method_38060<T>(arg0)
fun <T>LongRunningSampleStatistics<T>.quantiles() where T: LongRunningSample = this.comp_58()
