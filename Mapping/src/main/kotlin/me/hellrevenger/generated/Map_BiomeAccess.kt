package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BiomeAccess

val BiomeAccess.CHUNK_CENTER_OFFSET by aliasStatic(BiomeAccess::field_28106)
fun BiomeAccess.getBiome(arg0: BlockPos) = this.method_22393(arg0)
fun BiomeAccess.getBiomeForNoiseGen(arg0: Double, arg1: Double, arg2: Double) = this.method_24938(arg0, arg1, arg2)
fun BiomeAccess.getBiomeForNoiseGen(arg0: BlockPos) = this.method_27344(arg0)
fun KClass<BiomeAccess>.hashSeed(arg0: Long) = BiomeAccess.method_27984(arg0)
fun BiomeAccess.getBiomeForNoiseGen(arg0: Int, arg1: Int, arg2: Int) = this.method_24854(arg0, arg1, arg2)
fun BiomeAccess.withSource(arg0: net.minecraft.class_4543.class_4544) = this.method_38107(arg0)
