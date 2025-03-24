package me.hellrevenger.generated.Map_ItemCooldownManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_8024
 */
val ItemCooldownManager.entries by alias(ItemCooldownManager::field_8024)
/**
 * field_8025
 */
var ItemCooldownManager.tick by alias(ItemCooldownManager::field_8025)
/**
 * method_7905
 */
fun ItemCooldownManager.getCooldownProgress(arg0: ItemStack, arg1: Float) = this.method_7905(arg0, arg1)
/**
 * method_7906
 */
fun ItemCooldownManager.set(arg0: Identifier, arg1: Int) = this.method_7906(arg0, arg1)
/**
 * method_62835
 */
fun ItemCooldownManager.set(arg0: ItemStack, arg1: Int) = this.method_62835(arg0, arg1)
/**
 * method_7903
 */
fun ItemCooldownManager.update() = this.method_7903()
/**
 * method_7904
 */
fun ItemCooldownManager.isCoolingDown(arg0: ItemStack) = this.method_7904(arg0)
/**
 * method_62836
 */
fun ItemCooldownManager.getGroup(arg0: ItemStack) = this.method_62836(arg0)
/**
 * method_7900
 */
fun ItemCooldownManager.remove(arg0: Identifier) = this.method_7900(arg0)
