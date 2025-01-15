package me.hellrevenger.generated.Map_TelemetryEventType
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<TelemetryEventType>.GAME_LOAD_TIMES by aliasStatic(TelemetryEventType::field_44833)
val KClass<TelemetryEventType>.WORLD_LOAD_TIMES by aliasStatic(TelemetryEventType::field_41438)
val KClass<TelemetryEventType>.WORLD_LOADED by aliasStatic(TelemetryEventType::field_41436)
val KClass<TelemetryEventType>.ADVANCEMENT_MADE by aliasStatic(TelemetryEventType::field_44832)
val KClass<TelemetryEventType>.WORLD_UNLOADED by aliasStatic(TelemetryEventType::field_41439)
val KClass<TelemetryEventType>.PERFORMANCE_METRICS by aliasStatic(TelemetryEventType::field_41437)
fun TelemetryEventType.getTitle() = this.method_47730()
fun TelemetryEventType.getId() = this.method_47720()
fun <T>TelemetryEventType.hasProperty(arg0: TelemetryEventProperty<T>) = this.method_47722<T>(arg0)
fun KClass<TelemetryEventType>.builder(arg0: String, arg1: String) = TelemetryEventType.method_47725(arg0, arg1)
fun KClass<TelemetryEventType>.getTypes() = TelemetryEventType.method_47732()
fun TelemetryEventType.getProperties() = this.method_47726()
fun TelemetryEventType.isOptional() = this.method_47729()
fun TelemetryEventType.createEvent(arg0: TelemetrySession, arg1: PropertyMap) = this.method_47721(arg0, arg1)
fun TelemetryEventType.getCodec() = this.method_47728()
fun TelemetryEventType.getDescription() = this.method_47731()
