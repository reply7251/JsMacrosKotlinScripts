package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.tag_TagEntry

val tag_TagEntry.tag by alias(tag_TagEntry::field_39267)
val tag_TagEntry.required by alias(tag_TagEntry::field_39268)
val tag_TagEntry.id by alias(tag_TagEntry::field_15584)
fun KClass<tag_TagEntry>.create(arg0: Identifier) = tag_TagEntry.method_43937(arg0)
fun KClass<tag_TagEntry>.createOptionalTag(arg0: Identifier) = tag_TagEntry.method_43947(arg0)
fun tag_TagEntry.canAdd(arg0: Predicate<Identifier>, arg1: Predicate<Identifier>) = this.method_32832(arg0, arg1)
fun tag_TagEntry.forEachRequiredTagId(arg0: Consumer<Identifier>) = this.method_32831(arg0)
fun tag_TagEntry.forEachOptionalTagId(arg0: Consumer<Identifier>) = this.method_43944(arg0)
fun <T>tag_TagEntry.resolve(arg0: net.minecraft.class_3497.class_7474<T>, arg1: Consumer<T>) = this.method_26790<T>(arg0, arg1)
fun KClass<tag_TagEntry>.createTag(arg0: Identifier) = tag_TagEntry.method_43945(arg0)
fun KClass<tag_TagEntry>.createOptional(arg0: Identifier) = tag_TagEntry.method_43942(arg0)
