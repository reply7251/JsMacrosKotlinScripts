package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Angriness

val Angriness.AGITATED by aliasEnum(Angriness::class, "field_38121")
val Angriness.ANGRY by aliasEnum(Angriness::class, "field_38122")
val Angriness.CALM by aliasEnum(Angriness::class, "field_38120")
fun KClass<Angriness>.getForAnger(arg0: Int) = Angriness.method_42171(arg0)
fun Angriness.isAngry() = this.method_43691()
