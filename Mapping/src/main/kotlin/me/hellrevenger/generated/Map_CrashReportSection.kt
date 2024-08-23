package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CrashReportSection

fun KClass<CrashReportSection>.createPositionString(arg0: HeightLimitView, arg1: Double, arg2: Double, arg3: Double) = CrashReportSection.method_583(arg0, arg1, arg2, arg3)
fun CrashReportSection.initStackTrace(arg0: Int) = this.method_579(arg0)
fun CrashReportSection.shouldGenerateStackTrace(arg0: StackTraceElement, arg1: StackTraceElement) = this.method_584(arg0, arg1)
fun KClass<CrashReportSection>.createPositionString(arg0: HeightLimitView, arg1: Int, arg2: Int, arg3: Int) = CrashReportSection.method_581(arg0, arg1, arg2, arg3)
fun CrashReportSection.addStackTrace(arg0: StringBuilder) = this.method_574(arg0)
fun CrashReportSection.add(arg0: String, arg1: CrashCallable<String>) = this.method_577(arg0, arg1)
fun CrashReportSection.add(arg0: String, arg1: Throwable) = this.method_585(arg0, arg1)
fun KClass<CrashReportSection>.addBlockInfo(arg0: CrashReportSection, arg1: HeightLimitView, arg2: BlockPos, arg3: BlockState) = CrashReportSection.method_586(arg0, arg1, arg2, arg3)
fun CrashReportSection.trimStackTraceEnd(arg0: Int) = this.method_580(arg0)
fun CrashReportSection.add(arg0: String, arg1: Object) = this.method_578(arg0, arg1)
fun KClass<CrashReportSection>.createPositionString(arg0: HeightLimitView, arg1: BlockPos) = CrashReportSection.method_582(arg0, arg1)
fun CrashReportSection.getStackTrace() = this.method_575()
