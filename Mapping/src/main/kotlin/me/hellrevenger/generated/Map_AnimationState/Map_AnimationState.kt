package me.hellrevenger.generated.Map_AnimationState
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_61400
 */
fun AnimationState.getTimeInMilliseconds(age: Float) = this.method_61400(age)
/**
 * method_61401
 */
fun AnimationState.copyFrom(state: AnimationState) = this.method_61401(state)
/**
 * method_45317
 */
fun AnimationState.setRunning(running: Boolean, tick: Int) = this.method_45317(running, tick)
/**
 * method_56988
 */
fun AnimationState.skip(ticks: Int, speedMultiplier: Float) = this.method_56988(ticks, speedMultiplier)
/**
 * method_41327
 */
fun AnimationState.isRunning() = this.method_41327()
/**
 * method_41325
 */
fun AnimationState.stop() = this.method_41325()
/**
 * method_41323
 */
fun AnimationState.run(consumer: Consumer<AnimationState>) = this.method_41323(consumer)
/**
 * method_41322
 */
fun AnimationState.start(tick: Int) = this.method_41322(tick)
/**
 * method_41324
 */
fun AnimationState.startIfNotRunning(tick: Int) = this.method_41324(tick)
