package me.hellrevenger.generated.Map_RecipeGridAligner
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RecipeGridAlignerKt {
    /**
     * method_64566
     */
    fun <T>alignRecipeToGrid(width: Int, height: Int, recipe: Recipe<*>?, slots: Iterable<T>?, filter: net.minecraft.class_9838.class_9839<T>?) = RecipeGridAligner.method_64566<T>(width, height, recipe, slots, filter)
    /**
     * method_61229
     */
    fun <T>alignRecipeToGrid(width: Int, height: Int, recipeWidth: Int, recipeHeight: Int, slots: Iterable<T>?, filter: net.minecraft.class_9838.class_9839<T>?) = RecipeGridAligner.method_61229<T>(width, height, recipeWidth, recipeHeight, slots, filter)
}