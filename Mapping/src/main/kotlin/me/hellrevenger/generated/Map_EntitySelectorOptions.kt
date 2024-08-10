package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.EntitySelectorOptions

val EntitySelectorOptions.INAPPLICABLE_OPTION_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10887)
val EntitySelectorOptions.NEGATIVE_LEVEL_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10893)
val EntitySelectorOptions.TOO_SMALL_LEVEL_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10886)
val EntitySelectorOptions.NEGATIVE_DISTANCE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10890)
val EntitySelectorOptions.UNKNOWN_OPTION_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10885)
val EntitySelectorOptions.INVALID_MODE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10889)
val EntitySelectorOptions.INVALID_TYPE_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10892)
val EntitySelectorOptions.IRREVERSIBLE_SORT_EXCEPTION by aliasStatic(EntitySelectorOptions::field_10888)
fun KClass<EntitySelectorOptions>.register() = EntitySelectorOptions.method_9960()
fun KClass<EntitySelectorOptions>.suggestOptions(arg0: EntitySelectorReader, arg1: SuggestionsBuilder) = EntitySelectorOptions.method_9930(arg0, arg1)
fun KClass<EntitySelectorOptions>.getHandler(arg0: EntitySelectorReader, arg1: String, arg2: Int) = EntitySelectorOptions.method_9976(arg0, arg1, arg2)
