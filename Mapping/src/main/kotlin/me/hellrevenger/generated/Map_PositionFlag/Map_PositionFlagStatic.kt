package me.hellrevenger.generated.Map_PositionFlag
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PositionFlagKt {
    /**
     * field_54094
     */
    val DELTA by aliasStatic(PositionFlag::field_54094)
    /**
     * field_40710
     */
    val VALUES by aliasStatic(PositionFlag::field_40710)
    /**
     * field_40711
     */
    val ROT by aliasStatic(PositionFlag::field_40711)
    /**
     * field_12397
     */
    val X_ROT by aliasEnum(PositionFlag::class, "field_12397")
    /**
     * field_12398
     */
    val Y by aliasEnum(PositionFlag::class, "field_12398")
    /**
     * field_54092
     */
    val DELTA_Z by aliasEnum(PositionFlag::class, "field_54092")
    /**
     * field_54091
     */
    val DELTA_Y by aliasEnum(PositionFlag::class, "field_54091")
    /**
     * field_54093
     */
    val ROTATE_DELTA by aliasEnum(PositionFlag::class, "field_54093")
    /**
     * field_54090
     */
    val DELTA_X by aliasEnum(PositionFlag::class, "field_54090")
    /**
     * field_12401
     */
    val Y_ROT by aliasEnum(PositionFlag::class, "field_12401")
    /**
     * field_12403
     */
    val Z by aliasEnum(PositionFlag::class, "field_12403")
    /**
     * field_12400
     */
    val X by aliasEnum(PositionFlag::class, "field_12400")
    /**
     * method_63641
     */
    fun combine(sets: Array<Set<PositionFlag>>) = PositionFlag.method_63641(*sets)
    /**
     * method_11741
     */
    fun getBitfield(flags: Set<PositionFlag>) = PositionFlag.method_11741(flags)
    /**
     * method_11744
     */
    fun getFlags(mask: Int) = PositionFlag.method_11744(mask)
}