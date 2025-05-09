package me.hellrevenger.generated.Map_LightingProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_20601
 */
fun LightingProvider.setRetainData(pos: ChunkPos, retainData: Boolean) = this.method_20601(pos, retainData)
/**
 * method_22876
 */
fun LightingProvider.displaySectionLevel(lightType: LightType, pos: ChunkSectionPos) = this.method_22876(lightType, pos)
/**
 * method_22363
 */
fun LightingProvider.getLight(pos: BlockPos, ambientDarkness: Int) = this.method_22363(pos, ambientDarkness)
/**
 * method_51560
 */
fun LightingProvider.getStatus(lightType: LightType, pos: ChunkSectionPos) = this.method_51560(lightType, pos)
/**
 * method_15562
 */
fun LightingProvider.get(lightType: LightType) = this.method_15562(lightType)
/**
 * method_15558
 */
fun LightingProvider.enqueueSectionData(lightType: LightType, pos: ChunkSectionPos, nibbles: ChunkNibbleArray) = this.method_15558(lightType, pos, nibbles)
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
fun LightingProvider.isLightingEnabled(sectionPos: Long) = this.method_62874(sectionPos)
