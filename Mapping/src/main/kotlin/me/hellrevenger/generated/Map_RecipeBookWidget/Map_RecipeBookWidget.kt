package me.hellrevenger.generated.Map_RecipeBookWidget
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_45550
 */
val <T>KClass<RecipeBookWidget<T>>.BUTTON_TEXTURES where T: AbstractRecipeScreenHandler by aliasStatic({RecipeBookWidget.field_45550})
/**
 * field_54831
 */
val <T>RecipeBookWidget<T>.tabs where T: AbstractRecipeScreenHandler by alias(RecipeBookWidget<*>::field_54831)
/**
 * method_62044
 */
fun <T>RecipeBookWidget<T>.onMouseClick(arg0: Slot) where T: AbstractRecipeScreenHandler = this.method_62044(arg0)
/**
 * method_64876
 */
fun <T>RecipeBookWidget<T>.onRecipeDisplayed(arg0: NetworkRecipeId) where T: AbstractRecipeScreenHandler = this.method_64876(arg0)
/**
 * method_2581
 */
fun <T>RecipeBookWidget<T>.drawGhostSlots(arg0: DrawContext, arg1: Boolean) where T: AbstractRecipeScreenHandler = this.method_2581(arg0, arg1)
/**
 * method_2590
 */
fun <T>RecipeBookWidget<T>.update() where T: AbstractRecipeScreenHandler = this.method_2590()
/**
 * method_64875
 */
fun <T>RecipeBookWidget<T>.onCraftFailed(arg0: RecipeDisplay) where T: AbstractRecipeScreenHandler = this.method_64875(arg0)
/**
 * method_2598
 */
fun <T>RecipeBookWidget<T>.isClickOutsideBounds(arg0: Double, arg1: Double, arg2: Int, arg3: Int, arg4: Int, arg5: Int, arg6: Int) where T: AbstractRecipeScreenHandler = this.method_2598(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
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
fun <T>RecipeBookWidget<T>.initialize(arg0: Int, arg1: Int, arg2: MinecraftClient, arg3: Boolean) where T: AbstractRecipeScreenHandler = this.method_2597(arg0, arg1, arg2, arg3)
/**
 * method_2601
 */
fun <T>RecipeBookWidget<T>.drawTooltip(arg0: DrawContext, arg1: Int, arg2: Int, arg3: Slot) where T: AbstractRecipeScreenHandler = this.method_2601(arg0, arg1, arg2, arg3)
/**
 * method_2595
 */
fun <T>RecipeBookWidget<T>.findLeftEdge(arg0: Int, arg1: Int) where T: AbstractRecipeScreenHandler = this.method_2595(arg0, arg1)
