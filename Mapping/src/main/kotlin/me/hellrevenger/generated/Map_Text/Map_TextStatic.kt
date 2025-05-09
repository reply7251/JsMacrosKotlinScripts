package me.hellrevenger.generated.Map_Text
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TextKt {
    /**
     * method_43472
     */
    fun keybind(string: String) = Text.method_43472(string)
    /**
     * method_43470
     */
    fun literal(string: String) = Text.method_43470(string)
    /**
     * method_48321
     */
    fun translatableWithFallback(key: String, fallback: String) = Text.method_48321(key, fallback)
    /**
     * method_54156
     */
    fun of(pos: ChunkPos) = Text.method_54156(pos)
    /**
     * method_43471
     */
    fun translatable(key: String) = Text.method_43471(key)
    /**
     * method_43467
     */
    fun selector(selector: ParsedSelector, separator: Optional<Text>) = Text.method_43467(selector, separator)
    /**
     * method_62790
     */
    fun score(selector: ParsedSelector, objective: String) = Text.method_62790(selector, objective)
    /**
     * method_54159
     */
    fun stringifiedTranslatable(key: String, args: Array<Object>) = Text.method_54159(key, *args)
    /**
     * method_43473
     */
    fun empty() = Text.method_43473()
    /**
     * method_43468
     */
    fun nbt(rawPath: String, interpret: Boolean, separator: Optional<Text>, dataSource: NbtDataSource) = Text.method_43468(rawPath, interpret, separator, dataSource)
}