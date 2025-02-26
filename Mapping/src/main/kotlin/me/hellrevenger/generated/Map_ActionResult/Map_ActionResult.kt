package me.hellrevenger.generated.Map_ActionResult
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_5814
 */
val KClass<ActionResult>.FAIL by aliasEnum(ActionResult::class, "field_5814")
/**
 * field_33562
 */
val KClass<ActionResult>.CONSUME_PARTIAL by aliasEnum(ActionResult::class, "field_33562")
/**
 * field_5811
 */
val KClass<ActionResult>.PASS by aliasEnum(ActionResult::class, "field_5811")
/**
 * field_5812
 */
val KClass<ActionResult>.SUCCESS by aliasEnum(ActionResult::class, "field_5812")
/**
 * field_21466
 */
val KClass<ActionResult>.CONSUME by aliasEnum(ActionResult::class, "field_21466")
/**
 * field_51370
 */
val KClass<ActionResult>.SUCCESS_NO_ITEM_USED by aliasEnum(ActionResult::class, "field_51370")
/**
 * method_23666
 */
fun ActionResult.shouldSwingHand() = this.method_23666()
/**
 * method_36360
 */
fun ActionResult.shouldIncrementStat() = this.method_36360()
/**
 * method_23665
 */
fun ActionResult.isAccepted() = this.method_23665()
/**
 * method_29236
 */
fun KClass<ActionResult>.success(arg0: Boolean) = ActionResult.method_29236(arg0)
