package me.hellrevenger.generated.Map_FindEntityTask
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FindEntityTaskKt {
    /**
     * method_18941
     */
    fun <T>create(type: EntityType<out T>, maxDistance: Int, targetModule: MemoryModuleType<T>, speed: Float, completionRange: Int) where T: LivingEntity = FindEntityTask.method_18941<T>(type, maxDistance, targetModule, speed, completionRange)
}