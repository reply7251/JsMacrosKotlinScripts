package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.SignText

fun SignText.hasText(arg0: PlayerEntity) = this.method_49861(arg0)
fun SignText.withGlowing(arg0: Boolean) = this.method_49867(arg0)
fun SignText.isGlowing() = this.method_49856()
fun SignText.withMessage(arg0: Int, arg1: Text, arg2: Text) = this.method_49858(arg0, arg1, arg2)
fun SignText.getMessages(arg0: Boolean) = this.method_49877(arg0)
fun SignText.withMessage(arg0: Int, arg1: Text) = this.method_49857(arg0, arg1)
fun SignText.getColor() = this.method_49872()
fun SignText.getMessage(arg0: Int, arg1: Boolean) = this.method_49859(arg0, arg1)
fun SignText.hasRunCommandClickEvent(arg0: PlayerEntity) = this.method_49874(arg0)
fun SignText.withColor(arg0: DyeColor) = this.method_49862(arg0)
fun SignText.getOrderedMessages(arg0: Boolean, arg1: Function<Text, OrderedText>) = this.method_49868(arg0, arg1)
