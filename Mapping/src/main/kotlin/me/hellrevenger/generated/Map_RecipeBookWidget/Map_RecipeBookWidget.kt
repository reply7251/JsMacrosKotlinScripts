package me.hellrevenger.generated.Map_RecipeBookWidget
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<RecipeBookWidget>.BUTTON_TEXTURES by aliasStatic(RecipeBookWidget::field_45550)
fun RecipeBookWidget.drawGhostSlots(arg0: DrawContext, arg1: Int, arg2: Int, arg3: Boolean, arg4: Float) = this.method_2581(arg0, arg1, arg2, arg3, arg4)
fun RecipeBookWidget.initialize(arg0: Int, arg1: Int, arg2: MinecraftClient, arg3: Boolean, arg4: AbstractRecipeScreenHandler<*, *>) = this.method_2597(arg0, arg1, arg2, arg3, arg4)
fun RecipeBookWidget.acceptAlignedInput(arg0: Ingredient, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = this.method_60344(arg0, arg1, arg2, arg3, arg4)
fun RecipeBookWidget.update() = this.method_2590()
fun RecipeBookWidget.isClickOutsideBounds(arg0: Double, arg1: Double, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int) = this.method_2598(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
fun RecipeBookWidget.reset() = this.method_2579()
fun RecipeBookWidget.toggleOpen() = this.method_2591()
fun RecipeBookWidget.slotClicked(arg0: Slot) = this.method_2600(arg0)
fun RecipeBookWidget.drawTooltip(arg0: DrawContext, arg1: Int, arg2: Int, arg3: Int, arg4: Int) = this.method_2601(arg0, arg1, arg2, arg3, arg4)
fun RecipeBookWidget.isOpen() = this.method_2605()
fun RecipeBookWidget.refresh() = this.method_2592()
fun RecipeBookWidget.findLeftEdge(arg0: Int, arg1: Int) = this.method_2595(arg0, arg1)
fun RecipeBookWidget.showGhostRecipe(arg0: RecipeEntry<*>, arg1: MutableList<Slot>) = this.method_2596(arg0, arg1)
