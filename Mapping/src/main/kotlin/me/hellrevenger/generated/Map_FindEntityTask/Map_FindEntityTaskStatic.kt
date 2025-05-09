package me.hellrevenger.generated.Map_FindEntityTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FindEntityTaskKt {
    /**
     * method_18941
     */
    fun <T>create(type: EntityType<out T>, maxDistance: Int, targetModule: MemoryModuleType<T>, speed: Float, completionRange: Int) where T: LivingEntity = FindEntityTask.method_18941<T>(type, maxDistance, targetModule, speed, completionRange)
    /**
     * method_46957
     */
    fun <E, T>create(type: EntityType<out T>, maxDistance: Int, entityPredicate: Predicate<E>, targetPredicate: Predicate<T>, targetModule: MemoryModuleType<T>, speed: Float, completionRange: Int) where E: LivingEntity, T: LivingEntity = FindEntityTask.method_46957<E, T>(type, maxDistance, entityPredicate, targetPredicate, targetModule, speed, completionRange)
}