package me.hellrevenger.generated.Map_Codecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
object CodecsKt {
    /**
     * field_46236
     */
    val BASIC_OBJECT by aliasStatic(Codecs::field_46236)
    /**
     * field_39273
     */
    val BASE_64 by aliasStatic(Codecs::field_39273)
    /**
     * field_40721
     */
    val JSON_ELEMENT by aliasStatic(Codecs::field_40721)
    /**
     * field_39274
     */
    val TAG_ENTRY_ID by aliasStatic(Codecs::field_39274)
    /**
     * field_37408
     */
    val REGULAR_EXPRESSION by aliasStatic(Codecs::field_37408)
    /**
     * field_51365
     */
    val ARGB by aliasStatic(Codecs::field_51365)
    /**
     * field_46165
     */
    val ESCAPED_STRING by aliasStatic(Codecs::field_46165)
    /**
     * field_53754
     */
    val NON_NEGATIVE_FLOAT by aliasStatic(Codecs::field_53754)
    /**
     * field_33442
     */
    val POSITIVE_INT by aliasStatic(Codecs::field_33442)
    /**
     * field_42265
     */
    val QUATERNION_F by aliasStatic(Codecs::field_42265)
    /**
     * field_49012
     */
    val UNSIGNED_BYTE by aliasStatic(Codecs::field_49012)
    /**
     * field_51364
     */
    val VECTOR_4F by aliasStatic(Codecs::field_51364)
    /**
     * field_54067
     */
    val RGB by aliasStatic(Codecs::field_54067)
    /**
     * field_33441
     */
    val NON_NEGATIVE_INT by aliasStatic(Codecs::field_33441)
    /**
     * field_39042
     */
    val INSTANT by aliasStatic(Codecs::field_39042)
    /**
     * field_41759
     */
    val NON_EMPTY_STRING by aliasStatic(Codecs::field_41759)
    /**
     * field_42266
     */
    val AXIS_ANGLE_4F by aliasStatic(Codecs::field_42266)
    /**
     * field_34387
     */
    val POSITIVE_FLOAT by aliasStatic(Codecs::field_34387)
    /**
     * field_39395
     */
    val OPTIONAL_OF_LONG_TO_OPTIONAL_LONG by aliasStatic(Codecs::field_39395)
    /**
     * field_40726
     */
    val GAME_PROFILE_WITH_PROPERTIES by aliasStatic(Codecs::field_40726)
    /**
     * field_49183
     */
    val PLAYER_NAME by aliasStatic(Codecs::field_49183)
    /**
     * field_42267
     */
    val ROTATION by aliasStatic(Codecs::field_42267)
    /**
     * field_40725
     */
    val GAME_PROFILE_PROPERTY_MAP by aliasStatic(Codecs::field_40725)
    /**
     * field_39396
     */
    val OPTIONAL_LONG_TO_OPTIONAL_OF_LONG by aliasStatic(Codecs::field_39396)
    /**
     * field_44703
     */
    val CODEPOINT by aliasStatic(Codecs::field_44703)
    /**
     * field_42268
     */
    val MATRIX_4F by aliasStatic(Codecs::field_42268)
    /**
     * field_45075
     */
    val IDENTIFIER_PATH by aliasStatic(Codecs::field_45075)
    /**
     * field_40724
     */
    val BIT_SET by aliasStatic(Codecs::field_40724)
    /**
     * field_40723
     */
    val VECTOR_3F by aliasStatic(Codecs::field_40723)
    /**
     * method_65320
     */
    fun <E>listOrSingle(entryCodec: Codec<E>?, listCodec: Codec<MutableList<E>>?) = Codecs.method_65320<E>(entryCodec, listCodec)
    /**
     * method_65313
     */
    fun <E>listOrSingle(entryCodec: Codec<E>?) = Codecs.method_65313<E>(entryCodec)
    /**
     * method_40113
     */
    fun <T>nonEmptyEntryList(originalCodec: Codec<RegistryEntryList<T>>?) = Codecs.method_40113<T>(originalCodec)
    /**
     * method_56942
     */
    fun <E>withLifecycle(originalCodec: Codec<E>?, lifecycleGetter: function_Function<E, Lifecycle>?) = Codecs.method_56942<E>(originalCodec, lifecycleGetter)
    /**
     * method_39511
     */
    fun <E>rawIdChecked(elementToRawId: ToIntFunction<E>?, rawIdToElement: IntFunction<E>?, errorRawId: Int) = Codecs.method_39511<E>(elementToRawId, rawIdToElement, errorRawId)
    /**
     * method_39512
     */
    fun <E>orCompressed(uncompressedCodec: Codec<E>?, compressedCodec: Codec<E>?) = Codecs.method_39512<E>(uncompressedCodec, compressedCodec)
    /**
     * method_44167
     */
    fun optionalLong(codec: MapCodec<Optional<Long>>?) = Codecs.method_44167(codec)
    /**
     * method_65314
     */
    fun <I, E>idChecked(idCodec: Codec<I>?, idToElement: function_Function<I, E>?, elementToId: function_Function<E, I>?) = Codecs.method_65314<I, E>(idCodec, idToElement, elementToId)
    /**
     * method_39504
     */
    fun <E>withLifecycle(originalCodec: Codec<E>?, entryLifecycleGetter: function_Function<E, Lifecycle>?, lifecycleGetter: function_Function<E, Lifecycle>?) = Codecs.method_39504<E>(originalCodec, entryLifecycleGetter, lifecycleGetter)
    /**
     * method_53700
     */
    fun formattedTime(formatter: DateTimeFormatter?) = Codecs.method_53700(formatter)
    /**
     * method_57155
     */
    fun <A>optional(codec: Codec<A>?) = Codecs.method_57155<A>(codec)
    /**
     * method_53703
     */
    fun <K, V>strictUnboundedMap(keyCodec: Codec<K>?, elementCodec: Codec<V>?) = Codecs.method_53703<K, V>(keyCodec, elementCodec)
    /**
     * method_39028
     */
    fun <A>orElsePartial(arg0: A) = Codecs.method_39028<A>(arg0)
    /**
     * method_36973
     */
    fun <T>nonEmptyList(originalCodec: Codec<MutableList<T>>?) = Codecs.method_36973<T>(originalCodec)
    /**
     * method_65311
     */
    fun rangedInclusiveFloat(minInclusive: Float, maxInclusive: Float) = Codecs.method_65311(minInclusive, maxInclusive)
    /**
     * method_48766
     */
    fun rangedInt(min: Int, max: Int) = Codecs.method_48766(min, max)
    /**
     * method_37931
     */
    fun <P, I>createCodecForPairObject(codec: Codec<P>?, leftFieldName: String?, rightFieldName: String?, combineFunction: BiFunction<P, P, DataResult<I>>?, leftFunction: function_Function<I, P>?, rightFunction: function_Function<I, P>?) = Codecs.method_37931<P, I>(codec, leftFieldName, rightFieldName, combineFunction, leftFunction, rightFunction)
    /**
     * method_53921
     */
    fun <E>orCompressed(uncompressedCodec: MapCodec<E>?, compressedCodec: MapCodec<E>?) = Codecs.method_53921<E>(uncompressedCodec, compressedCodec)
    /**
     * method_54941
     */
    fun <K, V>parameters(typeKey: String?, parametersKey: String?, typeCodec: Codec<K>?, typeGetter: function_Function<in V, out K>?, parametersCodecGetter: function_Function<in K, out Codec<out V>>?) = Codecs.method_54941<K, V>(typeKey, parametersKey, typeCodec, typeGetter, parametersCodecGetter)
    /**
     * method_57153
     */
    fun <K, V>map(codec: Codec<Map<K, V>>?, maxLength: Int) = Codecs.method_57153<K, V>(codec, maxLength)
    /**
     * method_53918
     */
    fun <T>fromOps(ops: DynamicOps<T>?) = Codecs.method_53918<T>(ops)
    /**
     * method_42114
     */
    fun <A>exceptionCatching(codec: Codec<A>?) = Codecs.method_42114<A>(codec)
    /**
     * method_53058
     */
    fun <T>object2BooleanMap(keyCodec: Codec<T>?) = Codecs.method_53058<T>(keyCodec)
    /**
     * method_63572
     */
    fun <M>nonEmptyMap(originalCodec: Codec<M>?) where M: Map<*, *> = Codecs.method_63572<M>(originalCodec)
    /**
     * method_40110
     */
    fun <E>createContextRetrievalCodec(retriever: function_Function<DynamicOps<*>, DataResult<E>>?) = Codecs.method_40110<E>(retriever)
    /**
     * method_40114
     */
    fun <E, L, T>createEqualTypeChecker(typeGetter: function_Function<E, T>?) where L: Collection<E> = Codecs.method_40114<E, L, T>(typeGetter)
}