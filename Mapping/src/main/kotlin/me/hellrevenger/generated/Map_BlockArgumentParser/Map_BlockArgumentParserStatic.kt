package me.hellrevenger.generated.Map_BlockArgumentParser
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BlockArgumentParserKt {
    /**
     * field_10695
     */
    val UNKNOWN_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10695)
    /**
     * field_10684
     */
    val UNCLOSED_PROPERTIES_EXCEPTION by aliasStatic(BlockArgumentParser::field_10684)
    /**
     * field_10691
     */
    val DISALLOWED_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_10691)
    /**
     * field_10690
     */
    val INVALID_BLOCK_ID_EXCEPTION by aliasStatic(BlockArgumentParser::field_10690)
    /**
     * field_37965
     */
    val UNKNOWN_BLOCK_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_37965)
    /**
     * field_10683
     */
    val INVALID_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10683)
    /**
     * field_10692
     */
    val DUPLICATE_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10692)
    /**
     * field_10688
     */
    val EMPTY_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10688)
    /**
     * method_9685
     */
    fun stringifyBlockState(state: BlockState?) = BlockArgumentParser.method_9685(state)
    /**
     * method_41955
     */
    fun block(registryWrapper: RegistryWrapper<Block>?, reader: StringReader?, allowSnbt: Boolean) = BlockArgumentParser.method_41955(registryWrapper, reader, allowSnbt)
    /**
     * method_41960
     */
    fun blockOrTag(registryWrapper: RegistryWrapper<Block>?, reader: StringReader?, allowSnbt: Boolean) = BlockArgumentParser.method_41960(registryWrapper, reader, allowSnbt)
    /**
     * method_9666
     */
    fun getSuggestions(registryWrapper: RegistryWrapper<Block>?, builder: SuggestionsBuilder?, allowTag: Boolean, allowSnbt: Boolean) = BlockArgumentParser.method_9666(registryWrapper, builder, allowTag, allowSnbt)
    /**
     * method_41962
     */
    fun blockOrTag(registryWrapper: RegistryWrapper<Block>?, string: String?, allowSnbt: Boolean) = BlockArgumentParser.method_41962(registryWrapper, string, allowSnbt)
    /**
     * method_41957
     */
    fun block(registryWrapper: RegistryWrapper<Block>?, string: String?, allowSnbt: Boolean) = BlockArgumentParser.method_41957(registryWrapper, string, allowSnbt)
}