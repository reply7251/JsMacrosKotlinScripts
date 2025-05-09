package me.hellrevenger.generated.Map_TaskTriggerer
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TaskTriggererKt {
    /**
     * method_47227
     */
    fun <E, M>runIf(predicate: Predicate<E>, task: SingleTickTask<in E>) where E: LivingEntity = TaskTriggerer.method_47227<E>(predicate, task)
    /**
     * method_47221
     */
    fun <E, M>predicate(predicate: BiPredicate<ServerWorld, E>) where E: LivingEntity = TaskTriggerer.method_47221<E>(predicate)
    /**
     * method_47224
     */
    fun <E, M>task(creator: function_Function<net.minecraft.class_7898.class_7900<E>, out App<net.minecraft.class_7898.class_7902<E>, TaskRunnable<E>>>) where E: LivingEntity = TaskTriggerer.method_47224<E>(creator)
    /**
     * method_47220
     */
    fun <E, M>cast(app: App<net.minecraft.class_7898.class_7902<E>, M>) where E: LivingEntity = TaskTriggerer.method_47220<E, M>(app)
    /**
     * method_47215
     */
    fun <E, M>newContext() where E: LivingEntity = TaskTriggerer.method_47215<E>()
}