package me.hellrevenger.generated.Map_TaskTriggerer
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_47227
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.runIf(arg0: Predicate<E>, arg1: SingleTickTask<in E>) where E: LivingEntity = TaskTriggerer.method_47227<E>(arg0, arg1)
/**
 * method_47221
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.predicate(arg0: BiPredicate<ServerWorld, E>) where E: LivingEntity = TaskTriggerer.method_47221<E>(arg0)
/**
 * method_47224
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.task(arg0: function_Function<net.minecraft.class_7898.class_7900<E>, out App<net.minecraft.class_7898.class_7902<E>, TaskRunnable<E>>>) where E: LivingEntity = TaskTriggerer.method_47224<E>(arg0)
/**
 * method_47220
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.cast(arg0: App<net.minecraft.class_7898.class_7902<E>, M>) where E: LivingEntity = TaskTriggerer.method_47220<E, M>(arg0)
/**
 * method_47215
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.newContext() where E: LivingEntity = TaskTriggerer.method_47215<E>()
/**
 * method_47225
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.predicate(arg0: Predicate<E>) where E: LivingEntity = TaskTriggerer.method_47225<E>(arg0)
/**
 * method_47217
 */
fun <E, M>KClass<TaskTriggerer<E, M>>.runIf(arg0: TaskRunnable<in E>, arg1: TaskRunnable<in E>) where E: LivingEntity = TaskTriggerer.method_47217<E>(arg0, arg1)
