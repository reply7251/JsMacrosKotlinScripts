package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WireConnection

val KClass<WireConnection>.UP by aliasEnum(WireConnection::class, "field_12686")
val KClass<WireConnection>.NONE by aliasEnum(WireConnection::class, "field_12687")
val KClass<WireConnection>.SIDE by aliasEnum(WireConnection::class, "field_12689")
fun WireConnection.isConnected() = this.method_27855()
