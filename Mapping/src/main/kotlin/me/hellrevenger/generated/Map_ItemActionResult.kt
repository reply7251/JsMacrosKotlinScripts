package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemActionResult

val KClass<ItemActionResult>.CONSUME by aliasEnum(ItemActionResult::class, "field_47729")
val KClass<ItemActionResult>.SUCCESS by aliasEnum(ItemActionResult::class, "field_47728")
val KClass<ItemActionResult>.SKIP_DEFAULT_BLOCK_INTERACTION by aliasEnum(ItemActionResult::class, "field_47732")
val KClass<ItemActionResult>.FAIL by aliasEnum(ItemActionResult::class, "field_47733")
val KClass<ItemActionResult>.CONSUME_PARTIAL by aliasEnum(ItemActionResult::class, "field_47730")
val KClass<ItemActionResult>.PASS_TO_DEFAULT_BLOCK_INTERACTION by aliasEnum(ItemActionResult::class, "field_47731")
fun KClass<ItemActionResult>.success(arg0: Boolean) = ItemActionResult.method_55644(arg0)
fun ItemActionResult.isAccepted() = this.method_55643()
fun ItemActionResult.toActionResult() = this.method_55645()
