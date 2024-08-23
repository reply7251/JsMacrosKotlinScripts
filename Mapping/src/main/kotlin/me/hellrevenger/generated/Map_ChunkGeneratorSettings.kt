package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ChunkGeneratorSettings

val KClass<ChunkGeneratorSettings>.CAVES by aliasStatic(ChunkGeneratorSettings::field_26359)
val KClass<ChunkGeneratorSettings>.NETHER by aliasStatic(ChunkGeneratorSettings::field_26357)
val KClass<ChunkGeneratorSettings>.LARGE_BIOMES by aliasStatic(ChunkGeneratorSettings::field_35051)
val KClass<ChunkGeneratorSettings>.FLOATING_ISLANDS by aliasStatic(ChunkGeneratorSettings::field_26360)
val KClass<ChunkGeneratorSettings>.END by aliasStatic(ChunkGeneratorSettings::field_26358)
val KClass<ChunkGeneratorSettings>.AMPLIFIED by aliasStatic(ChunkGeneratorSettings::field_26356)
val KClass<ChunkGeneratorSettings>.OVERWORLD by aliasStatic(ChunkGeneratorSettings::field_26355)
fun ChunkGeneratorSettings.seaLevel() = this.comp_479()
fun KClass<ChunkGeneratorSettings>.createMissingSettings() = ChunkGeneratorSettings.method_44323()
fun ChunkGeneratorSettings.defaultFluid() = this.comp_476()
fun ChunkGeneratorSettings.mobGenerationDisabled() = this.comp_480()
fun ChunkGeneratorSettings.generationShapeConfig() = this.comp_474()
fun ChunkGeneratorSettings.hasAquifers() = this.method_33757()
fun ChunkGeneratorSettings.getRandomProvider() = this.method_38999()
fun ChunkGeneratorSettings.oreVeins() = this.comp_482()
fun ChunkGeneratorSettings.aquifers() = this.comp_481()
fun ChunkGeneratorSettings.defaultBlock() = this.comp_475()
fun KClass<ChunkGeneratorSettings>.bootstrap(arg0: Registerable<ChunkGeneratorSettings>) = ChunkGeneratorSettings.method_31111(arg0)
fun ChunkGeneratorSettings.surfaceRule() = this.comp_478()
fun ChunkGeneratorSettings.usesLegacyRandom() = this.comp_483()
fun ChunkGeneratorSettings.spawnTarget() = this.comp_538()
fun ChunkGeneratorSettings.noiseRouter() = this.comp_477()
