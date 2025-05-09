package me.hellrevenger.generated.Map_ServerRecipeManager
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ServerRecipeManagerKt {
    /**
     * method_42302
     */
    fun <I, T>createCachedMatchGetter(type: RecipeType<T>) where I: RecipeInput, T: Recipe<I> = ServerRecipeManager.method_42302<I, T>(type)
}