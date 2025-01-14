package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Rarity

val KClass<Rarity>.ID_TO_VALUE by aliasStatic(Rarity::field_50002)
val KClass<Rarity>.UNCOMMON by aliasEnum(Rarity::class, "field_8907")
val KClass<Rarity>.COMMON by aliasEnum(Rarity::class, "field_8906")
val KClass<Rarity>.RARE by aliasEnum(Rarity::class, "field_8903")
val KClass<Rarity>.EPIC by aliasEnum(Rarity::class, "field_8904")
fun Rarity.getFormatting() = this.method_58413()
