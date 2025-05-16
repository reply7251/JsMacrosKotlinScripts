package me.hellrevenger.generated.Map_CookingRecipeJsonBuilder
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CookingRecipeJsonBuilderKt {
    /**
     * method_17801
     */
    fun <T>create(input: Ingredient?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int, serializer: RecipeSerializer<T>?, recipeFactory: net.minecraft.class_1874.class_3958<T>?) where T: AbstractCookingRecipe = CookingRecipeJsonBuilder.method_17801<T>(input, category, output, experience, cookingTime, serializer, recipeFactory)
    /**
     * method_17802
     */
    fun createSmelting(input: Ingredient?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int) = CookingRecipeJsonBuilder.method_17802(input, category, output, experience, cookingTime)
    /**
     * method_10473
     */
    fun createBlasting(input: Ingredient?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int) = CookingRecipeJsonBuilder.method_10473(input, category, output, experience, cookingTime)
    /**
     * method_35916
     */
    fun createCampfireCooking(input: Ingredient?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int) = CookingRecipeJsonBuilder.method_35916(input, category, output, experience, cookingTime)
    /**
     * method_35918
     */
    fun createSmoking(input: Ingredient?, category: RecipeCategory?, output: ItemConvertible?, experience: Float, cookingTime: Int) = CookingRecipeJsonBuilder.method_35918(input, category, output, experience, cookingTime)
}