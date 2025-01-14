package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ModelIdentifier

val KClass<ModelIdentifier>.INVENTORY_VARIANT by aliasStatic(ModelIdentifier::field_52277)
fun KClass<ModelIdentifier>.ofInventoryVariant(arg0: Identifier) = ModelIdentifier.method_61078(arg0)
fun KClass<ModelIdentifier>.ofVanilla(arg0: String, arg1: String) = ModelIdentifier.method_45910(arg0, arg1)
fun ModelIdentifier.getVariant() = this.method_4740()
fun ModelIdentifier.id() = this.comp_2875()
fun ModelIdentifier.variant() = this.comp_2876()
