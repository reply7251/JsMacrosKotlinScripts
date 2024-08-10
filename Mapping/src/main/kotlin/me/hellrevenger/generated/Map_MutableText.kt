package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.MutableText

fun MutableText.append(arg0: Text) = this.method_10852(arg0)
fun MutableText.setStyle(arg0: Style) = this.method_10862(arg0)
fun MutableText.withColor(arg0: Int) = this.method_54663(arg0)
fun MutableText.append(arg0: String) = this.method_27693(arg0)
fun KClass<MutableText>.of(arg0: TextContent) = MutableText.method_43477(arg0)
fun MutableText.styled(arg0: UnaryOperator<Style>) = this.method_27694(arg0)
fun MutableText.formatted(arg0: Formatting) = this.method_27692(arg0)
fun MutableText.fillStyle(arg0: Style) = this.method_27696(arg0)
fun MutableText.formatted(arg0: Array<Formatting>) = this.method_27695(*arg0)
