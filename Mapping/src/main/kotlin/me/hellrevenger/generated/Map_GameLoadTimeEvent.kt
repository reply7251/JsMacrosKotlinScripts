package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameLoadTimeEvent

val KClass<GameLoadTimeEvent>.INSTANCE by aliasStatic(GameLoadTimeEvent::field_44842)
fun GameLoadTimeEvent.setBootstrapTime(arg0: Long) = this.method_51803(arg0)
fun GameLoadTimeEvent.stopTimer(arg0: TelemetryEventProperty<net.minecraft.class_8561.class_8562>) = this.method_51812(arg0)
fun GameLoadTimeEvent.send(arg0: TelemetrySender) = this.method_51805(arg0)
fun GameLoadTimeEvent.startTimer(arg0: TelemetryEventProperty<net.minecraft.class_8561.class_8562>) = this.method_51806(arg0)
fun GameLoadTimeEvent.addTimer(arg0: TelemetryEventProperty<net.minecraft.class_8561.class_8562>, arg1: Stopwatch) = this.method_51807(arg0, arg1)
