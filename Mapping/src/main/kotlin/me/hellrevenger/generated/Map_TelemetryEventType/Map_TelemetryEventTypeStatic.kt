package me.hellrevenger.generated.Map_TelemetryEventType
import kotlin.reflect.*
import me.hellrevenger.generated.*
object TelemetryEventTypeKt {
    /**
     * field_44833
     */
    val GAME_LOAD_TIMES by aliasStatic(TelemetryEventType::field_44833)
    /**
     * field_41438
     */
    val WORLD_LOAD_TIMES by aliasStatic(TelemetryEventType::field_41438)
    /**
     * field_41436
     */
    val WORLD_LOADED by aliasStatic(TelemetryEventType::field_41436)
    /**
     * field_44832
     */
    val ADVANCEMENT_MADE by aliasStatic(TelemetryEventType::field_44832)
    /**
     * field_41439
     */
    val WORLD_UNLOADED by aliasStatic(TelemetryEventType::field_41439)
    /**
     * field_41437
     */
    val PERFORMANCE_METRICS by aliasStatic(TelemetryEventType::field_41437)
    /**
     * method_47725
     */
    fun builder(id: String?, sentEventId: String?) = TelemetryEventType.method_47725(id, sentEventId)
    /**
     * method_47732
     */
    fun getTypes() = TelemetryEventType.method_47732()
}