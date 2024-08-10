package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemModels

val ItemModels.modelIds by alias(ItemModels::field_4129)
fun ItemModels.reloadModels() = this.method_3310()
fun ItemModels.getModel(arg0: ItemStack) = this.method_3308(arg0)
fun ItemModels.putModel(arg0: Item, arg1: ModelIdentifier) = this.method_3309(arg0, arg1)
fun ItemModels.getModel(arg0: Item) = this.method_3304(arg0)
