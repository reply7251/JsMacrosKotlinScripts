package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.LootContextParameterSet

fun LootContextParameterSet.addDynamicDrops(arg0: Identifier, arg1: Consumer<ItemStack>) = this.method_51864(arg0, arg1)
fun LootContextParameterSet.contains(arg0: LootContextParameter<*>) = this.method_51865(arg0)
fun <T>LootContextParameterSet.getOptional(arg0: LootContextParameter<T>) = this.method_51869<T>(arg0)
fun <T>LootContextParameterSet.get(arg0: LootContextParameter<T>) = this.method_51867<T>(arg0)
