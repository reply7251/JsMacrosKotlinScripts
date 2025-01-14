package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.FunctionLoader

val KClass<FunctionLoader>.FUNCTION_REGISTRY_KEY by aliasStatic(FunctionLoader::field_51976)
fun FunctionLoader.getTags() = this.method_29458()
fun FunctionLoader.get(arg0: Identifier) = this.method_29456(arg0)
fun FunctionLoader.getFunctions() = this.method_29447()
fun FunctionLoader.getTagOrEmpty(arg0: Identifier) = this.method_29459(arg0)
