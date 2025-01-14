package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LightmapTextureManager

val KClass<LightmapTextureManager>.MAX_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32767)
val KClass<LightmapTextureManager>.MAX_SKY_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32768)
val KClass<LightmapTextureManager>.MAX_BLOCK_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32769)
fun KClass<LightmapTextureManager>.getBlockLightCoordinates(arg0: Int) = LightmapTextureManager.method_24186(arg0)
fun KClass<LightmapTextureManager>.getSkyLightCoordinates(arg0: Int) = LightmapTextureManager.method_24187(arg0)
fun LightmapTextureManager.enable() = this.method_3316()
fun LightmapTextureManager.update(arg0: Float) = this.method_3313(arg0)
fun LightmapTextureManager.tick() = this.method_3314()
fun LightmapTextureManager.disable() = this.method_3315()
fun KClass<LightmapTextureManager>.pack(arg0: Int, arg1: Int) = LightmapTextureManager.method_23687(arg0, arg1)
fun KClass<LightmapTextureManager>.getBrightness(arg0: DimensionType, arg1: Int) = LightmapTextureManager.method_23284(arg0, arg1)
