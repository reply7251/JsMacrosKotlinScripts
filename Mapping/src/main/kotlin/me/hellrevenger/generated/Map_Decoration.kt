package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Decoration

val Decoration.PACKET_CODEC by aliasStatic(Decoration::field_51971)
fun KClass<Decoration>.ofOutgoingMessage(arg0: String) = Decoration.method_44780(arg0)
fun Decoration.apply(arg0: Text, arg1: net.minecraft.class_2556.class_7602) = this.method_43832(arg0, arg1)
fun KClass<Decoration>.ofTeamMessage(arg0: String) = Decoration.method_43835(arg0)
fun KClass<Decoration>.ofIncomingMessage(arg0: String) = Decoration.method_44779(arg0)
fun KClass<Decoration>.ofChat(arg0: String) = Decoration.method_43831(arg0)
fun Decoration.parameters() = this.comp_789()
fun Decoration.style() = this.comp_790()
fun Decoration.translationKey() = this.comp_788()
