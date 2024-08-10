package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.GameTestState

fun GameTestState.isStarted() = this.method_22179()
fun GameTestState.startCountdown(arg0: Int) = this.method_23634(arg0)
fun GameTestState.initializeImmediately() = this.method_56213()
fun GameTestState.isRequired() = this.method_22183()
fun GameTestState.completeIfSuccessful() = this.method_36064()
fun GameTestState.isFailed() = this.method_22178()
fun GameTestState.setBoxMinPos(arg0: BlockPos) = this.method_56214(arg0)
fun GameTestState.getMaxAttempts() = this.method_32242()
fun GameTestState.copy() = this.method_56210()
fun GameTestState.isFlaky() = this.method_32241()
fun GameTestState.runAtTick(arg0: Long, arg1: Runnable) = this.method_36060(arg0, arg1)
fun GameTestState.getStructureBlockBlockEntity() = this.method_36059()
fun GameTestState.getBoundingBox() = this.method_36062()
fun GameTestState.init() = this.method_22166()
fun GameTestState.getElapsedMilliseconds() = this.method_36063()
fun GameTestState.getRequiredSuccesses() = this.method_32243()
fun GameTestState.isPassed() = this.method_22177()
fun GameTestState.addListener(arg0: TestListener) = this.method_22167(arg0)
fun GameTestState.streamListeners() = this.method_56209()
fun GameTestState.fail(arg0: Throwable) = this.method_22168(arg0)
fun GameTestState.isOptional() = this.method_22184()
fun GameTestState.isCompleted() = this.method_22180()
fun GameTestState.getTemplatePath() = this.method_22169()
fun GameTestState.tick(arg0: TestRunContext) = this.method_22165(arg0)
fun GameTestState.getTemplateName() = this.method_23638()
