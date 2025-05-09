package me.hellrevenger.generated.Map_AbuseReportReason
import kotlin.reflect.*
import me.hellrevenger.generated.*
object AbuseReportReasonKt {
    /**
     * field_53036
     */
    val SEXUALLY_INAPPROPRIATE by aliasEnum(AbuseReportReason::class, "field_53036")
    /**
     * field_53035
     */
    val I_WANT_TO_REPORT_THEM by aliasEnum(AbuseReportReason::class, "field_53035")
    /**
     * field_39659
     */
    val HATE_SPEECH by aliasEnum(AbuseReportReason::class, "field_39659")
    /**
     * field_39667
     */
    val SELF_HARM_OR_SUICIDE by aliasEnum(AbuseReportReason::class, "field_39667")
    /**
     * field_39666
     */
    val DEFAMATION_IMPERSONATION_FALSE_INFORMATION by aliasEnum(AbuseReportReason::class, "field_39666")
    /**
     * field_39663
     */
    val NON_CONSENSUAL_INTIMATE_IMAGERY by aliasEnum(AbuseReportReason::class, "field_39663")
    /**
     * field_39664
     */
    val HARASSMENT_OR_BULLYING by aliasEnum(AbuseReportReason::class, "field_39664")
    /**
     * field_39661
     */
    val CHILD_SEXUAL_EXPLOITATION_OR_ABUSE by aliasEnum(AbuseReportReason::class, "field_39661")
    /**
     * field_39662
     */
    val IMMINENT_HARM by aliasEnum(AbuseReportReason::class, "field_39662")
    /**
     * field_39660
     */
    val TERRORISM_OR_VIOLENT_EXTREMISM by aliasEnum(AbuseReportReason::class, "field_39660")
    /**
     * field_39670
     */
    val ALCOHOL_TOBACCO_DRUGS by aliasEnum(AbuseReportReason::class, "field_39670")
    /**
     * method_62164
     */
    fun getExcludedReasonsForType(reportType: AbuseReportType) = AbuseReportReason.method_62164(reportType)
}