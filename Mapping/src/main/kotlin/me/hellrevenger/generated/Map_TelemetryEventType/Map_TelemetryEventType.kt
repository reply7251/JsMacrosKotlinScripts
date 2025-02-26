package me.hellrevenger.generated.Map_TelemetryEventType
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * field_44833
 */
val KClass<TelemetryEventType>.GAME_LOAD_TIMES by aliasStatic(TelemetryEventType::field_44833)
/**
 * field_41438
 */
val KClass<TelemetryEventType>.WORLD_LOAD_TIMES by aliasStatic(TelemetryEventType::field_41438)
/**
 * field_41436
 */
val KClass<TelemetryEventType>.WORLD_LOADED by aliasStatic(TelemetryEventType::field_41436)
/**
 * field_44832
 */
val KClass<TelemetryEventType>.ADVANCEMENT_MADE by aliasStatic(TelemetryEventType::field_44832)
/**
 * field_41439
 */
val KClass<TelemetryEventType>.WORLD_UNLOADED by aliasStatic(TelemetryEventType::field_41439)
/**
 * field_41437
 */
val KClass<TelemetryEventType>.PERFORMANCE_METRICS by aliasStatic(TelemetryEventType::field_41437)
/**
 * method_47730
 */
fun TelemetryEventType.getTitle() = this.method_47730()
/**
 * method_47720
 */
fun TelemetryEventType.getId() = this.method_47720()
/**
 * method_47722
 */
fun <T>TelemetryEventType.hasProperty(arg0: TelemetryEventProperty<T>) = this.method_47722<T>(arg0)
/**
 * method_47725
 */
fun KClass<TelemetryEventType>.builder(arg0: String, arg1: String) = TelemetryEventType.method_47725(arg0, arg1)
/**
 * method_47732
 */
fun KClass<TelemetryEventType>.getTypes() = TelemetryEventType.method_47732()
/**
 * method_47726
 */
fun TelemetryEventType.getProperties() = this.method_47726()
/**
 * method_47729
 */
fun TelemetryEventType.isOptional() = this.method_47729()
/**
 * method_47721
 */
fun TelemetryEventType.createEvent(arg0: TelemetrySession, arg1: PropertyMap) = this.method_47721(arg0, arg1)
/**
 * method_47728
 */
fun TelemetryEventType.getCodec() = this.method_47728()
/**
 * method_47731
 */
fun TelemetryEventType.getDescription() = this.method_47731()
