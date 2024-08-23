package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Difficulty

val KClass<Difficulty>.EASY by aliasEnum(Difficulty::class, "field_5805")
val KClass<Difficulty>.NORMAL by aliasEnum(Difficulty::class, "field_5802")
val KClass<Difficulty>.HARD by aliasEnum(Difficulty::class, "field_5807")
val KClass<Difficulty>.PEACEFUL by aliasEnum(Difficulty::class, "field_5801")
fun Difficulty.getTranslatableName() = this.method_5463()
fun Difficulty.getName() = this.method_5460()
fun KClass<Difficulty>.byName(arg0: String) = Difficulty.method_16691(arg0)
fun KClass<Difficulty>.byId(arg0: Int) = Difficulty.method_5462(arg0)
fun Difficulty.getInfo() = this.method_48556()
fun Difficulty.getId() = this.method_5461()
