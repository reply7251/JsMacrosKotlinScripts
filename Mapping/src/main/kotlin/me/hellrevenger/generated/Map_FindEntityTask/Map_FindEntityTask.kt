package me.hellrevenger.generated.Map_FindEntityTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_18941
 */
fun <T>KClass<FindEntityTask>.create(arg0: EntityType<out T>, arg1: Int, arg2: MemoryModuleType<T>, arg3: Float, arg4: Int) where T: LivingEntity = FindEntityTask.method_18941<T>(arg0, arg1, arg2, arg3, arg4)
/**
 * method_46957
 */
fun <E, T>KClass<FindEntityTask>.create(arg0: EntityType<out T>, arg1: Int, arg2: Predicate<E>, arg3: Predicate<T>, arg4: MemoryModuleType<T>, arg5: Float, arg6: Int) where E: LivingEntity, T: LivingEntity = FindEntityTask.method_46957<E, T>(arg0, arg1, arg2, arg3, arg4, arg5, arg6)
