package me.hellrevenger.generated.Map_Degradable
import kotlin.reflect.*
import me.hellrevenger.generated.*

fun <T>Degradable<T>.tickDegradation(arg0: BlockState, arg1: ServerWorld, arg2: BlockPos, arg3: Random) where T: Enum<T> = this.method_54764(arg0, arg1, arg2, arg3)
fun <T>Degradable<T>.getDegradationLevel() where T: Enum<T> = this.method_33622()
fun <T>Degradable<T>.tryDegrade(arg0: BlockState, arg1: ServerWorld, arg2: BlockPos, arg3: Random) where T: Enum<T> = this.method_54765(arg0, arg1, arg2, arg3)
fun <T>Degradable<T>.getDegradationChanceMultiplier() where T: Enum<T> = this.method_33620()
fun <T>Degradable<T>.getDegradationResult(arg0: BlockState) where T: Enum<T> = this.method_31639(arg0)
