package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TickManager

val KClass<TickManager>.MIN_TICK_RATE by aliasStatic(TickManager::field_46960)
fun TickManager.getNanosPerTick() = this.method_54750()
fun TickManager.setStepTicks(arg0: Int) = this.method_54747(arg0)
fun TickManager.getStepTicks() = this.method_54753()
fun TickManager.shouldSkipTick(arg0: Entity) = this.method_54746(arg0)
fun TickManager.getTickRate() = this.method_54748()
fun TickManager.setFrozen(arg0: Boolean) = this.method_54675(arg0)
fun TickManager.getMillisPerTick() = this.method_54749()
fun TickManager.shouldTick() = this.method_54751()
fun TickManager.isStepping() = this.method_54752()
fun TickManager.isFrozen() = this.method_54754()
fun TickManager.setTickRate(arg0: Float) = this.method_54671(arg0)
fun TickManager.step() = this.method_54755()
