package me.hellrevenger.generated.Map_PacketCodecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
object PacketCodecsKt {
    /**
     * method_57998
     */
    fun nbtCompound(sizeTracker: Supplier<NbtSizeTracker>) = PacketCodecs.method_57998(sizeTracker)
    /**
     * method_56895
     */
    fun byteArray(maxLength: Int) = PacketCodecs.method_56895(maxLength)
    /**
     * method_56371
     */
    fun <T>entryOf(iterable: IndexedIterable<T>) = PacketCodecs.method_56371<T>(iterable)
    /**
     * method_57997
     */
    fun <T>registryCodec(codec: Codec<T>, sizeTracker: Supplier<NbtSizeTracker>) = PacketCodecs.method_57997<T>(codec, sizeTracker)
    /**
     * method_56367
     */
    fun <T>registryEntry(registry: RegistryKey<out Registry<T>>, directCodec: PacketCodec<in RegistryByteBuf, T>) = PacketCodecs.method_56367<T>(registry, directCodec)
    /**
     * method_56365
     */
    fun <T>registryValue(registry: RegistryKey<out Registry<T>>) = PacketCodecs.method_56365<T>(registry)
    /**
     * method_57987
     */
    fun <T>unlimitedCodec(codec: Codec<T>) = PacketCodecs.method_57987<T>(codec)
    /**
     * method_58002
     */
    fun <T>unlimitedRegistryCodec(codec: Codec<T>) = PacketCodecs.method_58002<T>(codec)
    /**
     * method_57988
     */
    fun <T>codec(codec: Codec<T>, sizeTracker: Supplier<NbtSizeTracker>) = PacketCodecs.method_57988<T>(codec, sizeTracker)
    /**
     * method_57989
     */
    fun readCollectionSize(buf: ByteBuf, maxSize: Int) = PacketCodecs.method_57989(buf, maxSize)
    /**
     * method_56375
     */
    fun <T>indexed(indexToValue: IntFunction<T>, valueToIndex: ToIntFunction<T>) = PacketCodecs.method_56375<T>(indexToValue, valueToIndex)
    /**
     * method_56374
     */
    fun <B, V, C>toCollection(collectionFactory: IntFunction<C>) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_56374<B, V, C>(collectionFactory)
    /**
     * method_57991
     */
    fun <B, V, C>collection(factory: IntFunction<C>, elementCodec: PacketCodec<in B, V>, maxSize: Int) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_57991<B, V, C>(factory, elementCodec, maxSize)
    /**
     * method_57995
     */
    fun <B, L, R>either(left: PacketCodec<in B, L>, right: PacketCodec<in B, R>) where B: ByteBuf = PacketCodecs.method_57995<B, L, R>(left, right)
    /**
     * method_56382
     */
    fun <B, V>optional(codec: PacketCodec<B, V>) where B: ByteBuf = PacketCodecs.method_56382<B, V>(codec)
    /**
     * method_56896
     */
    fun <T>registryCodec(codec: Codec<T>) = PacketCodecs.method_56896<T>(codec)
    /**
     * method_56364
     */
    fun string(maxLength: Int) = PacketCodecs.method_56364(maxLength)
    /**
     * method_58001
     */
    fun <T>registryEntryList(registryRef: RegistryKey<out Registry<T>>) = PacketCodecs.method_58001<T>(registryRef)
    /**
     * method_56363
     */
    fun <B, V>toList() where B: ByteBuf = PacketCodecs.method_56363<B, V>()
    /**
     * method_56376
     */
    fun <B, V, C>collection(factory: IntFunction<C>, elementCodec: PacketCodec<in B, V>) where B: ByteBuf, C: Collection<V> = PacketCodecs.method_56376<B, V, C>(factory, elementCodec)
    /**
     * method_56383
     */
    fun <T>registryEntry(registry: RegistryKey<out Registry<T>>) = PacketCodecs.method_56383<T>(registry)
    /**
     * method_56378
     */
    fun nbt(sizeTracker: Supplier<NbtSizeTracker>) = PacketCodecs.method_56378(sizeTracker)
    /**
     * method_56377
     */
    fun <B, K, V, M>map(factory: IntFunction<out M>, keyCodec: PacketCodec<in B, K>, valueCodec: PacketCodec<in B, V>) where B: ByteBuf, M: Map<K, V> = PacketCodecs.method_56377<B, K, V, M>(factory, keyCodec, valueCodec)
    /**
     * method_57992
     */
    fun <B, K, V, M>map(factory: IntFunction<out M>, keyCodec: PacketCodec<in B, K>, valueCodec: PacketCodec<in B, V>, maxSize: Int) where B: ByteBuf, M: Map<K, V> = PacketCodecs.method_57992<B, K, V, M>(factory, keyCodec, valueCodec, maxSize)
    /**
     * method_56368
     */
    fun <T>codec(codec: Codec<T>) = PacketCodecs.method_56368<T>(codec)
    /**
     * method_57990
     */
    fun writeCollectionSize(buf: ByteBuf, size: Int, maxSize: Int) = PacketCodecs.method_57990(buf, size, maxSize)
    /**
     * method_58000
     */
    fun <B, V>toList(maxLength: Int) where B: ByteBuf = PacketCodecs.method_58000<B, V>(maxLength)
}