package me.hellrevenger.generated.Map_Registry
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_31189
 */
fun <T>Registry<T>.getOrEmpty(arg0: RegistryKey<T>) = this.method_31189(arg0)
/**
 * method_39673
 */
fun <T>Registry<T>.getCodec() = this.method_39673()
/**
 * method_40286
 */
fun <T>Registry<T>.iterateEntries(arg0: TagKey<T>) = this.method_40286(arg0)
/**
 * method_10230
 */
fun <T, V>KClass<Registry<T>>.register(arg0: Registry<V>, arg1: Identifier, arg2: T) where T: V = Registry.method_10230<V, T>(arg0, arg1, arg2)
/**
 * method_40290
 */
fun <T>Registry<T>.entryOf(arg0: RegistryKey<T>) = this.method_40290(arg0)
/**
 * method_40276
 */
fun <T>Registry<T>.freeze() = this.method_40276()
/**
 * method_40295
 */
fun <T>Registry<T>.getIndexedEntries() = this.method_40295()
/**
 * method_31140
 */
fun <T>Registry<T>.getOrThrow(arg0: RegistryKey<T>) = this.method_31140(arg0)
/**
 * method_40270
 */
fun <T>Registry<T>.streamEntries() = this.method_40270()
/**
 * method_10220
 */
fun <T>Registry<T>.stream() = this.method_10220()
/**
 * method_39197
 */
fun <T, V>KClass<Registry<T>>.register(arg0: Registry<V>, arg1: RegistryKey<V>, arg2: T) where T: V = Registry.method_39197<V, T>(arg0, arg1, arg2)
/**
 * method_40294
 */
fun <T>Registry<T>.getEntryCodec() = this.method_40294()
/**
 * method_42021
 */
fun <T>Registry<T>.getKeys() = this.method_42021()
/**
 * method_47983
 */
fun <T>Registry<T>.getEntry(arg0: T) = this.method_47983(arg0)
/**
 * method_10226
 */
fun <T>KClass<Registry<T>>.register(arg0: Registry<in T>, arg1: String, arg2: T) = Registry.method_10226<T>(arg0, arg1, arg2)
/**
 * method_29722
 */
fun <T>Registry<T>.getEntrySet() = this.method_29722()
/**
 * method_55841
 */
fun <T>Registry<T>.getEntry(arg0: Identifier) = this.method_55841(arg0)
/**
 * method_40265
 */
fun <T>Registry<T>.getEntry(arg0: Int) = this.method_40265(arg0)
/**
 * method_60385
 */
fun <T>Registry<T>.getDefaultEntry() = this.method_60385()
/**
 * method_40278
 */
fun <T>Registry<T>.clearTags() = this.method_40278()
/**
 * method_56159
 */
fun <T>Registry<T>.getRandomEntry(arg0: TagKey<T>, arg1: Random) = this.method_56159(arg0, arg1)
/**
 * method_30517
 */
fun <T>Registry<T>.getKey() = this.method_30517()
/**
 * method_40257
 */
fun <T>Registry<T>.populateTags(arg0: Map<TagKey<T>, MutableList<RegistryEntry<T>>>) = this.method_40257(arg0)
/**
 * method_10223
 */
fun <T>Registry<T>.get(arg0: Identifier) = this.method_10223(arg0)
/**
 * method_40273
 */
fun <T>Registry<T>.streamTags() = this.method_40273()
/**
 * method_10221
 */
fun <T>Registry<T>.getId(arg0: T) = this.method_10221(arg0)
/**
 * method_10235
 */
fun <T>Registry<T>.getIds() = this.method_10235()
/**
 * method_31138
 */
fun <T>Registry<T>.getLifecycle() = this.method_31138()
/**
 * method_57058
 */
fun <T>Registry<T>.getEntryInfo(arg0: RegistryKey<T>) = this.method_57058(arg0)
/**
 * method_40260
 */
fun <T>Registry<T>.getOrCreateEntryList(arg0: TagKey<T>) = this.method_40260(arg0)
/**
 * method_47984
 */
fun <T>KClass<Registry<T>>.registerReference(arg0: Registry<T>, arg1: RegistryKey<T>, arg2: T) = Registry.method_47984<T>(arg0, arg1, arg2)
/**
 * method_46770
 */
fun <T>Registry<T>.getEntryOwner() = this.method_46770()
/**
 * method_47985
 */
fun <T>KClass<Registry<T>>.registerReference(arg0: Registry<T>, arg1: Identifier, arg2: T) = Registry.method_47985<T>(arg0, arg1, arg2)
/**
 * method_40264
 */
fun <T>Registry<T>.getEntry(arg0: RegistryKey<T>) = this.method_40264(arg0)
/**
 * method_40272
 */
fun <T>Registry<T>.streamTagsAndEntries() = this.method_40272()
/**
 * method_46771
 */
fun <T>Registry<T>.getReadOnlyWrapper() = this.method_46771()
/**
 * method_10250
 */
fun <T>Registry<T>.containsId(arg0: Identifier) = this.method_10250(arg0)
/**
 * method_40269
 */
fun <T>Registry<T>.createEntry(arg0: T) = this.method_40269(arg0)
/**
 * method_40266
 */
fun <T>Registry<T>.getEntryList(arg0: TagKey<T>) = this.method_40266(arg0)
/**
 * method_17966
 */
fun <T>Registry<T>.getOrEmpty(arg0: Identifier) = this.method_17966(arg0)
/**
 * method_10240
 */
fun <T>Registry<T>.getRandom(arg0: Random) = this.method_10240(arg0)
/**
 * method_35842
 */
fun <T>Registry<T>.contains(arg0: RegistryKey<T>) = this.method_35842(arg0)
/**
 * method_29113
 */
fun <T>Registry<T>.getKey(arg0: T) = this.method_29113(arg0)
/**
 * method_29107
 */
fun <T>Registry<T>.get(arg0: RegistryKey<T>) = this.method_29107(arg0)
/**
 * method_46772
 */
fun <T>Registry<T>.getTagCreatingWrapper() = this.method_46772()
