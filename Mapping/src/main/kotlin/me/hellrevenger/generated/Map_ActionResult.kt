package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ActionResult

val ActionResult.FAIL by aliasEnum(ActionResult::class, "field_5814")
val ActionResult.CONSUME_PARTIAL by aliasEnum(ActionResult::class, "field_33562")
val ActionResult.PASS by aliasEnum(ActionResult::class, "field_5811")
val ActionResult.SUCCESS by aliasEnum(ActionResult::class, "field_5812")
val ActionResult.CONSUME by aliasEnum(ActionResult::class, "field_21466")
val ActionResult.SUCCESS_NO_ITEM_USED by aliasEnum(ActionResult::class, "field_51370")
fun ActionResult.shouldSwingHand() = this.method_23666()
fun ActionResult.shouldIncrementStat() = this.method_36360()
fun ActionResult.isAccepted() = this.method_23665()
fun KClass<ActionResult>.success(arg0: Boolean) = ActionResult.method_29236(arg0)
