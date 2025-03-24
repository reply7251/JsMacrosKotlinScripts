package me.hellrevenger.generated.Map_KeyBinding
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_32140
 */
val KClass<KeyBinding>.INVENTORY_CATEGORY by aliasStatic(KeyBinding::field_32140)
/**
 * field_32142
 */
val KClass<KeyBinding>.CREATIVE_CATEGORY by aliasStatic(KeyBinding::field_32142)
/**
 * field_32136
 */
val KClass<KeyBinding>.MOVEMENT_CATEGORY by aliasStatic(KeyBinding::field_32136)
/**
 * field_32138
 */
val KClass<KeyBinding>.MULTIPLAYER_CATEGORY by aliasStatic(KeyBinding::field_32138)
/**
 * field_1657
 */
val KClass<KeyBinding>.KEYS_BY_ID by aliasStatic(KeyBinding::field_1657)
/**
 * field_32141
 */
val KClass<KeyBinding>.UI_CATEGORY by aliasStatic(KeyBinding::field_32141)
/**
 * field_1655
 */
var KeyBinding.boundKey by alias(KeyBinding::field_1655)
/**
 * field_32137
 */
val KClass<KeyBinding>.MISC_CATEGORY by aliasStatic(KeyBinding::field_32137)
/**
 * field_32139
 */
val KClass<KeyBinding>.GAMEPLAY_CATEGORY by aliasStatic(KeyBinding::field_32139)
/**
 * method_1431
 */
fun KeyBinding.getTranslationKey() = this.method_1431()
/**
 * method_1423
 */
fun KeyBinding.getCategory() = this.method_1423()
/**
 * method_1427
 */
fun KeyBinding.isDefault() = this.method_1427()
/**
 * method_1437
 */
fun KClass<KeyBinding>.unpressAll() = KeyBinding.method_1437()
/**
 * method_1433
 */
fun KeyBinding.matchesMouse(arg0: Int) = this.method_1433(arg0)
/**
 * method_16007
 */
fun KeyBinding.getBoundKeyLocalizedText() = this.method_16007()
/**
 * method_1419
 */
fun KClass<KeyBinding>.getLocalizedName(arg0: String) = KeyBinding.method_1419(arg0)
/**
 * method_1428
 */
fun KeyBinding.getBoundKeyTranslationKey() = this.method_1428()
/**
 * method_1415
 */
fun KeyBinding.isUnbound() = this.method_1415()
/**
 * method_1420
 */
fun KClass<KeyBinding>.onKeyPressed(arg0: net.minecraft.class_3675.class_306) = KeyBinding.method_1420(arg0)
/**
 * method_1429
 */
fun KeyBinding.getDefaultKey() = this.method_1429()
/**
 * method_65807
 */
fun KClass<KeyBinding>.byId(arg0: String) = KeyBinding.method_65807(arg0)
/**
 * method_1424
 */
fun KClass<KeyBinding>.updatePressedStates() = KeyBinding.method_1424()
/**
 * method_1435
 */
fun KeyBinding.equals(arg0: KeyBinding) = this.method_1435(arg0)
/**
 * method_1417
 */
fun KeyBinding.matchesKey(arg0: Int, arg1: Int) = this.method_1417(arg0, arg1)
/**
 * method_1426
 */
fun KClass<KeyBinding>.updateKeysByCode() = KeyBinding.method_1426()
/**
 * method_23481
 */
fun KeyBinding.setPressed(arg0: Boolean) = this.method_23481(arg0)
/**
 * method_52231
 */
fun KClass<KeyBinding>.untoggleStickyKeys() = KeyBinding.method_52231()
/**
 * method_1430
 */
fun KeyBinding.compareTo(arg0: KeyBinding) = this.method_1430(arg0)
/**
 * method_1434
 */
fun KeyBinding.isPressed() = this.method_1434()
/**
 * method_1416
 */
fun KClass<KeyBinding>.setKeyPressed(arg0: net.minecraft.class_3675.class_306, arg1: Boolean) = KeyBinding.method_1416(arg0, arg1)
/**
 * method_1436
 */
fun KeyBinding.wasPressed() = this.method_1436()
