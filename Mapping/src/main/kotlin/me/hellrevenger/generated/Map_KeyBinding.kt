package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.KeyBinding

val KeyBinding.INVENTORY_CATEGORY by aliasStatic(KeyBinding::field_32140)
val KeyBinding.CREATIVE_CATEGORY by aliasStatic(KeyBinding::field_32142)
val KeyBinding.MOVEMENT_CATEGORY by aliasStatic(KeyBinding::field_32136)
val KeyBinding.MULTIPLAYER_CATEGORY by aliasStatic(KeyBinding::field_32138)
val KeyBinding.KEYS_BY_ID by aliasStatic(KeyBinding::field_1657)
val KeyBinding.UI_CATEGORY by aliasStatic(KeyBinding::field_32141)
val KeyBinding.boundKey by alias(KeyBinding::field_1655)
val KeyBinding.MISC_CATEGORY by aliasStatic(KeyBinding::field_32137)
val KeyBinding.GAMEPLAY_CATEGORY by aliasStatic(KeyBinding::field_32139)
fun KeyBinding.isDefault() = this.method_1427()
fun KClass<KeyBinding>.unpressAll() = KeyBinding.method_1437()
fun KeyBinding.matchesMouse(arg0: Int) = this.method_1433(arg0)
fun KeyBinding.getBoundKeyLocalizedText() = this.method_16007()
fun KClass<KeyBinding>.getLocalizedName(arg0: String) = KeyBinding.method_1419(arg0)
fun KeyBinding.getBoundKeyTranslationKey() = this.method_1428()
fun KeyBinding.setBoundKey(arg0: net.minecraft.class_3675.class_306) = this.method_1422(arg0)
fun KeyBinding.isUnbound() = this.method_1415()
fun KClass<KeyBinding>.onKeyPressed(arg0: net.minecraft.class_3675.class_306) = KeyBinding.method_1420(arg0)
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
