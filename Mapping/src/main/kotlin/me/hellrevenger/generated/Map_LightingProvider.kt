package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LightingProvider

fun LightingProvider.setRetainData(arg0: ChunkPos, arg1: Boolean) = this.method_20601(arg0, arg1)
fun LightingProvider.displaySectionLevel(arg0: LightType, arg1: ChunkSectionPos) = this.method_22876(arg0, arg1)
fun LightingProvider.isLightingEnabled(arg0: ChunkSectionPos) = this.method_51559(arg0)
fun LightingProvider.getLight(arg0: BlockPos, arg1: Int) = this.method_22363(arg0, arg1)
fun LightingProvider.getStatus(arg0: LightType, arg1: ChunkSectionPos) = this.method_51560(arg0, arg1)
fun LightingProvider.get(arg0: LightType) = this.method_15562(arg0)
fun LightingProvider.enqueueSectionData(arg0: LightType, arg1: ChunkSectionPos, arg2: ChunkNibbleArray) = this.method_15558(arg0, arg1, arg2)
fun LightingProvider.getTopY() = this.method_31930()
fun LightingProvider.getHeight() = this.method_31928()
fun LightingProvider.getBottomY() = this.method_31929()
