package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TelemetryEventType

val TelemetryEventType.GAME_LOAD_TIMES by aliasStatic(TelemetryEventType::field_44833)
val TelemetryEventType.WORLD_LOAD_TIMES by aliasStatic(TelemetryEventType::field_41438)
val TelemetryEventType.WORLD_LOADED by aliasStatic(TelemetryEventType::field_41436)
val TelemetryEventType.ADVANCEMENT_MADE by aliasStatic(TelemetryEventType::field_44832)
val TelemetryEventType.WORLD_UNLOADED by aliasStatic(TelemetryEventType::field_41439)
val TelemetryEventType.PERFORMANCE_METRICS by aliasStatic(TelemetryEventType::field_41437)
fun TelemetryEventType.getTitle() = this.method_47730()
fun <T>TelemetryEventType.hasProperty(arg0: TelemetryEventProperty<T>) = this.method_47722<T>(arg0)
fun KClass<TelemetryEventType>.builder(arg0: String, arg1: String) = TelemetryEventType.method_47725(arg0, arg1)
fun KClass<TelemetryEventType>.getTypes() = TelemetryEventType.method_47732()
fun TelemetryEventType.isOptional() = this.method_47729()
fun TelemetryEventType.createEvent(arg0: TelemetrySession, arg1: PropertyMap) = this.method_47721(arg0, arg1)
fun TelemetryEventType.getDescription() = this.method_47731()
