package me.hellrevenger.generated.Map_Perspective
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<Perspective>.THIRD_PERSON_FRONT by aliasEnum(Perspective::class, "field_26666")
val KClass<Perspective>.FIRST_PERSON by aliasEnum(Perspective::class, "field_26664")
val KClass<Perspective>.THIRD_PERSON_BACK by aliasEnum(Perspective::class, "field_26665")
fun Perspective.isFrontView() = this.method_31035()
fun Perspective.isFirstPerson() = this.method_31034()
fun Perspective.next() = this.method_31036()
