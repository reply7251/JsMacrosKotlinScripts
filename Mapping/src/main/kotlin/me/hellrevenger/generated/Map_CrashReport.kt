package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CrashReport

fun CrashReport.writeToFile(arg0: file_Path, arg1: ReportType) = this.method_60919(arg0, arg1)
fun KClass<CrashReport>.initCrashReport() = CrashReport.method_24305()
fun CrashReport.addDetails(arg0: StringBuilder) = this.method_555(arg0)
fun CrashReport.getCauseAsString() = this.method_557()
fun KClass<CrashReport>.create(arg0: Throwable, arg1: String) = CrashReport.method_560(arg0, arg1)
fun CrashReport.addElement(arg0: String, arg1: Int) = this.method_556(arg0, arg1)
fun CrashReport.asString(arg0: ReportType, arg1: List<String>) = this.method_60921(arg0, arg1)
fun CrashReport.asString(arg0: ReportType) = this.method_60920(arg0)
fun CrashReport.addElement(arg0: String) = this.method_562(arg0)
fun CrashReport.writeToFile(arg0: file_Path, arg1: ReportType, arg2: List<String>) = this.method_569(arg0, arg1, arg2)
