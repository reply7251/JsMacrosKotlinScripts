package me.hellrevenger.generated.Map_PacketCodecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_57998
 */
fun KClass<PacketCodecs>.nbtCompound(arg0: Supplier<NbtSizeTracker>) = PacketCodecs.method_57998(arg0)
/**
 * method_56895
 */
fun KClass<PacketCodecs>.byteArray(arg0: Int) = PacketCodecs.method_56895(arg0)
/**
 * method_56371
 */
fun <T>KClass<PacketCodecs>.entryOf(arg0: IndexedIterable<T>) = PacketCodecs.method_56371<T>(arg0)
/**
 * method_57997
 */
fun <T>KClass<PacketCodecs>.registryCodec(arg0: Codec<T>, arg1: Supplier<NbtSizeTracker>) = PacketCodecs.method_57997<T>(arg0, arg1)
/**
 * method_56367
 */
fun <T>KClass<PacketCodecs>.registryEntry(arg0: RegistryKey<out Registry<T>>, arg1: PacketCodec<in RegistryByteBuf, T>) = PacketCodecs.method_56367<T>(arg0, arg1)
/**
 * method_56365
 */
fun <T>KClass<PacketCodecs>.registryValue(arg0: RegistryKey<out Registry<T>>) = PacketCodecs.method_56365<T>(arg0)
/**
 * method_57987
 */
fun <T>KClass<PacketCodecs>.unlimitedCodec(arg0: Codec<T>) = PacketCodecs.method_57987<T>(arg0)
/**
 * method_58002
 */
fun <T>KClass<PacketCodecs>.unlimitedRegistryCodec(arg0: Codec<T>) = PacketCodecs.method_58002<T>(arg0)
/**
 * method_57988
 */
fun <T>KClass<PacketCodecs>.codec(arg0: Codec<T>, arg1: Supplier<NbtSizeTracker>) = PacketCodecs.method_57988<T>(arg0, arg1)
/**
 * method_57989
 */
fun KClass<PacketCodecs>.readCollectionSize(arg0: ByteBuf, arg1: Int) = PacketCodecs.method_57989(arg0, arg1)
/**
 * method_56375
 */
fun <T>KClass<PacketCodecs>.indexed(arg0: IntFunction<T>, arg1: ToIntFunction<T>) = PacketCodecs.method_56375<T>(arg0, arg1)
/**
 * method_56374
 */
fun <B, V, C>KClass<PacketCodecs>.toCollection(arg0: IntFunction<C>) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_56374<B, V, C>(arg0)
/**
 * method_57991
 */
fun <B, V, C>KClass<PacketCodecs>.collection(arg0: IntFunction<C>, arg1: PacketCodec<in B, V>, arg2: Int) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_57991<B, V, C>(arg0, arg1, arg2)
/**
 * method_57995
 */
fun <B, L, R>KClass<PacketCodecs>.either(arg0: PacketCodec<in B, L>, arg1: PacketCodec<in B, R>) where B: ByteBuf = PacketCodecs.method_57995<B, L, R>(arg0, arg1)
/**
 * method_56382
 */
fun <B, V>KClass<PacketCodecs>.optional(arg0: PacketCodec<B, V>) where B: ByteBuf = PacketCodecs.method_56382<B, V>(arg0)
/**
 * method_56896
 */
fun <T>KClass<PacketCodecs>.registryCodec(arg0: Codec<T>) = PacketCodecs.method_56896<T>(arg0)
/**
 * method_56364
 */
fun KClass<PacketCodecs>.string(arg0: Int) = PacketCodecs.method_56364(arg0)
/**
 * method_58001
 */
fun <T>KClass<PacketCodecs>.registryEntryList(arg0: RegistryKey<out Registry<T>>) = PacketCodecs.method_58001<T>(arg0)
/**
 * method_56363
 */
fun <B, V>KClass<PacketCodecs>.toList() where B: ByteBuf = PacketCodecs.method_56363<B, V>()
/**
 * method_56376
 */
fun <B, V, C>KClass<PacketCodecs>.collection(arg0: IntFunction<C>, arg1: PacketCodec<in B, V>) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_56376<B, V, C>(arg0, arg1)
/**
 * method_56383
 */
fun <T>KClass<PacketCodecs>.registryEntry(arg0: RegistryKey<out Registry<T>>) = PacketCodecs.method_56383<T>(arg0)
/**
 * method_56378
 */
fun KClass<PacketCodecs>.nbt(arg0: Supplier<NbtSizeTracker>) = PacketCodecs.method_56378(arg0)
/**
 * method_56377
 */
fun <B, K, V, M>KClass<PacketCodecs>.map(arg0: IntFunction<out M>, arg1: PacketCodec<in B, K>, arg2: PacketCodec<in B, V>) where B: ByteBuf, M: Map<K, V> = PacketCodecs.method_56377<B, K, V, M>(arg0, arg1, arg2)
/**
 * method_57992
 */
fun <B, K, V, M>KClass<PacketCodecs>.map(arg0: IntFunction<out M>, arg1: PacketCodec<in B, K>, arg2: PacketCodec<in B, V>, arg3: Int) where B: ByteBuf, M: Map<K, V> = PacketCodecs.method_57992<B, K, V, M>(arg0, arg1, arg2, arg3)
/**
 * method_56368
 */
fun <T>KClass<PacketCodecs>.codec(arg0: Codec<T>) = PacketCodecs.method_56368<T>(arg0)
/**
 * method_57990
 */
fun KClass<PacketCodecs>.writeCollectionSize(arg0: ByteBuf, arg1: Int, arg2: Int) = PacketCodecs.method_57990(arg0, arg1, arg2)
/**
 * method_58000
 */
fun <B, V>KClass<PacketCodecs>.toList(arg0: Int) where B: ByteBuf = PacketCodecs.method_58000<B, V>(arg0)
