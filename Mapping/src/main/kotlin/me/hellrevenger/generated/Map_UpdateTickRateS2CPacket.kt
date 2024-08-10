package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.UpdateTickRateS2CPacket

fun UpdateTickRateS2CPacket.apply(arg0: ClientPlayPacketListener) = this.method_54665(arg0)
fun KClass<UpdateTickRateS2CPacket>.create(arg0: TickManager) = UpdateTickRateS2CPacket.method_54664(arg0)
fun UpdateTickRateS2CPacket.isFrozen() = this.comp_2015()
fun UpdateTickRateS2CPacket.tickRate() = this.comp_2014()
