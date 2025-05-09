package me.hellrevenger.generated.Map_FixUtil
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FixUtilKt {
    /**
     * method_61355
     */
    fun createBlockState(id: String) = FixUtil.method_61355(id)
    /**
     * method_59907
     */
    fun <T>compose(fixes: Array<function_Function<Typed<*>, Typed<*>>>) = FixUtil.method_59907<T>(*fixes)
    /**
     * method_61350
     */
    fun withTypeChanged(arg0: types_Type<*>, oldType: types_Type<*>, newType: types_Type<*>) = FixUtil.method_61350(arg0, oldType, newType)
    /**
     * method_61351
     */
    fun apply(dynamic: Dynamic<*>, fieldName: String, applier: UnaryOperator<String>) = FixUtil.method_61351(dynamic, fieldName, applier)
    /**
     * method_61356
     */
    fun createBlockState(id: String, properties: Map<String, String>) = FixUtil.method_61356(id, properties)
    /**
     * method_57182
     */
    fun <T, R>withType(arg0: types_Type<R>, arg1: Typed<T>) = FixUtil.method_57182<T, R>(arg0, arg1)
    /**
     * method_56943
     */
    fun fixBlockPos(dynamic: Dynamic<*>) = FixUtil.method_56943(dynamic)
}