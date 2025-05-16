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
fun ItemCooldownManager.getCooldownProgress(stack: ItemStack?, tickDelta: Float) = this.method_7905(stack, tickDelta)
/**
 * method_7906
 */
fun ItemCooldownManager.set(groupId: Identifier?, duration: Int) = this.method_7906(groupId, duration)
/**
 * method_62835
 */
fun ItemCooldownManager.set(stack: ItemStack?, duration: Int) = this.method_62835(stack, duration)
/**
 * method_7903
 */
fun ItemCooldownManager.update() = this.method_7903()
/**
 * method_7904
 */
fun ItemCooldownManager.isCoolingDown(stack: ItemStack?) = this.method_7904(stack)
/**
 * method_62836
 */
fun ItemCooldownManager.getGroup(stack: ItemStack?) = this.method_62836(stack)
/**
 * method_7900
 */
fun ItemCooldownManager.remove(groupId: Identifier?) = this.method_7900(groupId)
