package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.PacketType

fun <T>PacketType<T>.side() where T: Packet<*> = this.comp_2230()
fun <T>PacketType<T>.id() where T: Packet<*> = this.comp_2231()
