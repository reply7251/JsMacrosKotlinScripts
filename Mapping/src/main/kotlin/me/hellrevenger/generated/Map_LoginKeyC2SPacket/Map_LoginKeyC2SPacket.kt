package me.hellrevenger.generated.Map_LoginKeyC2SPacket
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_12653
 */
fun LoginKeyC2SPacket.apply(arg0: ServerLoginPacketListener) = this.method_12653(arg0)
/**
 * method_12654
 */
fun LoginKeyC2SPacket.decryptSecretKey(privateKey: PrivateKey) = this.method_12654(privateKey)
/**
 * method_43643
 */
fun LoginKeyC2SPacket.verifySignedNonce(nonce: ByteArray, privateKey: PrivateKey) = this.method_43643(nonce, privateKey)
