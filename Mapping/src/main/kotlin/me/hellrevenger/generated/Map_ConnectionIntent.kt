package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ConnectionIntent

val KClass<ConnectionIntent>.LOGIN by aliasEnum(ConnectionIntent::class, "field_44975")
val KClass<ConnectionIntent>.STATUS by aliasEnum(ConnectionIntent::class, "field_44974")
val KClass<ConnectionIntent>.TRANSFER by aliasEnum(ConnectionIntent::class, "field_48227")
fun ConnectionIntent.getId() = this.method_52283()
fun KClass<ConnectionIntent>.byId(arg0: Int) = ConnectionIntent.method_52284(arg0)
