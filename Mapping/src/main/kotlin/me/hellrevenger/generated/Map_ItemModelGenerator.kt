package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.ItemModelGenerator

val KClass<ItemModelGenerator>.TRIM_TYPE by aliasStatic(ItemModelGenerator::field_42086)
val ItemModelGenerator.writer by alias(ItemModelGenerator::field_22844)
fun ItemModelGenerator.register(arg0: Item, arg1: String, arg2: Model) = this.method_25734(arg0, arg1, arg2)
fun ItemModelGenerator.uploadArmor(arg0: Identifier, arg1: Identifier, arg2: Identifier, arg3: Identifier) = this.method_48742(arg0, arg1, arg2, arg3)
fun ItemModelGenerator.uploadArmor(arg0: Identifier, arg1: Identifier, arg2: Identifier) = this.method_48517(arg0, arg1, arg2)
fun ItemModelGenerator.suffixTrim(arg0: Identifier, arg1: String) = this.method_48518(arg0, arg1)
fun ItemModelGenerator.register() = this.method_25731()
fun ItemModelGenerator.register(arg0: Item, arg1: Item, arg2: Model) = this.method_25732(arg0, arg1, arg2)
fun ItemModelGenerator.register(arg0: Item, arg1: Model) = this.method_25733(arg0, arg1)
fun ItemModelGenerator.registerClock(arg0: Item) = this.method_43229(arg0)
fun ItemModelGenerator.registerCompass(arg0: Item) = this.method_43228(arg0)
fun ItemModelGenerator.createArmorJson(arg0: Identifier, arg1: Map<TextureKey, Identifier>, arg2: RegistryEntry<ArmorMaterial>) = this.method_48519(arg0, arg1, arg2)
fun ItemModelGenerator.registerArmor(arg0: ArmorItem) = this.method_48523(arg0)
fun ItemModelGenerator.registerWolfArmor(arg0: Item) = this.method_57960(arg0)
