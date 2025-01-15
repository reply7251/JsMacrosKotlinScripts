package me.hellrevenger.generated.Map_BlockArgumentParser
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<BlockArgumentParser>.UNKNOWN_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10695)
val KClass<BlockArgumentParser>.UNCLOSED_PROPERTIES_EXCEPTION by aliasStatic(BlockArgumentParser::field_10684)
val KClass<BlockArgumentParser>.DISALLOWED_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_10691)
val KClass<BlockArgumentParser>.INVALID_BLOCK_ID_EXCEPTION by aliasStatic(BlockArgumentParser::field_10690)
val KClass<BlockArgumentParser>.UNKNOWN_BLOCK_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_37965)
val KClass<BlockArgumentParser>.INVALID_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10683)
val KClass<BlockArgumentParser>.DUPLICATE_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10692)
val KClass<BlockArgumentParser>.EMPTY_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10688)
fun KClass<BlockArgumentParser>.stringifyBlockState(arg0: BlockState) = BlockArgumentParser.method_9685(arg0)
fun KClass<BlockArgumentParser>.block(arg0: RegistryWrapper<Block>, arg1: StringReader, arg2: Boolean) = BlockArgumentParser.method_41955(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.blockOrTag(arg0: RegistryWrapper<Block>, arg1: StringReader, arg2: Boolean) = BlockArgumentParser.method_41960(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.getSuggestions(arg0: RegistryWrapper<Block>, arg1: SuggestionsBuilder, arg2: Boolean, arg3: Boolean) = BlockArgumentParser.method_9666(arg0, arg1, arg2, arg3)
fun KClass<BlockArgumentParser>.blockOrTag(arg0: RegistryWrapper<Block>, arg1: String, arg2: Boolean) = BlockArgumentParser.method_41962(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.block(arg0: RegistryWrapper<Block>, arg1: String, arg2: Boolean) = BlockArgumentParser.method_41957(arg0, arg1, arg2)
