package me.hellrevenger.generated.Map_Ingredient
import kotlin.reflect.*
import me.hellrevenger.generated.*
object IngredientKt {
    /**
     * method_64980
     */
    fun toDisplay(ingredient: Optional<Ingredient>?) = Ingredient.method_64980(ingredient)
    /**
     * method_8106
     */
    fun fromTag(tag: RegistryEntryList<Item>?) = Ingredient.method_8106(tag)
    /**
     * method_8091
     */
    fun ofItems(items: Array<ItemConvertible>) = Ingredient.method_8091(*items)
    /**
     * method_8101
     */
    fun ofItem(item: ItemConvertible?) = Ingredient.method_8101(item)
    /**
     * method_64981
     */
    fun createDisplayWithRemainder(displayedItem: RegistryEntry<Item>?) = Ingredient.method_64981(displayedItem)
    /**
     * method_61676
     */
    fun matches(ingredient: Optional<Ingredient>?, stack: ItemStack?) = Ingredient.method_61676(ingredient, stack)
    /**
     * method_26964
     */
    fun ofItems(stacks: Stream<out ItemConvertible>?) = Ingredient.method_26964(stacks)
}