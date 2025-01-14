package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.KeyBinding

val KClass<KeyBinding>.INVENTORY_CATEGORY by aliasStatic(KeyBinding::field_32140)
val KClass<KeyBinding>.CREATIVE_CATEGORY by aliasStatic(KeyBinding::field_32142)
val KClass<KeyBinding>.MOVEMENT_CATEGORY by aliasStatic(KeyBinding::field_32136)
val KClass<KeyBinding>.MULTIPLAYER_CATEGORY by aliasStatic(KeyBinding::field_32138)
val KClass<KeyBinding>.UI_CATEGORY by aliasStatic(KeyBinding::field_32141)
val KClass<KeyBinding>.MISC_CATEGORY by aliasStatic(KeyBinding::field_32137)
val KClass<KeyBinding>.GAMEPLAY_CATEGORY by aliasStatic(KeyBinding::field_32139)
fun KeyBinding.getTranslationKey() = this.method_1431()
fun KeyBinding.getCategory() = this.method_1423()
fun KeyBinding.isDefault() = this.method_1427()
fun KClass<KeyBinding>.unpressAll() = KeyBinding.method_1437()
fun KeyBinding.matchesMouse(arg0: Int) = this.method_1433(arg0)
fun KeyBinding.getBoundKeyLocalizedText() = this.method_16007()
fun KClass<KeyBinding>.getLocalizedName(arg0: String) = KeyBinding.method_1419(arg0)
fun KeyBinding.getBoundKeyTranslationKey() = this.method_1428()
fun KeyBinding.setBoundKey(arg0: net.minecraft.class_3675.class_306) = this.method_1422(arg0)
fun KeyBinding.isUnbound() = this.method_1415()
fun KClass<KeyBinding>.onKeyPressed(arg0: net.minecraft.class_3675.class_306) = KeyBinding.method_1420(arg0)
fun KeyBinding.getDefaultKey() = this.method_1429()
fun KClass<KeyBinding>.updatePressedStates() = KeyBinding.method_1424()
fun KeyBinding.equals(arg0: KeyBinding) = this.method_1435(arg0)
fun KeyBinding.matchesKey(arg0: Int, arg1: Int) = this.method_1417(arg0, arg1)
fun KClass<KeyBinding>.updateKeysByCode() = KeyBinding.method_1426()
fun KeyBinding.setPressed(arg0: Boolean) = this.method_23481(arg0)
fun KClass<KeyBinding>.untoggleStickyKeys() = KeyBinding.method_52231()
fun KeyBinding.compareTo(arg0: KeyBinding) = this.method_1430(arg0)
fun KeyBinding.isPressed() = this.method_1434()
fun KClass<KeyBinding>.setKeyPressed(arg0: net.minecraft.class_3675.class_306, arg1: Boolean) = KeyBinding.method_1416(arg0, arg1)
fun KeyBinding.wasPressed() = this.method_1436()
