package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Biome

val Biome.weather by alias(Biome::field_26393)
val Biome.REGISTRY_CODEC by aliasStatic(Biome::field_24677)
val Biome.generationSettings by alias(Biome::field_26635)
val Biome.spawnSettings by alias(Biome::field_26395)
val Biome.FOLIAGE_NOISE by aliasStatic(Biome::field_9324)
val Biome.NETWORK_CODEC by aliasStatic(Biome::field_26633)
val Biome.REGISTRY_ENTRY_LIST_CODEC by aliasStatic(Biome::field_26750)
fun Biome.getLoopSound() = this.method_24935()
fun Biome.shouldGenerateLowerFrozenOceanSurface(arg0: BlockPos) = this.method_39928(arg0)
fun Biome.getFoliageColor() = this.method_8698()
fun Biome.hasPrecipitation() = this.method_48163()
fun Biome.canSetSnow(arg0: WorldView, arg1: BlockPos) = this.method_8696(arg0, arg1)
fun Biome.getMoodSound() = this.method_24936()
fun Biome.getMusic() = this.method_27343()
fun Biome.doesNotSnow(arg0: BlockPos) = this.method_39927(arg0)
fun Biome.getSkyColor() = this.method_8697()
fun Biome.getGrassColorAt(x: Double, z: Double) = this.method_8711(x, z)
fun Biome.getPrecipitation(arg0: BlockPos) = this.method_48162(arg0)
fun Biome.getFogColor() = this.method_24376()
fun Biome.getAdditionsSound() = this.method_24937()
fun Biome.canSetIce(arg0: WorldView, arg1: BlockPos, arg2: Boolean) = this.method_8685(arg0, arg1, arg2)
fun Biome.getWaterFogColor() = this.method_8713()
fun Biome.getParticleConfig() = this.method_24378()
fun Biome.canSetIce(arg0: WorldView, arg1: BlockPos) = this.method_8705(arg0, arg1)
fun Biome.getWaterColor() = this.method_8687()
fun Biome.getTemperature() = this.method_8712()
fun Biome.isCold(arg0: BlockPos) = this.method_33599(arg0)
