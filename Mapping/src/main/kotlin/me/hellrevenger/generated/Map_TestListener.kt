package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TestListener

fun TestListener.onStarted(arg0: GameTestState) = this.method_22188(arg0)
fun TestListener.onRetry(arg0: GameTestState, arg1: GameTestState, arg2: TestRunContext) = this.method_56216(arg0, arg1, arg2)
fun TestListener.onPassed(arg0: GameTestState, arg1: TestRunContext) = this.method_33317(arg0, arg1)
fun TestListener.onFailed(arg0: GameTestState, arg1: TestRunContext) = this.method_22190(arg0, arg1)
