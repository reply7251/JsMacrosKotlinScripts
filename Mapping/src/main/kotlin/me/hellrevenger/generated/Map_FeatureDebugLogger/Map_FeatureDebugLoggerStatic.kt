package me.hellrevenger.generated.Map_FeatureDebugLogger
import kotlin.reflect.*
import me.hellrevenger.generated.*
object FeatureDebugLoggerKt {
    /**
     * method_39599
     */
    fun incrementFeatureCount(world: ServerWorld, configuredFeature: ConfiguredFeature<*, *>, placedFeature: Optional<PlacedFeature>) = FeatureDebugLogger.method_39599(world, configuredFeature, placedFeature)
    /**
     * method_39603
     */
    fun dump() = FeatureDebugLogger.method_39603()
    /**
     * method_39597
     */
    fun clear() = FeatureDebugLogger.method_39597()
    /**
     * method_39598
     */
    fun incrementTotalChunksCount(world: ServerWorld) = FeatureDebugLogger.method_39598(world)
}