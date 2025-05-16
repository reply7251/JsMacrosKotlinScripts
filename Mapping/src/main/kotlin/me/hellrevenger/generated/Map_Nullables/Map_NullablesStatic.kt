package me.hellrevenger.generated.Map_Nullables
import kotlin.reflect.*
import me.hellrevenger.generated.*
object NullablesKt {
    /**
     * method_49082
     */
    fun <T>getFirstOrElseGet(collection: Collection<T>?, getter: Supplier<T>?) = Nullables.method_49082<T>(collection, getter)
    /**
     * method_49091
     */
    fun isEmpty(array: BooleanArray?) = Nullables.method_49091(array)
    /**
     * method_49077
     */
    fun <T, R>map(value: T, mapper: function_Function<T, R>?) = Nullables.method_49077<T, R>(value, mapper)
    /**
     * method_49083
     */
    fun isEmpty(array: ByteArray?) = Nullables.method_49083(array)
    /**
     * method_49084
     */
    fun isEmpty(array: CharArray?) = Nullables.method_49084(array)
    /**
     * method_49085
     */
    fun isEmpty(array: DoubleArray?) = Nullables.method_49085(array)
    /**
     * method_49089
     */
    fun <T>isEmpty(array: Array<T>?) = Nullables.method_49089<T>(array)
    /**
     * method_49080
     */
    fun <T>getFirst(collection: Collection<T>?) = Nullables.method_49080<T>(collection)
    /**
     * method_49078
     */
    fun <T, R>mapOrElse(value: T, mapper: function_Function<T, R>?, other: R) = Nullables.method_49078<T, R>(value, mapper, other)
    /**
     * method_49086
     */
    fun isEmpty(array: FloatArray?) = Nullables.method_49086(array)
    /**
     * method_62789
     */
    fun <T>requireNonNullElse(first: T, second: T) = Nullables.method_62789<T>(first, second)
    /**
     * method_49081
     */
    fun <T>getFirstOrElse(collection: Collection<T>?, defaultValue: T) = Nullables.method_49081<T>(collection, defaultValue)
    /**
     * method_49087
     */
    fun isEmpty(array: IntArray?) = Nullables.method_49087(array)
    /**
     * method_49088
     */
    fun isEmpty(array: LongArray?) = Nullables.method_49088(array)
    /**
     * method_49090
     */
    fun isEmpty(array: ShortArray?) = Nullables.method_49090(array)
    /**
     * method_49079
     */
    fun <T, R>mapOrElseGet(value: T, mapper: function_Function<T, R>?, getter: Supplier<R>?) = Nullables.method_49079<T, R>(value, mapper, getter)
}