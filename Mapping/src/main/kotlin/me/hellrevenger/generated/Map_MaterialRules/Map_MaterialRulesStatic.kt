package me.hellrevenger.generated.Map_MaterialRules
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MaterialRulesKt {
    /**
     * field_35222
     */
    val STONE_DEPTH_FLOOR by aliasStatic(MaterialRules::field_35222)
    /**
     * field_36341
     */
    val STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_6 by aliasStatic(MaterialRules::field_36341)
    /**
     * field_36342
     */
    val STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH_RANGE_30 by aliasStatic(MaterialRules::field_36342)
    /**
     * field_35494
     */
    val STONE_DEPTH_CEILING by aliasStatic(MaterialRules::field_35494)
    /**
     * field_35224
     */
    val STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH by aliasStatic(MaterialRules::field_35224)
    /**
     * field_35223
     */
    val STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH by aliasStatic(MaterialRules::field_35223)
    /**
     * method_39057
     */
    fun waterWithStoneDepth(offset: Int, runDepthMultiplier: Int) = MaterialRules.method_39057(offset, runDepthMultiplier)
    /**
     * method_39055
     */
    fun biome(biomes: Array<RegistryKey<Biome>>) = MaterialRules.method_39055(*biomes)
    /**
     * method_40023
     */
    fun stoneDepth(offset: Int, addSurfaceDepth: Boolean, secondaryDepthRange: Int, verticalSurfaceType: VerticalSurfaceType) = MaterialRules.method_40023(offset, addSurfaceDepth, secondaryDepthRange, verticalSurfaceType)
    /**
     * method_39050
     */
    fun sequence(rules: Array<net.minecraft.class_6686.class_6708>) = MaterialRules.method_39050(*rules)
    /**
     * method_39058
     */
    fun aboveYWithStoneDepth(anchor: YOffset, runDepthMultiplier: Int) = MaterialRules.method_39058(anchor, runDepthMultiplier)
    /**
     * method_39046
     */
    fun water(offset: Int, runDepthMultiplier: Int) = MaterialRules.method_39046(offset, runDepthMultiplier)
    /**
     * method_39051
     */
    fun aboveY(anchor: YOffset, runDepthMultiplier: Int) = MaterialRules.method_39051(anchor, runDepthMultiplier)
    /**
     * method_39059
     */
    fun temperature() = MaterialRules.method_39059()
    /**
     * method_39049
     */
    fun condition(condition: net.minecraft.class_6686.class_6693, rule: net.minecraft.class_6686.class_6708) = MaterialRules.method_39049(condition, rule)
    /**
     * method_39052
     */
    fun noiseThreshold(noise: RegistryKey<net.minecraft.class_5216.class_5487>, min: Double) = MaterialRules.method_39052(noise, min)
    /**
     * method_39053
     */
    fun noiseThreshold(noise: RegistryKey<net.minecraft.class_5216.class_5487>, min: Double, arg2: Double) = MaterialRules.method_39053(noise, min, arg2)
    /**
     * method_39048
     */
    fun not(target: net.minecraft.class_6686.class_6693) = MaterialRules.method_39048(target)
    /**
     * method_39056
     */
    fun hole() = MaterialRules.method_39056()
    /**
     * method_39472
     */
    fun verticalGradient(id: String, trueAtAndBelow: YOffset, falseAtAndAbove: YOffset) = MaterialRules.method_39472(id, trueAtAndBelow, falseAtAndAbove)
    /**
     * method_39047
     */
    fun block(state: BlockState) = MaterialRules.method_39047(state)
    /**
     * method_39045
     */
    fun steepSlope() = MaterialRules.method_39045()
    /**
     * method_39473
     */
    fun surface() = MaterialRules.method_39473()
    /**
     * method_39549
     */
    fun stoneDepth(offset: Int, addSurfaceDepth: Boolean, verticalSurfaceType: VerticalSurfaceType) = MaterialRules.method_39549(offset, addSurfaceDepth, verticalSurfaceType)
    /**
     * method_39060
     */
    fun terracottaBands() = MaterialRules.method_39060()
}