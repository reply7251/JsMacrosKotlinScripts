package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkSide

val NetworkSide.CLIENTBOUND by aliasEnum(NetworkSide::class, "field_11942")
val NetworkSide.SERVERBOUND by aliasEnum(NetworkSide::class, "field_11941")
fun NetworkSide.getOpposite() = this.method_36146()
