package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChestType

val ChestType.LEFT by aliasEnum(ChestType::class, "field_12574")
val ChestType.RIGHT by aliasEnum(ChestType::class, "field_12571")
val ChestType.SINGLE by aliasEnum(ChestType::class, "field_12569")
fun ChestType.getOpposite() = this.method_11824()
