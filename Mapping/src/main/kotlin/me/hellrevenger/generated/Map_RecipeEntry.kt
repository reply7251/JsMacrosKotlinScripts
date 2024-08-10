package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.RecipeEntry

val <T>RecipeEntry<T>.PACKET_CODEC where T: Recipe<*> by aliasStatic({RecipeEntry.field_48357})
fun <T>RecipeEntry<T>.id() where T: Recipe<*> = this.comp_1932()
fun <T>RecipeEntry<T>.value() where T: Recipe<*> = this.comp_1933()
