package me.hellrevenger.generated.Map_RegistryEntry
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>RegistryEntry<T>.isIn(arg0: TagKey<T>) = this.method_40220(arg0)
fun <T>RegistryEntry<T>.matchesId(arg0: Identifier) = this.method_40226(arg0)
fun <T>RegistryEntry<T>.streamTags() = this.method_40228()
fun <T>RegistryEntry<T>.getKey() = this.method_40230()
fun <T>RegistryEntry<T>.getType() = this.method_40231()
fun <T>RegistryEntry<T>.getIdAsString() = this.method_55840()
fun <T>RegistryEntry<T>.matches(arg0: Predicate<RegistryKey<T>>) = this.method_40224(arg0)
fun <T>RegistryEntry<T>.matches(arg0: RegistryEntry<T>) = this.method_55838(arg0)
fun <T>RegistryEntry<T>.ownerEquals(arg0: RegistryEntryOwner<T>) = this.method_46745(arg0)
fun <T>RegistryEntry<T>.matchesKey(arg0: RegistryKey<T>) = this.method_40225(arg0)
fun <T>RegistryEntry<T>.hasKeyAndValue() = this.method_40227()
fun <T>RegistryEntry<T>.getKeyOrValue() = this.method_40229()
fun <T>KClass<RegistryEntry<T>>.of(arg0: T) = RegistryEntry.method_40223<T>(arg0)
fun <T>RegistryEntry<T>.value() = this.comp_349()
