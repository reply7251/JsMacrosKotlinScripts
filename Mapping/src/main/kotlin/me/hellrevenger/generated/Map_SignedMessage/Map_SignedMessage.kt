package me.hellrevenger.generated.Map_SignedMessage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_44865
 */
fun SignedMessage.getSalt() = this.method_44865()
/**
 * method_46293
 */
fun SignedMessage.isSenderMissing() = this.method_46293()
/**
 * method_44747
 */
fun SignedMessage.isExpiredOnServer(currentTime: Instant) = this.method_44747(currentTime)
/**
 * method_46291
 */
fun SignedMessage.getContent() = this.method_46291()
/**
 * method_45099
 */
fun SignedMessage.withFilterMaskEnabled(enabled: Boolean) = this.method_45099(enabled)
/**
 * method_44607
 */
fun SignedMessage.withoutUnsigned() = this.method_44607()
/**
 * method_55625
 */
fun SignedMessage.stripSignature() = this.method_55625()
/**
 * method_45100
 */
fun SignedMessage.isFullyFiltered() = this.method_45100()
/**
 * method_44862
 */
fun SignedMessage.getSignedContent() = this.method_44862()
/**
 * method_44858
 */
fun SignedMessage.verify(verifier: SignatureVerifier) = this.method_44858(verifier)
/**
 * method_44864
 */
fun SignedMessage.getTimestamp() = this.method_44864()
/**
 * method_46294
 */
fun SignedMessage.hasSignature() = this.method_46294()
/**
 * method_44748
 */
fun SignedMessage.isExpiredOnClient(currentTime: Instant) = this.method_44748(currentTime)
/**
 * method_45097
 */
fun SignedMessage.withFilterMask(filterMask: FilterMask) = this.method_45097(filterMask)
/**
 * method_46292
 */
fun SignedMessage.getSender() = this.method_46292()
/**
 * method_45040
 */
fun SignedMessage.canVerifyFrom(sender: UUID) = this.method_45040(sender)
/**
 * method_44863
 */
fun SignedMessage.withUnsignedContent(unsignedContent: Text) = this.method_44863(unsignedContent)
/**
 * comp_830
 */
fun SignedMessage.unsignedContent() = this.comp_830()
/**
 * comp_1084
 */
fun SignedMessage.signature() = this.comp_1084()
/**
 * comp_1083
 */
fun SignedMessage.link() = this.comp_1083()
/**
 * comp_981
 */
fun SignedMessage.filterMask() = this.comp_981()
/**
 * comp_928
 */
fun SignedMessage.signedBody() = this.comp_928()
