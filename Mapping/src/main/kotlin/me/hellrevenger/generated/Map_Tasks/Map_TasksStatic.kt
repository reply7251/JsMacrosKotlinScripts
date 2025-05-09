package me.hellrevenger.generated.Map_Tasks
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TasksKt {
    /**
     * method_47167
     */
    fun <E>weighted(weightedTasks: MutableList<util_Pair<out TaskRunnable<in E>, Int>>, order: net.minecraft.class_4103.class_4104, runMode: net.minecraft.class_4103.class_4216) where E: LivingEntity = Tasks.method_47167<E>(weightedTasks, order, runMode)
    /**
     * method_47166
     */
    fun <E>pickRandomly(weightedTasks: MutableList<util_Pair<out TaskRunnable<in E>, Int>>) where E: LivingEntity = Tasks.method_47166<E>(weightedTasks)
}