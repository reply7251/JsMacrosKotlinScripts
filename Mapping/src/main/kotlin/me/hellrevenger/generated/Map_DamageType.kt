package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.DamageType

val DamageType.ENTRY_CODEC by aliasStatic(DamageType::field_51565)
val DamageType.ENTRY_PACKET_CODEC by aliasStatic(DamageType::field_51932)
fun DamageType.exhaustion() = this.comp_1244()
fun DamageType.deathMessageType() = this.comp_1246()
fun DamageType.scaling() = this.comp_1243()
fun DamageType.effects() = this.comp_1245()
fun DamageType.msgId() = this.comp_1242()
