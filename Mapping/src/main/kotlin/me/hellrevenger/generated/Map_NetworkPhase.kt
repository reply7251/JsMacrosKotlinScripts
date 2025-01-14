package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.NetworkPhase

val KClass<NetworkPhase>.STATUS by aliasEnum(NetworkPhase::class, "field_20592")
val KClass<NetworkPhase>.LOGIN by aliasEnum(NetworkPhase::class, "field_20593")
val KClass<NetworkPhase>.HANDSHAKING by aliasEnum(NetworkPhase::class, "field_20590")
val KClass<NetworkPhase>.PLAY by aliasEnum(NetworkPhase::class, "field_20591")
val KClass<NetworkPhase>.CONFIGURATION by aliasEnum(NetworkPhase::class, "field_45671")
fun NetworkPhase.getId() = this.method_10785()
