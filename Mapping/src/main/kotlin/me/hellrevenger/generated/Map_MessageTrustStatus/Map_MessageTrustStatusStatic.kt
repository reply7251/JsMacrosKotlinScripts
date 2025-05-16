package me.hellrevenger.generated.Map_MessageTrustStatus
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MessageTrustStatusKt {
    /**
     * field_39782
     */
    val NOT_SECURE by aliasEnum(MessageTrustStatus::class, "field_39782")
    /**
     * field_39780
     */
    val SECURE by aliasEnum(MessageTrustStatus::class, "field_39780")
    /**
     * field_39781
     */
    val MODIFIED by aliasEnum(MessageTrustStatus::class, "field_39781")
    /**
     * method_44742
     */
    fun getStatus(message: SignedMessage?, decorated: Text?, receptionTimestamp: Instant?) = MessageTrustStatus.method_44742(message, decorated, receptionTimestamp)
}