package me.hellrevenger.generated.Map_RecipeSerializer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object RecipeSerializerKt {
    /**
     * method_17724
     */
    fun <T, S>register(id: String, serializer: S) where T: Recipe<*>, S: RecipeSerializer<T> = RecipeSerializer.method_17724<S, T>(id, serializer)
}