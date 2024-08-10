package me.hellrevenger.generated

import me.hellrevenger.generated.alias
import me.hellrevenger.generated.aliasEnum
import me.hellrevenger.generated.aliasStatic
import kotlin.reflect.*
import me.hellrevenger.generated.TestAttemptConfig

fun TestAttemptConfig.isDisabled() = this.method_56247()
fun TestAttemptConfig.shouldTestAgain(arg0: Int, arg1: Int) = this.method_56246(arg0, arg1)
fun TestAttemptConfig.needsMultipleAttempts() = this.method_56248()
fun KClass<TestAttemptConfig>.once() = TestAttemptConfig.method_56245()
fun TestAttemptConfig.numberOfTries() = this.comp_2213()
fun TestAttemptConfig.haltOnFailure() = this.comp_2214()
