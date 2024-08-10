package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MessageBody

fun MessageBody.update(arg0: net.minecraft.class_7498.class_7499) = this.method_46304(arg0)
fun MessageBody.timestamp() = this.comp_930()
fun MessageBody.toSerialized(arg0: MessageSignatureStorage) = this.method_46306(arg0)
fun KClass<MessageBody>.ofUnsigned(arg0: String) = MessageBody.method_46305(arg0)
fun MessageBody.lastSeenMessages() = this.comp_932()
fun MessageBody.content() = this.comp_929()
fun MessageBody.salt() = this.comp_931()
