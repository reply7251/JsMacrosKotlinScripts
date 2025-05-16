package me.hellrevenger.generated.Map_NetworkEncryptionUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NetworkEncryptionUtilsKt {
    /**
     * field_39272
     */
    val BASE64_ENCODER by aliasStatic(NetworkEncryptionUtils::field_39272)
    /**
     * field_39033
     */
    val RSA_PUBLIC_KEY_PREFIX by aliasStatic(NetworkEncryptionUtils::field_39033)
    /**
     * field_39109
     */
    val SHA256_WITH_RSA by aliasStatic(NetworkEncryptionUtils::field_39109)
    /**
     * field_39034
     */
    val LINEBREAK by aliasStatic(NetworkEncryptionUtils::field_39034)
    /**
     * field_40111
     */
    val SHA256_BITS by aliasStatic(NetworkEncryptionUtils::field_40111)
    /**
     * method_15239
     */
    fun generateSecretKey() = NetworkEncryptionUtils.method_15239()
    /**
     * method_15242
     */
    fun decodeEncodedRsaPublicKey(key: ByteArray?) = NetworkEncryptionUtils.method_15242(key)
    /**
     * method_15240
     */
    fun computeServerId(baseServerId: String?, publicKey: PublicKey?, secretKey: SecretKey?) = NetworkEncryptionUtils.method_15240(baseServerId, publicKey, secretKey)
    /**
     * method_43521
     */
    fun encodeRsaPrivateKey(key: PrivateKey?) = NetworkEncryptionUtils.method_43521(key)
    /**
     * method_15235
     */
    fun cipherFromKey(opMode: Int, key: Key?) = NetworkEncryptionUtils.method_15235(opMode, key)
    /**
     * method_15243
     */
    fun decrypt(key: Key?, data: ByteArray?) = NetworkEncryptionUtils.method_15243(key, data)
    /**
     * method_15234
     */
    fun decryptSecretKey(privateKey: PrivateKey?, encryptedSecretKey: ByteArray?) = NetworkEncryptionUtils.method_15234(privateKey, encryptedSecretKey)
    /**
     * method_43524
     */
    fun decodeRsaPublicKeyPem(key: String?) = NetworkEncryptionUtils.method_43524(key)
    /**
     * method_43522
     */
    fun encodeRsaPublicKey(key: PublicKey?) = NetworkEncryptionUtils.method_43522(key)
    /**
     * method_15237
     */
    fun generateServerKeyPair() = NetworkEncryptionUtils.method_15237()
    /**
     * method_43519
     */
    fun decodeRsaPrivateKeyPem(key: String?) = NetworkEncryptionUtils.method_43519(key)
    /**
     * method_15238
     */
    fun encrypt(key: Key?, data: ByteArray?) = NetworkEncryptionUtils.method_15238(key, data)
}