package me.hellrevenger.generated.Map_Brain
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BrainKt {
    /**
     * method_28313
     */
    fun <E>createBrainCodec(memoryModules: Collection<out MemoryModuleType<*>>?, sensors: Collection<out SensorType<out Sensor<in E>>>?) where E: LivingEntity = Brain.method_28313<E>(memoryModules, sensors)
    /**
     * method_28311
     */
    fun <E>createProfile(memoryModules: Collection<out MemoryModuleType<*>>?, sensors: Collection<out SensorType<out Sensor<in E>>>?) where E: LivingEntity = Brain.method_28311<E>(memoryModules, sensors)
}