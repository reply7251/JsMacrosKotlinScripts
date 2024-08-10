package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.Recipe

fun <T>Recipe<T>.getType() where T: RecipeInput = this.method_17716()
fun <T>Recipe<T>.getGroup() where T: RecipeInput = this.method_8112()
fun <T>Recipe<T>.createIcon() where T: RecipeInput = this.method_17447()
fun <T>Recipe<T>.showNotification() where T: RecipeInput = this.method_49188()
fun <T>Recipe<T>.getRemainder(arg0: T) where T: RecipeInput = this.method_8111(arg0)
fun <T>Recipe<T>.getResult(arg0: net.minecraft.class_7225.class_7874) where T: RecipeInput = this.method_8110(arg0)
fun <T>Recipe<T>.craft(arg0: T, arg1: net.minecraft.class_7225.class_7874) where T: RecipeInput = this.method_8116(arg0, arg1)
fun <T>Recipe<T>.getSerializer() where T: RecipeInput = this.method_8119()
fun <T>Recipe<T>.fits(arg0: Int, arg1: Int) where T: RecipeInput = this.method_8113(arg0, arg1)
fun <T>Recipe<T>.getIngredients() where T: RecipeInput = this.method_8117()
fun <T>Recipe<T>.matches(arg0: T, arg1: world_World) where T: RecipeInput = this.method_8115(arg0, arg1)
fun <T>Recipe<T>.isIgnoredInRecipeBook() where T: RecipeInput = this.method_8118()
fun <T>Recipe<T>.isEmpty() where T: RecipeInput = this.method_31584()
