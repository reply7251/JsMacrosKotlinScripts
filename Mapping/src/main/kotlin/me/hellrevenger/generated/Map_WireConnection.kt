package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WireConnection

val WireConnection.UP by aliasEnum(WireConnection::class, "field_12686")
val WireConnection.NONE by aliasEnum(WireConnection::class, "field_12687")
val WireConnection.SIDE by aliasEnum(WireConnection::class, "field_12689")
fun WireConnection.isConnected() = this.method_27855()
