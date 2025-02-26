package me.hellrevenger.generated.Map_SignedMessage
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_39786
 */
val KClass<SignedMessage>.SERVERBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39786)
/**
 * field_39787
 */
val KClass<SignedMessage>.CLIENTBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39787)
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
fun SignedMessage.isExpiredOnServer(arg0: Instant) = this.method_44747(arg0)
/**
 * method_46291
 */
fun SignedMessage.getContent() = this.method_46291()
/**
 * method_45099
 */
fun SignedMessage.withFilterMaskEnabled(arg0: Boolean) = this.method_45099(arg0)
/**
 * method_44607
 */
fun SignedMessage.withoutUnsigned() = this.method_44607()
/**
 * method_55625
 */
fun SignedMessage.stripSignature() = this.method_55625()
/**
 * method_45098
 */
fun KClass<SignedMessage>.ofUnsigned(arg0: UUID, arg1: String) = SignedMessage.method_45098(arg0, arg1)
/**
 * method_46290
 */
fun KClass<SignedMessage>.update(arg0: net.minecraft.class_7498.class_7499, arg1: MessageLink, arg2: MessageBody) = SignedMessage.method_46290(arg0, arg1, arg2)
/**
 * method_45041
 */
fun KClass<SignedMessage>.ofUnsigned(arg0: String) = SignedMessage.method_45041(arg0)
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
fun SignedMessage.verify(arg0: SignatureVerifier) = this.method_44858(arg0)
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
fun SignedMessage.isExpiredOnClient(arg0: Instant) = this.method_44748(arg0)
/**
 * method_45097
 */
fun SignedMessage.withFilterMask(arg0: FilterMask) = this.method_45097(arg0)
/**
 * method_46292
 */
fun SignedMessage.getSender() = this.method_46292()
/**
 * method_45040
 */
fun SignedMessage.canVerifyFrom(arg0: UUID) = this.method_45040(arg0)
/**
 * method_44863
 */
fun SignedMessage.withUnsignedContent(arg0: Text) = this.method_44863(arg0)
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
