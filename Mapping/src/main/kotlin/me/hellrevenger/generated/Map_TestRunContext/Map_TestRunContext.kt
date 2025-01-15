package me.hellrevenger.generated.Map_TestRunContext
import kotlin.reflect.*
import me.hellrevenger.generated.*

val KClass<TestRunContext>.DEFAULT_TESTS_PER_ROW by aliasStatic(TestRunContext::field_33151)
fun KClass<TestRunContext>.clearDebugMarkers(arg0: ServerWorld) = TestRunContext.method_22213(arg0)
fun TestRunContext.clear() = this.method_56229()
fun TestRunContext.getStates() = this.method_56219()
fun TestRunContext.start() = this.method_56226()
fun TestRunContext.retry(arg0: GameTestState) = this.method_56224(arg0)
fun TestRunContext.addBatchListener(arg0: BatchListener) = this.method_56223(arg0)
