package me.hellrevenger.generated.Map_Codecs
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_46236
 */
val KClass<Codecs>.BASIC_OBJECT by aliasStatic(Codecs::field_46236)
/**
 * field_39273
 */
val KClass<Codecs>.BASE_64 by aliasStatic(Codecs::field_39273)
/**
 * field_40721
 */
val KClass<Codecs>.JSON_ELEMENT by aliasStatic(Codecs::field_40721)
/**
 * field_39274
 */
val KClass<Codecs>.TAG_ENTRY_ID by aliasStatic(Codecs::field_39274)
/**
 * field_37408
 */
val KClass<Codecs>.REGULAR_EXPRESSION by aliasStatic(Codecs::field_37408)
/**
 * field_51365
 */
val KClass<Codecs>.ARGB by aliasStatic(Codecs::field_51365)
/**
 * field_46165
 */
val KClass<Codecs>.ESCAPED_STRING by aliasStatic(Codecs::field_46165)
/**
 * field_53754
 */
val KClass<Codecs>.NON_NEGATIVE_FLOAT by aliasStatic(Codecs::field_53754)
/**
 * field_33442
 */
val KClass<Codecs>.POSITIVE_INT by aliasStatic(Codecs::field_33442)
/**
 * field_42265
 */
val KClass<Codecs>.QUATERNION_F by aliasStatic(Codecs::field_42265)
/**
 * field_49012
 */
val KClass<Codecs>.UNSIGNED_BYTE by aliasStatic(Codecs::field_49012)
/**
 * field_51364
 */
val KClass<Codecs>.VECTOR_4F by aliasStatic(Codecs::field_51364)
/**
 * field_54067
 */
val KClass<Codecs>.RGB by aliasStatic(Codecs::field_54067)
/**
 * field_33441
 */
val KClass<Codecs>.NON_NEGATIVE_INT by aliasStatic(Codecs::field_33441)
/**
 * field_39042
 */
val KClass<Codecs>.INSTANT by aliasStatic(Codecs::field_39042)
/**
 * field_41759
 */
val KClass<Codecs>.NON_EMPTY_STRING by aliasStatic(Codecs::field_41759)
/**
 * field_42266
 */
val KClass<Codecs>.AXIS_ANGLE_4F by aliasStatic(Codecs::field_42266)
/**
 * field_34387
 */
val KClass<Codecs>.POSITIVE_FLOAT by aliasStatic(Codecs::field_34387)
/**
 * field_39395
 */
val KClass<Codecs>.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG by aliasStatic(Codecs::field_39395)
/**
 * field_40726
 */
val KClass<Codecs>.GAME_PROFILE_WITH_PROPERTIES by aliasStatic(Codecs::field_40726)
/**
 * field_49183
 */
val KClass<Codecs>.PLAYER_NAME by aliasStatic(Codecs::field_49183)
/**
 * field_42267
 */
val KClass<Codecs>.ROTATION by aliasStatic(Codecs::field_42267)
/**
 * field_40725
 */
val KClass<Codecs>.GAME_PROFILE_PROPERTY_MAP by aliasStatic(Codecs::field_40725)
/**
 * field_39396
 */
val KClass<Codecs>.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG by aliasStatic(Codecs::field_39396)
/**
 * field_44703
 */
val KClass<Codecs>.CODEPOINT by aliasStatic(Codecs::field_44703)
/**
 * field_42268
 */
val KClass<Codecs>.MATRIX_4F by aliasStatic(Codecs::field_42268)
/**
 * field_45075
 */
val KClass<Codecs>.IDENTIFIER_PATH by aliasStatic(Codecs::field_45075)
/**
 * field_40724
 */
val KClass<Codecs>.BIT_SET by aliasStatic(Codecs::field_40724)
/**
 * field_40723
 */
val KClass<Codecs>.VECTOR_3F by aliasStatic(Codecs::field_40723)
/**
 * method_65320
 */
fun <E>KClass<Codecs>.listOrSingle(arg0: Codec<E>, arg1: Codec<MutableList<E>>) = Codecs.method_65320<E>(arg0, arg1)
/**
 * method_65313
 */
fun <E>KClass<Codecs>.listOrSingle(arg0: Codec<E>) = Codecs.method_65313<E>(arg0)
/**
 * method_40113
 */
fun <T>KClass<Codecs>.nonEmptyEntryList(arg0: Codec<RegistryEntryList<T>>) = Codecs.method_40113<T>(arg0)
/**
 * method_56942
 */
fun <E>KClass<Codecs>.withLifecycle(arg0: Codec<E>, arg1: function_Function<E, Lifecycle>) = Codecs.method_56942<E>(arg0, arg1)
/**
 * method_39511
 */
fun <E>KClass<Codecs>.rawIdChecked(arg0: ToIntFunction<E>, arg1: IntFunction<E>, arg2: Int) = Codecs.method_39511<E>(arg0, arg1, arg2)
/**
 * method_39512
 */
fun <E>KClass<Codecs>.orCompressed(arg0: Codec<E>, arg1: Codec<E>) = Codecs.method_39512<E>(arg0, arg1)
/**
 * method_44167
 */
fun KClass<Codecs>.optionalLong(arg0: MapCodec<Optional<Long>>) = Codecs.method_44167(arg0)
/**
 * method_65314
 */
fun <I, E>KClass<Codecs>.idChecked(arg0: Codec<I>, arg1: function_Function<I, E>, arg2: function_Function<E, I>) = Codecs.method_65314<I, E>(arg0, arg1, arg2)
/**
 * method_39504
 */
fun <E>KClass<Codecs>.withLifecycle(arg0: Codec<E>, arg1: function_Function<E, Lifecycle>, arg2: function_Function<E, Lifecycle>) = Codecs.method_39504<E>(arg0, arg1, arg2)
/**
 * method_53700
 */
fun KClass<Codecs>.formattedTime(arg0: DateTimeFormatter) = Codecs.method_53700(arg0)
/**
 * method_57155
 */
fun <A>KClass<Codecs>.optional(arg0: Codec<A>) = Codecs.method_57155<A>(arg0)
/**
 * method_53703
 */
fun <K, V>KClass<Codecs>.strictUnboundedMap(arg0: Codec<K>, arg1: Codec<V>) = Codecs.method_53703<K, V>(arg0, arg1)
/**
 * method_39028
 */
fun <A>KClass<Codecs>.orElsePartial(arg0: A) = Codecs.method_39028<A>(arg0)
/**
 * method_36973
 */
fun <T>KClass<Codecs>.nonEmptyList(arg0: Codec<MutableList<T>>) = Codecs.method_36973<T>(arg0)
/**
 * method_65311
 */
fun KClass<Codecs>.rangedInclusiveFloat(arg0: Float, arg1: Float) = Codecs.method_65311(arg0, arg1)
/**
 * method_48766
 */
fun KClass<Codecs>.rangedInt(arg0: Int, arg1: Int) = Codecs.method_48766(arg0, arg1)
/**
 * method_37931
 */
fun <P, I>KClass<Codecs>.createCodecForPairObject(arg0: Codec<P>, arg1: String, arg2: String, arg3: BiFunction<P, P, DataResult<I>>, arg4: function_Function<I, P>, arg5: function_Function<I, P>) = Codecs.method_37931<P, I>(arg0, arg1, arg2, arg3, arg4, arg5)
/**
 * method_53921
 */
fun <E>KClass<Codecs>.orCompressed(arg0: MapCodec<E>, arg1: MapCodec<E>) = Codecs.method_53921<E>(arg0, arg1)
/**
 * method_54941
 */
fun <K, V>KClass<Codecs>.parameters(arg0: String, arg1: String, arg2: Codec<K>, arg3: function_Function<in V, out K>, arg4: function_Function<in K, out Codec<out V>>) = Codecs.method_54941<K, V>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_57153
 */
fun <K, V>KClass<Codecs>.map(arg0: Codec<Map<K, V>>, arg1: Int) = Codecs.method_57153<K, V>(arg0, arg1)
/**
 * method_53918
 */
fun <T>KClass<Codecs>.fromOps(arg0: DynamicOps<T>) = Codecs.method_53918<T>(arg0)
/**
 * method_42114
 */
fun <A>KClass<Codecs>.exceptionCatching(arg0: Codec<A>) = Codecs.method_42114<A>(arg0)
/**
 * method_53058
 */
fun <T>KClass<Codecs>.object2BooleanMap(arg0: Codec<T>) = Codecs.method_53058<T>(arg0)
/**
 * method_63572
 */
fun <M>KClass<Codecs>.nonEmptyMap(arg0: Codec<M>) where M: Map<*, *> = Codecs.method_63572<M>(arg0)
/**
 * method_40110
 */
fun <E>KClass<Codecs>.createContextRetrievalCodec(arg0: function_Function<DynamicOps<*>, DataResult<E>>) = Codecs.method_40110<E>(arg0)
/**
 * method_40114
 */
fun <E, L, T>KClass<Codecs>.createEqualTypeChecker(arg0: function_Function<E, T>) where L: Collection<E> = Codecs.method_40114<E, L, T>(arg0)
