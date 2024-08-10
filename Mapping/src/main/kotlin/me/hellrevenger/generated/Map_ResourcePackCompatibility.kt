package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ResourcePackCompatibility

val ResourcePackCompatibility.TOO_NEW by aliasEnum(ResourcePackCompatibility::class, "field_14220")
val ResourcePackCompatibility.COMPATIBLE by aliasEnum(ResourcePackCompatibility::class, "field_14224")
val ResourcePackCompatibility.TOO_OLD by aliasEnum(ResourcePackCompatibility::class, "field_14223")
fun KClass<ResourcePackCompatibility>.from(arg0: Range<Int>, arg1: Int) = ResourcePackCompatibility.method_14436(arg0, arg1)
fun ResourcePackCompatibility.isCompatible() = this.method_14437()
