package me.hellrevenger.generated.Map_CrashReport
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_60919
 */
fun CrashReport.writeToFile(path: file_Path, type: ReportType) = this.method_60919(path, type)
/**
 * method_567
 */
fun CrashReport.getSystemDetailsSection() = this.method_567()
/**
 * method_36147
 */
fun CrashReport.getStackTrace() = this.method_36147()
/**
 * method_555
 */
fun CrashReport.addDetails(crashReportBuilder: StringBuilder) = this.method_555(crashReportBuilder)
/**
 * method_557
 */
fun CrashReport.getCauseAsString() = this.method_557()
/**
 * method_556
 */
fun CrashReport.addElement(name: String, ignoredStackTraceCallCount: Int) = this.method_556(name, ignoredStackTraceCallCount)
/**
 * method_561
 */
fun CrashReport.getMessage() = this.method_561()
/**
 * method_60921
 */
fun CrashReport.asString(type: ReportType, extraInfo: MutableList<String>) = this.method_60921(type, extraInfo)
/**
 * method_572
 */
fun CrashReport.getFile() = this.method_572()
/**
 * method_564
 */
fun CrashReport.getCause() = this.method_564()
