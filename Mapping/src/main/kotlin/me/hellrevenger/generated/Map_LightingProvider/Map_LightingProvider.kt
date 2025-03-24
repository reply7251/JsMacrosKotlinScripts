package me.hellrevenger.generated.Map_LightingProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_52658
 */
val KClass<LightingProvider>.DEFAULT by aliasStatic(LightingProvider::field_52658)
/**
 * method_20601
 */
fun LightingProvider.setRetainData(arg0: ChunkPos, arg1: Boolean) = this.method_20601(arg0, arg1)
/**
 * method_22876
 */
fun LightingProvider.displaySectionLevel(arg0: LightType, arg1: ChunkSectionPos) = this.method_22876(arg0, arg1)
/**
 * method_22363
 */
fun LightingProvider.getLight(arg0: BlockPos, arg1: Int) = this.method_22363(arg0, arg1)
/**
 * method_51560
 */
fun LightingProvider.getStatus(arg0: LightType, arg1: ChunkSectionPos) = this.method_51560(arg0, arg1)
/**
 * method_15562
 */
fun LightingProvider.get(arg0: LightType) = this.method_15562(arg0)
/**
 * method_15558
 */
fun LightingProvider.enqueueSectionData(arg0: LightType, arg1: ChunkSectionPos, arg2: ChunkNibbleArray) = this.method_15558(arg0, arg1, arg2)
/**
 * method_31930
 */
fun LightingProvider.getTopY() = this.method_31930()
/**
 * method_31928
 */
fun LightingProvider.getHeight() = this.method_31928()
/**
 * method_31929
 */
fun LightingProvider.getBottomY() = this.method_31929()
/**
 * method_62874
 */
fun LightingProvider.isLightingEnabled(arg0: Long) = this.method_62874(arg0)
