package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FontType

val KClass<FontType>.SPACE by aliasEnum(FontType::class, "field_37904")
val KClass<FontType>.REFERENCE by aliasEnum(FontType::class, "field_44761")
val KClass<FontType>.TTF by aliasEnum(FontType::class, "field_2317")
val KClass<FontType>.BITMAP by aliasEnum(FontType::class, "field_2312")
val KClass<FontType>.UNIHEX by aliasEnum(FontType::class, "field_2313")
fun FontType.getLoaderCodec() = this.method_51758()
