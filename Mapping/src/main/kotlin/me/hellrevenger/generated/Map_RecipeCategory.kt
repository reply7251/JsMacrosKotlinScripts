package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeCategory

val KClass<RecipeCategory>.BREWING by aliasEnum(RecipeCategory::class, "field_40641")
val KClass<RecipeCategory>.FOOD by aliasEnum(RecipeCategory::class, "field_40640")
val KClass<RecipeCategory>.MISC by aliasEnum(RecipeCategory::class, "field_40642")
val KClass<RecipeCategory>.DECORATIONS by aliasEnum(RecipeCategory::class, "field_40635")
val KClass<RecipeCategory>.BUILDING_BLOCKS by aliasEnum(RecipeCategory::class, "field_40634")
val KClass<RecipeCategory>.TRANSPORTATION by aliasEnum(RecipeCategory::class, "field_40637")
val KClass<RecipeCategory>.REDSTONE by aliasEnum(RecipeCategory::class, "field_40636")
val KClass<RecipeCategory>.COMBAT by aliasEnum(RecipeCategory::class, "field_40639")
val KClass<RecipeCategory>.TOOLS by aliasEnum(RecipeCategory::class, "field_40638")
fun RecipeCategory.getName() = this.method_46203()
