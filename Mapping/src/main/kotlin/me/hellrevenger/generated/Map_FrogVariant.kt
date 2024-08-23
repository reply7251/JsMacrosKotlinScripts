package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FrogVariant

val KClass<FrogVariant>.COLD by aliasStatic(FrogVariant::field_37464)
val KClass<FrogVariant>.TEMPERATE by aliasStatic(FrogVariant::field_37462)
val KClass<FrogVariant>.WARM by aliasStatic(FrogVariant::field_37463)
fun KClass<FrogVariant>.registerAndGetDefault(arg0: Registry<FrogVariant>) = FrogVariant.method_58369(arg0)
fun FrogVariant.texture() = this.comp_707()
