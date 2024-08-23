package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemGroups

val KClass<ItemGroups>.INGREDIENTS by aliasStatic(ItemGroups::field_41062)
val KClass<ItemGroups>.REDSTONE by aliasStatic(ItemGroups::field_40198)
val KClass<ItemGroups>.displayContext by aliasStatic(ItemGroups::field_42466)
val KClass<ItemGroups>.COLORED_BLOCKS by aliasStatic(ItemGroups::field_41059)
val KClass<ItemGroups>.OPERATOR by aliasStatic(ItemGroups::field_41063)
val KClass<ItemGroups>.FUNCTIONAL by aliasStatic(ItemGroups::field_40197)
val KClass<ItemGroups>.INVENTORY by aliasStatic(ItemGroups::field_40206)
val KClass<ItemGroups>.COMBAT by aliasStatic(ItemGroups::field_40202)
val KClass<ItemGroups>.NATURAL by aliasStatic(ItemGroups::field_40743)
val KClass<ItemGroups>.TOOLS by aliasStatic(ItemGroups::field_41060)
val KClass<ItemGroups>.SPAWN_EGGS by aliasStatic(ItemGroups::field_40205)
val KClass<ItemGroups>.FOOD_AND_DRINK by aliasStatic(ItemGroups::field_41061)
val KClass<ItemGroups>.BUILDING_BLOCKS by aliasStatic(ItemGroups::field_40195)
val KClass<ItemGroups>.HOTBAR by aliasStatic(ItemGroups::field_40199)
val KClass<ItemGroups>.SEARCH by aliasStatic(ItemGroups::field_40200)
fun KClass<ItemGroups>.getGroups() = ItemGroups.method_47341()
fun KClass<ItemGroups>.getGroupsToDisplay() = ItemGroups.method_47335()
fun KClass<ItemGroups>.getSearchGroup() = ItemGroups.method_47344()
fun KClass<ItemGroups>.updateDisplayContext(arg0: FeatureSet, arg1: Boolean, arg2: net.minecraft.class_7225.class_7874) = ItemGroups.method_47330(arg0, arg1, arg2)
fun KClass<ItemGroups>.getDefaultTab() = ItemGroups.method_47328()
fun KClass<ItemGroups>.collect() = ItemGroups.method_47334()
fun KClass<ItemGroups>.registerAndGetDefault(arg0: Registry<ItemGroup>) = ItemGroups.method_51315(arg0)
