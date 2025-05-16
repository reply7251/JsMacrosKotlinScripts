package me.hellrevenger.generated.Map_ResourcePackCompatibility
import kotlin.reflect.*
import me.hellrevenger.generated.*
object ResourcePackCompatibilityKt {
    /**
     * field_14220
     */
    val TOO_NEW by aliasEnum(ResourcePackCompatibility::class, "field_14220")
    /**
     * field_14224
     */
    val COMPATIBLE by aliasEnum(ResourcePackCompatibility::class, "field_14224")
    /**
     * field_14223
     */
    val TOO_OLD by aliasEnum(ResourcePackCompatibility::class, "field_14223")
    /**
     * method_14436
     */
    fun from(range: Range<Int>?, current: Int) = ResourcePackCompatibility.method_14436(range, current)
}