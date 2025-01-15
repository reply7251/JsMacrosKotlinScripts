package me.hellrevenger.generated.Map_LootContextParameterSet
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun LootContextParameterSet.addDynamicDrops(arg0: Identifier, arg1: Consumer<ItemStack>) = this.method_51864(arg0, arg1)
fun LootContextParameterSet.getLuck() = this.method_51866()
fun LootContextParameterSet.contains(arg0: LootContextParameter<*>) = this.method_51865(arg0)
fun <T>LootContextParameterSet.getOptional(arg0: LootContextParameter<T>) = this.method_51869<T>(arg0)
fun LootContextParameterSet.getWorld() = this.method_51863()
fun <T>LootContextParameterSet.get(arg0: LootContextParameter<T>) = this.method_51867<T>(arg0)
