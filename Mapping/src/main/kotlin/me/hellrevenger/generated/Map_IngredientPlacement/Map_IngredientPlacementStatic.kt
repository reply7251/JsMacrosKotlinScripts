package me.hellrevenger.generated.Map_IngredientPlacement
import kotlin.reflect.*
import me.hellrevenger.generated.*
object IngredientPlacementKt {
    /**
     * field_52597
     */
    val NONE by aliasStatic(IngredientPlacement::field_52597)
    /**
     * method_61686
     */
    fun forShapeless(ingredients: MutableList<Ingredient>?) = IngredientPlacement.method_61686(ingredients)
    /**
     * method_61683
     */
    fun forMultipleSlots(ingredients: MutableList<Optional<Ingredient>>?) = IngredientPlacement.method_61683(ingredients)
    /**
     * method_61682
     */
    fun forSingleSlot(ingredient: Ingredient?) = IngredientPlacement.method_61682(ingredient)
}