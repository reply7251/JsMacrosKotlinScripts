package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Signer

fun KClass<Signer>.create(arg0: PrivateKey, arg1: String) = Signer.method_44179(arg0, arg1)
fun Signer.sign(arg0: ByteArray) = this.method_44180(arg0)
