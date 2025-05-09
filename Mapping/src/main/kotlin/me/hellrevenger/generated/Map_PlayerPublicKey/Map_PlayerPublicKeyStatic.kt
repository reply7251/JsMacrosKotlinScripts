package me.hellrevenger.generated.Map_PlayerPublicKey
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PlayerPublicKeyKt {
    /**
     * field_39954
     */
    val EXPIRED_PUBLIC_KEY_TEXT by aliasStatic(PlayerPublicKey::field_39954)
    /**
     * field_39955
     */
    val EXPIRATION_GRACE_PERIOD by aliasStatic(PlayerPublicKey::field_39955)
    /**
     * method_43550
     */
    fun verifyAndDecode(servicesSignatureVerifier: SignatureVerifier, playerUuid: UUID, publicKeyData: net.minecraft.class_7428.class_7443) = PlayerPublicKey.method_43550(servicesSignatureVerifier, playerUuid, publicKeyData)
}