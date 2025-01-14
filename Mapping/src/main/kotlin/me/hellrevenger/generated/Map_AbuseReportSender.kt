package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AbuseReportSender

fun AbuseReportSender.canSendReports() = this.method_44561()
fun AbuseReportSender.send(arg0: UUID, arg1: AbuseReportType, arg2: report_AbuseReport) = this.method_44563(arg0, arg1, arg2)
fun AbuseReportSender.getLimits() = this.method_44564()
fun KClass<AbuseReportSender>.create(arg0: ReporterEnvironment, arg1: UserApiService) = AbuseReportSender.method_44562(arg0, arg1)
