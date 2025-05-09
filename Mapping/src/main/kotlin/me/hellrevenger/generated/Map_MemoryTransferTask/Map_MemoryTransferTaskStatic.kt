package me.hellrevenger.generated.Map_MemoryTransferTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object MemoryTransferTaskKt {
    /**
     * method_46914
     */
    fun <E, T>create(runPredicate: Predicate<E>, sourceType: MemoryModuleType<out T>, targetType: MemoryModuleType<T>, expiry: UniformIntProvider) where E: LivingEntity = MemoryTransferTask.method_46914<E, T>(runPredicate, sourceType, targetType, expiry)
}