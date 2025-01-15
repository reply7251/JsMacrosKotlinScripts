package me.hellrevenger.generated.Map_RecipeSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>RecipeSerializer<T>.packetCodec() where T: Recipe<*> = this.method_56104()
fun <T, S>KClass<RecipeSerializer<T>>.register(arg0: String, arg1: S) where T: Recipe<*>, S: RecipeSerializer<T> = RecipeSerializer.method_17724<S, T>(arg0, arg1)
fun <T>RecipeSerializer<T>.codec() where T: Recipe<*> = this.method_53736()
