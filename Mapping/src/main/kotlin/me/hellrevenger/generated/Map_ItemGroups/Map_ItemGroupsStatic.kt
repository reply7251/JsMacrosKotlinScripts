package me.hellrevenger.generated.Map_ItemGroups
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ItemGroupsKt {
    /**
     * field_41062
     */
    val INGREDIENTS by aliasStatic(ItemGroups::field_41062)
    /**
     * field_40198
     */
    val REDSTONE by aliasStatic(ItemGroups::field_40198)
    /**
     * field_42466
     */
    val displayContext by aliasStatic(ItemGroups::field_42466)
    /**
     * field_41059
     */
    val COLORED_BLOCKS by aliasStatic(ItemGroups::field_41059)
    /**
     * field_41063
     */
    val OPERATOR by aliasStatic(ItemGroups::field_41063)
    /**
     * field_40197
     */
    val FUNCTIONAL by aliasStatic(ItemGroups::field_40197)
    /**
     * field_40206
     */
    val INVENTORY by aliasStatic(ItemGroups::field_40206)
    /**
     * field_40202
     */
    val COMBAT by aliasStatic(ItemGroups::field_40202)
    /**
     * field_40743
     */
    val NATURAL by aliasStatic(ItemGroups::field_40743)
    /**
     * field_41060
     */
    val TOOLS by aliasStatic(ItemGroups::field_41060)
    /**
     * field_40205
     */
    val SPAWN_EGGS by aliasStatic(ItemGroups::field_40205)
    /**
     * field_41061
     */
    val FOOD_AND_DRINK by aliasStatic(ItemGroups::field_41061)
    /**
     * field_40195
     */
    val BUILDING_BLOCKS by aliasStatic(ItemGroups::field_40195)
    /**
     * field_40199
     */
    val HOTBAR by aliasStatic(ItemGroups::field_40199)
    /**
     * field_40200
     */
    val SEARCH by aliasStatic(ItemGroups::field_40200)
    /**
     * method_47341
     */
    fun getGroups() = ItemGroups.method_47341()
    /**
     * method_47335
     */
    fun getGroupsToDisplay() = ItemGroups.method_47335()
    /**
     * method_47344
     */
    fun getSearchGroup() = ItemGroups.method_47344()
    /**
     * method_47330
     */
    fun updateDisplayContext(enabledFeatures: FeatureSet?, operatorEnabled: Boolean, registries: net.minecraft.class_7225.class_7874?) = ItemGroups.method_47330(enabledFeatures, operatorEnabled, registries)
    /**
     * method_47328
     */
    fun getDefaultTab() = ItemGroups.method_47328()
    /**
     * method_47334
     */
    fun collect() = ItemGroups.method_47334()
    /**
     * method_51315
     */
    fun registerAndGetDefault(registry: Registry<ItemGroup>?) = ItemGroups.method_51315(registry)
}