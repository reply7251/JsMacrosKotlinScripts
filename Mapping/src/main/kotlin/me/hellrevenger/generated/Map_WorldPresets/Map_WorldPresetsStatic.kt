package me.hellrevenger.generated.Map_WorldPresets
import kotlin.reflect.*
import me.hellrevenger.generated.*
object WorldPresetsKt {
    /**
     * field_25050
     */
    val DEFAULT by aliasStatic(WorldPresets::field_25050)
    /**
     * field_35756
     */
    val LARGE_BIOMES by aliasStatic(WorldPresets::field_35756)
    /**
     * field_35757
     */
    val AMPLIFIED by aliasStatic(WorldPresets::field_35757)
    /**
     * field_25056
     */
    val SINGLE_BIOME_SURFACE by aliasStatic(WorldPresets::field_25056)
    /**
     * field_25054
     */
    val FLAT by aliasStatic(WorldPresets::field_25054)
    /**
     * field_25059
     */
    val DEBUG_ALL_BLOCK_STATES by aliasStatic(WorldPresets::field_25059)
    /**
     * method_64225
     */
    fun createTestOptions(registries: net.minecraft.class_7225.class_7874) = WorldPresets.method_64225(registries)
    /**
     * method_41593
     */
    fun bootstrap(presetRegisterable: Registerable<WorldPreset>) = WorldPresets.method_41593(presetRegisterable)
    /**
     * method_41594
     */
    fun getWorldPreset(registry: DimensionOptionsRegistryHolder) = WorldPresets.method_41594(registry)
    /**
     * method_41599
     */
    fun getDefaultOverworldOptions(registries: net.minecraft.class_7225.class_7874) = WorldPresets.method_41599(registries)
    /**
     * method_41598
     */
    fun createDemoOptions(registries: net.minecraft.class_7225.class_7874) = WorldPresets.method_41598(registries)
}