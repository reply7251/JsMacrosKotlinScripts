package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.AnimationState

fun AnimationState.update(arg0: Float, arg1: Float) = this.method_43686(arg0, arg1)
fun AnimationState.setRunning(arg0: Boolean, arg1: Int) = this.method_45317(arg0, arg1)
fun AnimationState.skip(arg0: Int, arg1: Float) = this.method_56988(arg0, arg1)
fun AnimationState.isRunning() = this.method_41327()
fun AnimationState.stop() = this.method_41325()
fun AnimationState.run(arg0: Consumer<AnimationState>) = this.method_41323(arg0)
fun AnimationState.start(arg0: Int) = this.method_41322(arg0)
fun AnimationState.startIfNotRunning(arg0: Int) = this.method_41324(arg0)
