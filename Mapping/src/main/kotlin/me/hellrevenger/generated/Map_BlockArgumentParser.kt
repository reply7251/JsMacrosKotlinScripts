package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.BlockArgumentParser

val BlockArgumentParser.UNKNOWN_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10695)
val BlockArgumentParser.UNCLOSED_PROPERTIES_EXCEPTION by aliasStatic(BlockArgumentParser::field_10684)
val BlockArgumentParser.DISALLOWED_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_10691)
val BlockArgumentParser.INVALID_BLOCK_ID_EXCEPTION by aliasStatic(BlockArgumentParser::field_10690)
val BlockArgumentParser.UNKNOWN_BLOCK_TAG_EXCEPTION by aliasStatic(BlockArgumentParser::field_37965)
val BlockArgumentParser.INVALID_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10683)
val BlockArgumentParser.DUPLICATE_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10692)
val BlockArgumentParser.EMPTY_PROPERTY_EXCEPTION by aliasStatic(BlockArgumentParser::field_10688)
fun KClass<BlockArgumentParser>.stringifyBlockState(arg0: BlockState) = BlockArgumentParser.method_9685(arg0)
fun KClass<BlockArgumentParser>.block(arg0: RegistryWrapper<Block>, arg1: StringReader, arg2: Boolean) = BlockArgumentParser.method_41955(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.blockOrTag(arg0: RegistryWrapper<Block>, arg1: StringReader, arg2: Boolean) = BlockArgumentParser.method_41960(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.blockOrTag(arg0: RegistryWrapper<Block>, arg1: String, arg2: Boolean) = BlockArgumentParser.method_41962(arg0, arg1, arg2)
fun KClass<BlockArgumentParser>.block(arg0: RegistryWrapper<Block>, arg1: String, arg2: Boolean) = BlockArgumentParser.method_41957(arg0, arg1, arg2)
