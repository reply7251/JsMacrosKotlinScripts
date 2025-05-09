package me.hellrevenger.generated.Map_Degradable
import kotlin.reflect.*
import me.hellrevenger.generated.*
/**
 * method_54764
 */
fun <T>Degradable<T>.tickDegradation(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) where T: Enum<T> = this.method_54764(state, world, pos, random)
/**
 * method_33622
 */
fun <T>Degradable<T>.getDegradationLevel() where T: Enum<T> = this.method_33622()
/**
 * method_54765
 */
fun <T>Degradable<T>.tryDegrade(state: BlockState, world: ServerWorld, pos: BlockPos, random: Random) where T: Enum<T> = this.method_54765(state, world, pos, random)
/**
 * method_33620
 */
fun <T>Degradable<T>.getDegradationChanceMultiplier() where T: Enum<T> = this.method_33620()
/**
 * method_31639
 */
fun <T>Degradable<T>.getDegradationResult(state: BlockState) where T: Enum<T> = this.method_31639(state)
