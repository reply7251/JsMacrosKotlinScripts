package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkEncryptionUtils

val NetworkEncryptionUtils.BASE64_ENCODER by aliasStatic(NetworkEncryptionUtils::field_39272)
val NetworkEncryptionUtils.RSA_PUBLIC_KEY_PREFIX by aliasStatic(NetworkEncryptionUtils::field_39033)
val NetworkEncryptionUtils.SHA256_WITH_RSA by aliasStatic(NetworkEncryptionUtils::field_39109)
val NetworkEncryptionUtils.RSA_PUBLIC_KEY_CODEC by aliasStatic(NetworkEncryptionUtils::field_39035)
val NetworkEncryptionUtils.LINEBREAK by aliasStatic(NetworkEncryptionUtils::field_39034)
val NetworkEncryptionUtils.SHA256_BITS by aliasStatic(NetworkEncryptionUtils::field_40111)
val NetworkEncryptionUtils.RSA_PRIVATE_KEY_CODEC by aliasStatic(NetworkEncryptionUtils::field_39036)
fun KClass<NetworkEncryptionUtils>.generateSecretKey() = NetworkEncryptionUtils.method_15239()
fun KClass<NetworkEncryptionUtils>.decodeEncodedRsaPublicKey(arg0: ByteArray) = NetworkEncryptionUtils.method_15242(arg0)
fun KClass<NetworkEncryptionUtils>.computeServerId(arg0: String, arg1: PublicKey, arg2: SecretKey) = NetworkEncryptionUtils.method_15240(arg0, arg1, arg2)
fun KClass<NetworkEncryptionUtils>.encodeRsaPrivateKey(arg0: PrivateKey) = NetworkEncryptionUtils.method_43521(arg0)
fun KClass<NetworkEncryptionUtils>.cipherFromKey(arg0: Int, arg1: Key) = NetworkEncryptionUtils.method_15235(arg0, arg1)
fun KClass<NetworkEncryptionUtils>.decrypt(arg0: Key, arg1: ByteArray) = NetworkEncryptionUtils.method_15243(arg0, arg1)
fun KClass<NetworkEncryptionUtils>.decryptSecretKey(arg0: PrivateKey, arg1: ByteArray) = NetworkEncryptionUtils.method_15234(arg0, arg1)
fun KClass<NetworkEncryptionUtils>.decodeRsaPublicKeyPem(arg0: String) = NetworkEncryptionUtils.method_43524(arg0)
fun KClass<NetworkEncryptionUtils>.encodeRsaPublicKey(arg0: PublicKey) = NetworkEncryptionUtils.method_43522(arg0)
fun KClass<NetworkEncryptionUtils>.generateServerKeyPair() = NetworkEncryptionUtils.method_15237()
fun KClass<NetworkEncryptionUtils>.decodeRsaPrivateKeyPem(arg0: String) = NetworkEncryptionUtils.method_43519(arg0)
fun KClass<NetworkEncryptionUtils>.encrypt(arg0: Key, arg1: ByteArray) = NetworkEncryptionUtils.method_15238(arg0, arg1)
