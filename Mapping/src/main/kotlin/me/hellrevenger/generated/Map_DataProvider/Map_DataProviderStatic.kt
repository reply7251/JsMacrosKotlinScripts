package me.hellrevenger.generated.Map_DataProvider
import kotlin.reflect.*
import me.hellrevenger.generated.*
object DataProviderKt {
    /**
     * method_64108
     */
    fun <T>writeCodecToPath(writer: DataWriter, codec: Codec<T>, value: T, path: file_Path) = DataProvider.method_64108<T>(writer, codec, value, path)
    /**
     * method_64110
     */
    fun <T>writeAllToPath(writer: DataWriter, codec: Codec<T>, pathResolver: net.minecraft.class_7784.class_7489, idsToValues: Map<Identifier, T>) = DataProvider.method_64110<T>(writer, codec, pathResolver, idsToValues)
    /**
     * method_10320
     */
    fun writeToPath(writer: DataWriter, json: JsonElement, path: file_Path) = DataProvider.method_10320(writer, json, path)
}