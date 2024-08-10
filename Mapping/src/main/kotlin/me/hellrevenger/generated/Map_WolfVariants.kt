package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.WolfVariants

val WolfVariants.DEFAULT by aliasStatic(WolfVariants::field_51588)
val WolfVariants.SPOTTED by aliasStatic(WolfVariants::field_49726)
val WolfVariants.PALE by aliasStatic(WolfVariants::field_49725)
val WolfVariants.BLACK by aliasStatic(WolfVariants::field_49728)
val WolfVariants.SNOWY by aliasStatic(WolfVariants::field_49727)
val WolfVariants.ASHEN by aliasStatic(WolfVariants::field_49729)
val WolfVariants.WOODS by aliasStatic(WolfVariants::field_49731)
val WolfVariants.RUSTY by aliasStatic(WolfVariants::field_49730)
val WolfVariants.STRIPED by aliasStatic(WolfVariants::field_49733)
val WolfVariants.CHESTNUT by aliasStatic(WolfVariants::field_49732)
fun KClass<WolfVariants>.bootstrap(arg0: Registerable<WolfVariant>) = WolfVariants.method_58068(arg0)
fun KClass<WolfVariants>.fromBiome(arg0: DynamicRegistryManager, arg1: RegistryEntry<Biome>) = WolfVariants.method_58067(arg0, arg1)
