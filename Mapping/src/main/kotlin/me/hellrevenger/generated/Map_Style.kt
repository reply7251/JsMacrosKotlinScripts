package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Style

val Style.EMPTY by aliasStatic(Style::field_24360)
val Style.DEFAULT_FONT_ID by aliasStatic(Style::field_24359)
fun Style.isItalic() = this.method_10966()
fun Style.withClickEvent(arg0: ClickEvent) = this.method_10958(arg0)
fun Style.withHoverEvent(arg0: HoverEvent) = this.method_10949(arg0)
fun Style.withInsertion(arg0: String) = this.method_10975(arg0)
fun Style.isBold() = this.method_10984()
fun Style.isStrikethrough() = this.method_10986()
fun Style.withColor(arg0: TextColor) = this.method_27703(arg0)
fun Style.withFormatting(arg0: Formatting) = this.method_27706(arg0)
fun Style.withFont(arg0: Identifier) = this.method_27704(arg0)
fun Style.withParent(arg0: Style) = this.method_27702(arg0)
fun Style.withFormatting(arg0: Array<Formatting>) = this.method_27705(*arg0)
fun Style.withObfuscated(arg0: Boolean) = this.method_36141(arg0)
fun Style.withUnderline(arg0: Boolean) = this.method_30938(arg0)
fun Style.isUnderlined() = this.method_10965()
fun Style.isObfuscated() = this.method_10987()
fun Style.isEmpty() = this.method_10967()
fun Style.withExclusiveFormatting(arg0: Formatting) = this.method_27707(arg0)
fun Style.withItalic(arg0: Boolean) = this.method_10978(arg0)
fun Style.withColor(arg0: Int) = this.method_36139(arg0)
fun Style.withBold(arg0: Boolean) = this.method_10982(arg0)
fun Style.withColor(arg0: Formatting) = this.method_10977(arg0)
fun Style.withStrikethrough(arg0: Boolean) = this.method_36140(arg0)
