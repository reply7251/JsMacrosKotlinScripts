package me.hellrevenger.generated.Map_RandomSequencesState
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun RandomSequencesState.resetAll() = this.method_52509()
fun RandomSequencesState.setDefaultParameters(arg0: Int, arg1: Boolean, arg2: Boolean) = this.method_52510(arg0, arg1, arg2)
fun KClass<RandomSequencesState>.fromNbt(arg0: Long, arg1: NbtCompound) = RandomSequencesState.method_51842(arg0, arg1)
fun RandomSequencesState.reset(arg0: Identifier) = this.method_52517(arg0)
fun RandomSequencesState.forEachSequence(arg0: BiConsumer<Identifier, RandomSequence>) = this.method_52513(arg0)
fun RandomSequencesState.getOrCreate(arg0: Identifier) = this.method_51843(arg0)
fun KClass<RandomSequencesState>.getPersistentStateType(arg0: Long) = RandomSequencesState.method_52511(arg0)
fun RandomSequencesState.reset(arg0: Identifier, arg1: Int, arg2: Boolean, arg3: Boolean) = this.method_52512(arg0, arg1, arg2, arg3)
