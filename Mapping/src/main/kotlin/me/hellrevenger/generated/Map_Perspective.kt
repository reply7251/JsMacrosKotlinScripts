package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Perspective

val Perspective.THIRD_PERSON_FRONT by aliasEnum(Perspective::class, "field_26666")
val Perspective.FIRST_PERSON by aliasEnum(Perspective::class, "field_26664")
val Perspective.THIRD_PERSON_BACK by aliasEnum(Perspective::class, "field_26665")
fun Perspective.isFrontView() = this.method_31035()
fun Perspective.isFirstPerson() = this.method_31034()
fun Perspective.next() = this.method_31036()
