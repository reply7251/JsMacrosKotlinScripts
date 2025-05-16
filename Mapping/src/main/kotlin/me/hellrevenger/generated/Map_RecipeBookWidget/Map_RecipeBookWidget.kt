package me.hellrevenger.generated.Map_RecipeBookWidget
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_54831
 */
val <T>RecipeBookWidget<T>.tabs where T: AbstractRecipeScreenHandler by alias(RecipeBookWidget<*>::field_54831)
/**
 * method_62044
 */
fun <T>RecipeBookWidget<T>.onMouseClick(slot: Slot?) where T: AbstractRecipeScreenHandler = this.method_62044(slot)
/**
 * method_64876
 */
fun <T>RecipeBookWidget<T>.onRecipeDisplayed(recipeId: NetworkRecipeId?) where T: AbstractRecipeScreenHandler = this.method_64876(recipeId)
/**
 * method_2581
 */
fun <T>RecipeBookWidget<T>.drawGhostSlots(context: DrawContext?, resultHasPadding: Boolean) where T: AbstractRecipeScreenHandler = this.method_2581(context, resultHasPadding)
/**
 * method_2590
 */
fun <T>RecipeBookWidget<T>.update() where T: AbstractRecipeScreenHandler = this.method_2590()
/**
 * method_64875
 */
fun <T>RecipeBookWidget<T>.onCraftFailed(display: RecipeDisplay?) where T: AbstractRecipeScreenHandler = this.method_64875(display)
/**
 * method_2598
 */
fun <T>RecipeBookWidget<T>.isClickOutsideBounds(mouseX: Double, arg1: Double, mouseY: Int, arg3: Int, x: Int, y: Int, backgroundWidth: Int) where T: AbstractRecipeScreenHandler = this.method_2598(mouseX, arg1, mouseY, arg3, x, y, backgroundWidth)
/**
 * method_2591
 */
fun <T>RecipeBookWidget<T>.toggleOpen() where T: AbstractRecipeScreenHandler = this.method_2591()
/**
 * method_2605
 */
fun <T>RecipeBookWidget<T>.isOpen() where T: AbstractRecipeScreenHandler = this.method_2605()
/**
 * method_2592
 */
fun <T>RecipeBookWidget<T>.refresh() where T: AbstractRecipeScreenHandler = this.method_2592()
/**
 * method_2597
 */
fun <T>RecipeBookWidget<T>.initialize(parentWidth: Int, parentHeight: Int, client: MinecraftClient?, narrow: Boolean) where T: AbstractRecipeScreenHandler = this.method_2597(parentWidth, parentHeight, client, narrow)
/**
 * method_2601
 */
fun <T>RecipeBookWidget<T>.drawTooltip(context: DrawContext?, x: Int, y: Int, slot: Slot?) where T: AbstractRecipeScreenHandler = this.method_2601(context, x, y, slot)
/**
 * method_2595
 */
fun <T>RecipeBookWidget<T>.findLeftEdge(width: Int, backgroundWidth: Int) where T: AbstractRecipeScreenHandler = this.method_2595(width, backgroundWidth)
