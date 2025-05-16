package me.hellrevenger.generated.Map_tag_TagEntry
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_39267
 */
val tag_TagEntry.tag by alias(tag_TagEntry::field_39267)
/**
 * field_39268
 */
val tag_TagEntry.required by alias(tag_TagEntry::field_39268)
/**
 * field_15584
 */
val tag_TagEntry.id by alias(tag_TagEntry::field_15584)
/**
 * method_32832
 */
fun tag_TagEntry.canAdd(directEntryPredicate: Predicate<Identifier>?, tagEntryPredicate: Predicate<Identifier>?) = this.method_32832(directEntryPredicate, tagEntryPredicate)
/**
 * method_32831
 */
fun tag_TagEntry.forEachRequiredTagId(idConsumer: Consumer<Identifier>?) = this.method_32831(idConsumer)
/**
 * method_43944
 */
fun tag_TagEntry.forEachOptionalTagId(idConsumer: Consumer<Identifier>?) = this.method_43944(idConsumer)
/**
 * method_26790
 */
fun <T>tag_TagEntry.resolve(valueGetter: net.minecraft.class_3497.class_7474<T>?, idConsumer: Consumer<T>?) = this.method_26790<T>(valueGetter, idConsumer)
