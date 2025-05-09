package me.hellrevenger.generated.Map_LightmapTextureManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LightmapTextureManagerKt {
    /**
     * field_32767
     */
    val MAX_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32767)
    /**
     * field_32768
     */
    val MAX_SKY_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32768)
    /**
     * field_32769
     */
    val MAX_BLOCK_LIGHT_COORDINATE by aliasStatic(LightmapTextureManager::field_32769)
    /**
     * method_62226
     */
    fun getBrightness(ambientLight: Float, lightLevel: Int) = LightmapTextureManager.method_62226(ambientLight, lightLevel)
    /**
     * method_24186
     */
    fun getBlockLightCoordinates(light: Int) = LightmapTextureManager.method_24186(light)
    /**
     * method_24187
     */
    fun getSkyLightCoordinates(light: Int) = LightmapTextureManager.method_24187(light)
    /**
     * method_62228
     */
    fun applyEmission(light: Int, lightEmission: Int) = LightmapTextureManager.method_62228(light, lightEmission)
    /**
     * method_23687
     */
    fun pack(block: Int, sky: Int) = LightmapTextureManager.method_23687(block, sky)
    /**
     * method_23284
     */
    fun getBrightness(type: DimensionType, lightLevel: Int) = LightmapTextureManager.method_23284(type, lightLevel)
}