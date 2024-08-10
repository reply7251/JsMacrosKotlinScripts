package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FrogVariant

val FrogVariant.PACKET_CODEC by aliasStatic(FrogVariant::field_51942)
val FrogVariant.COLD by aliasStatic(FrogVariant::field_37464)
val FrogVariant.TEMPERATE by aliasStatic(FrogVariant::field_37462)
val FrogVariant.WARM by aliasStatic(FrogVariant::field_37463)
fun KClass<FrogVariant>.registerAndGetDefault(arg0: Registry<FrogVariant>) = FrogVariant.method_58369(arg0)
fun FrogVariant.texture() = this.comp_707()
