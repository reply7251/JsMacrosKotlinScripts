package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TestSet

fun TestSet.failed() = this.method_22236()
fun TestSet.getTestCount() = this.method_22238()
fun TestSet.getFailedRequiredTestCount() = this.method_22229()
fun TestSet.addListener(arg0: Consumer<GameTestState>) = this.method_29407(arg0)
fun TestSet.getOptionalTests() = this.method_36104()
fun TestSet.getRequiredTests() = this.method_36103()
fun TestSet.getResultString() = this.method_22240()
fun TestSet.remove(arg0: GameTestState) = this.method_56243(arg0)
fun TestSet.getFailedOptionalTestCount() = this.method_22234()
fun TestSet.getCompletedTestCount() = this.method_22235()
fun TestSet.hasFailedOptionalTests() = this.method_22237()
fun TestSet.isDone() = this.method_22239()
fun TestSet.add(arg0: GameTestState) = this.method_22230(arg0)
fun TestSet.addListener(arg0: TestListener) = this.method_22231(arg0)
