package me.hellrevenger.generated.Map_Batches
import kotlin.reflect.*
import me.hellrevenger.generated.*
object BatchesKt {
    /**
     * method_56198
     */
    fun createState(testFunction: TestFunction?, rotationSteps: Int, world: ServerWorld?) = Batches.method_56198(testFunction, rotationSteps, world)
    /**
     * method_56188
     */
    fun defaultBatcher() = Batches.method_56188()
    /**
     * method_56194
     */
    fun createBatches(testFunctions: Collection<TestFunction>?, world: ServerWorld?) = Batches.method_56194(testFunctions, world)
    /**
     * method_56195
     */
    fun create(states: Collection<GameTestState>?, batchId: String?, index: Long) = Batches.method_56195(states, batchId, index)
    /**
     * method_61092
     */
    fun batcher(batchSize: Int) = Batches.method_61092(batchSize)
}