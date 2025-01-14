package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeType

fun <T>KClass<RecipeType<T>>.register(arg0: String) where T: Recipe<*> = RecipeType.method_17726<T>(arg0)
