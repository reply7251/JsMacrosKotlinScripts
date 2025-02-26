package me.hellrevenger.generated.Map_ResourcePackCompatibility
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_14220
 */
val KClass<ResourcePackCompatibility>.TOO_NEW by aliasEnum(ResourcePackCompatibility::class, "field_14220")
/**
 * field_14224
 */
val KClass<ResourcePackCompatibility>.COMPATIBLE by aliasEnum(ResourcePackCompatibility::class, "field_14224")
/**
 * field_14223
 */
val KClass<ResourcePackCompatibility>.TOO_OLD by aliasEnum(ResourcePackCompatibility::class, "field_14223")
/**
 * method_14436
 */
fun KClass<ResourcePackCompatibility>.from(arg0: Range<Int>, arg1: Int) = ResourcePackCompatibility.method_14436(arg0, arg1)
/**
 * method_14439
 */
fun ResourcePackCompatibility.getNotification() = this.method_14439()
/**
 * method_14437
 */
fun ResourcePackCompatibility.isCompatible() = this.method_14437()
/**
 * method_14438
 */
fun ResourcePackCompatibility.getConfirmMessage() = this.method_14438()
