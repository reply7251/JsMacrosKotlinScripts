package me.hellrevenger.generated.Map_CookingRecipeJsonBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_17801
 */
fun <T>KClass<CookingRecipeJsonBuilder>.create(arg0: Ingredient, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int, arg5: RecipeSerializer<T>, arg6: net.minecraft.class_1874.class_3958<T>) where T: AbstractCookingRecipe = CookingRecipeJsonBuilder.method_17801<T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
/**
 * method_35917
 */
fun CookingRecipeJsonBuilder.group(arg0: String) = this.method_35917(arg0)
/**
 * method_17802
 */
fun KClass<CookingRecipeJsonBuilder>.createSmelting(arg0: Ingredient, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int) = CookingRecipeJsonBuilder.method_17802(arg0, arg1, arg2, arg3, arg4)
/**
 * method_10473
 */
fun KClass<CookingRecipeJsonBuilder>.createBlasting(arg0: Ingredient, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int) = CookingRecipeJsonBuilder.method_10473(arg0, arg1, arg2, arg3, arg4)
/**
 * method_35916
 */
fun KClass<CookingRecipeJsonBuilder>.createCampfireCooking(arg0: Ingredient, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int) = CookingRecipeJsonBuilder.method_35916(arg0, arg1, arg2, arg3, arg4)
/**
 * method_10469
 */
fun CookingRecipeJsonBuilder.criterion(arg0: String, arg1: AdvancementCriterion<*>) = this.method_10469(arg0, arg1)
/**
 * method_35918
 */
fun KClass<CookingRecipeJsonBuilder>.createSmoking(arg0: Ingredient, arg1: RecipeCategory, arg2: ItemConvertible, arg3: Float, arg4: Int) = CookingRecipeJsonBuilder.method_35918(arg0, arg1, arg2, arg3, arg4)
