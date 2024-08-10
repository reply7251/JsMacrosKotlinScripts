package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GeneratorOptions

val GeneratorOptions.DEMO_OPTIONS by aliasStatic(GeneratorOptions::field_40367)
fun GeneratorOptions.isLegacyCustomizedType() = this.method_28035()
fun GeneratorOptions.withStructures(arg0: Boolean) = this.method_45542(arg0)
fun KClass<GeneratorOptions>.parseSeed(arg0: String) = GeneratorOptions.method_46720(arg0)
fun GeneratorOptions.hasBonusChest() = this.method_28030()
fun GeneratorOptions.withBonusChest(arg0: Boolean) = this.method_28036(arg0)
fun KClass<GeneratorOptions>.getRandomSeed() = GeneratorOptions.method_46721()
fun KClass<GeneratorOptions>.createRandom() = GeneratorOptions.method_45541()
fun GeneratorOptions.shouldGenerateStructures() = this.method_28029()
fun GeneratorOptions.withSeed(arg0: OptionalLong) = this.method_28024(arg0)
