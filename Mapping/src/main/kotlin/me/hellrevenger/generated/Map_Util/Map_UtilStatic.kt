package me.hellrevenger.generated.Map_Util
import kotlin.reflect.*
import me.hellrevenger.generated.*
object UtilKt {
    /**
     * field_37250
     */
    val TICKER by aliasStatic(Util::field_37250)
    /**
     * field_25140
     */
    val NIL_UUID by aliasStatic(Util::field_25140)
    /**
     * field_33859
     */
    val JAR_FILE_SYSTEM_PROVIDER by aliasStatic(Util::field_33859)
    /**
     * field_1128
     */
    val nanoTimeSupplier by aliasStatic(Util::field_1128)
    /**
     * method_57109
     */
    fun <K, V>mapWith(map: Map<K, V>?, keyToAppend: K, valueToAppend: V) = Util.method_57109<K, V>(map, keyToAppend, valueToAppend)
    /**
     * method_659
     */
    fun getEpochTimeMs() = Util.method_659()
    /**
     * method_27958
     */
    fun getIoWorkerExecutor() = Util.method_27958()
    /**
     * method_22321
     */
    fun getInnermostMessage(t: Throwable?) = Util.method_22321(t)
    /**
     * method_651
     */
    fun getJVMFlags() = Util.method_651()
    /**
     * method_22320
     */
    fun <T>getFatalOrPause(t: T) where T: Throwable = Util.method_22320<T>(t)
    /**
     * method_65951
     */
    fun getAvailableBackgroundThreads() = Util.method_65951()
    /**
     * method_648
     */
    fun getMeasuringTimeNano() = Util.method_648()
    /**
     * method_33141
     */
    fun <T>decodeFixedLengthList(list: MutableList<T>?, length: Int) = Util.method_33141<T>(list, length)
    /**
     * method_58272
     */
    fun <T>withPrepended(valueToPrepend: T, list: MutableList<T>?) = Util.method_58272<T>(valueToPrepend, list)
    /**
     * method_61199
     */
    fun <T>or(a: Predicate<in T>?) = Util.method_61199<T>(a)
    /**
     * method_54908
     */
    fun <T>readTyped(type: types_Type<T>?, value: Dynamic<*>?) = Util.method_54908<T>(type, value)
    /**
     * method_668
     */
    fun getOperatingSystem() = Util.method_668()
    /**
     * method_61194
     */
    fun <T>and(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?, d: Predicate<in T>?) = Util.method_61194<T>(a, b, c, d)
    /**
     * method_27172
     */
    fun getRandom(array: IntArray?, random: Random?) = Util.method_27172(array, random)
    /**
     * method_61190
     */
    fun <T>and(a: Predicate<in T>?, b: Predicate<in T>?) = Util.method_61190<T>(a, b)
    /**
     * method_43027
     */
    fun <T>copyShuffled(list: ObjectArrayList<T>?, random: Random?) = Util.method_43027<T>(list, random)
    /**
     * method_61196
     */
    fun <T>and(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?, d: Predicate<in T>?, e: Predicate<in T>?) = Util.method_61196<T>(a, b, c, d, e)
    /**
     * method_43658
     */
    fun <T>lastIndexGetter(values: MutableList<T>?) = Util.method_43658<T>(values)
    /**
     * method_656
     */
    fun <T>make(factory: Supplier<T>?) = Util.method_656<T>(factory)
    /**
     * method_43373
     */
    fun <V>combineCancellable(futures: MutableList<out CompletableFuture<out V>>?) = Util.method_43373<V>(futures)
    /**
     * method_34865
     */
    fun <T, U, R>memoize(biFunction: BiFunction<T, U, R>?) = Util.method_34865<T, U, R>(biFunction)
    /**
     * method_41204
     */
    fun backupAndReplace(current: file_Path?, newPath: file_Path?, backup: file_Path?, noRestoreOnFail: Boolean) = Util.method_41204(current, newPath, backup, noRestoreOnFail)
    /**
     * method_20793
     */
    fun <T>getLast(list: MutableList<T>?) = Util.method_20793<T>(list)
    /**
     * method_29187
     */
    fun getChoiceType(typeReference: TypeReference?, id: String?) = Util.method_29187(typeReference, id)
    /**
     * method_63541
     */
    fun <K, V>mapEnum(enumClass: Class<K>?, mapper: function_Function<K, V>?) where K: Enum<K> = Util.method_63541<K, V>(enumClass, mapper)
    /**
     * method_17974
     */
    fun <T>ifPresentOrElse(optional: Optional<T>?, presentAction: Consumer<T>?, elseAction: Runnable?) = Util.method_17974<T>(optional, presentAction, elseAction)
    /**
     * method_54907
     */
    fun <A, B>apply(typed: Typed<A>?, type: types_Type<B>?, modifier: UnaryOperator<Dynamic<*>>?) = Util.method_54907<A, B>(typed, type, modifier)
    /**
     * method_56616
     */
    fun <T>anyOf(predicates: MutableList<out Predicate<in T>>?) = Util.method_56616<T>(predicates)
    /**
     * method_658
     */
    fun getMeasuringTimeMs() = Util.method_658()
    /**
     * method_60931
     */
    fun validateUri(uri: String?) = Util.method_60931(uri)
    /**
     * method_29476
     */
    fun startTimerHack() = Util.method_29476()
    /**
     * method_61192
     */
    fun <T>and(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?) = Util.method_61192<T>(a, b, c)
    /**
     * method_43253
     */
    fun <T>copyShuffled(array: Array<T>?, random: Random?) = Util.method_43253<T>(array, random)
    /**
     * method_48746
     */
    fun <K, V>cachedMapper(mapper: function_Function<K, V>?) = Util.method_48746<K, V>(mapper)
    /**
     * method_645
     */
    fun <T>previous(iterable: Iterable<T>?, arg1: T) = Util.method_645<T>(iterable, arg1)
    /**
     * method_43499
     */
    fun <T>waitAndApply(resultFactory: function_Function<Executor, CompletableFuture<T>>?) = Util.method_43499<T>(resultFactory)
    /**
     * method_29775
     */
    fun relativeCopy(src: file_Path?, dest: file_Path?, toCopy: file_Path?) = Util.method_29775(src, dest, toCopy)
    /**
     * method_55473
     */
    fun getDownloadWorkerExecutor() = Util.method_55473()
    /**
     * method_27173
     */
    fun <T>getRandom(array: Array<T>?, random: Random?) = Util.method_27173<T>(array, random)
    /**
     * method_38646
     */
    fun setMissingBreakpointHandler(missingBreakpointHandler: Consumer<String>?) = Util.method_38646(missingBreakpointHandler)
    /**
     * method_61208
     */
    fun <T>or(predicates: Array<Predicate<in T>>) = Util.method_61208<T>(*predicates)
    /**
     * method_59901
     */
    fun <T>isSymmetrical(width: Int, height: Int, list: MutableList<T>?) = Util.method_59901<T>(width, height, list)
    /**
     * method_51822
     */
    fun decodeFixedLengthArray(stream: LongStream?, length: Int) = Util.method_51822(stream, length)
    /**
     * method_660
     */
    fun <T>next(iterable: Iterable<T>?, arg1: T) = Util.method_660<T>(iterable, arg1)
    /**
     * method_43251
     */
    fun shuffle(stream: IntStream?, random: Random?) = Util.method_43251(stream, random)
    /**
     * method_57108
     */
    fun <T>withAppended(list: MutableList<T>?, valueToAppend: T) = Util.method_57108<T>(list, valueToAppend)
    /**
     * method_39977
     */
    fun logErrorOrPause(message: String?, throwable: Throwable?) = Util.method_39977(message, throwable)
    /**
     * method_61204
     */
    fun <T>or(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?, d: Predicate<in T>?) = Util.method_61204<T>(a, b, c, d)
    /**
     * method_61211
     */
    fun <T>or() = Util.method_61211<T>()
    /**
     * method_43028
     */
    fun <T>shuffle(list: MutableList<T>?, random: Random?) = Util.method_43028<T>(list, random)
    /**
     * method_33559
     */
    fun logErrorOrPause(message: String?) = Util.method_33559(message)
    /**
     * method_18350
     */
    fun shutdownExecutors() = Util.method_18350()
    /**
     * method_33791
     */
    fun <V>combineSafe(futures: MutableList<out CompletableFuture<V>>?) = Util.method_33791<V>(futures)
    /**
     * method_24155
     */
    fun throwUnchecked(t: Throwable?) = Util.method_24155(t)
    /**
     * method_53909
     */
    fun <T>lastIdentityIndexGetter(values: MutableList<T>?) = Util.method_53909<T>(values)
    /**
     * method_650
     */
    fun <T>getValueAsString(property: property_Property<T>?, value: Object?) where T: Comparable<T> = Util.method_650<T>(property, value)
    /**
     * method_41238
     */
    fun <T>debugSupplier(supplier: Supplier<T>?, messageSupplier: Supplier<String>?) = Util.method_41238<T>(supplier, messageSupplier)
    /**
     * method_64122
     */
    fun runInNamedZone(runnable: Runnable?, name: String?) = Util.method_64122(runnable, name)
    /**
     * method_29190
     */
    fun decodeFixedLengthArray(stream: IntStream?, length: Int) = Util.method_29190(stream, length)
    /**
     * method_34866
     */
    fun <T, R>memoize(function: function_Function<T, R>?) = Util.method_34866<T, R>(function)
    /**
     * method_32309
     */
    fun <T>getRandom(list: MutableList<T>?, random: Random?) = Util.method_32309<T>(list, random)
    /**
     * method_40083
     */
    fun <T>getRandomOrEmpty(list: MutableList<T>?, random: Random?) = Util.method_40083<T>(list, random)
    /**
     * method_61200
     */
    fun <T>or(a: Predicate<in T>?, b: Predicate<in T>?) = Util.method_61200<T>(a, b)
    /**
     * method_56613
     */
    fun <T>allOf(predicates: MutableList<out Predicate<in T>>?) = Util.method_56613<T>(predicates)
    /**
     * method_43252
     */
    fun <T>copyShuffled(stream: Stream<T>?, random: Random?) = Util.method_43252<T>(stream, random)
    /**
     * method_18349
     */
    fun getMainWorkerExecutor() = Util.method_18349()
    /**
     * method_61189
     */
    fun <T>and(a: Predicate<in T>?) = Util.method_61189<T>(a)
    /**
     * method_30309
     */
    fun replaceInvalidChars(string: String?, predicate: CharPredicate?) = Util.method_30309(string, predicate)
    /**
     * method_61206
     */
    fun <T>or(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?, d: Predicate<in T>?, e: Predicate<in T>?) = Util.method_61206<T>(a, b, c, d, e)
    /**
     * method_30626
     */
    fun backupAndReplace(current: file_Path?, newPath: file_Path?, backup: file_Path?) = Util.method_30626(current, newPath, backup)
    /**
     * method_57107
     */
    fun <T>registryValueToString(registry: Registry<T>?, value: T) = Util.method_57107<T>(registry, value)
    /**
     * method_29188
     */
    fun addPrefix(prefix: String?, consumer: Consumer<String>?) = Util.method_29188(prefix, consumer)
    /**
     * method_652
     */
    fun <V>combine(futures: MutableList<out CompletableFuture<out V>>?) = Util.method_652<V>(futures)
    /**
     * method_18839
     */
    fun debugRunnable(runnable: Runnable?, messageSupplier: Supplier<String>?) = Util.method_18839(runnable, messageSupplier)
    /**
     * method_27761
     */
    fun moveCursor(string: String?, cursor: Int, delta: Int) = Util.method_27761(string, cursor, delta)
    /**
     * method_654
     */
    fun <T>make(arg0: T, initializer: Consumer<in T>?) = Util.method_654<T>(arg0, initializer)
    /**
     * method_55333
     */
    fun <T>readTyped(type: types_Type<T>?, value: Dynamic<*>?, allowPartial: Boolean) = Util.method_55333<T>(type, value, allowPartial)
    /**
     * method_61198
     */
    fun <T>and(predicates: Array<Predicate<in T>>) = Util.method_61198<T>(*predicates)
    /**
     * method_664
     */
    fun <K, V>toMap() = Util.method_664<K, V>()
    /**
     * method_58579
     */
    fun <T>toArrayList() = Util.method_58579<T>()
    /**
     * method_44893
     */
    fun getFormattedCurrentTime() = Util.method_44893()
    /**
     * method_43498
     */
    fun <T>waitAndApply(resultFactory: function_Function<Executor, T>?, donePredicate: Predicate<T>?) = Util.method_43498<T>(resultFactory, donePredicate)
    /**
     * method_61210
     */
    fun <T>and() = Util.method_61210<T>()
    /**
     * method_646
     */
    fun createTranslationKey(type: String?, id: Identifier?) = Util.method_646(type, id)
    /**
     * method_61202
     */
    fun <T>or(a: Predicate<in T>?, b: Predicate<in T>?, c: Predicate<in T>?) = Util.method_61202<T>(a, b, c)
}