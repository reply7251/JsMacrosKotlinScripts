package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.CatVariant

val CatVariant.PACKET_CODEC by aliasStatic(CatVariant::field_51941)
val CatVariant.ALL_BLACK by aliasStatic(CatVariant::field_38719)
val CatVariant.PERSIAN by aliasStatic(CatVariant::field_38715)
val CatVariant.RAGDOLL by aliasStatic(CatVariant::field_38716)
val CatVariant.WHITE by aliasStatic(CatVariant::field_38717)
val CatVariant.JELLIE by aliasStatic(CatVariant::field_38718)
val CatVariant.BLACK by aliasStatic(CatVariant::field_38710)
val CatVariant.RED by aliasStatic(CatVariant::field_38711)
val CatVariant.SIAMESE by aliasStatic(CatVariant::field_38712)
val CatVariant.BRITISH_SHORTHAIR by aliasStatic(CatVariant::field_38713)
val CatVariant.CALICO by aliasStatic(CatVariant::field_38714)
val CatVariant.TABBY by aliasStatic(CatVariant::field_38709)
fun KClass<CatVariant>.registerAndGetDefault(arg0: Registry<CatVariant>) = CatVariant.method_46646(arg0)
fun CatVariant.texture() = this.comp_706()
