package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CriterionProgress

fun CriterionProgress.isObtained() = this.method_784()
fun KClass<CriterionProgress>.fromPacket(arg0: PacketByteBuf) = CriterionProgress.method_785(arg0)
fun CriterionProgress.toPacket(arg0: PacketByteBuf) = this.method_787(arg0)
fun CriterionProgress.reset() = this.method_790()
fun CriterionProgress.obtain() = this.method_789()
