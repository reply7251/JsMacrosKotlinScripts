package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChestType

val KClass<ChestType>.LEFT by aliasEnum(ChestType::class, "field_12574")
val KClass<ChestType>.RIGHT by aliasEnum(ChestType::class, "field_12571")
val KClass<ChestType>.SINGLE by aliasEnum(ChestType::class, "field_12569")
fun ChestType.getOpposite() = this.method_11824()
