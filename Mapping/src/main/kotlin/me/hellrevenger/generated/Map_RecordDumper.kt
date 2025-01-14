package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecordDumper

val KClass<RecordDumper>.METRICS_DIRECTORY by aliasStatic(RecordDumper::field_32677)
val KClass<RecordDumper>.DEBUG_PROFILING_DIRECTORY by aliasStatic(RecordDumper::field_29616)
val KClass<RecordDumper>.DEVIATIONS_DIRECTORY by aliasStatic(RecordDumper::field_32678)
val KClass<RecordDumper>.FILE_NAME by aliasStatic(RecordDumper::field_32679)
fun RecordDumper.createDump(arg0: Set<Sampler>, arg1: Map<Sampler, MutableList<Deviation>>, arg2: ProfileResult) = this.method_34807(arg0, arg1, arg2)
