package me.hellrevenger.generated.Map_RandomSequencesState
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_52509
 */
fun RandomSequencesState.resetAll() = this.method_52509()
/**
 * method_52510
 */
fun RandomSequencesState.setDefaultParameters(salt: Int, includeWorldSeed: Boolean, includeSequenceId: Boolean) = this.method_52510(salt, includeWorldSeed, includeSequenceId)
/**
 * method_52517
 */
fun RandomSequencesState.reset(id: Identifier) = this.method_52517(id)
/**
 * method_52513
 */
fun RandomSequencesState.forEachSequence(consumer: BiConsumer<Identifier, RandomSequence>) = this.method_52513(consumer)
/**
 * method_51843
 */
fun RandomSequencesState.getOrCreate(id: Identifier) = this.method_51843(id)
/**
 * method_52512
 */
fun RandomSequencesState.reset(id: Identifier, salt: Int, includeWorldSeed: Boolean, includeSequenceId: Boolean) = this.method_52512(id, salt, includeWorldSeed, includeSequenceId)
