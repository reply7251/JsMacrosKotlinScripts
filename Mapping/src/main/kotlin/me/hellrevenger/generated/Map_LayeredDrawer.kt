package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LayeredDrawer

val LayeredDrawer.LAYER_Z_PADDING by aliasStatic(LayeredDrawer::field_47848)
fun LayeredDrawer.addLayer(arg0: net.minecraft.class_9080.class_9081) = this.method_55810(arg0)
fun LayeredDrawer.addSubDrawer(arg0: LayeredDrawer, arg1: BooleanSupplier) = this.method_55811(arg0, arg1)
fun LayeredDrawer.render(arg0: DrawContext, arg1: RenderTickCounter) = this.method_55809(arg0, arg1)
