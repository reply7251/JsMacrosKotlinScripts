package me.hellrevenger.generated.Map_GridWidget
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_48636
 */
fun GridWidget.setRowSpacing(rowSpacing: Int) = this.method_48636(rowSpacing)
/**
 * method_46452
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int) where T: Widget = this.method_46452<T>(widget, row, column)
/**
 * method_48635
 */
fun GridWidget.setColumnSpacing(columnSpacing: Int) = this.method_48635(columnSpacing)
/**
 * method_52734
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int, callback: Consumer<Positioner>?) where T: Widget = this.method_52734<T>(widget, row, column, callback)
/**
 * method_46453
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int, occupiedRows: Int, occupiedColumns: Int) where T: Widget = this.method_46453<T>(widget, row, column, occupiedRows, occupiedColumns)
/**
 * method_46457
 */
fun GridWidget.copyPositioner() = this.method_46457()
/**
 * method_46458
 */
fun GridWidget.getMainPositioner() = this.method_46458()
/**
 * method_46454
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int, occupiedRows: Int, occupiedColumns: Int, positioner: Positioner?) where T: Widget = this.method_46454<T>(widget, row, column, occupiedRows, occupiedColumns, positioner)
/**
 * method_46455
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int, positioner: Positioner?) where T: Widget = this.method_46455<T>(widget, row, column, positioner)
/**
 * method_52733
 */
fun <T>GridWidget.add(widget: T, row: Int, column: Int, occupiedBelow: Int, occupiedAbove: Int, callback: Consumer<Positioner>?) where T: Widget = this.method_52733<T>(widget, row, column, occupiedBelow, occupiedAbove, callback)
/**
 * method_47610
 */
fun GridWidget.createAdder(columns: Int) = this.method_47610(columns)
/**
 * method_48637
 */
fun GridWidget.setSpacing(spacing: Int) = this.method_48637(spacing)
