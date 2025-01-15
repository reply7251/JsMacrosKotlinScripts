package me.hellrevenger.generated.Map_PlayerPublicKey
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<PlayerPublicKey>.EXPIRED_PUBLIC_KEY_TEXT by aliasStatic(PlayerPublicKey::field_39954)
val KClass<PlayerPublicKey>.EXPIRATION_GRACE_PERIOD by aliasStatic(PlayerPublicKey::field_39955)
fun PlayerPublicKey.createSignatureInstance() = this.method_43697()
fun KClass<PlayerPublicKey>.verifyAndDecode(arg0: SignatureVerifier, arg1: UUID, arg2: net.minecraft.class_7428.class_7443) = PlayerPublicKey.method_43550(arg0, arg1, arg2)
fun PlayerPublicKey.data() = this.comp_767()
