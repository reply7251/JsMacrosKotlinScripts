package me.hellrevenger.generated.Map_CrashReportSection
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_579
 */
fun CrashReportSection.initStackTrace(ignoredCallCount: Int) = this.method_579(ignoredCallCount)
/**
 * method_584
 */
fun CrashReportSection.shouldGenerateStackTrace(prev: StackTraceElement?, next: StackTraceElement?) = this.method_584(prev, next)
/**
 * method_574
 */
fun CrashReportSection.addStackTrace(crashReportBuilder: StringBuilder?) = this.method_574(crashReportBuilder)
/**
 * method_577
 */
fun CrashReportSection.add(name: String?, callable: CrashCallable<String>?) = this.method_577(name, callable)
/**
 * method_585
 */
fun CrashReportSection.add(name: String?, throwable: Throwable?) = this.method_585(name, throwable)
/**
 * method_580
 */
fun CrashReportSection.trimStackTraceEnd(callCount: Int) = this.method_580(callCount)
/**
 * method_578
 */
fun CrashReportSection.add(name: String?, detail: Object?) = this.method_578(name, detail)
/**
 * method_575
 */
fun CrashReportSection.getStackTrace() = this.method_575()
