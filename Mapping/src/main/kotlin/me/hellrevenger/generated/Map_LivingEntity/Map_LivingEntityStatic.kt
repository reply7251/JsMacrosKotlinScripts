package me.hellrevenger.generated.Map_LivingEntity
import kotlin.reflect.*
import me.hellrevenger.generated.*
object LivingEntityKt {
    /**
     * field_30068
     */
    val BABY_SCALE_FACTOR by aliasStatic(LivingEntity::field_30068)
    /**
     * field_54564
     */
    val NOT_WEARING_GAZE_DISGUISE_PREDICATE by aliasStatic(LivingEntity::field_54564)
    /**
     * field_30073
     */
    val GLOWING_FLAG by aliasStatic(LivingEntity::field_30073)
    /**
     * field_30071
     */
    val EQUIPMENT_SLOT_ID by aliasStatic(LivingEntity::field_30071)
    /**
     * field_30077
     */
    val DEATH_TICKS by aliasStatic(LivingEntity::field_30077)
    /**
     * field_30076
     */
    val GRAVITY by aliasStatic(LivingEntity::field_30076)
    /**
     * field_51995
     */
    val ATTRIBUTES_NBT_KEY by aliasStatic(LivingEntity::field_51995)
    /**
     * method_63624
     */
    fun canGlideWith(stack: ItemStack?, slot: EquipmentSlot?) = LivingEntity.method_63624(stack, slot)
    /**
     * method_31079
     */
    fun positionInPortal(pos: Vec3d?) = LivingEntity.method_31079(pos)
    /**
     * method_26827
     */
    fun createLivingAttributes() = LivingEntity.method_26827()
    /**
     * method_56079
     */
    fun getSlotForHand(hand: Hand?) = LivingEntity.method_56079(hand)
    /**
     * method_6089
     */
    fun containsOnlyAmbientEffects(effects: Collection<StatusEffectInstance>?) = LivingEntity.method_6089(effects)
}