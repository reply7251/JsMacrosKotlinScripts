package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SignedMessage

val SignedMessage.SERVERBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39786)
val SignedMessage.CLIENTBOUND_TIME_TO_LIVE by aliasStatic(SignedMessage::field_39787)
fun SignedMessage.getSalt() = this.method_44865()
fun SignedMessage.isSenderMissing() = this.method_46293()
fun SignedMessage.isExpiredOnServer(arg0: Instant) = this.method_44747(arg0)
fun SignedMessage.getContent() = this.method_46291()
fun SignedMessage.withFilterMaskEnabled(arg0: Boolean) = this.method_45099(arg0)
fun SignedMessage.withoutUnsigned() = this.method_44607()
fun SignedMessage.stripSignature() = this.method_55625()
fun KClass<SignedMessage>.ofUnsigned(arg0: UUID, arg1: String) = SignedMessage.method_45098(arg0, arg1)
fun KClass<SignedMessage>.update(arg0: net.minecraft.class_7498.class_7499, arg1: MessageLink, arg2: MessageBody) = SignedMessage.method_46290(arg0, arg1, arg2)
fun KClass<SignedMessage>.ofUnsigned(arg0: String) = SignedMessage.method_45041(arg0)
fun SignedMessage.isFullyFiltered() = this.method_45100()
fun SignedMessage.getSignedContent() = this.method_44862()
fun SignedMessage.verify(arg0: SignatureVerifier) = this.method_44858(arg0)
fun SignedMessage.getTimestamp() = this.method_44864()
fun SignedMessage.hasSignature() = this.method_46294()
fun SignedMessage.isExpiredOnClient(arg0: Instant) = this.method_44748(arg0)
fun SignedMessage.withFilterMask(arg0: FilterMask) = this.method_45097(arg0)
fun SignedMessage.getSender() = this.method_46292()
fun SignedMessage.canVerifyFrom(arg0: UUID) = this.method_45040(arg0)
fun SignedMessage.withUnsignedContent(arg0: Text) = this.method_44863(arg0)
fun SignedMessage.unsignedContent() = this.comp_830()
fun SignedMessage.signature() = this.comp_1084()
fun SignedMessage.link() = this.comp_1083()
fun SignedMessage.filterMask() = this.comp_981()
fun SignedMessage.signedBody() = this.comp_928()
