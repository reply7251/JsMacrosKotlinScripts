package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LoginKeyC2SPacket

fun LoginKeyC2SPacket.apply(arg0: ServerLoginPacketListener) = this.method_12653(arg0)
fun LoginKeyC2SPacket.decryptSecretKey(arg0: PrivateKey) = this.method_12654(arg0)
fun LoginKeyC2SPacket.verifySignedNonce(arg0: ByteArray, arg1: PrivateKey) = this.method_43643(arg0, arg1)
