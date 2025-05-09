package me.hellrevenger.generated.Map_KeyBinding
import kotlin.reflect.*
import me.hellrevenger.generated.*
object KeyBindingKt {
    /**
     * field_32140
     */
    val INVENTORY_CATEGORY by aliasStatic(KeyBinding::field_32140)
    /**
     * field_32142
     */
    val CREATIVE_CATEGORY by aliasStatic(KeyBinding::field_32142)
    /**
     * field_32136
     */
    val MOVEMENT_CATEGORY by aliasStatic(KeyBinding::field_32136)
    /**
     * field_32138
     */
    val MULTIPLAYER_CATEGORY by aliasStatic(KeyBinding::field_32138)
    /**
     * field_1657
     */
    val KEYS_BY_ID by aliasStatic(KeyBinding::field_1657)
    /**
     * field_32141
     */
    val UI_CATEGORY by aliasStatic(KeyBinding::field_32141)
    /**
     * field_32137
     */
    val MISC_CATEGORY by aliasStatic(KeyBinding::field_32137)
    /**
     * field_32139
     */
    val GAMEPLAY_CATEGORY by aliasStatic(KeyBinding::field_32139)
    /**
     * method_1437
     */
    fun unpressAll() = KeyBinding.method_1437()
    /**
     * method_1419
     */
    fun getLocalizedName(id: String) = KeyBinding.method_1419(id)
    /**
     * method_1420
     */
    fun onKeyPressed(key: net.minecraft.class_3675.class_306) = KeyBinding.method_1420(key)
    /**
     * method_65807
     */
    fun byId(id: String) = KeyBinding.method_65807(id)
    /**
     * method_1424
     */
    fun updatePressedStates() = KeyBinding.method_1424()
    /**
     * method_1426
     */
    fun updateKeysByCode() = KeyBinding.method_1426()
    /**
     * method_52231
     */
    fun untoggleStickyKeys() = KeyBinding.method_52231()
    /**
     * method_1416
     */
    fun setKeyPressed(key: net.minecraft.class_3675.class_306, pressed: Boolean) = KeyBinding.method_1416(key, pressed)
}