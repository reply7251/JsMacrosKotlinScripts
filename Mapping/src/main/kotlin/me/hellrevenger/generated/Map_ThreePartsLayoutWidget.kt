package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ThreePartsLayoutWidget

val ThreePartsLayoutWidget.DEFAULT_HEADER_FOOTER_HEIGHT by aliasStatic(ThreePartsLayoutWidget::field_42490)
fun <T>ThreePartsLayoutWidget.addBody(arg0: T) where T: Widget = this.method_48999<T>(arg0)
fun <T>ThreePartsLayoutWidget.addFooter(arg0: T, arg1: Consumer<Positioner>) where T: Widget = this.method_48997<T>(arg0, arg1)
fun <T>ThreePartsLayoutWidget.addBody(arg0: T, arg1: Consumer<Positioner>) where T: Widget = this.method_49000<T>(arg0, arg1)
fun ThreePartsLayoutWidget.setHeaderHeight(arg0: Int) = this.method_48995(arg0)
fun ThreePartsLayoutWidget.addHeader(arg0: Text, arg1: TextRenderer) = this.method_57726(arg0, arg1)
fun ThreePartsLayoutWidget.setFooterHeight(arg0: Int) = this.method_48991(arg0)
fun ThreePartsLayoutWidget.getContentHeight() = this.method_57727()
fun <T>ThreePartsLayoutWidget.addHeader(arg0: T, arg1: Consumer<Positioner>) where T: Widget = this.method_48993<T>(arg0, arg1)
fun <T>ThreePartsLayoutWidget.addHeader(arg0: T) where T: Widget = this.method_48992<T>(arg0)
fun <T>ThreePartsLayoutWidget.addFooter(arg0: T) where T: Widget = this.method_48996<T>(arg0)
