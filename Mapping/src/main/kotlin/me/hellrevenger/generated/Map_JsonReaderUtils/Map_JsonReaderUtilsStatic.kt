package me.hellrevenger.generated.Map_JsonReaderUtils
import kotlin.reflect.*
import me.hellrevenger.generated.*
object JsonReaderUtilsKt {
    /**
     * method_55377
     */
    fun <T>parse(registries: net.minecraft.class_7225.class_7874?, stringReader: StringReader?, codec: Codec<T>?) = JsonReaderUtils.method_55377<T>(registries, stringReader, codec)
    /**
     * method_58128
     */
    fun readWhileMatching(stringReader: StringReader?, predicate: CharPredicate?) = JsonReaderUtils.method_58128(stringReader, predicate)
}