package me.hellrevenger.generated.Map_ItemActionResult
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_47729
 */
val KClass<ItemActionResult>.CONSUME by aliasEnum(ItemActionResult::class, "field_47729")
/**
 * field_47728
 */
val KClass<ItemActionResult>.SUCCESS by aliasEnum(ItemActionResult::class, "field_47728")
/**
 * field_47732
 */
val KClass<ItemActionResult>.SKIP_DEFAULT_BLOCK_INTERACTION by aliasEnum(ItemActionResult::class, "field_47732")
/**
 * field_47733
 */
val KClass<ItemActionResult>.FAIL by aliasEnum(ItemActionResult::class, "field_47733")
/**
 * field_47730
 */
val KClass<ItemActionResult>.CONSUME_PARTIAL by aliasEnum(ItemActionResult::class, "field_47730")
/**
 * field_47731
 */
val KClass<ItemActionResult>.PASS_TO_DEFAULT_BLOCK_INTERACTION by aliasEnum(ItemActionResult::class, "field_47731")
/**
 * method_55644
 */
fun KClass<ItemActionResult>.success(arg0: Boolean) = ItemActionResult.method_55644(arg0)
/**
 * method_55643
 */
fun ItemActionResult.isAccepted() = this.method_55643()
/**
 * method_55645
 */
fun ItemActionResult.toActionResult() = this.method_55645()
